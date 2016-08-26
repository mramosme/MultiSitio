package com.fyg.multisitio.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.exceptions.IbatisException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Galeria;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Zona;
import com.fyg.multisitio.comun.ExcepcionesMultiSitioComun;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;

/**
 * Contiene los metodos para guardar en BD las entidades correspondientes al Micro-
 * Sitio
 * @author mramosme
 * @version 1.0
 * @updated 21-jul-2016 02:09:22 p.m.
 */


/*lee el archivo XML de la configuracion y el llamado de los mappers*/
public class RegistraMicroSitio {
	IbatisException msgError;
	private static GUIDGenerator uid;
	private static SqlSessionFactory sqlMapper;
	private static Reader reader; 
	private Contacto ObjContacto;

	
	static{
		try{
			reader	  = Resources.getResourceAsReader("com/fyg/multisitio/dao/resources/database-config.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader,getDatabaseProperties());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlMapper;
	}
	
	private static Properties getDatabaseProperties(){
		Resource resource = new ClassPathResource("com/fyg/multisitio/dao/resources/database.properties");
		Properties databaseProperties = null;
		try {
			databaseProperties = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return databaseProperties;
	}
	
	private void cerrarConexion(SqlSession session) {
		try {
			if(session != null) {
				session.clearCache();
		    	session.close();
			}
		} catch(Exception excepcion) {
			excepcion.printStackTrace();
		}
	}

	
	                                                            /*INICIA OPERACIONES*/

	/**
	 * Modifica un  registro de la tabla 
	 */
	@SuppressWarnings("static-access")
	private void modificaContacto(Contacto contacto)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaRegistroContacto",contacto);
Integer valor =  new Integer (1);
			
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
		catch(IbatisException e) {
        	
			String guid = uid.generateGUID(contacto);  
            LogHandler.error(guid, this.getClass(), "Error: ", e);
		}
		finally {
			if (result)
			{
				session.commit();
				String guid = uid.generateGUID(contacto);
				LogHandler.debug(guid,this.getClass(), "REGISTRO ACTUALIZADO EN LA BD");
			}
			
			this.cerrarConexion(session);
		}
	}

	/**
	 * Modifica un  registro de la tabla 
	 */
	public  void modificaGaleria(Galeria galeria, String guid)throws Exception{
		
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaRegistroGaleria",galeria);
			Integer valor =  new Integer (1);
			if(actualizados.equals(valor)) {
				result = true;
			}
			
		}
		 catch(IbatisException e) { 
	            LogHandler.error(guid, this.getClass(), "Error: ", e);
			}
			finally {
				if (result)
				{
					session.commit();
					LogHandler.debug(guid,this.getClass(), "Modificación correcta de galeria");
				}
				this.cerrarConexion(session);
			}
	}
	
	/**
	 * 
	 * Inactiva un registro de la galeria
	 * 
	 *
	 */

	public void inactivaGaleria(Galeria galeria, String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaEstatusGaleria",galeria);

			Integer valor =  new Integer (1);
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
		catch(IbatisException e) {
        	  
            LogHandler.error(guid, this.getClass(), "Error: ", e);
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "Inactivación correcta de galeria");
			}
			this.cerrarConexion(session);
		}
	}

	/**
	 * Modifica un  registro de la tabla negocio
	 */

	public void modificaNegocio(Negocio negocio, String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		
		 /**
		  * Se crea un objecto tipo Contacto para recibir informacion del contacto
		  */
		Contacto contact = new Contacto();
		
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaRegistroNegocio",negocio);
            
			/**
			 * Llamada al metodo modificaContacto
			 */
			modificaContacto(contact);
			
			Integer valor =  new Integer (1);
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
		catch(IbatisException e) {
            LogHandler.error(guid, this.getClass(), "Error: ", e);
            
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "Modificación correcta de contacto");
			}
			this.cerrarConexion(session);
		}
	}

	/**
	 * Modifica un  registro a la tabla sitio
	 */
	
	public void modificaSitio(Sitio sitio, String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaRegistroSitio",sitio);
			Integer valor =  new Integer (1);
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
		catch(IbatisException e) {
        
            LogHandler.error(guid, this.getClass(), "Error: ", e);
      
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "Modificación correcta de sitio");
			}
			this.cerrarConexion(session);
		}
	}

	/**
	 * Modifica un  registro de la tabla zona
	 */
	
	public void modificaZona(Zona zona, String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
			Integer actualizados = session.update("RegistraMicroSitio.actualizaRegistroZona",zona);

			Integer valor =  new Integer (1);
			if(actualizados.equals(valor)) {
				result = true;
			}
			 
		}
		catch(IbatisException e) {
        	
            LogHandler.error(guid, this.getClass(), "Error: ", e);
           
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "Modificación correctade la zona");
			}
			this.cerrarConexion(session);
		}
	}

	/**
	 * Ingresa un  registro a la tabla contacto
	 */
	@SuppressWarnings("static-access")
	private void registraContacto(Contacto contacto)throws ExcepcionesMultiSitioComun{
		
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		
		Boolean result = false;
		
		try {
        	Integer actualizados = session.insert("RegistraMicroSitio.insertaRegistroContacto",contacto);
            Integer valor =  new Integer (1);
            
            ObjContacto = contacto;
			if(actualizados.equals(valor)) {
				result = true;
			}
		
			
		}
           catch(IbatisException e) {
        	String guid = uid.generateGUID(contacto);  
            LogHandler.error(guid, this.getClass(), "Error: ", e);
            throw e;
		}
		finally {
			if (result)
			{
				session.commit();
				String guid = uid.generateGUID(contacto);
				LogHandler.debug(guid,this.getClass(), "REGISTRO CONTACTO CORRECTO EN LA BD");
			}
			
			this.cerrarConexion(session);
		}
		
		
	}

	/**
	 * Ingrega un  registro a la tabla galeria
	 */
	@SuppressWarnings("static-access")
	public void registraGaleria(Galeria galeria)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
        	Integer actualizados = session.insert("RegistraMicroSitio.insertaRegistroGaleria",galeria);
