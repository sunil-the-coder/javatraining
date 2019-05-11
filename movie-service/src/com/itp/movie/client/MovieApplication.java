package com.itp.movie.client;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.itp.movie.exception.InvalidMovieException;
import com.itp.movie.model.Movie;
import com.itp.movie.service.MovieService;

public class MovieApplication {

	public static void main(String[] args) {

		// 1. Prepare movies & add into db using service

		Movie m1 = new Movie(1, "Avengers", 5, LocalDate.now(), Arrays.asList("Thanos", "Thor", "CaptainAmerica"));

		Movie m2 = new Movie(2, "Natsamrat", 4, LocalDate.of(2018, 2, 4),
				Arrays.asList("Nana Patekar", "Mahesh", "Vikram Gokhale"));

		Movie m3 = new Movie(3, "DDLJ", 5, LocalDate.of(1995, 10, 5),
				Arrays.asList("Shahrukh", "Kajol", "Amrish Puri"));

		MovieService movieService = new MovieService();
		movieService.addMovie(m1);
		movieService.addMovie(m2);
		movieService.addMovie(m3);

		// 2. Retrieve movies

		List<Movie> movies = movieService.getAllMovies();
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		System.out.println("********* Movies By Rating **********");
		List<Movie> moviesByRating = movieService.getMoviesByRating(4);
		moviesByRating.stream().forEach(m -> System.out.println(m.getName()));

		try {
			movieService.updateMovie(100, 5);
		} catch (InvalidMovieException e) {
			e.printStackTrace();
		}

		movies = movieService.getAllMovies();
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

	}
}
