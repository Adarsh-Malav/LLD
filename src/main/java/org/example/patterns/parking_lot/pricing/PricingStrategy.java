package org.example.patterns.parking_lot.pricing;


import org.example.patterns.parking_lot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

