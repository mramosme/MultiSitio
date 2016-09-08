package com.fyg.multisitio.negocio;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dao.ConsultaMultiSitio;
public class ConsultasMultiSitioNegocio {

	/**
	 * Metodo que utiliza el dao para consultar un negocio
	 * @param negocio ,Recibe valores de negocio
	 * @return ,regresa la lista de negocio
	 */
	public EncabezadoRespuesta consultaNegocio(Negocio negocio) {
		//Primero generamos el identificador unico de la transaccion
		String uid = GUIDGenerator.generateGUID(negocio);
		//Mandamos a log el objeto de entrada
		LogHandler.debug(uid, this.getClass(), "registraNegocio - Daton Entrada: " + negocio);
		//Variable de resultado
	    EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
	    try {
	    	//Mandamos el id a consultar para el ejemplo
	    	ConsultaMultiSitio dao = new ConsultaMultiSitio();
	    } catch (Exception ex) {
	    	LogHandler.error(uid, this.getClass(), "ConsultaMultiSitio - ErrorMultisitio: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
	    }
	    LogHandler.debug(uid, this.getClass(), "consultaNegocio - Daton Salida: " + respuesta);
		return respuesta;
	}
}
