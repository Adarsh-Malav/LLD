package org.example.patterns.solidprinciples.singleResponsiblity;

    public class Marker1 {
         String name;
         String color;
         int price;
         int year;

     public Marker1(String name, String color, int price, int year) {
         this.name = name;
         this.color = color;
         this.price = price;
         this.year = year;
     }
   }
 // GOOD: Following SRP - Each class has a single responsibility

// Responsibility: Managing Invoice data only
    class Invoice1 {

     private Marker1 marker;
     private int quantity;
     private int total;

     public Invoice1(Marker1 marker, int quantity) {
         this.marker = marker;
         this.quantity = quantity;
      }
 // Responsibility 1: Calculate the total(business logic)
     public void calculateTotal() {
         System.out.println("Calculating total...");
         this.total = this.marker.price * this.quantity;
         }
     }
 // Responsibility 2: Managing Database Operations only
    class InvoiceDao {

         Invoice1 invoice;

         public InvoiceDao(Invoice1 invoice) {
            this.invoice = invoice;
         }

     public void saveToDB() {
     // Save into the DB the invoice
     System.out.println("Saving to DB...");
     }
 }
 // Responsibility 3: Printing the Invoice only
  class InvoicePrinter {

    public Invoice1 invoice;
         public InvoicePrinter(Invoice1 invoice) {
           this.invoice = invoice;
         }
         public void print() {
         // print the invoice
         System.out.println("Printing Invoice...");
         }
     }
 // Usage example showing how all classes work together
  class Demo1 {


     public static void main(String[] args) {
          // create the service objects
          Invoice1 invoice = new Invoice1(new Marker1("name", "color", 10,
                 2020), 10);
          InvoiceDao invoiceDao = new InvoiceDao(invoice);
          InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

          // Use the services
          invoice.calculateTotal();
          invoiceDao.saveToDB();
          invoicePrinter.print();
     }
 }