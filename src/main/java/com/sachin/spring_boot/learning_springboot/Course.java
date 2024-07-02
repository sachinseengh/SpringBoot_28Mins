package com.sachin.spring_boot.learning_springboot;

public class Course {

	
	private int id;
	private String course;
	private String tutor;
	
	
	
	public Course(int id, String course, String tutor) {
		super();
		this.id = id;
		this.course = course;
		this.tutor = tutor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

//	@Override
//	public String toString() {
//		return "Course [id=" + id + ", course=" + course + ", tutor=" + tutor + "]";
//	}
	
	
	
}
