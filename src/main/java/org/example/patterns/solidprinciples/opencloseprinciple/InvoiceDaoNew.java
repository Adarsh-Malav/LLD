package org.example.patterns.solidprinciples.opencloseprinciple;

import org.example.patterns.solidprinciples.singleResponsiblity.Invoice;
import org.example.patterns.solidprinciples.singleResponsiblity.Marker;

public interface InvoiceDaoNew {
        public void save();
    }

class DatabaseInvoiceDao implements InvoiceDaoNew {
    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
            }

             @Override
        public void save() {
             // Save into the DB the invoice
             System.out.println("Saving to DB...");
         }
        }


// Concrete implementation for FileInvoiceDao
 // NEW File Save Operation: An extension without modification!
    class FileInvoiceDao implements InvoiceDaoNew {

         Invoice invoice;

         public FileInvoiceDao(Invoice invoice) {
         // set the invoice
             this.invoice = invoice;
         }

         @Override
        public void save() {
         // Save into the file the invoice
             System.out.println("Saving to file...");
         }
 }

         // Usage demonstrating OCP compliance
          class Demo2 {
     public static void main(String[] args) {
         Invoice invoice = new Invoice(new Marker("name", "color", 10,
                 2020), 10);
         invoice.calculateTotal();

         InvoiceDaoNew databaseInvoiceDao = new
                 DatabaseInvoiceDao(invoice);
         databaseInvoiceDao.save(); // Save to DB

         InvoiceDaoNew fileInvoiceDao = new FileInvoiceDao(invoice);
         fileInvoiceDao.save(); // Save to File
 }
}