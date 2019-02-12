package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,i=0;
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));

	 while (i<=numero) {
		 JOptionPane.showMessageDialog(null, "El numero es " + i);
		 i++;
	 }
		 	
	}
}

