package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Registro;

public interface RegistroService {
	public Registro registrar(Registro a);
	public Registro actualizar(Registro a);
	public void eliminar(Registro a);
	public List<Registro>ver();

}