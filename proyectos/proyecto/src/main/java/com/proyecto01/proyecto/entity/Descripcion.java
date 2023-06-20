package com.proyecto01.proyecto.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Descripcion")
@Table(name="descripcion")
public class Descripcion {
	@Id
	String codigo;
	String desayuno;
	String almuerzo;
	String cena;
	String extra;
	String bebidas;
	public Descripcion() {
		super();
	}
	public Descripcion(String codigo, String desayuno, String almuerzo, String cena, String extra, String bebidas) {
		super();
		this.codigo = codigo;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
		this.extra = extra;
		this.bebidas = bebidas;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	public String getAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}
	public String getCena() {
		return cena;
	}
	public void setCena(String cena) {
		this.cena = cena;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public String getBebidas() {
		return bebidas;
	}
	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}
	
	

}
