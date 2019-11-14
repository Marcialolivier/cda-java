package tp4;

import java.util.Scanner;

public class Tp4Exo4 {

	public static void main(String[] args) {
		// VARIABLES
		int nb, x=0, nbprem;
		// SAISIE
		Scanner saisie=new Scanner(System.in);
		System.out.println("Saisir un entier positif : ");
		nb=saisie.nextInt();
		// ALGO
		if (nb!=1) {
			for (int i=1;i<=nb;i++) {
				nbprem=nb%i;
				x=0;
				for (int j=1;j<=1;j++) {
					nbprem=i%j;
					if (nbprem==0) {
						x+=1;}
					if (x==2) {
						System.out.println(j);}
				if (nbprem==0) {
					x+=1;}
				// NB EST PREMIER
				if (x==2) {
					System.out.println(nb+" est un nombre premier");}
				//NB N'EST PAS PREMIER
				else {
					System.out.println(nb+" n'est pas un nombre premier");}}}}
		// EXCEPTION
		else {
			System.out.println("1 n'est pas un premier par definition");	
		saisie.close();}
		
		
	}

}
