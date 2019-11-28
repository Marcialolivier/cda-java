package tp5;

import java.util.Scanner;

public class Tp5Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez un mot : ");
		String mot = sc.next();
		
		int motLong = mot.length(),j = 0,k = 0; 
		char[] tabMot = new char[motLong], tabMotReverse = new char[motLong];
		
		for (int i = 0; i < motLong; i++) {
			tabMot[i] = mot.charAt(i);
		}
		
		for (int i = motLong-1; i >= 0; i--) {
			j = (motLong-1) - i;
			tabMotReverse[j] = mot.charAt(i);
		}
		
		for (int i = 0; i < motLong; i++) {
			if (tabMot[i] != tabMotReverse[i]) {
				k+=1;
			}
		}
		if (k>0) {
			System.out.println("Pas palindrome");
		} else {
			System.out.println("Palindrome");
		}
	}
}


