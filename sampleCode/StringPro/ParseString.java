package sampleCode.StringPro;

public class ParseString {

    public static void main(String[] args) {
        
        String book = "Building Java Programs";

        int start = book.indexOf(" ") + 1;
        System.out.println(start);
        String startJava = book.substring(start);
        System.out.println(startJava);
        int end = startJava.indexOf(" ");
        System.out.println(end);
        String endJava = startJava.substring(0, end);
        System.out.println(endJava);


    }
    
}
