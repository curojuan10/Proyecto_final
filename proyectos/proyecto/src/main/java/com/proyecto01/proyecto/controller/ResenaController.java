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

import com.proyecto01.proyecto.entity.Resena;
import com.proyecto01.proyecto.service.ResenaService;

@RestController
@RequestMapping("/resena")
public class ResenaController {
	@Autowired
	ResenaService x;
	
	@PostMapping
	public Resena registrar(@RequestBody Resena a) {
		return x.registrar(a);
	}
	@PutMapping
	public Resena actualizar(@RequestBody Resena a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Resena a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Resena>ver(){
		return x.ver();
	}

}