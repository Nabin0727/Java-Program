package Exam;

import java.util.Scanner;

public class Input {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a text!");
		String str = input.nextLine();
		
		System.out.println("The input text is " + str);
	}

}
