package io.zipcoder.polymorphism;
import java.util.Scanner;


public class User {

public void ask() {
    Scanner pet = new Scanner(System.in);
    System.out.println("How many pets do you have?");
    int noOfPets = pet.nextInt();

    Scanner kind = new Scanner(System.in);
    System.out.println("What kind is each pet?");
    String petKind = kind.nextLine();

    Scanner n= new Scanner(System.in);
    System.out.println("What are your pets names?");
    String name = n.nextLine();

}
}
