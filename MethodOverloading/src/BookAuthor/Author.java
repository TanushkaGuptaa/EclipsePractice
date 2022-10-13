package BookAuthor;

public class Author {

	private String name;
	private String gender;
	private String topicBase;
	private int date;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String gender, String topicBase, int date) {
		super();
		this.name = name;
		this.gender = gender;
		this.topicBase = topicBase;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTopicBase() {
		return topicBase;
	}

	public void setTopicBase(String topicBase) {
		this.topicBase = topicBase;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", gender=" + gender + ", topicBase=" + topicBase + ", date=" + date + "]";
	}

}
