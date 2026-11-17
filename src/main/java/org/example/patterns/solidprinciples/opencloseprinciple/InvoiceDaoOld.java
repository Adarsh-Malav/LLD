package org.example.patterns.solidprinciples.opencloseprinciple;

import org.example.patterns.solidprinciples.singleResponsiblity.Invoice;
import org.example.patterns.solidprinciples.singleResponsiblity.Marker;

public class InvoiceDaoOld {

    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        // Save into the DB the invoice
        System.out.println("Saving to DB...");
    }
}
         // Responsibility: Managing Database Operations and File Operations
         // BAD: This class violates OCP - needs modification for every new
      class InvoiceDao {

             Invoice invoice;

             public InvoiceDao(Invoice invoice) {
                 this.invoice = invoice;
             }

             public void saveToDB() {
// Save into the DB the invoice
                 System.out.println("Saving to DB...");
// BAD: This design violates OCP
             }
                 // Every time we add a new save function, we need to modify the
                 public void saveToFile () {
                     // Save into the file
                     System.out.println("Saving to file...");
                 }
             }

         // Usage example - showing the problem
      class Demo {
 public static void main(String[] args) {
         Invoice invoice = new Invoice(new Marker("name", "color", 10,
                2020), 10);
         invoice.calculateTotal();

         InvoiceDao databaseFileSave = new InvoiceDao(invoice);
         databaseFileSave.saveToDB(); // Save to DB
         databaseFileSave.saveToFile(); // Save to File

         // Problem: If we want to add a new function like  saveToMongoDB(),
                 // we need to modify InvoiceDao and all its derived classes(if exists)
         // This violates the "closed for modification" part of OCP
         }
 }