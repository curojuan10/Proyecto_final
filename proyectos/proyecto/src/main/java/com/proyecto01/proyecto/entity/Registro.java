package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Registro")
@Table(name="registro")
public class Registro {
	@Id
	String ruc;
	String r_consumo;
	String r_pago;
	public Registro() {
		super();
	}
	public Registro(String ruc, String r_consumo, String r_pago) {
		super();
		this.ruc = ruc;
		this.r_consumo = r_consumo;
		this.r_pago = r_pago;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getR_consumo() {
		return r_consumo;
	}
	public void setR_consumo(String r_consumo) {
		this.r_consumo = r_consumo;
	}
	public String getR_pago() {
		return r_pago;
	}
	public void setR_pago(String r_pago) {
		this.r_pago = r_pago;
	}
	

}