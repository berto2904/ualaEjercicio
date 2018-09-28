package com.tevenimosabancar.modelo;

import java.sql.Time;

public class Capitulo {
	private String titulo;
	private Time duracion;
	
	
	public Capitulo(String titulo, Time duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}
	
	
}
