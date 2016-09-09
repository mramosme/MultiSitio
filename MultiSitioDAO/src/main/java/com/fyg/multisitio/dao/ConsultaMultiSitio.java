package com.fyg.multisitio.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dao.resources.FabricaConexiones;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Zona;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Galeria;


/**
 * Contiene los metodos para consultar en BD las entidades correspondientes al Micro-
 * Sitio
 * @author Roberto Coto
 * @version 1.0
 * @updated 07-AGO-2016 02:09:22 p.m.
 */
public class ConsultaMultiSitio {
//Se esta agregando las consultas conforme la interfaz, se estara actualizando el fichero (EN CONSTRUCCION)

	/**
	 * Metodo para consultar contacto mediante sitio y negocio
	 * @param uid , Identificador unico
	 * @param contacto ,Objeto contacto para recibir valores
	 * @param session ,Sesion de BD mybatis
	 * @return ,Regresa una lista contacto
	 */
	@SuppressWarnings("unchecked")
	public List<String> consultaContacto(String uid, Contacto contacto, SqlSession session)
	{
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		SqlSession sessionTx = null;
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		List<String> listaContacto = null;
		try {
			//Abrimos conexion Transaccional
			//Logica para saber si es atomica la transaccion
			if ( session == null ) {
				 sessionTx = FabricaConexiones.obtenerSesionTx();
			} else {
				sessionTx = session;
			}
			//Se hace una consulta a la tabla contacto
			listaContacto = sessionTx.selectList("ConsultaMultiSitio.concultaContacto", contacto);
		}
		catch (Exception ex) {
			LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			if ( session == null ) {
				LogHandler.debug(uid, this.getClass(), "Cerramos conexion.");
				FabricaConexiones.close(sessionTx);
			}
		}
		return listaContacto;
	}
	/**
	 * Metodo que consulta sitio y contacto.
	 * @param uid ,Identificador unico
	 * @param sitio ,para recibir valor de sitio
	 * @return ,Regresa una lista de sitio /contacto
	 */
	@SuppressWarnings("unchecked")
	public List<String> consultaSitio(String uid, Sitio sitio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<String> listaSitio = null;
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Se hace una consulta a la tabla contacto
			listaSitio = sessionTx.selectList("ConsultaMultiSitio.consultaSitioGeneral", sitio);
		}
		catch (Exception ex) {
			LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return listaSitio;
	}
	/**
	 * Metodo para consultar negocios
	 * @param uid ,Identificador unico
	 * @param negocio ,Para recibir valores de negocio
	 * @return ,Regresa una lista negocio
	 */
	@SuppressWarnings("unchecked")
	public List<String> consultaNegocio(String uid, Negocio negocio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<String> listaNegocio = null;
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Se hace una consulta a la tabla contacto
			listaNegocio = sessionTx.selectList("ConsultaMultiSitio.consultaNegocioGeneral", negocio);
			System.out.println("Número total: " + listaNegocio.size() );
		}
		catch (Exception ex) {
			LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return listaNegocio;
	}

	/**
	 * Metodo para consultar la zona.
	 * @param uid ,Identificador unico de registro.
	 * @param zona ,se recibe la zona para consultar la BD.
	 * @return ,Regresa la zona a culsultar.
	 */
	@SuppressWarnings("unchecked")
	public List<String> consultaZona(String uid, Zona zona) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<String> listaZona = null;
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Se hace una consulta a la tabla contacto
			listaZona = sessionTx.selectList("ConsultaMultiSitio.consultaZona", zona);
		}
		catch (Exception ex) {
			LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return listaZona;
	}
	/**
	 * Metodo para consultar una imagen
	 * @param uid , Identificador unico
	 * @param galeria ,Para recibir valore de galeria
	 * @return ,Regresa una lista de galeria
	 */
	@SuppressWarnings("unchecked")
	public List<String> consultaGaleria(String uid, Galeria galeria) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<String> listaGaleria = null;
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			//Se hace una consulta a la tabla contacto
			listaGaleria = sessionTx.selectList("ConsultaMultiSitio.consultaZona", galeria);
		}
		catch (Exception ex) {
			LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return listaGaleria;
	}
}
