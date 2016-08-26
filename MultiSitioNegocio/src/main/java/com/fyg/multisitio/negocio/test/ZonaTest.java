package com.fyg.multisitio.negocio.test;

/**
 * se importan las clases necesarias
 */
import com.fyg.multisitio.dto.Zona;
import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;

import org.junit.Before;
import org.junit.Test;

public class ZonaTest {
	private GUIDGenerator uid;
	private Zona registroZona;
	private OperacionesMultiSitioNegocio data;
	
	@Before
	public void setUp() throws Exception {
		 data = new OperacionesMultiSitioNegocio();
		    /**
		    * Datos de Zona
		    */
		   registroZona = new Zona();
		   registroZona.setNombre("PRUEBA ZONA");
		   registroZona.setDescripcion("Contiene todo lo relacionado a turismo");
		   registroZona.setUrlImagen("http://www.giphy.com/images/giphy.gif");
		   registroZona.setEstatus(1);
		
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testRegistraZona() throws Exception {
		String guid = uid.generateGUID(data);
		
		try{
			data.registraZona(registroZona);
			LogHandler.debug(guid,this.getClass(), "PRUEBA EXITOSA EN JUNIT");
		}
		catch(Exception e){
			LogHandler.error(guid, this.getClass(), "Error: ", e);
			
		}
		
	}

}
