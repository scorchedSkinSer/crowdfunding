package com.zc.add.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理类
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ServerResponse handlerException(Exception e){
        e.printStackTrace();
        return ServerResponse.error();
    }




}
