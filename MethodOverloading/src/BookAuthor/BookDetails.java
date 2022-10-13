package BookAuthor;

public class BookDetails {
	private String name;
	private double Cost;
	private int noOfPages;
	private Author auth;

	public BookDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookDetails(String name, double cost, int noOfPages, Author auth) {
		super();
		this.name = name;
		Cost = cost;
		this.noOfPages = noOfPages;
		this.auth = auth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "BookDetails [name=" + name + ", Cost=" + Cost + ", noOfPages=" + noOfPages + ", auth=" + auth
				+ ", toString()=" + super.toString() + "]";
	}

}
