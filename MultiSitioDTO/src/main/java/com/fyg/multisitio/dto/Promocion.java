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

	private int id;
	private int idSitio;
	private int idNegocio;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String usuarioRegistro;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSitio() {
		return idSitio;
	}
	public void setIdSitio(int idSitio) {
		this.idSitio = idSitio;
	}
	public int getIdNegocio() {
		return idNegocio;
	}
	public void setIdNegocio(int idNegocio) {
		this.idNegocio = idNegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
}
