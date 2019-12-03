package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez un mot : ");
		String mot = sc.next();
		System.out.println("Votre mot : " + mot);

		int motLong = mot.length(), j=0;
		char[] tabMot = new char[motLong];

		for (int i = 0; i < mot.length(); i++) {
			if (mot.charAt(i) != 'e') {
				j++;
				tabMot[j] = mot.charAt(i);
			}
		}
		
		String newMot = String.valueOf(tabMot);

		System.out.println("Votre mot sans 'e' : " + newMot);

	}

}
