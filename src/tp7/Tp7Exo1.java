package tp7;

import java.util.Scanner;

public class Tp7Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisissez le rayon de votre cercle en cm: ");
		double rayon = sc.nextDouble();
		
		double perimetre = perimetre(rayon);
		System.out.println("Le perimetre de votre cercle est : "+perimetre+"cm");
		double surface = surface(rayon);
		System.out.println("Le perimetre de votre cercle est : "+surface+"cm");
	}

	public static double perimetre(double rayon) {
		double resultat;
		resultat = 2 * Math.PI * rayon;
		return resultat;

	}

	public static double surface(double rayon) {
		double resultat;
		resultat = 4 / 3 * Math.PI * Math.pow(rayon, 3);
		return resultat;
	}
}
