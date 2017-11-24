package Data;

interface IFirstname {
	ILastname setFirstname(String firstname);
}

interface ILastname {
	IRole setLastname(String lastname);
}

interface IRole {
	ILocation setRole(String role);
}

interface ILocation {
	IPhoto setLocation(String location);
}

interface IPhoto {
	ILogin setPhoto(String photo);
}

interface ILogin {
	IPassword setLogin(String login);
}

interface IPassword {
	IBuildUser setPassword(String password);
}


interface IBuildUser {
	User build();
}

public class User implements IFirstname, ILastname, IRole,
        ILocation, IPhoto, ILogin, IPassword, IBuildUser, IUser {

	private String firstname;	// must be
	private String lastname;	// must be
	private String role;		// must be
	private String location;
	private String photo;
	private String login;		// must be
	private String password;	// must be

	
	private User(){
		this.firstname = "";
		this.lastname = "";
		this.role = "";
		this.location = "";
		this.photo = "";
		this.login = "";
		this.password = "";
	}

	public static User get() {
		return new User();
	}

	//setters

	public ILastname setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}


	public IRole setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public ILocation setRole(String role) {
		this.role = role;
		return this;
	}

	public IPhoto setLocation(String location) {
		this.location = location;
		return this;
	}

	public ILogin setPhoto(String photo) {
		this.photo = photo;
		return this;
	}

	public IPassword setLogin(String login) {
		this.login = login;
		return this;
	}

	public IBuildUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public User build() {
		return this;
	}



	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getRole() {
		return role;
	}

	public String getLocation() {
		return location;
	}

	public String getPhoto() {
		return photo;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}


	public User setFirstName(String firstname) {
		this.firstname = firstname;
		return this;
	}






}
