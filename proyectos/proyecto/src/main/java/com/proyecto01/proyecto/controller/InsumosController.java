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

import com.proyecto01.proyecto.entity.Insumos;
import com.proyecto01.proyecto.service.InsumosService;

@RestController
@RequestMapping("/insumo")
public class InsumosController {
	@Autowired
	InsumosService x;
	
	@PostMapping
	public Insumos registrar(@RequestBody Insumos a) {
		return x.registrar(a);
	}
	@PutMapping
	public Insumos actualizar(@RequestBody Insumos a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Insumos a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Insumos>ver(){
		return x.ver();
	}

}