package com.nevits.clicker.entity;

import com.nevits.clicker.dto.RoomDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {
    
    @Id
    String id;
    
    @Indexed( unique = true )
    String code;
    
    String status;

    public Room() {
    }

    public Room(RoomDto roomDto) {
        this.code = roomDto.getCode();
        this.status = roomDto.getStatus();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void update(RoomDto roomDto) {
        this.code = roomDto.getCode();
        this.status = roomDto.getStatus();
    }
    
}
