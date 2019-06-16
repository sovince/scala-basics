package com.sovince.rpc.enums;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2019/6/16
 * Time: 21:00
 * Description:
 */
public enum  Cmds {
    CONNECT(0,"--connect","Connected"),

    FOOD(1,"--food","Get a piece of bread"),
    WATER(2,"--water","Get a cup of java"),
    REST(3,"--rest","Keep working 996"),
    REVOLUTION(4,"--revolution","Got beat fiercely")
    ;
    private Integer index;
    private String request;
    private String responses;

    Cmds(Integer index, String request,String responses) {
        this.index = index;
        this.responses = responses;
        this.request = request;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public static Cmds cmdOf(Integer index) {
        for (Cmds cmd : values()) {
            if (cmd.getIndex().equals(index)) {
                return cmd;
            }
        }
        return null;
    }
}