Integer valor =  new Integer (1);
			
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
catch(IbatisException e) {
        	
			String guid = uid.generateGUID(galeria);  
            LogHandler.error(guid, this.getClass(), "Error: ", e);
            throw e;
		}
		finally {
			if (result)
			{
				session.commit();
				String guid = uid.generateGUID(galeria);
				LogHandler.debug(guid,this.getClass(), "REGISTRO GALERIA CORRECTA EN LA BD");
				
			}
			
			this.cerrarConexion(session);
		}
	}

	/**
	 * Ingrega un  registro a la tabla negocio
	 */
	
	public void registraNegocio(Negocio negocio , String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
			/**
			 * llama al metodo privado Contacto
			 */
			registraContacto(negocio.getObjetoContacto());
			
			/**
			 * se le asigna el id resultante 
			 */
			negocio.setIdContacto(ObjContacto.getId());
			
        	Integer actualizados = session.insert("RegistraMicroSitio.insertaRegistroNegocio",negocio);
            Integer valor =  new Integer (1);

			if(actualizados.equals(valor)) {
				result = true;
			}
			
		}
		catch(IbatisException e) {
        	//AQUI

            LogHandler.error(guid, this.getClass(), "Error: ", e);
            throw e;
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "REGISTRO CORRECTO DEL NEGOCIO EN LA BD");
			}
			
			this.cerrarConexion(session);
		}
		
		
	}

	/**
	 * Ingrega un  registro a la tabla sitio
	 */

	public void registraSitio(Sitio sitio,String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		
		try {
			/**
			 * Llama al metodo privado registraContacto
			 */
			 registraContacto(sitio.getObjetoContacto());
		
			sitio.setContacto(ObjContacto.getId()); 
			
        	Integer actualizados = session.insert("RegistraMicroSitio.insertaRegistroSitio",sitio);
        	Integer valor =  new Integer (1);
			
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
           catch(IbatisException e) {
        	
            LogHandler.error(guid, this.getClass(), "Error: ", e);
            throw e;
            
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "REGISTRO CORRECTO EN LA BD");
			}
			
			this.cerrarConexion(session);
		}
	}

	/**
	 * Ingrega un  registro a la tabla zona
	 */
	
	
	public void registraZona(Zona zona, String guid)throws Exception{
		SqlSession session = RegistraMicroSitio.getSqlSessionFactory().openSession();
		Boolean result = false;
		try {
        	Integer actualizados = session.insert("RegistraMicroSitio.insertaRegistroZona",zona);
            Integer valor =  new Integer (1);
			
			if(actualizados.equals(valor)) {
				result = true;
			}
		}
catch(IbatisException e) {
        	
			 
            LogHandler.error(guid, this.getClass(), "Error: ", e);
            throw e;
		}
		finally {
			if (result)
			{
				session.commit();
				LogHandler.debug(guid,this.getClass(), "REGISTRO CORRECTO EN LA BD");
			}
			
			this.cerrarConexion(session);
		}
	}

	/**
	 * Modifica un  registro de la tabla promocion
	 */
	public void modificaPromocion(){

	}

	/**
	 * Ingrega un  registro a la tabla promocion
	 */
	public void registraPromocion(){

	}

}