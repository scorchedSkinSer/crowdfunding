package com.zc.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(AjaxException.class)
    private ServerResponse HandlerAjaxException(AjaxException e){
        //e.printStackTrace();
        return ServerResponse.Login_error();
    }
    @ExceptionHandler(ToKenException.class)
    private ServerResponse HandlerToKenException(ToKenException e){
        //e.printStackTrace();
        return ServerResponse.token_error(e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    private ServerResponse exceptionCapture(Exception e){
        e.printStackTrace();
        return ServerResponse.error(e.getMessage());
    }
}
