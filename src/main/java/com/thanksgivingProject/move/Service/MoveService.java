package com.thanksgivingProject.move.Service;

import com.thanksgivingProject.move.Entity.Room;
import com.thanksgivingProject.move.Repository.MoveRepository;
import org.springframework.stereotype.Service;

@Service
public class MoveService {
    private final MoveRepository moveRepository;

    public MoveService(MoveRepository moveRepository) {
        this.moveRepository = moveRepository;
    }

    public Room addRoom(Room room) throws Exception{
        return moveRepository.save(room);
    }

}
