package tp3;

import java.util.Scanner;

public class Tp3Exo4 {

	public static void main(String[] args) {
		int heures, mins, secs, time;
		Scanner	saisie=new Scanner(System.in);
		
		System.out.println("Saisir les heures : ");
		heures=saisie.nextInt();
		System.out.println("Saisir les minutes : ");
		mins=saisie.nextInt();
		System.out.println("Saisir les secondes : ");
		secs=saisie.nextInt();
		
		time=(heures*60+mins)*60+secs;
		System.out.println(time);

	}

}
