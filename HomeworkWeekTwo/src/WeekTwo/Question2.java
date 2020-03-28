package WeekTwo;

public class Question2 {

	public static void main(String[] args) {

		int[][] matrice = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };

		for (int i = 0; i < matrice.length; i++) {

			for (int j = 0; j < matrice[0].length; j++) {

				System.out.print(matrice[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int k = 0; k < 5; k++) {

			for (int t = 4; t < 0; t--) {

				System.out.print(matrice[k][t] + "\t");
			}

		}

	}
}
