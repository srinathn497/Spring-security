package com.javainuse.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {

	@Id
	public long a;
	public int b;
	public int c;

	public long getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	@Override
	public String toString() {
		return "Topics [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	public Topics(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Topics() {
		// TODO Auto-generated constructor stub
	}
	
	 
}
