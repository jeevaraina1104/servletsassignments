package Topic2;

public class User {

	private String userName;
	private String passsword;
	private String userType;

	public User(String userName, String passsword, String userType) {
		super();
		this.userName = userName;
		this.passsword = passsword;
		this.userType = userType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

}
