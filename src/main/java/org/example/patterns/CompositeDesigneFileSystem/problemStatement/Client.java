package org.example.patterns.CompositeDesigneFileSystem.problemStatement;

public class Client {
 public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");

         File rentalReceipt = new File("RentalReceipt");
         movieDirectory.add(rentalReceipt);

         Directory comedyMovieDirectory = new Directory("ComedyMovies");
         File dumbAndDumber = new File("DumbAndDumber");
         comedyMovieDirectory.add(dumbAndDumber);
         movieDirectory.add(comedyMovieDirectory);
        comedyMovieDirectory.add(new File("Adarsh"));
     movieDirectory.add(new Directory("Malav"));

         movieDirectory.printContents();
         }
 }
