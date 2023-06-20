package com.proyecto01.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Ticket")
@Table(name="ticket")
public class Ticket {
	@Id
	String ruc;
	double importe_total;
	public Ticket() {
		super();
	}
	public Ticket(String ruc, double importe_total) {
		super();
		this.ruc = ruc;
		this.importe_total = importe_total;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public double getImporte_total() {
		return importe_total;
	}
	public void setImporte_total(double importe_total) {
		this.importe_total = importe_total;
	}
	
	

}