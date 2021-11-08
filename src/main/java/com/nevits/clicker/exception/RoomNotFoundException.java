package com.nevits.clicker.exception;

import com.nevits.clicker.enums.ErrorCodeEnum;
import org.springframework.http.HttpStatus;

public class RoomNotFoundException extends InternalServerErrorException{
    
    public RoomNotFoundException(){
        super( new ServerErrorResponseDto( "User not found", ErrorCodeEnum.ROOM_NOT_FOUND, HttpStatus.NOT_FOUND ),
               HttpStatus.NOT_FOUND );
    }
}
