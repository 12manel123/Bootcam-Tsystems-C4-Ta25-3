package com.example.Almacenes.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes")
public class Almacen {
	@Id
	@Column(name = "codigo")
	private int id;
	private String lugar;
	private int capacidad;
	public Almacen() {
	}

	public Almacen(int id, String lugar, int capacidad) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@OneToMany(mappedBy = "almacen")
	private List<Caja> caja;
	
	
	@Override
	public String toString() {
		return "Almacen [id=" + id + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}

	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Caja")
	public List<Caja> getCaja(){
		return caja;
	}
	
	

	
	
}
