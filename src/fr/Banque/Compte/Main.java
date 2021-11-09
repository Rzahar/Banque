package fr.Banque.Compte;

public class Main {

	public static void main(String[] args) throws BanqueException {
		// TODO Auto-generated method stub
		
		// Test de la classe Compte & Client
		Compte c1 = new Compte(1, 500);
		
		CompteRemunere c1Remu = new CompteRemunere(c1.getNumero(),c1.getSolde(), 0.1);
		System.out.println(" interet : " + c1Remu.calculerInteret());
		
		CompteASeuil c1Seuil = new CompteASeuil(1,2000,40);
		c1Seuil.retirer(20);
	}

}
