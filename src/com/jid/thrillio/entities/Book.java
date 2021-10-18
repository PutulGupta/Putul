package com.jid.thrillio.entities;

import java.util.Arrays;

import com.jid.thrillio.constants.BookGenre;
import com.jid.thrillio.partner.Shareable;

public class Book extends Bookmark implements Shareable {
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazonRatings;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRatings() {
		return amazonRatings;
	}

	public void setAmazonRatings(double amazonRatings) {
		this.amazonRatings = amazonRatings;
	}

	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publisher=" + publisher + ", authors="
				+ Arrays.toString(authors) + ", genre=" + genre + ", amazonRatings=" + amazonRatings + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		if (genre.equals(BookGenre.PHILOSOPHY) || genre.equals(BookGenre.SELF_HELP)) {
			return true;
		}
		return false;
		
	}

	@Override
	public String getItemData() {
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
		   builder.append("<type>Book</type>");
		   builder.append("<titile>").append(getTitle()).append("</title>");
		   builder.append("<publisher>").append(publisher).append("</publisher>");
		   builder.append("<author>").append(String.join(",", authors)).append("</author>");
		   
		   builder.append("<publicationYear>").append(publicationYear).append("</publicationYear>");
		   builder.append("<genre>").append(genre).append("</genre>");
		   builder.append("<amazonRating>").append(amazonRatings).append("</amazonRating>");
		   
		builder.append("</item>");
		return builder.toString();

	}

}
