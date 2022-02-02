package com.vam.model;

public class UpdateReplyDTO {

	private int bookId;
	
	private double ratingAvg;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getRatingAvg() {
		return ratingAvg;
	}

	public void setRatingAvg(double ratingAvg) {
		this.ratingAvg = ratingAvg;
	}

	@Override
	public String toString() {
		return "UpdateReplyDTO [bookId=" + bookId + ", ratingAvg=" + ratingAvg + "]";
	}
	
	
	
}
