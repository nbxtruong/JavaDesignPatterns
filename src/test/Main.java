package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Message m=new Message();

		Scanner values=new Scanner(System.in);
		System.out.println("Input the message: ");
		String message=values.nextLine();
		m.showMessage(message);
	}
}
