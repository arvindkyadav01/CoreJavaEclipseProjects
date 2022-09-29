package com.book;

public class Auther {

	private String authername;
	private int year;
	private Book book; // aggregation weak assocition

	public Auther() {

		super();
	}

	public Auther(String authername, int year, Book book) {
		super();
		this.authername = authername;
		this.year = year;
		this.book = book;
	}

	public String getAuthername() {
		return authername;
	}

	public void setAuthername(String authername) {
		this.authername = authername;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Auther [authername=" + authername + ", year=" + year + ", book=" + book + "]";
	}

}
