package tp5;

import java.util.Scanner;

public class Tp5Exo1b {

	public static void main(String[] args) { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez le nombre de colonnes : ");
		int nbCol = sc.nextInt();
		System.out.println("Saisissez le nombre de lignes : ");
		int nbLign = sc.nextInt();

		int tab2[][] = new int[nbCol][nbLign];
		
		for (int i = 0; i < tab2.length; i++) {
			for (int j = 0; j < tab2[i].length; j++) {
				System.out.println("Saisissez la valeur Colonne: " + (i + 1) + ", Ligne: " + (j + 1) + " : ");
				tab2[i][j] = sc.nextInt();
				}
			}
		
		int maxi = tab2[0][0], nbZero = 0;
	
		for (int i = 0; i < tab2.length; i++) {
			for (int j = 0; j < tab2[i].length; j++) {
				if (maxi < tab2[i][j]) {
					maxi = tab2[i][j];
				}
				if (tab2[i][j] == 0) {
						nbZero++;
				}
			}
		}
		
		System.out.println("La valeur maximale de tableau est : "+maxi);
		System.out.println("Le nombre de zero dans le tableau est : "+nbZero);
	
	}

}