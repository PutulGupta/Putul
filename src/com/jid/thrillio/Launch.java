package com.jid.thrillio;

import com.jid.thrillio.entities.Bookmark;
import com.jid.thrillio.entities.User;
import com.jid.thrillio.managers.BookmarkManager;
import com.jid.thrillio.managers.UserManager;

public class Launch {
	
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	
	private static void loadData() {
		// TODO Auto-generated method stub
		System.out.println("1. Loading Data");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data...");
		printUserData();
		printBookmarkData();
	}

	
    private static void printUserData() {
		// TODO Auto-generated method stub
		for(User user : users) {
			System.out.println(user);
		}
		
	}
    
    private static void printBookmarkData() {
		// TODO Auto-generated method stub
    	for(Bookmark[] bookmarkList : bookmarks) {
    		for(Bookmark bookmark : bookmarkList) {
    			System.out.println(bookmark);
    		}
    	}
		
	}
    
    private static void start() {
    	System.out.println("\n2. Bookmarking...");
    	for(User user : users) {
    		View.browse(user, bookmarks);
    	}
		
	}

	public static void main(String[] args) {
		loadData();
		start();

	}


	

	

}
