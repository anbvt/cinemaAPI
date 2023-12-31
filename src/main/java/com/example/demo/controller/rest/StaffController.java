package com.example.demo.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.exception.InvalidRequestParameterException;
import com.example.demo.model.AccountModel;
import com.example.demo.model.StaffUpdatePasswordModel;
import com.example.demo.service.StaffService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/api/staff")
@CrossOrigin("*")
public class StaffController {
	@Autowired
	private StaffService staffService;

	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody Staff staff)
			throws InvalidRequestParameterException, MessagingException {
		staff.setStatus(true);
		return ResponseEntity.ok(staffService.insert(staff));
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginA(@RequestBody AccountModel staff) throws InvalidRequestParameterException{
		return ResponseEntity.ok(staffService.loginA(staff));
	}

	@PostMapping("/loginE")
	public ResponseEntity<?> loginE(@RequestBody AccountModel staff) throws InvalidRequestParameterException{
		return ResponseEntity.ok(staffService.loginE(staff));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable String id) throws InvalidRequestParameterException{
		return ResponseEntity.ok(staffService.findById(id));
	}

	@PostMapping("/update")
	public void update(@RequestBody Staff staff) throws InvalidRequestParameterException{
		staffService.update(staff);
	}

	@PostMapping("/updatePassword")
	public void update(@RequestBody StaffUpdatePasswordModel staff) throws InvalidRequestParameterException{
		staffService.updatePassword(staff);
	}

	@GetMapping({ "/", "" })
	public ResponseEntity<?> findAll() {
		return ResponseEntity.ok(staffService.findAll());
	}

	@PostMapping("/updateStatus")
	public ResponseEntity<?> updateStatus(@RequestBody Staff staff) throws InvalidRequestParameterException {
		return ResponseEntity.ok(staffService.updateStatus(staff));
	}
}
