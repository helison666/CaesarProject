package Data;

public final class UserRepository {
    private static volatile UserRepository instance = null;

	private UserRepository() {
	}
	
    public static UserRepository get() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new UserRepository();
                }
            }
        }
        return instance;
    }

	public IUser getUser1() {
		return User.get()
				.setFirstname("Maxim")
				.setLastname("Kosyak")
				.setRole("Administrator")
				.setLocation("Dnipro")
				.setPhoto("/img/batman_icon.png")
				.setLogin("max")
				.setPassword("kos")
				.build();
	}

	public IUser getUser2() {
		return User.get()
				.setFirstname("Olexandr")
				.setLastname("Gofman")
				.setRole("Teacher")
				.setLocation("Dnipro")
				.setPhoto("/img/batman_icon.png")
				.setLogin("alex")
				.setPassword("gof")
				.build();
	}

	public IUser getLogin() {
		return User.get()
				.setLogin("dmytro")
				.setPassword("1234")
				.build();
	}



}
