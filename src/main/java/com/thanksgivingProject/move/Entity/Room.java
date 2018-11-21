package com.thanksgivingProject.move.Entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity(name = "ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Room_Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "Exits")
    private ArrayList<Integer> exits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Integer> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Integer> exits) {
        this.exits = exits;
    }

    public Room() {
    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Room(int id, String name, String description, ArrayList<Integer> exits) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.exits = exits;
    }
}
