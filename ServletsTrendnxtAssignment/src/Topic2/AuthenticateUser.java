package Topic2;

import java.util.HashMap;
import java.util.Map;

public class AuthenticateUser {
	Map<String, String> userDetails = new HashMap<>();

	public AuthenticateUser() {
		super();
		userDetails.put("jeeva", "jeeva");
		userDetails.put("user", "password");
	}

	public boolean authenticate(String userName, String password) {
		if (userDetails.containsKey(userName) && userDetails.get(userName).equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public User fetchUserDetails(String userName) {
		User user = new User(userName, userDetails.get(userName), "Ram".equals(userName) ? "A" : "E");
		return user;
	}
}
