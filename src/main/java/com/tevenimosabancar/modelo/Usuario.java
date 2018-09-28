package com.tevenimosabancar.modelo;

import java.util.List;

public class Usuario {
	private String nombre;
	private String apellido;
	private String moods;
	
	
	private List<CanalDeComunicacion> canales;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<CanalDeComunicacion> getCanales() {
		return canales;
	}

	public void setCanales(List<CanalDeComunicacion> canales) {
		this.canales = canales;
	}

	public String getMoods() {
		return moods;
	}

	public void setMoods(String moods) {
		this.moods = moods;
	}
}
