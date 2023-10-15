package com.example.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LanguageOfMovieService;

@RestController
@RequestMapping("/api/languageofmovie")
@CrossOrigin("*")
public class LanguageOfMovieController {
    @Autowired
    LanguageOfMovieService languageOfMovieService;

    @GetMapping({ "", "/" })
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(languageOfMovieService.findAll());
    }
}
