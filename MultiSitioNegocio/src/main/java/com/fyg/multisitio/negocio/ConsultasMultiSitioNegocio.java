package com.fyg.multisitio.negocio;

import java.util.Iterator;
import java.util.List;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.FiltroNegocio;
import com.fyg.multisitio.dto.FiltroSitio;
import com.fyg.multisitio.dao.ConsultaMultiSitio;
public class ConsultasMultiSitioNegocio {

	/**
	 * Metodo que utiliza el dao para consultar un negocio
	 * @param negocio ,Recibe valores de negocio
	 * @return ,regresa la lista de negocio
	 */
	public List<FiltroNegocio> consultaNegocio(FiltroNegocio negocio) {
		//Primero generamos el identificador unico de la transaccion
		String uid = GUIDGenerator.generateGUID(negocio);
		//Mandamos a log el objeto de entrada
		LogHandler.debug(uid, this.getClass(), "registraNegocio - Daton Entrada: " + negocio);
		//Variable de resultado
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Consulta correcta.");
		List<FiltroNegocio> data = null;
	    try {
	    	data = new ConsultaMultiSitio().consultaNegocio(uid, negocio);
	    	 
	    } catch (Exception ex) {
	    	LogHandler.error(uid, this.getClass(), "ConsultaMultiSitio - ErrorMultisitio: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
	    }
	    LogHandler.debug(uid, this.getClass(), "consultaNegocio - Datos Salida: " + respuesta);
		return data;
	}
/**
 * Metodo que consulta los sitios disponibles
 * @param sitio ,Recibe valores de sitio
 * @return ,Regresa una lista sitio
 */
	public EncabezadoRespuesta consultaSitio(FiltroSitio sitio) {
		//Primero generamos el identificador unico de la transaccion
				String uid = GUIDGenerator.generateGUID(sitio);
				//Mandamos a log el objeto de entrada
				LogHandler.debug(uid, this.getClass(), "consultaSitio - Daton Entrada: " + sitio);
				//Variable de resultado
			    EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
			    try {
			    	List<FiltroSitio> dataSitio = new ConsultaMultiSitio().consultaSitio(uid, sitio);
			    	Iterator<FiltroSitio> iter = dataSitio.iterator();
					while (iter.hasNext())
					{ System.out.println(iter.next()); }
			    } catch (Exception ex) {
			    	LogHandler.error(uid, this.getClass(), "ConsultaMultiSitio - ErrorMultisitio: " + ex.getMessage(), ex);
					respuesta.setUid(uid);
					respuesta.setEstatus(false);
					respuesta.setMensajeFuncional(ex.getMessage());
					respuesta.setMensajeTecnico(ex.getMessage());
			    }
			    LogHandler.debug(uid, this.getClass(), "consultaNegocio - Datos Salida: " + respuesta);
		return respuesta;
	}
}
