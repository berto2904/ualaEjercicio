package com.tevenimosabancar.modelo;

import java.sql.Time;
import java.util.List;

public class Serie extends ContenidoAudiovisual {
	
	public Serie(Integer estreno, Time duracion) {
		super(estreno, duracion);
		// TODO Auto-generated constructor stub
	}

	private List<Temporada> temporadas;

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	@Override
	public Boolean esInteresante() {
		Boolean esInteresante =  false;
		if ((this.temporadas.size() == 4) || (this.temporadas.size() == 5)) {
			esInteresante =  true;
		}
		return esInteresante;
	}
	
}
