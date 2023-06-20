package com.proyecto01.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto01.proyecto.entity.Ticket;
import com.proyecto01.proyecto.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService x;
	
	@PostMapping
	public Ticket registrar(@RequestBody Ticket a) {
		return x.registrar(a);
	}
	@PutMapping
	public Ticket actualizar(@RequestBody Ticket a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Ticket a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Ticket>ver(){
		return x.ver();
	}

}