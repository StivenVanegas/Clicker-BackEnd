package com.nevits.clicker.repository;

import com.nevits.clicker.entity.Room;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String>{
    
     Optional<Room> findByCode (String code);
}
