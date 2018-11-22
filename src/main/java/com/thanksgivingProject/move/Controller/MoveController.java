package com.thanksgivingProject.move.Controller;

import com.thanksgivingProject.move.Entity.Room;
import com.thanksgivingProject.move.Service.MoveService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/move")
public class MoveController {
    private final MoveService moveService;

    public MoveController(MoveService moveService) {
        this.moveService = moveService;
    }

    /*@RequestMapping("/{charId}/to/{roomId}")
    public void updateLocation(@PathVariable int charId, @PathVariable int roomId){

    }*/
    @RequestMapping(value = "/addRoom", method = RequestMethod.POST)
    public Room addRoom(@RequestBody Room room) throws Exception{
        return moveService.addRoom(room);
    }


}
