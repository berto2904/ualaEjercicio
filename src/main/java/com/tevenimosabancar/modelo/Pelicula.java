package com.tevenimosabancar.modelo;

import java.sql.Time;

public class Pelicula extends ContenidoAudiovisual {
	public Pelicula(Integer estreno, Time duracion) {
		super(estreno, duracion);
		// TODO Auto-generated constructor stub
	}

	private Integer cantOscar;
	
	
	public Integer getCantOscar() {
		return cantOscar;
	}

	public void setCantOscar(Integer cantOscar) {
		this.cantOscar = cantOscar;
	}
	
	@Override
	public Boolean esInteresante() {
		Boolean esInteresante = false;
		if (this.cantOscar > 1) {
			esInteresante = true;
		}
		return esInteresante;
	}
	
	
}
