package tp3;

public class Tp3Exo2 {

	public static void main(String[] args) {
		int n=10, p=4;
		long q=2111000222;
		float x=1.75f, result=0;
		
		result=n+q;
		System.out.println(result+", type= long");
		result=n+x;
		System.out.println(result+", type= float");
		result=n%p*q;
		System.out.println(result+", type= float");
		result=n%-p*n;
		System.out.println(result+", type= int");
		result=-n%p*n;
		System.out.println(result+", type= int");
	}

}
