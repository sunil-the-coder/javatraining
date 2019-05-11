package com.itp.movie.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {

	private int id;
	private String name;
	private int rating;
	private LocalDate releaseDate;
	private List<String> actors;

	public Movie(int id, String name, int rating, LocalDate releaseDate, List<String> actors) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.releaseDate = releaseDate;
		this.actors = actors;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

}
