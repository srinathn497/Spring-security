package com.javainuse.course;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	public int courseid;
	public String coursename;
	public String coursedescription;
	
	


	public Courses() {
		// TODO Auto-generated constructor stub
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public String getCoursedescription() {
		return coursedescription;
	}


	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}


	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	@Override
	public String toString() {
		return "Courses [coursename=" + coursename + ", coursedescription=" + coursedescription + ", courseid="
				+ courseid + "]";
	}
	
	 
}
