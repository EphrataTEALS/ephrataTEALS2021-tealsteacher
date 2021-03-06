package sampleCode.Scanner;

import java.util.Scanner;  // Import the Scanner class

public class SimpleScanner {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in); // Instantiate a new Scanner Object

        // Obtain Darwin's inputs

        System.out.println("Enter Darwin's Money in wallet: ");
        double darwinMoney = console.nextDouble();
        
        System.out.println("Enter Darwin's Meal cost: ");
        double darwinMeal = console.nextDouble();
        
        System.out.println("Enter Darwin's Tip %: ");
        double darwinTip = console.nextDouble();

        // Print out the values assigned to the variables

        System.out.println("Value in darwinMoney variable: " + darwinMoney);
        System.out.println("Value in darwinMeal variable: " + darwinMeal);
        System.out.println("Value in darwinTip variable: " + darwinTip);
    }
}