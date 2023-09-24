package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TicketDao;
import com.example.demo.dto.TicketDto;
import com.example.demo.entity.Ticket;
import com.example.demo.exception.InvalidRequestParameterException;

@Service
public class TicketService implements BaseService<Ticket, Integer> {
	@Autowired
	TicketDao ticketDao;

	@Override
	public List<Ticket> findAll() {
		return ticketDao.findAll();
	}

	@Override
	public Optional<Ticket> findById(Integer id) throws InvalidRequestParameterException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	
	public List<TicketDto> findByCustomerId(Optional<Integer> customerId) {		
		return ticketDao.findByCustomerId(customerId.get());
	}
}