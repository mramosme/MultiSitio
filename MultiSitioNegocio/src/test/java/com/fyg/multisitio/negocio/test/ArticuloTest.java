package com.fyg.multisitio.negocio.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fyg.multisitio.dto.Articulo;
import com.fyg.multisitio.negocio.OperacionesMultiSitioNegocio;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
public class ArticuloTest {
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
	 private Articulo registraArticulo;
	 /**
	  *
	  * @throws Exception
	  */
	@Before
	public void setUp() throws Exception {
		 data = new OperacionesMultiSitioNegocio();
		 /**
		  * Datos que se enviaran a articulo
		  */
		 Date fechaRegistro = new Date();
		 registraArticulo = new Articulo();
		 registraArticulo.setIdNegocio(2);
		 registraArticulo.setNombre("Platillo regional de mariscos");
		 registraArticulo.setDescripcion("Platillo de mariscos con salsa y pimientos");
		 registraArticulo.setPrecio(50.5);
		 registraArticulo.setFechaRegistro(fechaRegistro);
		 registraArticulo.setEstatus(1);
	}
	/**
	 *
	 * @throws Exception
	 */
	@Test
	@SuppressWarnings("static-access")
	public void testRegistraArticulo() throws Exception {
		
		String guid = uid.generateGUID(data);
		try {
			data.registraArticulo(registraArticulo);
			LogHandler.debug(guid,this.getClass(), "PRUEBA JUNIT");
		}
		catch (Exception ex) {
			LogHandler.debug(guid,this.getClass(), "Error");
		}
	}

}
