package com.fyg.multisitio.dto;

import java.util.Date;

import com.fyg.multisitio.comun.ObjetoValor;

/**
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:16 p.m.
 */
public class Galeria extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = -8347679659254874490L;
	/**
	 * Identificador �nico de registro
	 *
	 */
	private int id;
	/**
	 * Id de Negocio
	 *
	 */
	private int idNegocio;
	/**
	 * Ruta de la imagen a publicar
	 *
	 */
	private String urlImagen;
	/**
	 * A - Activo
	 * I - Inactivo
	 *
	 */
	private int estatus;
	/**
	 * Fecha de registro
	 *
	 *
	 */
	private Date fechaRegistro;
	/**
	 * Fecha de Baja
	 *
	 */
	private Date fechaBaja;
	/**
	 * Usuario alta
	 */
	private String usuarioAlta;
	/**
	 * Usuario Baja
	 */
	private String usuarioBaja;
	/**
	 * @return ,Se obtiene el id unico de registro
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id ,Ingresa un id unico de registro
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return ,Se obtiene el id unico de negocio
	 */
	public int getIdNegocio() {
		return idNegocio;
	}
	/**
	 * @param idNegocio ,Ingresa un id unico de negocio
	 */
	public void setIdNegocio(int idNegocio) {
		this.idNegocio = idNegocio;
	}
	/**
	 * @return ,Se obtiene la url de la imagen
	 */
	public String getUrlImagen() {
		return urlImagen;
	}
	/**
	 * @param urlImagen ,Se ingresa la url de la imagen
	 */
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	/**
	 * @return ,Se obtiene el estatus
	 */
	public int getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ,Ingresa un estatus de la imagen de la galeria
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	/**
	 * @return ,Se obtiene una fecha de registro de la imagen
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @param fechaRegistro ,Ingresa una fecha de registro de la imagen
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	/**
	 * @return ,Se obtiene una fecha de baja
	 */
	public Date getFechaBaja() {
		return fechaBaja;
	}
	/**
	 * @param fechaBaja ,Ingresa una fecha de baja
	 */
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	/**
	 * @return ,Se obtiene el alta del usuario
	 */
	public String getUsuarioAlta() {
		return usuarioAlta;
	}
	/**
	 * @param usuarioAlta ,Ingresa una alta de usuario
	 */
	public void setUsuarioAlta(String usuarioAlta) {
		this.usuarioAlta = usuarioAlta;
	}
	/**
	 * @return ,Se obtiene la baja de usuario
	 */
	public String getUsuarioBaja() {
		return usuarioBaja;
	}
	/**
	 * @param usuarioBaja ,Ingresa la baja de usuario
	 */
	public void setUsuarioBaja(String usuarioBaja) {
		this.usuarioBaja = usuarioBaja;
	}
	/**
	 * @return ,Se obtiene la descripcion
	 */
	public String getNombre() {
		return "";
	}
	/**
	 * @param nombre ,Ingresa una descripcion
	 */
	public void setNombre(String nombre) {
	}
}