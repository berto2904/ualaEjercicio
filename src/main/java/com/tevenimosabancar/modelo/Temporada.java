package com.tevenimosabancar.modelo;

import java.util.List;

public class Temporada {
	private List<Capitulo> capitulos;
	
	public Temporada(List<Capitulo> capitulos) {
		super();
		this.capitulos = capitulos;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	
	
}
