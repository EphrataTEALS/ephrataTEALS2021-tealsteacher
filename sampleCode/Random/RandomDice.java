package sampleCode.Random;

import java.util.Random;

public class RandomDice {

    public static void main(String[] Args) {
    Random r = new Random();
    int diceRoll = r.nextInt(6) + 1;
    System.out.println("Roll is: " + diceRoll);
    }
}
