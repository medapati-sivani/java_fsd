package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	private String email;
	private String name;
	private String feedbacks;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}
	@Override
	public String toString() {
		return "Feedback [email=" + email + ", name=" + name + ", feedbacks=" + feedbacks + "]";
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String email, String name, String feedbacks) {
		super();
		this.email = email;
		this.name = name;
		this.feedbacks = feedbacks;
	}

}
