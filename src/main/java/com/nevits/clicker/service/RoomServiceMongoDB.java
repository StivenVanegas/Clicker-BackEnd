package com.nevits.clicker.service;

import com.nevits.clicker.dto.RoomDto;
import com.nevits.clicker.entity.Room;
import com.nevits.clicker.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceMongoDB implements RoomService{

    private final RoomRepository roomRepository;

    public RoomServiceMongoDB(@Autowired RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    
    @Override
    public Room create(RoomDto roomDto) {
        return roomRepository.save(new Room(roomDto));
    }
    
}
