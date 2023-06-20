package com.proyecto01.proyecto.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity(name="Cliente")
@Table(name="cliente")
public class Cliente {
	@Id
	String ruc;
	String dni;
	public Cliente() {
		super();
	}
	public Cliente(String dni, String ruc) {
		super();
		this.dni = dni;
		this.ruc = ruc;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	@OneToOne(fetch = FetchType.LAZY,mappedBy ="cliente",cascade = CascadeType.ALL)
	private Servicio servicio;
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
	
	
	

}