package com.example.Almacenes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas")
public class Caja {
	@Id
	@Column(name = "num_referencia")//Preguntar numReferencia como formatea
	private String id;
	private String contenido;
	private int valor;
	
	@ManyToOne
	@JoinColumn(name = "almacen")
	private Almacen almacen;

	public Caja() {
	}

	public Caja(String id, String contenido, int valor, Almacen almacen) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [id=" + id + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}

	
	
	
	

}
