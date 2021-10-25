package com.jid.thrillio.controllers;

import com.jid.thrillio.entities.Bookmark;
import com.jid.thrillio.entities.User;
import com.jid.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {

	}

	public static BookmarkController getInstance() {
		return instance;
	}

	public <getkidFriendlyStatus> void saveUserBookmark(User user,getkidFriendlyStatus kidsFriendlyStatus, Bookmark bookmark ) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);

	}

	public void setKidFriendlyStatus(User user, String kidsFriendlyStatus, Bookmark bookmark) {
		BookmarkManager.getInstance().setKidsFriendlyStatus(user, kidsFriendlyStatus, bookmark);

	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user, bookmark);
		
	}

}
