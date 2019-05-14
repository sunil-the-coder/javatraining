package com.itp.movie.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.itp.movie.exception.InvalidMovieException;
import com.itp.movie.model.Movie;

public class MovieService {

	// Movie In memory database
	private Map<String, List<Movie>> moviesMap = new HashMap<>();

	public void addMovie(String category, Movie movie) {
		// store movie in the memory
		List<Movie> movies = moviesMap.get(category);
		if(movies == null || movies.size() <= 0) {
			movies = new LinkedList<>();
		}
		movies.add(movie);
		moviesMap.put(category, movies);
	}

	public List<Movie> getAllMovies(String category) {
		// Collections.sort(movies, new SortMovieByRating());

		/*
		 * Collections.sort(movies, new Comparator<Movie>() {
		 * 
		 * @Override public int compare(Movie m1, Movie m2) { return m2.getRating() -
		 * m1.getRating(); } });
		 */

		Collections.sort(moviesMap.get(category),
				(m1, m2) -> m2.getRating() - m1.getRating());

		return moviesMap.get(category);
	}

	public List<Movie> getMoviesByRating(String category, int rating) {
		List<Movie> filteredMovies = new LinkedList();
		moviesMap.get(category).stream().forEach(m -> {
			if (m.getRating() == rating)
				filteredMovies.add(m);
		});
		return filteredMovies;
	}

	public void updateMovie(int movieId, int rating) throws InvalidMovieException {

		Movie movie = getMovieById(movieId);
		if (movie == null) {
			throw new InvalidMovieException("No movie found for given identifier");
		} else {
			movie.setRating(rating);
		}

	}

	private Movie getMovieById(int id) {

		Movie movie = null;
		Set<String> categories = moviesMap.keySet();
		for (String category : categories) {
			List<Movie> catMovies = moviesMap.get(category);
			movie = findMovieById(catMovies, id);
		}
		return movie;
	}

	private Movie findMovieById(List<Movie> catMovies, int id) {
		Movie movie = null;
		for (Movie m : catMovies) {
			if (id == m.getId()) {
				movie = m;
				break;
			}
		}
		return movie;
	}

	public List<Movie> getMoviesByRelaseDates() {
		// return movies - first movie must be latest one
		return null;
	}

	public void delete(int movieId) {
		// delete the movie from movies
	}

	public List<Movie> getMoviesByActor(String actorName) {
		// matching actor names movies must be returned.
		return null;
	}

	public List<Movie> getMoviesByDateRange(LocalDate start, LocalDate end) {
		// return movies which are released between given dates.
		return null;
	}

}

class SortMovieByRating implements Comparator<Movie> {
	@Override
	public int compare(Movie m1, Movie m2) {
		return m2.getRating() - m1.getRating();
	}
}
