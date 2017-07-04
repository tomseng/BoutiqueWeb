package tables;

public class User {

	private int idUser;
	private String email;
	private String password;
	private String username;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(String email, String password, String username) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
	}



	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public void setUsername(String username) {
		
	}



	public String getUsername() {
		return username;
	}
}
