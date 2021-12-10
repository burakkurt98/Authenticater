
public class PersonalInformation {
	
	private String userName;
	private String password;
	private String name;
	private String surname;
	private String job;
	private String newPassword;
	
	public PersonalInformation(String username, String password, String name, String surname, String job ,String newPassword) {
		this.userName = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.job = job;
		this.newPassword = newPassword;

	}
	
	public PersonalInformation() {
	}
	
	public String getUsername() {
		return userName;
	}
	
	public void setUsername(String username) {
		this.userName = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setjob(String job) {
		this.job = job;
	}
	
	public String toString() {
		return "MODEL CLASS";
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
