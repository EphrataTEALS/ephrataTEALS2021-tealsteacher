package sampleCode.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class Lunch {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in); // Instantiate a new Scanner Object

        // Prompt for inputs
        
        System.out.println("How much money did you pay for lunch at your favorite restaurant?");
        double costOfLunch = console.nextDouble();
        

        // Print out the values assigned to the variables

        System.out.println("I paid $" + costOfLunch + " for my lunch.");

    }
}