package com.zc.add.common;

/**
 * 项目中返回值的方法
 * @param <T>
 */
public class ServerResponse<T> {

    private static int code;
    private String message;
    private T data;


    public static ServerResponse USER_EXIST(){
        ResponseEnum responseEnum =  ResponseEnum.USER_EXIST;
        return new ServerResponse(responseEnum.getCode(), responseEnum.getMessage(),null);
    }

    public static ServerResponse TOKEN_IS_NULL(String message){
        ResponseEnum responseEnum =  ResponseEnum.TOKEN_IS_NULL;
        return new ServerResponse(responseEnum.getCode(),message,null);
    }
    public static ServerResponse loginNull(){
        ResponseEnum responseEnum =  ResponseEnum.LOGIN_NULL;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }
    public static ServerResponse userPasNull(){
        ResponseEnum responseEnum =  ResponseEnum.USER_PASSWORD_IS_NULL;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }
    public static ServerResponse PASSWORD_IS_ERROR(){
        ResponseEnum responseEnum =  ResponseEnum.PASSWORD_IS_ERROR;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }
    public static ServerResponse userNameNull(){
        ResponseEnum responseEnum =  ResponseEnum.USER_IS_NOT_EXIST;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse error(String message){
        return new ServerResponse(code,message,null);
    }


    public static  ServerResponse error(ResponseEnum responseEnum){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static  ServerResponse error(){
        ResponseEnum responseEnum = ResponseEnum.ERROR;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static  ServerResponse success(){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static  ServerResponse success(Object data){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),data);
    }
    public ServerResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
