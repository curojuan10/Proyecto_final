package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Resena;

public interface ResenaService {
	public Resena registrar(Resena a);
	public Resena actualizar(Resena a);
	public void eliminar(Resena a);
	public List<Resena>ver();

}