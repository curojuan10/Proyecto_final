package com.proyecto01.proyecto.service;

import java.util.List;
import com.proyecto01.proyecto.entity.Orden;
public interface OrdenService {
	public Orden registrar(Orden a);
	public Orden actualizar(Orden a);
	public void eliminar(Orden a);
	public List<Orden>ver();

}
