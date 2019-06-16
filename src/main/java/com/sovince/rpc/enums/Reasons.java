package com.sovince.rpc.enums;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 20:34
 * Description:
 */
public enum Reasons {
    SUCCESS(0, "Connected!"),
    TIMEOUT(1, "Connection timeout!"),
    UNKNOWN(2, "Connection fail due to unknown exception!"),
    ILLEGALCMD(3,"Illegal cmd")
    ;

    private Integer code;
    private String msg;

    Reasons(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
