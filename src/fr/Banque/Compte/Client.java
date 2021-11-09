package fr.Banque.Compte;

import java.util.ArrayList;

public class Client {
	/*
	 * Création de l'onglet Client
	 */

	// On initie les variables désirées
	private String nom;
	private String prenom;
	private int age;
	private int numero;
	private Compte[] comptes;

	// Création du constructeur vide
	public Client() {
		super();
	};

	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	// Constructor avec les var du Compte
	public Client(String nom, String prenom, int age, int numero, Compte[] comptes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
		this.comptes = comptes;
	}

	// Création des différents Getter/Setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Compte[] getComptes() {
		return comptes;
	}
	// Fin des Getters/Setters

	// Fonction de création de compte
	public void ajouterCompte(Compte unCompte) throws BanqueException {
		if (this.comptes.length == 5) {
			throw new BanqueException("Vous ne pouvez créer de nouveau compte");
		} else {
			int nbCompte = 0;
			for (int i = 0; i < this.comptes.length; i++) {
				if (this.comptes[i] != null) {
					if (this.comptes[i].getNumero() == unCompte.getNumero()) {
						System.out.println("ce compte existe déjà");
						break;
					}
					nbCompte += 1;
					continue;
				} else {
					this.comptes[i] = unCompte;
					nbCompte += 1;
					break;
				}
			}
			if (nbCompte >= 5) {
				System.out.println("Il n'y a plus de place disponible !");
			}
		}
	}

	// Création d'une fonction d'ajout de compte
	public void setComptes(Compte[] comptes) {
		if (comptes.length != 5) {
			System.out.println("Le tableau doit contenir 5 comptes");
		} else {
			this.comptes = comptes;
		}
	}

	// Creation d'une fonction de recherche de compte
	public Compte getCompteByNum(int numeroCompte) {
		Compte findCompte = new Compte();
		for (int i = 0; i < this.comptes.length; i++) {
			findCompte = this.comptes[i];
			break;
		}
		if (findCompte.equals(null)) {
			System.out.println("Le compte n'a pas été trouvé");
		}
		return findCompte;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", numero=" + numero + ", account="
				+ comptes + this.getNumero() + "]";
	}

}
