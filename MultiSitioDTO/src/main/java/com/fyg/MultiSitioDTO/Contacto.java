package com.fyg.MultiSitioDTO;

import com.fyg.MultiSitioComun.ObjetoValor;

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
	private String calle;
	private String colonia;
	private String telefono;
	private String correo;
	private String nombre;
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