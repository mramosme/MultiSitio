package com.fyg.multisitio.dto;

import com.fyg.multisitio.comun.ObjetoValor;

/**
 * Contactos
 *
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:09 p.m.
 */
public class Contacto extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 8163048128392157838L;
	/**
	 * Identificador unico de registro
	 *
	 */
	private int id;

	/**
	 * Dato que almacena la calle del contacto
	 */
	private String calle;
	/**
	 * Dato que almacena una colonia
	 */
	private String colonia;
	/**
	 * Dato que almacena el telefono del contacto
	 */
	private String telefono;
	/**
	 * Dato que almacena el correo del contacto
	 */
	private String correo;
	/**
	 * Dato que almacena el nombre del contacto
	 */
	private String nombre;
	/**
	 * Dato que almacena el estatus
	 */
	private int estatus;
	/**
	 * @return , obtiene el id unico de registro
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id ,ingresa el id unico
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return ,obtiene la calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * @return ,obtiene el estatus
	 */
	public int getEstatus() {
		 return estatus;
	}
	/**
	 * @param estatus , ingresa un estatus
	 */
	public void setEstatus(int estatus) {

	}
	/**
	 * @return ,Se obtiene el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param calle ,ingresa una calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return ,obtiene la colonia
	 */
	public String getColonia() {
		return colonia;
	}
	/**
	 * @param colonia ,ingresa una colonia
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	/**
	 * @return ,obtiene un numero de telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono ,ingresa un numero de telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return ,obtiene un correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo ,ingresa un correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @param nombre ,ingresa un nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	

}