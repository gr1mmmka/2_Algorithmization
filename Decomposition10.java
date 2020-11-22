package by.khmara.epam.mod02;

import java.util.Scanner;

public class Decomposition10 {

	/*
	 * 10. Дано натуральное число N. Написать метод(методы) для формирования
	 * массива, элементами которого являются цифры числа N.
	 */

	static long n;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		n = sc.nextLong();

		for (int x : fillMass())
			System.out.print(x + " ");

	}

	public static int[] fillMass() {

		int[] mass;
		String str;

		str = n + "";
		mass = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			mass[i] = Character.digit(str.charAt(i), 10);
		}

		return mass;
	}
}
