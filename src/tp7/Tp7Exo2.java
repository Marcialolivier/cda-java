package tp7;

import java.util.Scanner;

public class Tp7Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[3];

		for (int i = 0; i < tab.length; i++) {
			System.out.println("Saisissez un entier " + i + ": ");
			tab[i] = sc.nextInt();
		}
  
		int max = plusGrand(tab);

		System.out.println("le plus grand chiffre est :" + max);
	}

	public static int plusGrand(int[] tab) {
		int max = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
			System.out.println(max);
		}
		return max;
	}
}
