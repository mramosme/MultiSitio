package com.fyg.multisitio.dto;

import java.util.Date;

import com.fyg.multisitio.comun.ObjetoValor;

/**
 * @author Roberto Coto
 *
 */
public class Articulo extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 7553466827353987149L;
	/**
	 * Identificador unico del articulo
	 */
	private Integer id;
	/**
	 * ID del negocio
	 */
	private Integer idNegocio;
	/**
	 * Nombre del articulo
	 */
	private String nombre;
	/**
	 * Descripcion del articulo
	 */
	private String descripcion;
	/**
	 * Precio del articulo
	 */
	private Double precio;
	/**
	 * Fecha del registro del articulo
	 */
	private Date fechaRegistro;
	/**
	 * Estatus del articulo
	 */
	private Boolean estatus;
	/**
	 * @return ,Obtiene el id del articulo
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id , ingresa el id del articulo
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return obtiene el id del negocio
	 */
	public Integer getIdNegocio() {
		return idNegocio;
	}
	/**
	 * @param idNegocio , Ingresa el id del negocio
	 */
	public void setIdNegocio(Integer idNegocio) {
		this.idNegocio = idNegocio;
	}
	/**
	 * @return ,Obtiene el nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre , ingresa el nombre del articulo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,obtiene la descripcion del articulo
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion , Ingresa la descripcion del articulo
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return , Obtiene el precio del articulo
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @param precio , ingresa el precio del articulo
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @return , obtiene la fecha de registro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @param fechaRegistro , Ingresa la fecha de registro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	/**
	 * @return , obtiene el estatus del articulo
	 */
	public Boolean getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ,ingresa el estatus del articulo
	 */
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
}
