package org.example.patterns.parking_lot.parkinglot;


import org.example.patterns.parking_lot.Entity.Vehicle;
import org.example.patterns.parking_lot.Ticket;

public class EntranceGate {

    public Ticket enter(ParkingBuilding building, Vehicle vehicle) {
        return building.allocate(vehicle);
    }
}


