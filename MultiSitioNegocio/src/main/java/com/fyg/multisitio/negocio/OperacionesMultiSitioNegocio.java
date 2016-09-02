package com.fyg.multisitio.negocio;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.ExcepcionesMultiSitioComun;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dao.RegistraMicroSitio;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Zona;

public class OperacionesMultiSitioNegocio {


	/**
	 * Metodo para registrar negocio
	 * @param negocio variable con los datos del negocio
	 * @return estatus de la transaccion
	 * @throws Exception
	 */
	public EncabezadoRespuesta registraNegocio(Negocio negocio) {

		//Primero generamos el identificador unico de la transaccion
		String uid = GUIDGenerator.generateGUID(negocio);
		//Mandamos a log el objeto de entrada
		LogHandler.debug(uid, this.getClass(), "registraNegocio - Daton Entrada: " + negocio);
		//Variable de resultado
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		try {
			//Validaciones Negocio

			if (negocio.getNombre() == null || negocio.getNombre().isEmpty()) {
				throw new ExcepcionesMultiSitioComun("El nombre del negocio es obligatorio.");
			}

			//Seguro aqui faltan muchas valdiaciones --Agregar Robert

			//Mandamos a la parte del dao
			RegistraMicroSitio dao = new RegistraMicroSitio();
			respuesta = dao.registraNegocio(uid, negocio);
		}
		catch  (ExcepcionesMultiSitioComun ex) {
			LogHandler.error(uid, this.getClass(), "registraNegocio - ErrorMultisitio: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		catch  (Exception ex) {
			LogHandler.error(uid, this.getClass(), "registraNegocio - Error: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		LogHandler.debug(uid, this.getClass(), "registraNegocio - Daton Salida: " + respuesta);
		return respuesta;
	}


	/**
	 * Metodo para registrar sitio
	 * @param sitio variable con los datos del sitio
	 * @return estatus de la transaccion
	 */
	public EncabezadoRespuesta registraSitio(Sitio sitio) {
		//Primero generamos el identificador unico de la transaccion
		String uid = GUIDGenerator.generateGUID(sitio);
		//Mandamos a log el objeto de entrada
		LogHandler.debug(uid, this.getClass(), "registraSitio - Daton Entrada: " + sitio);
		//Variable de resultado
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		try {
			//Validaciones Negocio

			if (sitio.getNombre() == null || sitio.getNombre().isEmpty()) {
				throw new ExcepcionesMultiSitioComun("El nombre del sitio es obligatorio.");
			}

			//Seguro aqui faltan muchas valdiaciones --Agregar Robert

			//Mandamos a la parte del dao
			RegistraMicroSitio dao = new RegistraMicroSitio();
			respuesta = dao.registraSitio(uid, sitio);
		}
		catch  (ExcepcionesMultiSitioComun ex) {
			LogHandler.error(uid, this.getClass(), "registraSitio - ErrorMultisitio: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		catch  (Exception ex) {
			LogHandler.error(uid, this.getClass(), "registraSitio - Error: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		LogHandler.debug(uid, this.getClass(), "registraSitio - Daton Salida: " + respuesta);
		return respuesta;
	}



	/**
	 * Metodo para registrar una zona
	 * @param zona variable con los datos de la zona
	 * @return estatus de la transaccion
	 */
	public EncabezadoRespuesta registraZona(Zona zona)
	{
		//Primero generamos el identificador unico de la transaccion
		String uid = GUIDGenerator.generateGUID(zona);
		//Mandamos a log el objeto de entrada
		LogHandler.debug(uid, this.getClass(), "registraZona - Daton Entrada: " + zona);
		//Variable de resultado
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		try {
			//Validaciones Negocio

			if (zona.getNombre() == null || zona.getNombre().isEmpty()) {
				throw new ExcepcionesMultiSitioComun("El nombre de la zona es obligatorio.");
			}

			//Seguro aqui faltan muchas valdiaciones --Agregar Robert

			//Mandamos a la parte del dao
			RegistraMicroSitio dao = new RegistraMicroSitio();
			respuesta = dao.registraZona(uid, zona);
		}
		catch  (ExcepcionesMultiSitioComun ex) {
			LogHandler.error(uid, this.getClass(), "registraZona - ErrorMultisitio: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		catch  (Exception ex) {
			LogHandler.error(uid, this.getClass(), "registraZona - Error: " + ex.getMessage(), ex);
			respuesta.setUid(uid);
			respuesta.setEstatus(false);
			respuesta.setMensajeFuncional(ex.getMessage());
			respuesta.setMensajeTecnico(ex.getMessage());
		}
		LogHandler.debug(uid, this.getClass(), "registraZona - Daton Salida: " + respuesta);
		return respuesta;
	}
}
