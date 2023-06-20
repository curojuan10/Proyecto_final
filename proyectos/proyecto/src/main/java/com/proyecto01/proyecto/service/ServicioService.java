package com.proyecto01.proyecto.service;

import java.util.List;

import com.proyecto01.proyecto.entity.Servicio;

public interface ServicioService {
	public Servicio registrar(Servicio a);
	public Servicio actualizar(Servicio a);
	public void eliminar(Servicio a);
	public List<Servicio>ver();

}
