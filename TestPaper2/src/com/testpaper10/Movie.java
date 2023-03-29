package com.testpaper10;

import java.util.List;

public class Movie {

	private int id;
	private String name;
	List<String> list2;
	
	
	public Movie(int id, String name, List<String> list22) {
		super();
		this.id = id;
		this.name = name;
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



	public String getActors() {
				return null;
	}



	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + "]";
	}
	
	


  







}
	
	
	
	
	
	
	
	
      

