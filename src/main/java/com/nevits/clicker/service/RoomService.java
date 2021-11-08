package com.nevits.clicker.service;

import com.nevits.clicker.dto.RoomDto;
import com.nevits.clicker.entity.Room;

public interface RoomService {
    
    Room create (RoomDto roomDto);
}
