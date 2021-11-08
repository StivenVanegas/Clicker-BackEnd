package com.nevits.clicker.controller.room;

import com.nevits.clicker.dto.RoomDto;
import com.nevits.clicker.entity.Room;
import com.nevits.clicker.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/v1/user" )
public class RoomController {
    
    private final RoomService roomService;

    public RoomController(@Autowired RoomService roomService) {
        this.roomService = roomService;
    }
    
    @PostMapping
    public ResponseEntity<Room> create(@RequestBody RoomDto roomDto){
        return ResponseEntity.ok(roomService.create(roomDto));
    }
}
