package com.fyg.multisitio.dto;

import java.util.Date;

import com.fyg.multisitio.comun.ObjetoValor;

/**
* Clase Promocion
* Define el catalogo de promociones
* @author Roberto Coto
* @version 1.0
* @created 21-jul-2016 12:38:33 p.m.
*/
public class Promocion extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 7525397544198367754L;

	/**
     *Identificador unico de registro
	 */
	private int id;
	/**
	 * Identificador unico del sitio
	 */
	private int idSitio;
	/**
	 * Identificador unico del negocio
	 */
	private int idNegocio;
	/**
	 * Descripcion de la promocion
	 */
	private String nombre;
	/**
	 * Fecha de inicio
	 */
	private Date fechaInicio;
	/**
	 * Fecha Final
	 */
	private Date fechaFin;
	/**
	 * Descripcion del registro de usuario
	 */
	private String usuarioRegistro;

	/**
	 * @return , obtiene el id
	 */
    public int getId() {
		return id;
	}
	/**
	 * @param id , ingresa un id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return , obtiene el id del sitio
	 */
	public int getIdSitio() {
		return idSitio;
	}
	/**
	 * @param idSitio , ingresa el id del sitio
	 */
	public void setIdSitio(int idSitio) {
		this.idSitio = idSitio;
	}
	/**
	 * @return , obtiene el idnegocio
	 */
	public int getIdNegocio() {
		return idNegocio;
	}
	/**
	 * @param idNegocio , ingresa un id negocio
	 */
	public void setIdNegocio(int idNegocio) {
		this.idNegocio = idNegocio;
	}
	/**
	 * @return , retorna la descripcion de la promocion
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre , inserta la descripcion
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,retorna una fecha de inicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio , ingresa una fecha de inicio
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return , retorna la fecha final
	 */
	public Date getFechaFin() {
		return fechaFin;
	}
	/**
	 * @param fechaFin ,ingresa una fecha final
	 */
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	/**
	 * @return retorna el registro del usuario
	 */
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	/**
	 * @param usuarioRegistro , inserta un  registro de usuario
	 */
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
}
