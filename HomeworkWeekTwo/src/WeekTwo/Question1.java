package WeekTwo;

public class Question1 {

	private static final int Exception = 0;

	public static void main(String[] args) {

		int[][] matrice = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 }, { 0, 1, 1 } };

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				int sayac1 = 0;
				int sayac0 = 0;

				for (int j2 = i - 1; j2 <= i + 1; j2++) {

					for (int k = j - 1; k <= j + 1; k++) {

						if (matrice[j2][k] == 0) {
							sayac0++;
						} else {
							sayac1++;
						}

					}

				}
			}

		}

	}

}
