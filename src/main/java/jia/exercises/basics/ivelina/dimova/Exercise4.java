package jia.exercises.basics.ivelina.dimova;

import java.math.BigInteger;

public class Exercise4 {
	public static void main(String[] args) {
		int num = 10;
		BigInteger factorial = BigInteger.valueOf(1);
		while (true) {
			if (num == 1) {
				break;
			}
			factorial = factorial.multiply(BigInteger.valueOf(num));
			num--;
		}
		System.out.println("n!=" + factorial);
	}
}