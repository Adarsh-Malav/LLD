package org.example.patterns.interview.parking_lot.pricing;


import org.example.patterns.interview.parking_lot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

