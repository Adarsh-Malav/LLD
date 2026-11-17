package org.example.patterns.solidprinciples.InterfaceSegmentaion;

// GOOD: This class follows ISP
 // Now classes only implement what they actually need - Clean implementations
  class Chef implements ChefTasks {
    @Override
    public void prepareFood() {
        System.out.println("Preparing food...");
    }
    @Override
    public void decideMenu() {
        System.out.println("Deciding menu...");
    }

         }
         // GOOD: This class follows ISP
         // Now classes only implement what they actually need - Clean implementations
  class Waiter1 implements WaiterTasks {

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks...");
    }
    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }

         }

     // Usage example - Following ISP
      public class SolutionDemo {

    public static void main(String[] args) {
// Create the objects
// Now classes only implement what they actually support
        Chef chef = new Chef();
        Waiter1 waiter = new Waiter1();

//    Key Benefits of the Refactored Code
// Use the objects
// These work perfectly - no forced implementations
    chef.prepareFood();
    chef.decideMenu();
    // These work perfectly - no forced implementations
    waiter.takeOrder();
    waiter.serveFoodAndDrinks();
}

}