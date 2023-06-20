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

import com.proyecto01.proyecto.entity.Mesa;
import com.proyecto01.proyecto.service.MesaService;

@RestController
@RequestMapping("/mesa")
public class MesaController {
	@Autowired
	MesaService x;
	
	@PostMapping
	public Mesa registrar(@RequestBody Mesa a) {
		return x.registrar(a);
	}
	@PutMapping
	public Mesa actualizar(@RequestBody Mesa a) {
		return x.actualizar(a);
	}
	@DeleteMapping
	public void eliminar(@RequestBody Mesa a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Mesa>ver(){
		return x.ver();
	}

}

