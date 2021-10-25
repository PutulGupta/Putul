package com.jid.thrillio;

import com.jid.thrillio.constants.UserType;
import com.jid.thrillio.constants.kidFriendlyStatus;
import com.jid.thrillio.controllers.BookmarkController;
import com.jid.thrillio.entities.Bookmark;
import com.jid.thrillio.entities.User;
import com.jid.thrillio.partner.Shareable;

public class View {

	private static final Bookmark kidsFriendlyStatus = null;

	public static void browse(User user, Bookmark[][] bookmarks) {
		System.out.println("\n" + user.getEmail() + "is browsing items...");
		int bookmarkCount = 0;
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				if (bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
					boolean isBookmarked = getBookmarkDecision(bookmark);
					if (isBookmarked) {
						bookmarkCount++;

						BookmarkController.getInstance().saveUserBookmark(user, kidsFriendlyStatus, bookmark);

						System.out.println("New item bookmarked..." + bookmark);

					}
				}
				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) {
					if (bookmark.isKidFriendlyEligible()
							&& bookmark.getKidsFriendlyStatus().equals(kidFriendlyStatus.UNKNOWN)) {
						String kidsFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						if (!kidsFriendlyStatus.equals(kidFriendlyStatus.UNKNOWN)) {
							BookmarkController.getInstance().setKidFriendlyStatus(user, kidsFriendlyStatus, bookmark);
						}

					}
					if(bookmark.getKidsFriendlyStatus().equals(kidFriendlyStatus.APPROVED) && bookmark instanceof Shareable) {
						boolean isShared = getShareDecision();
						if(isShared) {
							BookmarkController.getInstance().share(user, bookmark);
						}
					}
				}
			}
		}
	}
	\// ToDo: Below methods simulate user input. After IO, we take input via console.

	private static boolean getShareDecision() {
		return Math.random() < 0.5 ? true : false;
		
	}

	private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
		double randomVal = Math.random();
		return randomVal < 0.4 ? kidFriendlyStatus.APPROVED
				: (randomVal >= 0.4 && randomVal < 0.8) ? kidFriendlyStatus.REJECTED : kidFriendlyStatus.UNKNOWN;
	}

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return (Math.random() < 0.5 ? true : false);
	}
}
