package com.itp.movie.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.itp.movie.exception.InvalidMovieException;
import com.itp.movie.model.Movie;

public class MovieService {

	// Movie In memory database
	private List<Movie> movies = new LinkedList<Movie>();

	public void addMovie(Movie movie) {
		// store movie in the memory
		movies.add(movie);
	}

	public List<Movie> getAllMovies() {
		// Collections.sort(movies, new SortMovieByRating());

		/*
		 * Collections.sort(movies, new Comparator<Movie>() {
		 * 
		 * @Override public int compare(Movie m1, Movie m2) { return m2.getRating() -
		 * m1.getRating(); } });
		 */

		Collections.sort(movies, (m1, m2) -> m2.getRating() - m1.getRating());
		return movies;
	}

	public List<Movie> getMoviesByRating(int rating) {
		List<Movie> filteredMovies = new LinkedList();
		movies.stream().forEach(m -> {
			if (m.getRating() == rating)
				filteredMovies.add(m);
		});
		return filteredMovies;
	}

	public void updateMovie(int movieId, int rating) throws InvalidMovieException{

		Movie movie = getMovieById(movieId);
		if (movie == null) {
			throw new InvalidMovieException("No movie found for given identifier");
		} else {
			movie.setRating(rating);
		}

	}

	private Movie getMovieById(int id) {
		Movie movie = null;
		for (Movie m : movies) {
			if (id == m.getId()) {
				movie = m;
				break;
			}
		}
		return movie;
	}
	
	public List<Movie> getMoviesByRelaseDates() {
		//return movies - first movie must be latest one
		return null;
	}
	
	public void delete(int movieId) {
		//delete the movie from movies
	}
	
	public List<Movie> getMoviesByActor(String actorName) {
		//matching actor names movies must be returned.
		return null;
	} 
	
	public List<Movie> getMoviesByDateRange(LocalDate start, LocalDate end){
		//return movies which are released between given dates.
		return null;
	}
	
}

class SortMovieByRating implements Comparator<Movie> {
	@Override
	public int compare(Movie m1, Movie m2) {
		return m2.getRating() - m1.getRating();
	}
}
