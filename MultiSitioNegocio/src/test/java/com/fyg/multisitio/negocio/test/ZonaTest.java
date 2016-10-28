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
	/**
	 *UID unico de registro
	 */
	private GUIDGenerator uid;
	/**
	 * Se crea objeto zona para mandar valores
	 */
	private Zona registroZona;
	/**
	 * Se crea objeto contacto para mandar valores
	 */
	private OperacionesMultiSitioNegocio data;
	/**
	 *
	 * @throws Exception
	 */
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
	/**
	 *
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testRegistraZona() throws Exception {
		String guid = uid.generateGUID(data);

		try {
			data.registraZona(registroZona);
			LogHandler.debug(guid,this.getClass(), "PRUEBA EXITOSA EN JUNIT");
		}
		catch (Exception ex) {
			LogHandler.error(guid, this.getClass(), "Error: ", ex);

		}
	}

}
