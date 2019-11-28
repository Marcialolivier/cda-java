package tp5;

public class Tp5Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notes = {12,15.25,13.5,8.75};
		double somme = 0, moy; 
		int nbNoteSup=0;
		
		System.out.println("combien de notes : "+notes.length);
		for (int i = 0; i < notes.length; i++) {
			System.out.println("notes "+(i+1)+" : "+notes[i]);
			somme += notes[i];
		}
		
		moy = somme/notes.length;
		System.out.println("moyenne de ces "+notes.length+" notes : "+moy);
		
		for (int i = 0; i < notes.length; i++) {
			if (notes[i]>moy) {
				nbNoteSup++;
			}
		}
		
		System.out.println("Nombres de notes supérieures à la moyenne : "+nbNoteSup);
	}
}
