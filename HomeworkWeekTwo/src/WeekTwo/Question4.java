package WeekTwo;

public class Question4 {

	static void mukerreriYaz(int[] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {

					System.out.print(array[i] + " ");
				}

			}

		}
	}

	static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 3, 4, 1, 2, 3 };
		printArray(array);
		System.out.println();
		mukerreriYaz(array);

	}

}
