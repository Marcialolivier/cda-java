package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	private static Scanner sc;

	public static void main(String[] args) {
		int val, bit;
		String bin="";
		
		sc = new Scanner(System.in);
		System.out.println("Donner une valeur entiere comprise entre -2147483648 et +2147483647: ");
		val=sc.nextInt();
		System.out.println("Donner un numero de bit (compris entre 0 et 31): ");
		bit=sc.nextInt();
		//CALCUL VAL EN BIN
		while (val > 0) {
			bin += val % 2;
			val /= 2;
		}
		System.out.println(bin);
		System.out.println("Le resultat est : " + bin.charAt(bit) );
		sc.close();
	}

}
