package by.khmara.epam.mod02;

public abstract class MassiveOfMassive6 {

	/*
	 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n -
	 * нечетное):
	 */

	public static void main(String[] args) {

		int k;
		int[][] mass;
		int n;
		int count;

		mass = new int[13][13];

		for (int i = 0; i < mass.length; i++) {
			n = mass[i].length;

			for (int j = 0; j < n; j++) {

				mass[i][j] = 1;

				if (i <= n / 2) {

					k = 0;
					while (k < i && i != 0) {

						mass[i][k] = 0;
						mass[i][n - k - 1] = 0;
						k++;
					}

				} else if (i > n / 2) {

					k = 0;
					count = mass.length - 1;

					while (k < i && count > i) {
						mass[i][k] = 0;
						mass[i][n - k - 1] = 0;
						k++;
						count--;
					}
				}

				System.out.print(mass[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
