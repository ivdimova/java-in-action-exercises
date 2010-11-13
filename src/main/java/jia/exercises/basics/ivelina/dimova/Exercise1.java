package jia.exercises.basics.ivelina.dimova;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) throws IOException {
		File someFile = new File("employees.txt");
		PrintWriter pw = new PrintWriter(new FileWriter(someFile, true));

		Scanner in = new Scanner(System.in);
		System.out.printf("Enter your name:");
		String name = in.next();
		System.out.printf("Enter your lastname:");
		String lastName = in.next();
		System.out.printf("Enter your age:");
		int age = in.nextInt();
		System.out.printf("Enter your job:");
		String job = in.next();
		System.out.printf("Enter your salary:");
		int salary = in.nextInt();
		pw.printf("%10s | %10s | % d| %15s | %6d %n", name, lastName, age, job,
				salary);
		pw.close();
	}
}
