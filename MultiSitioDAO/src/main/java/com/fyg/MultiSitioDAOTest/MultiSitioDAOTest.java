package com.fyg.MultiSitioDAOTest;

import org.junit.Before;
import org.junit.Test;

import com.fyg.MultiSitioDAO.RegistraMicroSitio;
import com.fyg.MultiSitioDTO.Contacto;



import com.fyg.MultiSitioComun.LogHandler;
import com.fyg.MultiSitioComun.GUIDGenerator;
import com.fyg.MultiSitioComun.ExcepcionesMultiSitioComun;

public class MultiSitioDAOTest {
	private GUIDGenerator uid;
	private RegistraMicroSitio contacto;
	private Contacto data;
	
	/*@Before
	public void setUp() throws Exception {
		contacto = new RegistraMicroSitio();
		data = new Contacto();
		
		
		data.setNombre("JUAN CARLOS PEREZ");
		data.setCalle("CAMINO VERDE");
		data.setColonia("SANTA FE");
		data.setCorreo("JPEREZ@fygsolutions.com");
		data.setTelefono("5567893345");	
	}

	@Test
	@SuppressWarnings("static-access")
	public void testRegistraContacto() throws ExcepcionesMultiSitioComun {
		String guid = uid.generateGUID(contacto);
		
		try{
			
			contacto.registraContacto(data);
			
		}
		catch(ExcepcionesMultiSitioComun e){
			LogHandler.error(guid, this.getClass(), "Error: ", e);
		}
	}*/
	

}
