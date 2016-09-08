package com.fyg.multisitio.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dao.resources.FabricaConexiones;
import com.fyg.multisitio.dto.Contacto;


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
	 * @param uid
	 * @param contacto
	 * @param session
	 * @return ,Regresa una lista contacto
	 */
	@SuppressWarnings("unchecked")
	private List<String> consultaContacto(String uid, Contacto contacto,SqlSession session)
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

	public List<String> consultaZona(String uid, Contacto contacto,SqlSession session) {
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		SqlSession sessionTx = null;
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<String> listaZona = null;
		try {
			
		}
		catch (Exception ex) {
			
		}
		return listaZona;
	}

}
