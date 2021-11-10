package com.nevits.clicker.service;

import com.nevits.clicker.dto.RoomDto;
import com.nevits.clicker.entity.Room;
import com.nevits.clicker.exception.RoomNotFoundException;
import com.nevits.clicker.repository.RoomRepository;
import java.util.Optional;
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

    @Override
    public Room findByCode(String code) throws RoomNotFoundException{
        Optional<Room> room = roomRepository.findByCode(code);
        if(room.isPresent()){
            return room.get();
        } else {
            throw new RoomNotFoundException();
        }
    }
    
    
}
