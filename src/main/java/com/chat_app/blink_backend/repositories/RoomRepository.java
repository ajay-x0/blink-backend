package com.chat_app.blink_backend.repositories;

import com.chat_app.blink_backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room,String> {

    //find room by roomId
    Room findByRoomId(String roomId);
}
