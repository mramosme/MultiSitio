package com.fyg.multisitio.negocio.test;


import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Galeria;
import com.fyg.multisitio.dto.Giro;
import com.fyg.multisitio.dto.Negocio;

public class NegocioTest {
	/**
	 * Se crea el objeto data para mandarle valores a negocio
	 */
	private OperacionesMultiSitioNegocio data;
	/**
	 * Objeto contacto para mandar valores
	 */
    private Contacto registroContacto;
    /**
     * Objeto negoocio para mandar valores
     */
    private Negocio  registroNegocio;
    /**
     * Objeto galeria para mandar valores
     */
    private Galeria registraGaleria;
    /**
     * Generador uid unico
     */
    private GUIDGenerator uid;
    /**
     * Objeto para giro
     */
    private Giro registroGiro;
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
	       registroContacto.setLatitud("19.4243792");
	       registroContacto.setLongitud("-99.1954434");
           /**
            * Datos que se le enviaran para registrar un giro
            */
	       registroGiro = new Giro();
	       registroGiro.setNombreGiro("Restaurante");
	       
	       Date fechaImagen = new Date();
	       registraGaleria = new Galeria();
	       registraGaleria.setUrlImagen("http://vignette4.wikia.nocookie.net/zootopia/images/3/3e/Nick_Sly_Fox_Render.png");
	       registraGaleria.setEstatus(1);
	       registraGaleria.setFechaRegistro(fechaImagen);
	       registraGaleria.setUsuarioAlta("Admin");
	       
	       /**
		    * Datos que se enviaran al negocio
		    */
		   registroNegocio = new Negocio();
		   registroNegocio.setObjetoContacto(registroContacto);
		   registroNegocio.setObjetoGaleria(registraGaleria);
		   registroNegocio.setIdSitio(2);
		   registroNegocio.setObjetoGiro(registroGiro);
		   registroNegocio.setNombre("RESTAURANT LA FINA");
		   registroNegocio.setDescripcionCorta("Playa ubicada en Catemaco Veracruz");
		   registroNegocio.setDescripcionLarga("Playa Azul cuenta con todo lo que ves aqui al alcanze de tus manos");
		   registroNegocio.setUrlLogotipo("http://www.imagendeejemplo.com/imagencilla.jpg");
		   registroNegocio.setEstatus(1);
		   registroNegocio.setLigaFB("https://www.facebook.com/pages/PlayaAzul");
		   registroNegocio.setLigaPagina("https://www.playazul.com.mx");
		   registroNegocio.setCalificacion(1);
		   registroNegocio.setWifi(true);
		   registroNegocio.setEstacionamiento(true);
		   registroNegocio.setAreaNinos(false);
		   registroNegocio.setMascotas(true);
		   

	}
	/**
	 * @Test ,para las pruebas unitarias
	 */
	@Test
	@SuppressWarnings("static-access")
	public void testRegistraContacto() {
		String guid = uid.generateGUID(data);

		try {
			data.registraNegocio(registroNegocio);
			LogHandler.debug(guid,this.getClass(),"PRUEBA EXITOSA EN JUNIT");
		}
		catch (Exception ex) {
		 LogHandler.error(guid, this.getClass(), "Error: ", ex);
		}

	}
}
