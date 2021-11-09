package fr.Banque.Compte;

public interface ICompteRemunere {
	public double calculerInteret();
	public void verserInteret();
	public double getTaux();
	public void setTaux(double taux);
	
}
