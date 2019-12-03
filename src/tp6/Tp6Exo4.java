package tp6;

import java.util.Arrays;
import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// CREATION TABLEAU
		System.out.println("Saisissez la longueur du tableau : ");
		int lgTab = sc.nextInt();
		String tabChaine[] = new String[lgTab];
		for (int i = 0; i < tabChaine.length; i++) {
			System.out.println("Saisissez la valeur" + (i + 1) + " : ");
			tabChaine[i] = sc.next();
		}

		/*char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int indice = 0, indice2 = 0;

		for (int i = 0; i < tabChaine.length-1; i++) {
			for (int j = 0; j < tabChaine[i].length(); j++) {
				for (int k = 0; k < alphabet.length; k++) {
					if (tabChaine[i].charAt(j) == alphabet[k])
						indice = k;
					if (tabChaine[i+1].charAt(j) == alphabet[k])
						indice2 = k;
					if (indice > indice2) {
						String permut = tabChaine[i+1];
						tabChaine[i+1] = tabChaine[i];
						tabChaine[i] = permut;
						break;
					}
				}
			}
		}*/
		
		Arrays.sort(tabChaine);
		

		System.out.println(Arrays.toString(tabChaine));
	}
}
