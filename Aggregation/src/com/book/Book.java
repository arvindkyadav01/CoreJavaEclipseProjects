package com.book;

public class Book {

	private String bookname;
	private String publication;
	private int publicaionyear;
	private double price;

	public Book() {

		super();
	}

	public Book(String bookname, String publication, int publicaionyear, double price) {
		super();
		this.bookname = bookname;
		this.publication = publication;
		this.publicaionyear = publicaionyear;
		this.price = price;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getPublicaionyear() {
		return publicaionyear;
	}

	public void setPublicaionyear(int publicaionyear) {
		this.publicaionyear = publicaionyear;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return bookname + " " + publication + " " + publicaionyear + " " + price;
	}

}
