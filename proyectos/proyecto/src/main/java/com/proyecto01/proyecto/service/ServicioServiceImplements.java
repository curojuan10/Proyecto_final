package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Servicio;
import com.proyecto01.proyecto.repository.ServicioRepository;

@Service
public class ServicioServiceImplements implements ServicioService {
	@Autowired
	ServicioRepository x;

	@Override
	public Servicio registrar(Servicio a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Servicio actualizar(Servicio a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Servicio a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Servicio> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
