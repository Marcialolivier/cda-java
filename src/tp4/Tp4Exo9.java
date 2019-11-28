package tp4;

public class Tp4Exo9 {

	public static void main(String[] args) {
		int nbCase = 64, j = 0;
		long i = 1;
		while (j < nbCase-1) {
			i *= 2;
			j++;
			System.out.println("Case["+j+"] vaut : "+i+".");
		}
	}
}
