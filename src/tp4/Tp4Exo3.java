package tp4;

import java.util.Scanner;

public class Tp4Exo3 {

	public static void main(String[] args) {
		int i, x;
		String chaine="";
		Scanner saisie=new Scanner(System.in);
		System.out.println("Saisissez la longueur du triange : ");
		x=saisie.nextInt();
				
		for (i=0;i<=x;i++)
		 chaine+="*";
		 System.out.println(chaine);
		saisie.close();
	}

}
