package com.example.demo.controller.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.admin.controller.enums.RequestParameterEnum;
import com.example.demo.exception.InvalidRequestParameterException;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/api/ticket")
@CrossOrigin("*")
public class TicketController {
	@Autowired
	TicketService ticketService;

	@GetMapping("/get-all")
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(ticketService.findAll());
	}
}
