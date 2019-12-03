package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez un mot : ");
		String mot = sc.next();
		
		int motLong = mot.length(),j = 0,k = 0; 
		char[] tabMotReverse = new char[motLong];
		
		for (int i = motLong-1; i >= 0; i--) {
			j = (motLong-1) - i;
			tabMotReverse[j] = mot.charAt(i);
		}
		
		String newMot = String.valueOf(tabMotReverse);

		System.out.println("Votre mot sans a l'envers : " + newMot);
		
	}

}
