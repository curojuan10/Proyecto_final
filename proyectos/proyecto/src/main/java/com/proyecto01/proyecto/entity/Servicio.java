package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity(name="Servicio")
@Table(name="servicio")
public class Servicio {
	@Id
	String nm_mesa;
	String carta;
	public Servicio() {
		super();
	}
	public Servicio( String nm_mesa, String carta) {
		super();
		this.nm_mesa = nm_mesa;
		this.carta = carta;
	}
	public String getNm_mesa() {
		return nm_mesa;
	}
	public void setNm_mesa(String nm_mesa) {
		this.nm_mesa = nm_mesa;
	}
	public String getCarta() {
		return carta;
	}
	public void setCarta(String carta) {
		this.carta = carta;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ruc")
	private Cliente cliente;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
