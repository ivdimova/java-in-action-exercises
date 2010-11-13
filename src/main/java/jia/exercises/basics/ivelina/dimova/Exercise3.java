package jia.exercises.basics.ivelina.dimova;

public class Exercise3 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 1;
		while (num < 1000) {
			if ((num % 3 == 0) && (num % 5 == 0)) {
				sum += num;

			}
			num++;

		}
		System.out.print("Sum is:" + sum);
	}
}
