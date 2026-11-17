package org.example.patterns.behavioral.strategy.paymentmethods.solution;


import org.example.patterns.behavioral.strategy.paymentmethods.solution.strategy.PaymentStrategy;

// Context class - holds reference to a strategy object
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        System.out.print(this.paymentStrategy.getClass().getSimpleName() + ": ");
        paymentStrategy.pay(amount);
    }
}
