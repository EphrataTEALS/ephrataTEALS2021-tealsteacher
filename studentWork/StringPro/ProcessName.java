package studentWork.StringPro;

import java.util.*;  // for Scanner

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        // read the entire input as a single line
        String input = console.nextLine();
        
        int spaceIndex = input.indexOf(" ");
        String lastName = input.substring(spaceIndex + 1);
        char firstInitial = input.charAt(0);
        
        String name = lastName + ", " + firstInitial + ".";
        
        System.out.println("Your name is: " + name);
    }
}