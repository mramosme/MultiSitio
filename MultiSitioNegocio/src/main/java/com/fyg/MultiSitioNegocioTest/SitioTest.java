package com.fyg.MultiSitioNegocioTest;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import com.fyg.MultiSitioDTO.Sitio;
import com.fyg.MultiSitioDTO.Contacto;
import com.fyg.MultiSitioNegocio.OperacionesMultiSitioNegocio;
import com.fyg.MultiSitioComun.LogHandler;
import com.fyg.MultiSitioComun.GUIDGenerator;


public class SitioTest {
	private OperacionesMultiSitioNegocio data;
	private Sitio    registraSitio;
	private Contacto registroContacto;
	 private GUIDGenerator uid;
	 
	 
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
		 
		   Date Fecha = new Date();
		   registraSitio = new Sitio();
		   registraSitio.setObjetoContacto(registroContacto);
		   registraSitio.setNombre("Valle de Bravo");
		   registraSitio.setDomicilio("ESTADO DE MEXICO");
		   registraSitio.setTelefono("5567384774");
		   registraSitio.setFechaRegistro(Fecha);
		   registraSitio.setEstatus(1);
		   registraSitio.setIdZona(1);
		
	}

	@SuppressWarnings("static-access")
	@Test
	public void testRegistraSitio() throws Exception {
		String guid = uid.generateGUID(data);
		try{
			data.registraSitio(registraSitio);
			LogHandler.debug(guid,this.getClass(), "PRUEBA JUNIT");
		}
		catch(Exception e){
			
		}
		
	}

}
