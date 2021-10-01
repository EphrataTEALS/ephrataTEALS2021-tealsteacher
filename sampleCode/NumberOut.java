package sampleCode;

public class NumberOut {
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		methodOne();
	}
	
	public static void methodOne() {
		System.out.println("1");
	}

	public static void methodTwo() {
		methodOne();
		System.out.println("2");
	}
}
