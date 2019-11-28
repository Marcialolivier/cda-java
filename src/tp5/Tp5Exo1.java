package tp5;

import java.util.Scanner;

public class Tp5Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez la longueur du tableau");
		int[] tab = new int[sc.nextInt()];

		for (int i = 0; i < tab.length; i++) {
			System.out.println(i +1+ " Saisissez une valeure entiere = ");
			tab[i] = sc.nextInt();
		}
		
		int maxi = tab[0], nbZero = 0;
		
		for (int i = 0; i < tab.length; i++) {
			if (maxi < tab[i]) {
				maxi = tab[i];
			}
			if (tab[i] == 0) {
					nbZero++;
			}
		}
		
		System.out.println("La valeur maximale de tableau est : "+maxi);
		System.out.println("Le nombre de zero dans le tableau est : "+nbZero);
	}
		
}
		
		
