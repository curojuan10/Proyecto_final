package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Resena;
import com.proyecto01.proyecto.repository.ResenaRepository;
@Service
public class ResenaServiceImplements implements ResenaService {
	@Autowired
	ResenaRepository x;

	@Override
	public Resena registrar(Resena a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Resena actualizar(Resena a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Resena a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Resena> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
