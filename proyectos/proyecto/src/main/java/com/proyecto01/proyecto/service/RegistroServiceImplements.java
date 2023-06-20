package com.proyecto01.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto01.proyecto.entity.Registro;
import com.proyecto01.proyecto.repository.RegistroRepository;

@Service
public class RegistroServiceImplements implements RegistroService{
	 @Autowired
	 RegistroRepository x;

	@Override
	public Registro registrar(Registro a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Registro actualizar(Registro a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Registro a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Registro> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
