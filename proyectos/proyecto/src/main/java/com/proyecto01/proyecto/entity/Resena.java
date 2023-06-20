package com.proyecto01.proyecto.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Resena")
@Table(name="resena")
public class Resena {
	@Id
	String nm_mesa;
	String codigo;
	int cantidad;
	public Resena() {
		super();
	}
	public Resena(String nm_mesa, String codigo, int cantidad) {
		super();
		this.nm_mesa = nm_mesa;
		this.codigo = codigo;
		this.cantidad = cantidad;
	}
	public String getNm_mesa() {
		return nm_mesa;
	}
	public void setNm_mesa(String nm_mesa) {
		this.nm_mesa = nm_mesa;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}

