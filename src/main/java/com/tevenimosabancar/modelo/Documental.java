package com.tevenimosabancar.modelo;

import java.sql.Time;

public class Documental extends ContenidoAudiovisual {

	public Documental(Integer estreno, Time duracion) {
		super(estreno, duracion);
	}
	
	@Override
	public Boolean esInteresante() {
		Boolean esInteresante = false;
		if (getTitulo().contains("unofficial")) {
			esInteresante = true;
		}
		return esInteresante;
	}

}
