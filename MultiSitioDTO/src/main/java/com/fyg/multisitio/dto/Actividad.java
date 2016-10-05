package com.fyg.multisitio.dto;

import com.fyg.multisitio.comun.ObjetoValor;

public class Actividad  extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 240073096192346286L;
	/**
	 * Identificador unico de actividad.
	 */
	private int idActividad;
	/**
	 * nombre de la actividad
	 */
	private String nombre;
	/**
	 * descripcion de la etiqueta
	 */
	private String descripcion;
	/**
	 * Identificador del giro
	 */
	private int idGiro;
	/***
	 * @return , obtiene el id de la actividad
	 */
	public int getIdActividad() {
		return idActividad;
	}
	/**
	 * @param idActividad ,Ingresa el id de la actividad
	 */
	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}
	/**
	 * @return ,Obtiene el nombre de la actividad
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre , ingresa el nombre de la actividad
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,Obtiene la descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion ,ingresa la descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return ,Obtiene el id del Giro
	 */
	public int getIdGiro() {
		return idGiro;
	}
	/**
	 * @param idGiro ,Ingresa el id del giro
	 */
	public void setIdGiro(int idGiro) {
		this.idGiro = idGiro;
	}
}
