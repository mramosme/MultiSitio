package com.fyg.multisitio.negocio.test;



import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.FiltroSitio;
import com.fyg.multisitio.dto.Negocio;

public class ConsultaTest {
	private ConsultasMultiSitioNegocio data;
	private FiltroSitio dataNegocio;
	
	@Before
	public void setUp() throws Exception {
		data = new ConsultasMultiSitioNegocio();
		dataNegocio = new FiltroSitio();
		dataNegocio.setIdSitio(1);
	}

	@Test
	public void testConsultaNegocio() {
		try {
			data.consultaSitio(dataNegocio);
			
		}
		catch (Exception ex) {
		
		}
	}

}
