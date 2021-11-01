package studentWork.Random;

import java.util.Random;

public class TestRandom {

    public static void main(String[] Args) {

        Random rand = new Random();
        int e = rand.nextInt(10) * 4;
        System.out.println(e);
    }
}