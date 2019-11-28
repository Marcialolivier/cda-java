package tp4;

import java.util.Arrays;

public class Tp4Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibo = new int[20];
		float nbOr;
		fibo[0] = 1;
		fibo[1] = 2;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i]=fibo[i-2]+fibo[i-1];
		}
		System.out.println(Arrays.toString(fibo) );
		for (int i = 1; i < fibo.length; i++) {
			nbOr=(float)fibo[i]/fibo[i-1];
			if (nbOr > 1.6179 & nbOr < 1.6181) {
				System.out.println(fibo[i]+" est dans l'intervalle.("+nbOr+")");
			}
		}
	}

}
