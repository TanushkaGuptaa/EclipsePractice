package BookAuthor;

public class AuthorBookDetails {

	static void display(BookDetails b) {

		System.out.println("Author Name:" + b.getName());
		System.out.println("Book Cost:" + b.getCost());
		System.out.println("Number Of Book Pages:" + b.getNoOfPages());
		System.out.println("Book Author Details:" + b.getAuth());

		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDetails b1 = new BookDetails("ravan", 100, 200, new Author("Amish", "Male", "IndianMyth", 232002));

		System.out.println("Author Details are:");

		display(b1);

	}

}