package sampleCode.Jepardy;

import java.util.*;

public class test {
    
    public static void main(String[] args) {

        int test = doSomething(3);
        System.out.println(test);
    }
 
        public static int doSomething(int times) {
            for (int i = 0; i < times; i++) {
                System.out.println("Doing something");
            }
            return somethingElse(times + 4);
        }
        public static int somethingElse(int x) {
            return x * x;
        }         
}
