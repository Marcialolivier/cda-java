package tp5;

import java.util.Arrays;

public class Tp5Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] result = new int [2][2];
		int[][] mat2 = {{5,6},{7,8}};
		int[][] mat1 = {{1,2},{3,4}};
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				int coeff = 0;
				for (int k = 0; k < mat2.length; k++) {
					 coeff += mat1[i][k]*mat2[k][j];
				}
				result[i][j] = coeff;
			}
		}

		for (int[] is : result) {
			System.out.println(Arrays.toString(is));
		}
	}
}
