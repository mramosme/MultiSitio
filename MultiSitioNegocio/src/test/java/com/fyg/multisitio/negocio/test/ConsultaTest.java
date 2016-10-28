package com.fyg.multisitio.negocio.test;



import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.dto.Actividad;


public class ConsultaTest {
	private ConsultasMultiSitioNegocio data;
	private Actividad dataActividad;
	
	@Before
	public void setUp() throws Exception {
		data = new ConsultasMultiSitioNegocio();
		dataActividad = new Actividad();
		dataActividad.setNombre("nadar");
	}

	@Test
	public void testConsultaNegocio() {
		try {
			data.busquedaActividad(dataActividad);
			
		}
		catch (Exception ex) {
		
		}
	}

}
