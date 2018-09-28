package com.tevenimosabancar;

import static org.junit.Assert.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tevenimosabancar.modelo.Capitulo;
import com.tevenimosabancar.modelo.Documental;
import com.tevenimosabancar.modelo.Pelicula;
import com.tevenimosabancar.modelo.Serie;
import com.tevenimosabancar.modelo.Temporada;

public class contenidoAudiovisualTest {

	@Test
	public void productoEsViejo() {
		Pelicula pelicula = new Pelicula(2011, new Time(7200000));
		Boolean esViejo = pelicula.esViejo();
		assertTrue(esViejo);
	}
	
	@Test
	public void productoEsNuevo() {
		Pelicula pelicula = new Pelicula(2017, new Time(7200000));
		Boolean esNuevo = pelicula.esViejo();
		assertFalse(esNuevo);
	}
	
	@Test	
	public void peliculaEsInteresante() {
		Pelicula pelicula = new Pelicula(2017, new Time(7200000));
		pelicula.setCantOscar(5);
		assertTrue(pelicula.esInteresante());
	}
	
	@Test
	public void serieEsInteresante() {
		Serie serie = new Serie(2018, new Time(7200452));
		serie.setTitulo("Breaking Bad");
		
		
		List<Capitulo> capitulos = new ArrayList<Capitulo>() ;
		
		Capitulo c1  = new Capitulo("Capitulo1", new Time(1800000));
		capitulos.add(c1);
		
		Capitulo c2 = new Capitulo("Capitulo2", new Time(1800000));
		capitulos.add(c2);
		
		Capitulo c3 = new Capitulo("Capitulo3", new Time(1800000));
		capitulos.add(c3);
		
		Capitulo c4 = new Capitulo("Capitulo4", new Time(1800000));
		capitulos.add(c4);
		
		Temporada temporada1 = new Temporada(capitulos);
		Temporada temporada2 = new Temporada(capitulos);
		Temporada temporada3 = new Temporada(capitulos);
		Temporada temporada4 = new Temporada(capitulos);
		
		List<Temporada> temporadas = new ArrayList<Temporada>();
		temporadas.add(temporada1);
		temporadas.add(temporada2);
		temporadas.add(temporada3);
		temporadas.add(temporada4);
		
		serie.setTemporadas(temporadas);
		
		assertTrue(serie.esInteresante());
	}
	
	@Test
	public void documentalEsInteresante() {
		Documental documental =  new Documental(2017, new Time(7200452));
		documental.setTitulo("The unofficial story of Jim Carrey");
		assertTrue(documental.esInteresante());
	}

}
