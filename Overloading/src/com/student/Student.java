//method overloading using difrrent arguments
package com.student;

public class Student {

	private int id;
	private String name;
	private int rollno;
	private double score;
	private String course;

	public Student() { // default constructor
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int rollno, double score, String course) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.score = score;
		this.course = course;
	}

	/**
	 * @param id
	 * @param name
	 * @param rollno
	 * @param score
	 */
	public Student(int id, String name, int rollno, double score) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", score=" + score + ", course=" + course
				+ "]";
	}

}
