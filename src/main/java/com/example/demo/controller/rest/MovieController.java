package com.example.demo.controller.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.exception.InvalidRequestParameterException;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/api/movie")
@CrossOrigin("*")
public class MovieController{
	@Autowired
	private MovieService movieService;


	@GetMapping(value= {"","/"})
	public ResponseEntity<?> findAll(@RequestParam("status") Optional<String> status) throws InvalidRequestParameterException {
		List<Movie> list = !status.isPresent() ? movieService.findAll() : movieService.findByStatus(status.get());
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable String id) throws InvalidRequestParameterException {
		return ResponseEntity.ok(movieService.findById(id).get());
	}

	@GetMapping("/nowshowing")
	public ResponseEntity<?> findMoviesNowShowing() {
		return ResponseEntity.ok(movieService.findMoviesNowShowing());
	}
	
	@GetMapping("/getDetail")
	public ResponseEntity<?> findMovieDetailPage(@RequestParam("id") String movieId) {
		return ResponseEntity.ok(movieService.findMovieDetailPage(movieId));
	}

	@GetMapping("/getByShowTime")
	public ResponseEntity<?> getByShowTime(@RequestParam("showtimeid") int showtimeid) {
		return ResponseEntity.ok(movieService.findByShowTimeId(showtimeid));
	}
}
