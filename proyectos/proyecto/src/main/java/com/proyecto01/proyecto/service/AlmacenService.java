package com.proyecto01.proyecto.service;
import java.util.List;

import com.proyecto01.proyecto.entity.Almacen;

public interface AlmacenService {
	public Almacen registrar(Almacen a);
	public Almacen actualizar(Almacen a);
	public void eliminar(Almacen a);
	public List<Almacen>ver();

}
