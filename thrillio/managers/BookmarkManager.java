package com.jid.thrillio.managers;

import com.jid.thrillio.dao.BookmarkDao;
import com.jid.thrillio.entities.Book;
import com.jid.thrillio.entities.Bookmark;
import com.jid.thrillio.entities.Movie;
import com.jid.thrillio.entities.User;
import com.jid.thrillio.entities.UserBookmark;
import com.jid.thrillio.entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {

		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);

		return movie;

	}

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre,
			double amazonRating) {
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(publisher);

		return book;

	}

	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink wb = new WebLink();
		wb.setId(id);
		wb.setTitle(title);
		wb.setUrl(url);
		wb.setHost(host);

		return wb;

	}

	public Bookmark[][] getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);

		dao.saveUserBookmark(userBookmark);

	}

	public void setKidsFriendlyStatus(User user, String kidsFriendlyStatus, Bookmark bookmark) {
	    bookmark.setKidsFriendlyStatus(bookmark);
		bookmark.setKidsFriendlyStatus(user);
		System.out.println(
				"kid friendly status:" + kidsFriendlyStatus + ",Marked by " + user.getEmail() + ", " + bookmark);

	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		bookmark.setSharedBy(user);
		
		System.out.println("Data to be shared");
		if(bookmark instanceof Book) {
			System.out.println(((Book) bookmark).getItemData());
			
		}
		else if(bookmark instanceof WebLink) {
			System.out.println(((WebLink) bookmark).getItemData());
		}
		
	}

}
