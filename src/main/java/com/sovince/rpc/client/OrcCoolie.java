package com.sovince.rpc.client;

import com.sovince.rpc.conf.CoreProperties;
import com.sovince.rpc.enums.Cmds;
import com.sovince.rpc.protocol.BladeMasterProtocol;
import com.sovince.rpc.vo.ConnectStatus;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 21:20
 * Description:
 */
public class OrcCoolie {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private Random random = new Random();

    public static void main(String[] args) throws IOException, InterruptedException {
        new OrcCoolie().start();
    }

    public void start() throws IOException, InterruptedException {
        final BladeMasterProtocol coolie = RPC.getProxy(
                BladeMasterProtocol.class,
                BladeMasterProtocol.versionID,
                new InetSocketAddress(CoreProperties.bindAddress, CoreProperties.port),
                new Configuration()
        );
        //尝试连接
        ConnectStatus connectStatus = coolie.connect(getRandomCmd());//随机请求连接
        while (!connectStatus.getConnected()) {
            logger.warn(connectStatus.getReason());
            Thread.sleep(1000);
            connectStatus = coolie.connect(Cmds.CONNECT);//连接请求
        }
        logger.info(connectStatus.getReason());//连接成功

        //随机发出请求
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(
                new TimerTask() {
                    @Override
                    public void run() {
                        String result = coolie.begging(getRandomCmd());
                        logger.info("BladeMaster:"+result);
                    }
                }, 2000L, 2000L);
    }

    private Cmds getRandomCmd(){
        return Cmds.cmdOf(random.nextInt(Cmds.values().length));
    }

}
