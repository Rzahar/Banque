package fr.Banque.Compte;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteRemunere {
	private double taux;

		public CompteASeuilRemunere () {
			super();
		}
		
		public CompteASeuilRemunere(int numero, int solde, double taux) {
			super(numero, solde, taux);			
		}
		
		
}
