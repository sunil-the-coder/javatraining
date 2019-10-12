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

		Movie m1 = new Movie(1, "Avengers", 5, LocalDate.of(2018,2,14), Arrays.asList("Thanos", "Thor", "CaptainAmerica","Shahrukh"));

		Movie m2 = new Movie(2, "Natsamrat", 4, LocalDate.of(2018, 2, 7),
				Arrays.asList("Nana Patekar", "Mahesh", "Vikram Gokhale"));

		Movie m3 = new Movie(3, "DDLJ", 5, LocalDate.of(1995, 10, 5),
				Arrays.asList("Shahrukh", "Kajol", "Amrish Puri"));

		Movie m4 = new Movie(4, "Action jackson", 3, LocalDate.of(2018,2,2), Arrays.asList("Ajay", "Yami"));
		
		MovieService movieService = new MovieService();
		movieService.addMovie("Action",m1);
		movieService.addMovie("Drama",m2);
		movieService.addMovie("Romantic",m3);
		movieService.addMovie("Action",m4);
		
		// 2. Retrieve movies

		List<Movie> movies = movieService.getAllMovies("Action");
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		System.out.println("--------- By Release Dates---------");
		movies = movieService.getMoviesByRelaseDates("Action");
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		//delete movie by id
		//movieService.delete(4);
		
		System.out.println("--------- After Delete ---------");
		movies = movieService.getAllMovies("Action");
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		
		System.out.println("--------- Movies By Actors ---------");
		movies = movieService.getMoviesByActor("Shahrukh");
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		System.out.println("--------- Movies By Date Range ---------");
		movies = movieService.getMoviesByDateRange(
				LocalDate.of(2018, 2, 1), LocalDate.of(2018, 2, 8));
		movies.stream().forEach(m -> System.out.println(m.getName() + "|" + m.getRating()));

		
		/*
		 * System.out.println("********* Movies By Rating **********"); List<Movie>
		 * moviesByRating = movieService.getMoviesByRating(4);
		 * moviesByRating.stream().forEach(m -> System.out.println(m.getName()));
		 * 
		 * try { movieService.updateMovie(100, 5); } catch (InvalidMovieException e) {
		 * e.printStackTrace(); }
		 * 
		 * movies = movieService.getAllMovies(); movies.stream().forEach(m ->
		 * System.out.println(m.getName() + "|" + m.getRating()));
		 */
	}
}
