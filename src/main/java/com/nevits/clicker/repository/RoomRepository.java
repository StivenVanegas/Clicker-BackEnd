package com.nevits.clicker.repository;

import com.nevits.clicker.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String>{
    
}
