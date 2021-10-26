package studentWork.loops2;

import java.util.Scanner;

// This Multiplication of an entered number by One To Ten class would print a multiplication table on an entered number multiplied by 1 through 10


public class Multiples {

    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    // This is where to write the for loop that does the multiplication
     
        for(int i = 1; i <=10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }


    System.out.println("The Iteration is Complete");  //add appropriate ending statement
    }
}