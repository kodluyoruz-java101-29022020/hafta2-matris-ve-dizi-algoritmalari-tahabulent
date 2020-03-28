package WeekTwo;

import java.util.Random;

public class Question3 {
	static Random rnd = new Random();

	static int[][] fillMatrice(int rowcount, int columncount) {

		int[][] a = new int[rowcount][columncount];
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < columncount; j++) {
				a[i][j] = rnd.nextInt(10);
			}
		}
		return a;
	}

	static void printMatrice(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

	}

	static int[][] matriceMultiplication(int[][] a, int[][] b) {

		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				for (int k = 0; k < b.length; k++) {

					result[i][j] += a[i][k] * b[k][j];

				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a, b, c;
		a = fillMatrice(3, 4);
		printMatrice(a);
		System.out.println("------");
		b = fillMatrice(4, 5);
		printMatrice(b);
		System.out.println("------");
		c = matriceMultiplication(a, b);
		printMatrice(c);
	}

}
