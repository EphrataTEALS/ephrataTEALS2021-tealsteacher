package sampleCode.Random;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Print a random number and tells the user whether it is odd
        // or even.

        Random rng = new Random();

        // int randnum = 10;
        
        if (rng.nextInt(10) % 2 == 0) {
            System.out.println(rng.nextInt(10) + " (even)");
        } else {
            System.out.println(rng.nextInt(10) + " (odd)");
        }
    }
}