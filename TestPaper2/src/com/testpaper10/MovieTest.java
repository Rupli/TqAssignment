package com.testpaper10;

import java.util.ArrayList;
import java.util.List;

public class MovieTest {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("Amitabh Bachchan");
		list1.add("Shashi Kapoor");

		List<String> list2 = new ArrayList<>();
		list2.add("Amitabh Bachchan");
		list2.add("Amitabh Bachchan");

		List<String> list3 = new ArrayList<>();
		list3.add("Jaya Bhaduri");
		list3.add("Amitabh Bachchan");

		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "Bagban", list1));
		movies.add(new Movie(2, "Deewar", list2));
		movies.add(new Movie(3, "Zanjeer", list3));

		int amitabhMovies = 0;

		for (Movie movie : movies) {
			if (movie.getActors().contains("Amitabh Bachchan")) {
				amitabhMovies++;
			}
		}

		System.out.println("Amitabh Bachchan has acted in " + amitabhMovies + " movies.");
	}

}
