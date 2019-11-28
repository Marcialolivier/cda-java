package tp5;

import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez une entier base 10: ");
		int nb = sc.nextInt(); 
		System.out.println("Base 10 : "+nb);
		int copy = nb;
		
		String bin = "";
		while (nb > 0) {
			bin += nb % 2;
			nb /= 2;
		}
		System.out.println("Base 2 : "+bin);
		
		char[] hexa = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rest;
		String chaine = "";
		
		while (copy > 0) {
			rest = copy%16;
			chaine = hexa[rest] + chaine;
			copy = copy/16;
		}
		System.out.println("Base 16 : "+chaine);
		
	}
}
