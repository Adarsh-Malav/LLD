package org.example.patterns.interview.DesingeVendingMachine.VendingState.impl;

import org.example.patterns.interview.DesingeVendingMachine.Item;
import org.example.patterns.interview.DesingeVendingMachine.VendingMachine;
import org.example.patterns.interview.DesingeVendingMachine.VendingState.State;

public class DispenseState extends State {

        DispenseState(VendingMachine machine, int codeNumber) throws Exception{
         System.out.println("Currently Vending machine is in DispenseState");
                 dispenseProduct(machine, codeNumber);
        }

         @Override
         public Item dispenseProduct(VendingMachine machine, int
                 codeNumber) throws Exception{
              System.out.println("Product has been dispensed");
              Item item = machine.getInventory().getItem(codeNumber);
              machine.getInventory().updateSoldOutItem(codeNumber);
              machine.setVendingMachineState(new IdleState(machine));
             return item;
              }
 }
