package ExceptionHanding;

import java.util.Scanner;

public class Main {
	static int numLoginAttempts = 0;

	public static void main(String[] args) {
		while (numLoginAttempts < 3) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter username: ");
			String username = scanner.nextLine();

			System.out.print("Enter password: ");
			String password = scanner.nextLine();
			try {
				login(username, password);
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void login(String username, String password) throws LoginException {
		if (!username.equals("user") || !password.equals("password")) {
			++numLoginAttempts;
			LoginExceed();
			throw new LoginException("Invalid username or password!\n");
		}

		else {
			numLoginAttempts = 0;
			throw new LoginException("Login successful!\n");
		}
	}
	public static void LoginExceed() throws LoginException {
		if (numLoginAttempts >= 3) {
			throw new LoginException("Maximum login attempts exceeded!\n");
		}
	}
}
