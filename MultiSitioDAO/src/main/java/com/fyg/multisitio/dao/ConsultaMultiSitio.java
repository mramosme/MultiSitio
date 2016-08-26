package com.fyg.multisitio.dao;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

//import com.fyg.MultiSitioComun.ObjetoValor;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Galeria;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Zona;


public class ConsultaMultiSitio {
	private static SqlSessionFactory sqlMapper;
	private static Reader reader; 
	//private static final Logger LOGGER = Logger.getLogger(ObjetoValor.class);
	
private static Vector<SqlSessionFactory> sqlSessionFactory;
	
	static {
		sqlSessionFactory = new Vector<SqlSessionFactory>();
		
		sqlSessionFactory.add(0, null );
		sqlSessionFactory.add(1, null );
		sqlSessionFactory.add(2, null );
		}

	static{
		try{
			reader	  = Resources.getResourceAsReader("database-config.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader,getDatabaseProperties());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory(){
		return sqlMapper;
	}
	
	private static Properties getDatabaseProperties(){
		Resource resource = new ClassPathResource("database.properties");
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
	
	
	@SuppressWarnings("unchecked")
	public List<Contacto> obtenerCatalogoContacto(Contacto contacto) throws Exception {
		SqlSession session         = null;
		List<Contacto> listaCatalogo = null;
		
		try {
			session       = sqlSessionFactory.get(0).openSession(true);
			listaCatalogo = session.selectList("ConsultaMultiSitio.consultaContacto", contacto);
		}
		catch(Exception excepcion) {
			session.rollback();
			//logger.info("[ConsultasAdministracionRedVentasDAO][obtenerCatalogo] ERROR POR: " + excepcion.getMessage());
			throw excepcion;
		}
		finally {
			session.commit();
			this.cerrarConexion(session);
		}
		
		return listaCatalogo;
	}
	
	@SuppressWarnings("unchecked")
	public List<Galeria> obtenerCatalogoGaleria(Galeria galeria) throws Exception {
		SqlSession session         = null;
		List<Galeria> listaCatalogo = null;
		
		try {
			session       = sqlSessionFactory.get(0).openSession(true);
			listaCatalogo = session.selectList("ConsultaMultiSitio.consultaGaleria", galeria);
		}
		catch(Exception excepcion) {
			session.rollback();
			//logger.info("[ConsultasAdministracionRedVentasDAO][obtenerCatalogo] ERROR POR: " + excepcion.getMessage());
			throw excepcion;
		}
		finally {
			session.commit();
			this.cerrarConexion(session);
		}
		
		return listaCatalogo;
	}
	
	@SuppressWarnings("unchecked")
	public List<Negocio> obtenerCatalogoNegocio(Negocio negocio) throws Exception {
		SqlSession session         = null;
		List<Negocio> listaCatalogo = null;
		
		try {
			session       = sqlSessionFactory.get(0).openSession(true);
			listaCatalogo = session.selectList("ConsultaMultiSitio.consultaNegocio", negocio);
		}
		catch(Exception excepcion) {
			session.rollback();
			//logger.info("[ConsultasAdministracionRedVentasDAO][obtenerCatalogo] ERROR POR: " + excepcion.getMessage());
			throw excepcion;
		}
		finally {
			session.commit();
			this.cerrarConexion(session);
		}
		
		return listaCatalogo;
	}
	
	@SuppressWarnings("unchecked")
	public List<Sitio> obtenerCatalogoSitio(Sitio sitio) throws Exception {
		SqlSession session         = null;
		List<Sitio> listaCatalogo = null;
		
		try {
			session       = sqlSessionFactory.get(0).openSession(true);
			listaCatalogo = session.selectList("ConsultaMultiSitio.consultaSitio",sitio);
		}
		catch(Exception excepcion) {
			session.rollback();
			//logger.info("[ConsultasAdministracionRedVentasDAO][obtenerCatalogo] ERROR POR: " + excepcion.getMessage());
			throw excepcion;
		}
		finally {
			session.commit();
			this.cerrarConexion(session);
		}
		
		return listaCatalogo;
	}
	
	@SuppressWarnings("unchecked")
	public List<Zona> obtenerCatalogoZona(Zona zona) throws Exception {
		SqlSession session         = null;
		List<Zona> listaCatalogo = null;
		
		try {
			session       = sqlSessionFactory.get(0).openSession(true);
			listaCatalogo = session.selectList("ConsultaMultiSitio.consultaZona", zona);
		}
		catch(Exception excepcion) {
			session.rollback();
			//logger.info("[ConsultasAdministracionRedVentasDAO][obtenerCatalogo] ERROR POR: " + excepcion.getMessage());
			throw excepcion;
		}
		finally {
			session.commit();
			this.cerrarConexion(session);
		}
		
		return listaCatalogo;
	}
}
