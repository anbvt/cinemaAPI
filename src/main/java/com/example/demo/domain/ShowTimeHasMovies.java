package com.example.demo.domain;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ShowTimeDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShowTimeHasMovies{
    private int id;
    private LocalTime starttime;
    private String movie;
    private String movieid;
    private List<String> movies = new ArrayList<>();

    public ShowTimeHasMovies(int id,LocalTime starttime,String movie, String movieid){
        this.id = id;
        this.starttime = starttime;
        this.movie = movie;
        this.movieid = movieid;
    }

    public static ShowTimeHasMovies convert(ShowTimeDto showtime) {
        return new ShowTimeHasMovies(showtime.getId(),showtime.getStartTime(), showtime.getMovieName(),showtime.getMovieId());
    }
}
