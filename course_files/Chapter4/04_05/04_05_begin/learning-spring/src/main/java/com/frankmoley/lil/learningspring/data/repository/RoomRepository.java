package com.jonathan.malatesta.learningspring.data.repository;

import com.jonathan.malatesta.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
