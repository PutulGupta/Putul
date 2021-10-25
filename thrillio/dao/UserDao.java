package com.jid.thrillio.dao;

import com.jid.thrillio.DataStore;
import com.jid.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}
	

}
