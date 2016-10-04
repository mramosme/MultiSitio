package com.fyg.multisitio.dao;

import org.apache.ibatis.session.SqlSession;

import com.fyg.multisitio.comun.EncabezadoRespuesta;
import com.fyg.multisitio.comun.ExcepcionesMultiSitioComun;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dao.resources.FabricaConexiones;
import com.fyg.multisitio.dto.Articulo;
import com.fyg.multisitio.dto.Contacto;
import com.fyg.multisitio.dto.Galeria;
import com.fyg.multisitio.dto.Giro;
import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Zona;
import com.fyg.multisitio.dto.Promocion;

/**
 * Contiene los metodos para guardar en BD las entidades correspondientes al Micro-
 * Sitio
 * @author mramosme
 * @version 1.0
 * @updated 21-jul-2016 02:09:22 p.m.
 */

public class RegistraMicroSitio {

	/**
	 * Se crea un ObjetoContacto para obtener el id cuando se registra en la tabla contacto
	 */
	private Contacto objContacto;
	/**
	 * Se crea objeto giro para recibir el id en la tabla negocio
	 */
	private Giro objGiro;
	/**
	 * Se crea objeto galeria para recibir el id
	 */
	private Galeria objGaleria;
	/**
	 * Metodo modifica contacto, realiza la modificacion de un contacto (de sitio o de negocio)
	 * @param uid identificador unico de la transaccion
	 * @param contacto variable para la actualizacion
	 * @param session sesion, en caso de ser atomica la transaccion
	 * @return estatus actualizacion
	 */
	private EncabezadoRespuesta modificaContacto(String uid, Contacto contacto, SqlSession session) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		try {
			//Abrimos conexion Transaccional
			//Logica para saber si es atomica la transaccion
			if ( session == null ) {
				 sessionTx = FabricaConexiones.obtenerSesionTx();
			} else {
				sessionTx = session;
			}

        	int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroContacto", contacto);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar el contacto.");
			}
			//Realizamos commit
			//La conexion no es atomica realizamos commit
			if ( session == null ) {
				LogHandler.debug(uid, this.getClass(), "Commit conexion.");
				sessionTx.commit();
			}
		}
		catch (Exception ex) {
			//Realizamos rollBack
			if ( session == null ) {
				LogHandler.debug(uid, this.getClass(), "RollBack!!!");
				FabricaConexiones.rollBack(sessionTx);
			}
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
		return respuesta;
	}


	/**
	 * Metodo modifica galeria ,Modifica una imagen de la galeria del sitio o negocio
	 * @param uid identificador unico de la transaccion
	 * @param galeria  variable para la actualizacion
	 * @return estatus actualizacion
	 */
	public EncabezadoRespuesta modificaGaleria(String uid, Galeria galeria) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroGaleria", galeria);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar la galeria.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}
	/**
	 * Metodo que modifica el articulo
	 * @param uid ,UID unico
	 * @param articulo , recibe valores de articulo
	 * @return , retorna si la modificacion fue exitosa
	 */
	public EncabezadoRespuesta modificaArticulo(String uid, Articulo articulo) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Modificacion Correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaArticulo", articulo);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en inactivar la galeria.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}
	/**
	 * Metodo que modifica un giro
	 * @param uid ,UID unico de registro
	 * @param giro , recibe valores de giro
	 * @return regresa si fue exitosa la modificacion
	 */
	public EncabezadoRespuesta modificaGiro(String uid, Giro giro) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Modificacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaGiro", giro);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en inactivar la galeria.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}
	/**
	 * Inactiva un registro de la galeria
	 * @param uid identificador unico de la transaccion
	 * @param galeria variable para la actualizacion
	 * @return estatus actualizacion
	 */
	public EncabezadoRespuesta inactivaGaleria(String uid, Galeria galeria) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Inactivacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaEstatusGaleria", galeria);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en inactivar la galeria.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Modifica un  registro de la tabla negocio
	 * @param uid identificador unico de la transaccion
	 * @param negocio variable para la actualizacion
	 * @return estatus actualizacion
	 */
	public EncabezadoRespuesta modificaNegocio(String uid, Negocio negocio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Inactivacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();

			//Modificamos Contacto
			modificaContacto(uid, negocio.getObjetoContacto(), sessionTx);

			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroNegocio", negocio);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar el negocio.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			LogHandler.debug(uid, this.getClass(), "Cerrar conexion.");
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Modifica un  registro a la tabla sitio
	 * @param uid identificador unico de la transaccion
	 * @param sitio variable para la actualizacion
	 * @return estatus actualizacion
	 */
	public EncabezadoRespuesta modificaSitio(String uid, Sitio sitio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroSitio", sitio);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar el sitio.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Modifica un  registro de la tabla zona
	 * @param uid identificador unico de la transaccion
	 * @param zona  variable para la actualizacion
	 * @return estatus actualizacion
	 */
	public EncabezadoRespuesta modificaZona(String uid, Zona zona) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroZona", zona);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar el sitio.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}



	/**
	 * Metodo registra contacto , registra un contacto para sitio o negocio
	 * @param uid identificador unico de la transaccion
	 * @param contacto variable para registro
	 * @param session sesion, en caso de ser atomica la transaccion
	 * @return contacto registrado
	 * @throws Exception en caso de existir un error
	 */
	private Contacto registraContacto(String uid, Contacto contacto, SqlSession session)
			throws Exception {
		SqlSession sessionTx = null;

		//Logica para saber si es atomica la transaccion
		if ( session == null ) {
			 sessionTx = FabricaConexiones.obtenerSesionTx();
		} else {
			sessionTx = session;
		}
		//Registramos el contacto
		int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroContacto", contacto);
        //Validamos el registro
		if ( registros == 0) {
			if ( session == null ) {
				FabricaConexiones.rollBack(sessionTx);
				FabricaConexiones.close(sessionTx);
			}
			throw new ExcepcionesMultiSitioComun("No se pudo registrar el contacto.");
		}
		//Obtenemos el id contacto que se genero al insertar y se le asiga al objeto contacto
			objContacto = contacto;

		//La conexion no es atomica realizamos commit
		if ( session == null ) {
			LogHandler.debug(uid, this.getClass(), "Commit conexion.");
			sessionTx.commit();
		}
		//La conexion no es atomica cerramos
		if ( session == null ) {
			LogHandler.debug(uid, this.getClass(), "Cerramos conexion.");
			FabricaConexiones.close(sessionTx);
		}
		return contacto;
	}

	/**
	 * Metodo para registrar una imagen en la galeria
	 * @param uid ,UID unico de registro
	 * @param galeria , recibe los valores de galeria
	 * @param session , Abre una session de base de datos
	 * @return ,regresa el id de la imagen
	 * @throws Exception , si ocurre una excepcion
	 */
	private Galeria registraGaleria(String uid, Galeria galeria, SqlSession session) throws Exception {
		SqlSession sessionTx = null;
		//Logica para saber si es atomica la transaccion
				if ( session == null ) {
					 sessionTx = FabricaConexiones.obtenerSesionTx();
				} else {
					sessionTx = session;
				}
				//Registramos el contacto
				int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroGaleria", galeria);
		        //Validamos el registro
				if ( registros == 0) {
					if ( session == null ) {
						FabricaConexiones.rollBack(sessionTx);
						FabricaConexiones.close(sessionTx);
					}
					throw new ExcepcionesMultiSitioComun("No se pudo registrar el contacto.");
				}
				//Obtenemos el id contacto que se genero al insertar y se le asiga al objeto contacto
					objGaleria = galeria;

				//La conexion no es atomica realizamos commit
				if ( session == null ) {
					LogHandler.debug(uid, this.getClass(), "Commit conexion.");
					sessionTx.commit();
				}
				//La conexion no es atomica cerramos
				if ( session == null ) {
					LogHandler.debug(uid, this.getClass(), "Cerramos conexion.");
					FabricaConexiones.close(sessionTx);
				}
				return galeria;
	}


	/**
	 * Metodo registra negocio, Ingresa un registro en la tabla negocio
	 * @param uid identificador unico de la transaccion
	 * @param negocio variable para registro
	 * @return estatus trasaccion
	 */
	public EncabezadoRespuesta registraNegocio(String uid, Negocio negocio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Registro correcto.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();

			//Primero registramos el contacto
			registraContacto(uid, negocio.getObjetoContacto() , sessionTx);

			//Despues registramos el giro
			registraGiro(uid, negocio.getObjetoGiro() , sessionTx);

			//Despues registramos la imagen en la galeria
			registraGaleria(uid, negocio.getObjetoGaleria(), sessionTx);

			//Validar si trae el id del contacto
			LogHandler.debug(uid, this.getClass(), "contacto: " + negocio.getObjetoContacto());

			//Validar si trae el id del giro
			LogHandler.debug(uid, this.getClass(), "contactoGiro: " + negocio.getObjetoGiro());

			//Se le asigna el id del contacto resultante en la tabla negocio
			negocio.setIdContacto(objContacto.getId());

			//Se le asigna el id del giro del negocio
			negocio.setIdGiro(objGiro.getIdGiro());

			//Se le asigna el id de la imagen guardada
			negocio.setIdGaleria(objGaleria.getId());

        	int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroNegocio", negocio);
			if ( registros == 0) {
				throw new ExcepcionesMultiSitioComun("Error en registrar Negocio.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;

	}


	/**
	 * Metodo registra sitio ,Ingresa un registro en la tabla sitio
	 * @param uid identificador unico de la transaccion
	 * @param sitio variable para registro
	 * @return estatus trasaccion
	 */
	public EncabezadoRespuesta registraSitio(String uid, Sitio sitio) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Registro correcto.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();

			//Primero registramos el contacto
			registraContacto(uid, sitio.getObjetoContacto() , sessionTx);

			//segundo guardamos la imagen en nuestra galeria
			registraGaleria(uid, sitio.getObjetoGaleria() , sessionTx);
			//Validar si trae el id del contacto
			LogHandler.debug(uid, this.getClass(), "contacto: " + sitio.getObjetoContacto());

			//Le asignamos el id de contacto en sitio
			sitio.setContacto(objContacto.getId());

			//le asignamos el id de la galeria en el sitio
			sitio.setIdGaleria(objGaleria.getId());

        	int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroSitio", sitio);
			if ( registros == 0) {
				throw new ExcepcionesMultiSitioComun("Error en registrar Sitio.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Metodo registra zona ,Ingresa un registro en la tabla zona
	 * @param uid identificador unico de la transaccion
	 * @param zona variable para registro
	 * @return estatus trasaccion
	 */
	public EncabezadoRespuesta registraZona(String uid, Zona zona) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Registro correcto.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
        	int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroZona", zona);
			if ( registros == 0) {
				throw new ExcepcionesMultiSitioComun("Error en registrar la zona.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Metodo modifica promocion ,Modifica en la tabla promocion
	 * @param uid identificador unico de la transaccion
	 * @param promocion variable para registro
	 * @return estatus modificacion
	 */
	public EncabezadoRespuesta modificaPromocion(String uid, Promocion promocion) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Actualizacion correcta.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
			int actualizados = sessionTx.update("RegistraMicroSitio.actualizaRegistroPromocion", promocion);
			if ( actualizados == 0) {
				throw new ExcepcionesMultiSitioComun("Error en actualizar la galeria.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}

	/**
	 * Metodo registra promocion ,Ingresa un registro en la tabla promocion
	 * @param uid identificador unico de la transaccion
	 * @param promocion variable para registro
	 * @return estatus trasaccion
	 */
	public EncabezadoRespuesta registraPromocion(String uid, Promocion promocion) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Registro correcto.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
        	int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroPromocion", promocion);
			if ( registros == 0) {
				throw new ExcepcionesMultiSitioComun("Error en registrar la zona.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}
	/**
	 * Metodo para registrar un articulo
	 * @param uid ,Identificador unico
	 * @param articulo ,recibe valores del articulo
	 * @return regresa si el registro fue correcto
	 */
	public EncabezadoRespuesta registraArticulo(String uid, Articulo articulo) {
		SqlSession sessionTx = null;
		EncabezadoRespuesta respuesta = new EncabezadoRespuesta();
		respuesta.setUid(uid);
		respuesta.setEstatus(true);
		respuesta.setMensajeFuncional("Registro correcto.");
		try {
			//Abrimos conexion Transaccional
			sessionTx = FabricaConexiones.obtenerSesionTx();
        	int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroArticulo", articulo);
			if ( registros == 0) {
				throw new ExcepcionesMultiSitioComun("Error en registrar la zona.");
			}
			//Realizamos commit
			LogHandler.debug(uid, this.getClass(), "Commit!!!");
			sessionTx.commit();
		}
		catch (Exception ex) {
			//Realizamos rollBack
			LogHandler.debug(uid, this.getClass(), "RollBack!!!");
			FabricaConexiones.rollBack(sessionTx);
            LogHandler.error(uid, this.getClass(), "Error: " + ex.getMessage(), ex);
            respuesta.setEstatus(false);
    		respuesta.setMensajeFuncional(ex.getMessage());
		}
		finally {
			FabricaConexiones.close(sessionTx);
		}
		return respuesta;
	}
	/**
	 * Metodo privado para registrar el giro del negocio
	 * @param uid , UID unico de registro
	 * @param giro , recibe valores de giro
	 * @param session , inicia la sesion de base de datos
	 * @return regresa si el registro fue correcto
	 */
	private Giro registraGiro(String uid, Giro giro, SqlSession session)
			throws Exception {
		SqlSession sessionTx = null;

		//Logica para saber si es atomica la transaccion
		if ( session == null ) {
			 sessionTx = FabricaConexiones.obtenerSesionTx();
		} else {
			sessionTx = session;
		}
		//Registramos el giro
		int registros = sessionTx.insert("RegistraMicroSitio.insertaRegistroGiro", giro);
        //Validamos el registro
		if ( registros == 0) {
			if ( session == null ) {
				FabricaConexiones.rollBack(sessionTx);
				FabricaConexiones.close(sessionTx);
			}
			throw new ExcepcionesMultiSitioComun("No se pudo registrar el giro.");
		}
		//Obtenemos el id giro que se genero al insertar y se le asiga al objeto giro
			objGiro = giro;

		//La conexion no es atomica realizamos commit
		if ( session == null ) {
			LogHandler.debug(uid, this.getClass(), "Commit conexion.");
			sessionTx.commit();
		}
		//La conexion no es atomica cerramos
		if ( session == null ) {
			LogHandler.debug(uid, this.getClass(), "Cerramos conexion.");
			FabricaConexiones.close(sessionTx);
		}
		return giro;
	}
}
