package tables;

import java.util.ArrayList;

public class Commande {

	private int idCommande;

	public Commande(ArrayList<Produit> produits, String quantite) {
		super();
		this.produits = produits;
		this.quantite = quantite;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public ArrayList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	private ArrayList<Produit> produits;
	private String quantite;

}
