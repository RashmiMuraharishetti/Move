package com.thanksgivingProject.move.Repository;

import com.thanksgivingProject.move.Entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface MoveRepository extends CrudRepository<Room, Integer> {
}
