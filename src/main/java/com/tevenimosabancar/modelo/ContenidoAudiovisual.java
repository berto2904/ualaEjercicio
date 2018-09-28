package com.tevenimosabancar.modelo;

import java.sql.Time;
import java.util.Calendar;

public class ContenidoAudiovisual {
	private String titulo;
	private Integer estreno;
	private Time duracion;
	
	public ContenidoAudiovisual(Integer estreno, Time duracion) {
		super();
		this.estreno = estreno;
		this.duracion = duracion;
	}
	
	public Integer getEstreno() {
		return estreno;
	}
	public void setEstreno(Integer estreno) {
		this.estreno = estreno;
	}
	public Time getDuracion() {
		return duracion;
	}
	public void setDuracion(Time duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Boolean esViejo() {
		boolean esViejo = false;
		int hoy = Calendar.getInstance().get(Calendar.YEAR);
		if ((hoy - this.estreno) > 2) {
			esViejo = true;
		}
		
		return esViejo;
		
	}

	public Boolean esInteresante() {
		return false;
	}
	
}
