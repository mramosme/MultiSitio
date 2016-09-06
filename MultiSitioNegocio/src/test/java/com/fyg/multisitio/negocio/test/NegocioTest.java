package com.fyg.multisitio.negocio.test;


import org.junit.Before;

import org.junit.Test;
import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Negocio;

public class NegocioTest {
	private OperacionesMultiSitioNegocio data;
    private Contacto registroContacto;
    private Negocio  registroNegocio;
    private GUIDGenerator uid;
    /**
     * @author Roberto Coto
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception {
		   data = new OperacionesMultiSitioNegocio();
		  
		   /**
		    * Datos que se enviaran a contactos
		    */
	       registroContacto = new Contacto();
	       registroContacto.setNombre("CARLOS ALBERTO VAZQUEZ");
	       registroContacto.setCalle("AVILA CAMACHO");
	       registroContacto.setColonia("Polanco");
	       registroContacto.setCorreo("prueba@fygsolutions.com");
	       registroContacto.setTelefono("5578902232");
		   
	       
	       /**
		    * Datos que se enviaran al negocio
		    */
		   registroNegocio = new Negocio();
		   registroNegocio.setObjetoContacto(registroContacto);
		   registroNegocio.setIdSitio(1);
		   registroNegocio.setNombre("RESTAURANT LA FINA");
		   registroNegocio.setDescripcionCorta("Playa ubicada en Catemaco Veracruz");
		   registroNegocio.setDescripcionLarga("Playa Azul cuenta con todo lo que ves aqui al alcanze de tus manos");
		   registroNegocio.setUrlLogotipo("http://www.imagendeejemplo.com/imagencilla.jpg");
		   registroNegocio.setEstatus(1);
		   registroNegocio.setLigaFB("https://www.facebook.com/pages/PlayaAzul");
		   registroNegocio.setLigaPagina("https://www.playazul.com.mx");
		   registroNegocio.setCalificacion(5);
		   registroNegocio.setWifi(true);
		   registroNegocio.setEstacionamiento(true);
		   registroNegocio.setAreaNinos(false);
		   registroNegocio.setMascotas(true);
		   
	}

	@Test
	@SuppressWarnings("static-access")
	public void testRegistraContacto() {
		String guid = uid.generateGUID(data);
	    
		try{
			data.registraNegocio(registroNegocio);
			LogHandler.debug(guid,this.getClass(), "PRUEBA EXITOSA EN JUNIT");
		}
		catch(Exception e){
		 LogHandler.error(guid, this.getClass(), "Error: ", e);
		}
		
		
	}

}
