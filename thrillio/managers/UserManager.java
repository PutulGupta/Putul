package com.jid.thrillio.managers;

import com.jid.thrillio.DataStore;
import com.jid.thrillio.dao.UserDao;
import com.jid.thrillio.entities.User;
import com.jid.thrillio.entities.UserBookmark;

public class UserManager {
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);
		
		
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}
	
	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
	}

}
