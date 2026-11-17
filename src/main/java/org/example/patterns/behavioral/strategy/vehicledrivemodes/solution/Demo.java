package org.example.patterns.behavioral.strategy.vehicledrivemodes.solution;


import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.context.GoodsVehicle;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.context.HybridVehicle;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.context.SportsVehicle;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.context.Vehicle;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.strategies.EVDrive;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.strategies.NormalDrive;
import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.strategies.SportsDrive;

public class Demo {
    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes ######");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();
    }
}
