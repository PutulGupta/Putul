package com.jid.thrillio.dao;

import com.jid.thrillio.DataStore;
import com.jid.thrillio.entities.Bookmark;
import com.jid.thrillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}

}
