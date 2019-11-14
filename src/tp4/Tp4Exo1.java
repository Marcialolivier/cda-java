package tp4;

public class Tp4Exo1 {

	public static void main(String[] args) {
		double n1=12, n2=15.25, n3=13.5, n4=8.75, moyenne;
		int nombresNotes = 4;
		
		moyenne= n1+n2+n3+n4/nombresNotes;
		System.out.println("combien de notes : "+nombresNotes);
		System.out.println("note 1 : "+n1);
		System.out.println("note 2 : "+n2);
		System.out.println("note 3 : "+n3);
		System.out.println("note 4 : "+n4);
		System.out.println("moyenne de ces 4 notes : "+moyenne);
	}

}
