package com.nevits.clicker.exception;

import org.springframework.http.HttpStatus;

public class InternalServerErrorException extends RuntimeException{
    
    private final ServerErrorResponseDto serverErrorResponseDto;


    private final HttpStatus httpStatus;

    public InternalServerErrorException( ServerErrorResponseDto serverErrorResponseDto, HttpStatus httpStatus ){
        this.serverErrorResponseDto = serverErrorResponseDto;
        this.httpStatus = httpStatus;
    }

    public ServerErrorResponseDto getServerErrorResponseDto(){
        return serverErrorResponseDto;
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
