package org.example.patterns.solidprinciples.dependencyInversionPrinciple;

// VIOLATION OF DIP
 // High-level module directly depending on low-level module
public class MackBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

//    private final Keyboard keyboard;
//    private final Mouse mouse;                                          //the above code is commented to show the correct implementation of DIP
    // Direct dependency on concrete class

//    public MackBook(Mouse mouse, Keyboard keyboard) {
//         this.keyboard = keyboard; // Works with any kind of keyboar and mouse
//         this.mouse = mouse;
//    }
    public MackBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse)
    {
        keyboard = wiredKeyboard; // Tight coupling
        mouse = wiredMouse; // Tight coupling
    }
    public Mouse getMouse() {
        return mouse;
    }
    public Keyboard getKeyboard() {
        return keyboard;
    }
 }

  class DemoViolation {

     public static void main(String[] args) {

// create keyboard and mouse objects
         WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell",
                 "F602", "Grey");
         WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602",
                 "Grey");
         BluetoothKeyboard bluetoothKeyboard = new
                 BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
         BluetoothMouse bluetoothMouse = new
                 BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");
// create macbook
         MackBook macBookWithWiredParts = new MackBook(wiredKeyboard,
                 wiredMouse);
         macBookWithWiredParts.getKeyboard().getSpecifications();
         macBookWithWiredParts.getMouse().getSpecifications();
// create macbook with bluetooth keyboard and mouse
// MackBook macBookWithBluetoothParts = new MackBook(bluetoothKeyboard, bluetoothKeyboard);
// cannot create macbook with bluetooth keyboard and mouse
//         because  Problems with the Above Code
//         The MackBook is tightly coupled to the WiredKeyboard and the WiredMouse.
//                 Cannot create MackBook objects with different parts without modifying the MackBook class.
//         Difficult to test MackBook in isolation
//         High-level module MackBook depends on low-level module WiredKeyboard and the WiredMouse.
//                 Code Example: Follows DIP
//         Utility Code remains the same
         // macbook depends on wired keyboard and mouse - tight
//         coupling - violation of DIP
          }
 }
