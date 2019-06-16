package com.sovince.rpc.server;

import com.sovince.rpc.conf.CoreProperties;
import com.sovince.rpc.protocol.BladeMasterProtocol;
import com.sovince.rpc.protocol.impl.BladeMasterProtocolImpl;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 19:51
 * Description:
 */
public class BladeMaster {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) throws IOException {
        new BladeMaster().start();
    }

    public void start() throws IOException {

        Configuration configuration = new Configuration();
        RPC.Builder builder = new RPC.Builder(configuration);

        String bindAddress = CoreProperties.bindAddress;
        int port = CoreProperties.port;
        RPC.Server bladeMaster = builder
                .setBindAddress(bindAddress)
                .setPort(port)
                .setProtocol(BladeMasterProtocol.class)
                .setInstance(new BladeMasterProtocolImpl())
                .build();
        bladeMaster.start();

        logger.info("BladeMaster is starting at "+ bindAddress+":"+port);
    }
}
