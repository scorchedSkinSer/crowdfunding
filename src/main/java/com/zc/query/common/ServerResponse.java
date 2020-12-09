package com.zc.common;

import java.util.Objects;

public class ServerResponse {
    private   Integer   code;

    private   String    msg;

    private   Object    data;


    public   static ServerResponse success(Object  data){
        return new ServerResponse(ServerEnum.SUCCESS.getCode(), ServerEnum.SUCCESS.getMsg(),data);
    }

    public   static ServerResponse success(){
        return new ServerResponse(ServerEnum.SUCCESS.getCode(), ServerEnum.SUCCESS.getMsg());
    }

    public   static ServerResponse error(String  mag){
        return new ServerResponse(ServerEnum.ERROR.getCode(), ServerEnum.ERROR.getMsg(),mag);
    }

    public   static ServerResponse error(){
        return new ServerResponse(ServerEnum.ERROR.getCode(), ServerEnum.ERROR.getMsg());
    }

    public   static ServerResponse Login_error(){
        return new ServerResponse(ServerEnum.LOGIN.getCode(), ServerEnum.LOGIN.getMsg());
    }

    public ServerResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ServerResponse(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ServerResponse() {
    }

    public static ServerResponse token_error(String message) {
        return new ServerResponse(ServerEnum.TOKEN.getCode(),message);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerResponse that = (ServerResponse) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(msg, that.msg) &&
                Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, data);
    }
}
