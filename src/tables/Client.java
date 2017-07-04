package tables;

public class Client {

	private String idClient;
	private String nom;
	private String prenom;
	private String email;

	public Client(String nom, String prenom, String email, String adrClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adrClient = adrClient;
	}

	public String getIdClient() {
		return idClient;
	}
	

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdrClient() {
		return adrClient;
	}

	public void setAdrClient(String adrClient) {
		this.adrClient = adrClient;
	}

	private String adrClient;

}
