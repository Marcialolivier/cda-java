package tp2;

import java.util.Scanner;

public class Tp2Exo1 {
	public static void main(String[] args) {
		Scanner lecture_clavier=new Scanner(System.in);
		int valeur1;
		int valeur2;
		
		System.out.print("Saisir un entier : ");
		valeur1=lecture_clavier.nextInt();
		System.out.print("Saisir un entier : ");
		valeur2=lecture_clavier.nextInt();
		System.out.print(valeur1+valeur2);
		lecture_clavier.close();
	}

}
