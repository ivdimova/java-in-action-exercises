package jia.exercises.basics.ivelina.dimova;

public class Exercise2 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 1;
		while (num <= 1000) {
			num++;
			sum += num;
		}
		System.out.print("Sum is:" + sum);
	}

}
