package com.fyg.multisitio.dto;
import com.fyg.multisitio.comun.ObjetoValor;

/**
 * Definir cat�logo de Zonas
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:33 p.m.
 */
public class Zona extends ObjetoValor {

	/**
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
	 */
	private String descripcion;
	/**
	 * Imagen a subir
	 */
	private String urlImagen;
	/**
	 * A - Activo
	 * I - Inactivo
	 */
	private int estatus;

	/**
	 * @return ,obtiene el id unico de registro
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id ,ingresa el id unico de registro
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return , obtiene la descripcion de la zona
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre , ingresa la descripcion de la zona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,Obtiene la descripcion de la zona
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion ,ingresa una descripcion de la zona
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return ,obtiene la url de la imagen
	 */
	public String getUrlImagen() {
		return urlImagen;
	}
	/**
	 * @param urlImagen ,ingresa la url de la imagen
	 */
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	/**
	 * @return ,obtiene el estatus de la zona
	 */
	public int getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ,ingresa el estatus de la zona
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
}