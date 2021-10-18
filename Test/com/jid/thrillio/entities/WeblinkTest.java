package com.jid.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import com.jid.thrillio.managers.BookmarkManager;

class WeblinkTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test1: porn in url -- false
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",	"http://www.javaworld.com,	unknown");
		boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse("For porn in url - isKidFriendly() must return false", isKidFriendlyEligible);
		
		//Test 2: porn in title -- false
		webLink = BookmarkManager.getInstance().createWebLink(2000,	"Taming porn, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.javaworld.com,	unknown");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse("For porn in title - isKidFriendly() must return false", isKidFriendlyEligible);
		
		//Test 3: adult in host -- false
		webLink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2",	"http://www.adult.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.adult.com,	unknown");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse("For adult in host - isKidFriendly() must return false", isKidFriendlyEligible);
		
		//Test 4: adult in url but not in host part -- true
		webLink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",	"http://www.javaworld.com,	unknown");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue("For adult in url but not host - isKidFriendly() must return true", isKidFriendlyEligible);
		
		//Test 5: adult in title only -- true
		webLink = BookmarkManager.getInstance().createWebLink(2000,	"Taming adult, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",	"http://www.javaworld.com,	unknown");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue("For adult in title - isKidFriendly() must return true", isKidFriendlyEligible);
		
	}

}
