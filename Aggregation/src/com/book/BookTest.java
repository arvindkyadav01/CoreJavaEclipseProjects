package com.book;

public class BookTest {

	static void display(Auther a) {

		System.out.println(a);

	}

	public static void main(String[] args) {

		Auther a1 = new Auther("Robert", 2020, new Book("Rich Dad and Poor Dad", "Tata", 1995, 152));

		System.out.println("Details are:");

		display(a1);

	}
}