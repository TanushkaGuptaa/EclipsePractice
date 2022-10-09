package com.Aggregation;

public class WrittenBooks {

	private String Bookname;
	private String AuthorName;
	private double BookPrice;
	private Address addr;

	public WrittenBooks() {
		super();
	}

	public WrittenBooks(String Bookname, String AuthorName, double BookPrice, Address addr) {
		super();

		this.Bookname = Bookname;
		this.AuthorName = AuthorName;
		this.BookPrice = BookPrice;
		this.addr = addr;

	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public double getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(double bookPrice) {
		BookPrice = bookPrice;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "WrittenBooks [Bookname=" + Bookname + ", AuthorName=" + AuthorName + ", BookPrice=" + BookPrice + "]";
	}

}
