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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	
	public int getEstatus() {
		 return estatus;
	}
	
	public void setEstatus(int estatus) {

	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	

}