package tp6;

import javax.swing.JOptionPane;

public class Tp6Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longueur = 128-32;
		
		int[] decUni = new int[longueur];
		char[] carUni = new char[decUni.length];
		String[] hexUni = new String[decUni.length];
		
		for (int i = 0; i < decUni.length; i++) {
			decUni[i] = i + 32;
			carUni[i] = (char) decUni[i];
			hexUni[i] = Integer.toHexString(decUni[i]);
		}
		
		String tabUni;
		
		tabUni = "<html><table border='1'>";
		tabUni += "<tr><th>DEC</th><th>CAR</th><th>HEX</th></tr>";
		for (int i = 0; i < decUni.length; i++) {
			tabUni += "<tr><th>"+decUni[i]+"</th><th>"+carUni[i]+"</th><th>"+hexUni[i]+"</th></tr>";
		}
		tabUni += "</table></html>";
		
		JOptionPane.showMessageDialog(null, tabUni, "UNICODE", JOptionPane.PLAIN_MESSAGE);
	}
}
