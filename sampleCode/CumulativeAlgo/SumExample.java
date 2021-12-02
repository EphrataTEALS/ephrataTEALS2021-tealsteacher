package sampleCode.CumulativeAlgo;

import java.util.*;

public class SumExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers do you want to add? ");
        int numbersToAdd = s.nextInt();
        System.out.println("Numbers: " + numbersToAdd);

        int sum = 0;
        for (int i=0; i < numbersToAdd; i++) {
            System.out.println("What is the Number that you would like to add? ");
            int value = s.nextInt();
            sum = sum + value;
        }

        System.out.println("The sum is " + sum);
        
    }
        

    
}
