package com.fyg.multisitio.negocio.test;



import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.dto.Actividad;
import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;

public class ActividadTest {
	/**
	 * Se crea el objeto data para mandarle valores a negocio
	 */
	private OperacionesMultiSitioNegocio data;
	/**
	 *Uid unico generado
	 */
	 private GUIDGenerator uid;
	 /**
	  * se crea objeto para registrar articulo
	  */
	 private Actividad registraActividad;
	@Before
	public void setUp() throws Exception {
		 data = new OperacionesMultiSitioNegocio();
		 
		 /**
		  * se le envian los datos a actividad
		  */
		 registraActividad = new Actividad();
		 registraActividad.setNombre("Nadar");
		 registraActividad.setDescripcion("Natacion, nadar,agua");
		 registraActividad.setIdGiro(2);
	}

	@Test
	@SuppressWarnings("static-access")
	public void testRegistraActividad() throws Exception {
		
		String guid = uid.generateGUID(data);
		try {
			data.registraActividad(registraActividad);
			LogHandler.debug(guid,this.getClass(), "PRUEBA JUNIT");
		}
		catch (Exception ex) {
			LogHandler.debug(guid,this.getClass(), "Error");
		}
	}

}
