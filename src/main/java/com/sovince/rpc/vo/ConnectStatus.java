package com.sovince.rpc.vo;

import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 20:12
 * Description:
 */
public class ConnectStatus implements Writable {
    private boolean connected;
    private String reason;

    public void write(DataOutput out) throws IOException {
        out.writeBoolean(this.connected);
        out.writeUTF(this.reason);
    }

    public void readFields(DataInput in) throws IOException {
        this.connected = in.readBoolean();
        this.reason = in.readUTF();
    }

    public boolean getConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
