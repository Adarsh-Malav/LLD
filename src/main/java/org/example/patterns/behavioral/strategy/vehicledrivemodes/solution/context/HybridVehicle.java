package org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.context;


import org.example.patterns.behavioral.strategy.vehicledrivemodes.solution.strategies.DriveStrategy;

// Concrete context subclass
public class HybridVehicle extends Vehicle {

    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
