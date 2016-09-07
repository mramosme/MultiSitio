package com.fyg.multisitio.negocio.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;


public class SitioTest {
	/**
	 * Se crea el objeto data para mandarle valores a negocio
	 */
	private OperacionesMultiSitioNegocio data;
	/**
	 * Se crea objeto sitio para mandar valores
	 */
	private Sitio    registraSitio;
	/**
	 * Se crea objeto contacto para mandar valores
	 */
	private Contacto registroContacto;
	/**
	 *Uid unico generado
	 */
	 private GUIDGenerator uid;
	 /**
	  *
	  * @throws Exception
	  */
	@Before
	public void setUp() throws Exception {
		 data = new OperacionesMultiSitioNegocio();

		    /**
		    * Datos que se enviaran a contactos
		    */
	       registroContacto = new Contacto();
	       registroContacto.setNombre("JUAN CARLOS ROJAS");
	       registroContacto.setCalle("Carretera Costera Golfo");
	       registroContacto.setColonia("Polanco");
	       registroContacto.setCorreo("puebloazul@hotmail.com");
	       registroContacto.setTelefono("5578902232");

		   Date fecha = new Date();
		   registraSitio = new Sitio();
		   registraSitio.setObjetoContacto(registroContacto);
		   registraSitio.setNombre("Valle de Bravo");
		   registraSitio.setDomicilio("ESTADO DE MEXICO");
		   registraSitio.setTelefono("5567384774");
		   registraSitio.setFechaRegistro(fecha);
		   registraSitio.setEstatus(1);
		   registraSitio.setIdZona(1);

	}
	/**
	 *
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testRegistraSitio() throws Exception {
		String guid = uid.generateGUID(data);
		try {
			data.registraSitio(registraSitio);
			LogHandler.debug(guid,this.getClass(), "PRUEBA JUNIT");
		}
		catch (Exception ex) {
			LogHandler.debug(guid,this.getClass(), "Error");
		}

	}

}
