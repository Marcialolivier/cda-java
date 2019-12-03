package tp5;

import java.util.Arrays;
import java.util.Scanner;

public class Tp5Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez la longueur du tableau : ");
		int lgTab = sc.nextInt(); 
		
		int[] tab = new int[lgTab];
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Saisissez la valeur"+(i+1)+" : ");
			tab[i] = sc.nextInt(); 
		}
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.println("i =" + tab[i] +" < j =" + tab[j]);
				if (tab[i]<tab[j]){
					int permut = tab[j];
					tab[j] = tab[i];
					tab[i] = permut;
				}
			}
		}

		
		System.out.println(Arrays.toString(tab));
	}

}
