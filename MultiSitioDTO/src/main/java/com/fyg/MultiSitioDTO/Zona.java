package com.fyg.MultiSitioDTO;

import com.fyg.MultiSitioComun.ObjetoValor;

/**
 * Definir cat�logo de Zonas
 * 
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:33 p.m.
 */
public class Zona extends ObjetoValor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6731409908395972932L;
	/**
	 * Identificador �nico de registro
	 *        
	 */
	private  int id;
	/**
	 * Nombre de la Zona
	 *        
	 */
	private String nombre;
	/**
	 * Descripci�n de la zona
	 *        
	 */
	private String descripcion;
	private String urlImagen;
	/**
	 * A - Activo
	 *        I - Inactivo
	 *        
	 */
	private int estatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	
}