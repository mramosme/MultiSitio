package com.fyg.multisitio.negocio.test;



import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.Negocio;

public class ConsultaTest {
	private ConsultasMultiSitioNegocio data;
	private Negocio dataNegocio;
	
	@Before
	public void setUp() throws Exception {
		data = new ConsultasMultiSitioNegocio();
		dataNegocio = new Negocio();
		dataNegocio.setId(3);
	}

	@Test
	public void testConsultaNegocio() {
		try {
			data.consultaNegocio(dataNegocio);
			
		}
		catch (Exception ex) {
		
		}
	}

}
