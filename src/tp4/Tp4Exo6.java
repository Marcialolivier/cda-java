package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	private static Scanner sc;

	public static void main(String[] args) {

		// VARIABLES
		int nb, calc = 0;

		sc = new Scanner(System.in);
		System.out.println("Saisir le nombre de premiers a additioner : ");
		nb = sc.nextInt()*2;

		// CALCUL
		for (int i = 0; i <= nb; i++) {
			if (i % 2 == 1) {
				calc += i;
			}
		}
		System.out.println(calc);
	}
}
