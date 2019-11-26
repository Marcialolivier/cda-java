package tp4;

import java.util.Scanner;

public class Tp4Exo2 {

	public static void main(String[] args) {
		float note=0, moy=0;
		int i=0;
		Scanner saisie=new Scanner(System.in);		
		while (note>=0)
			System.out.println("Saisissez vos notes, -1 pour arreter la saisie : ");
			note=saisie.nextFloat();
			moy+=note;
			i++;
			System.out.println("note "+i+" : "+note);
		System.out.println("Fin de saisie");
		System.out.println("moyenne de ces "+i+" notes : "+(moy/i));
		saisie.close();
	}

}
