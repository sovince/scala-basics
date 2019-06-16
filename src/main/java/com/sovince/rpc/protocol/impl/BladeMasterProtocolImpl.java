package com.sovince.rpc.protocol.impl;

import com.sovince.rpc.enums.Cmds;
import com.sovince.rpc.enums.Reasons;
import com.sovince.rpc.protocol.BladeMasterProtocol;
import com.sovince.rpc.vo.ConnectStatus;
import org.apache.hadoop.ipc.ProtocolSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Random;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 20:18
 * Description:
 */
public class BladeMasterProtocolImpl implements BladeMasterProtocol {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private Random random = new Random();

    public ConnectStatus connect(Cmds cmd) {
        ConnectStatus status = new ConnectStatus();
        //whatever cmd,just go

        if(cmd!=Cmds.CONNECT){
            status.setConnected(false);
            status.setReason(Reasons.ILLEGALCMD.getMsg()+":"+cmd.getRequest());
            return status;
        }
        logger.info("BladeMaster received a connection request");

        int sleep = random.nextInt(2000);
        try {
            Thread.sleep(random.nextInt(sleep));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //TIMEOUT
        if(sleep>1000){
            status.setConnected(false);
            status.setReason(Reasons.TIMEOUT.getMsg());
            logger.warn("Fail to response!Cause of "+Reasons.TIMEOUT.getMsg());
            return status;
        }

        status.setConnected(true);
        status.setReason(Reasons.SUCCESS.getMsg());

        return status;
    }

    public String begging(Cmds cmd) {
        logger.info("BladeMaster received request:"+cmd.getRequest());
        if(cmd==Cmds.CONNECT) return "Don't bother me!";
        return cmd.getResponses();
    }


    public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
        return versionID;
    }

    public ProtocolSignature getProtocolSignature(String protocol, long clientVersion, int clientMethodsHash) throws IOException {
        return new ProtocolSignature();
    }
}
