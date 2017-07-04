package tables;

public class Produit {

	private int idProduit;

	public Produit(String nomProduit, String descProduit) {
		super();
		this.nomProduit = nomProduit;
		this.descProduit = descProduit;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescProduit() {
		return descProduit;
	}

	public void setDescProduit(String descProduit) {
		this.descProduit = descProduit;
	}

	private String nomProduit;
	private String descProduit;
}
