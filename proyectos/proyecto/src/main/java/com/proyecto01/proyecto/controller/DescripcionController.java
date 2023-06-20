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


import com.proyecto01.proyecto.entity.Descripcion;
import com.proyecto01.proyecto.service.DescripcionService;

@RestController
@RequestMapping("/descripcion")
public class DescripcionController {
	@Autowired
	DescripcionService x;
	
	@PostMapping
	public Descripcion registrar(@RequestBody Descripcion a) {
		return x.registrar(a);
	}
	@PutMapping
	public Descripcion actualizar(@RequestBody Descripcion a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Descripcion a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Descripcion>ver(){
		return x.ver();
	}

}
