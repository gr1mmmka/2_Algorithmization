package by.khmara.epam.mod02;

public class Sort5 {

	/*
	 * 5. Сортировка вставками. Место помещения очередного элемента в
	 * отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
	 * оформить в виде отдельной функции.
	 */

	public static void main(String[] args) {

		int[] mass;

		mass = new int[] { 8, 5, 2, 0, -5, 9, 1, 2, 2 };

		insertionSort(mass);
		System.out.println("Sorted array: ");
		viewArr(mass);
	}

	private static void insertionSort(int[] mass) {
		int temp;
		int posMax;

		for (int i = 1; i < mass.length; i++) {
			posMax = findPosMax(mass, 0, i - 1, mass[i]); // Находим самый левый элемент, который будет больше искомого
			if (posMax != -1) {
				temp = mass[i];
				for (int j = i; j > posMax; j--) {
					mass[j] = mass[j - 1];
				}
				mass[posMax] = temp;
			}
		}
	}

	private static int findPosMax(int[] mass, int left, int right, int x) {

		int mid;
		int posMax;
		posMax = -1;

		do {
			mid = (left + right) / 2;
			if (mass[mid] > x) {
				right = mid - 1;
				posMax = mid;
			} else {
				left = mid + 1;
			}
		} while (left <= right);

		return posMax;
	}

	private static void viewArr(int[] mass) {

		for (int x : mass) {
			System.out.print(x + " ");
		}
	}

}
