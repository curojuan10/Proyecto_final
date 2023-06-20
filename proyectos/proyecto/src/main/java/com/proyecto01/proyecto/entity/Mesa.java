package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Mesa")
@Table(name="mesa")
public class Mesa {
	@Id
	String numero_mesa;
	String mesa_pago;
	public Mesa() {
		super();
	}
	public Mesa(String numero_mesa, String mesa_pago) {
		super();
		this.numero_mesa = numero_mesa;
		this.mesa_pago = mesa_pago;
	}
	public String getNumero_mesa() {
		return numero_mesa;
	}
	public void setNumero_mesa(String numero_mesa) {
		this.numero_mesa = numero_mesa;
	}
	public String getMesa_pago() {
		return mesa_pago;
	}
	public void setMesa_pago(String mesa_pago) {
		this.mesa_pago = mesa_pago;
	}
	
	

}
