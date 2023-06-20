package com.proyecto01.proyecto.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Insumo")
@Table(name="insumo")
public class Insumos {
	@Id
	String codigo;
	String tipo;
	String suministros;
	public Insumos() {
		super();
	}
	public Insumos(String codigo, String tipo, String suministros) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.suministros = suministros;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSuministros() {
		return suministros;
	}
	public void setSuministros(String suministros) {
		this.suministros = suministros;
	}
	
	

}

