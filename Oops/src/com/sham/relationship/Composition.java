package com.sham.relationship;

import java.util.ArrayList;
import java.util.List;

class Room {
    private String name;
    public Room(String name) { this.name = name; }
    public String getName() { return name; }
}

class House {
    private String address;
    private List<Room> rooms = new ArrayList<>();

    public House(String address) { this.address = address; }

    public void addRoom(String roomName) { rooms.add(new Room(roomName)); }

    public void showRooms() {
        System.out.println("House at " + address + " has rooms:");
        for (Room r : rooms) System.out.println(r.getName());
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House("123 Main St");
        house.addRoom("Living Room");
        house.addRoom("Bedroom");

        house.showRooms();

        // Rooms cannot exist without House reference
    }
}
