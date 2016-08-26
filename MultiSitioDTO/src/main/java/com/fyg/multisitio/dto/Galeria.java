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
	 *        I - Inactivo
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
	private String usuarioAlta;
	private String usuarioBaja;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdNegocio() {
		return idNegocio;
	}
	public void setIdNegocio(int idNegocio) {
		this.idNegocio = idNegocio;
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
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getUsuarioAlta() {
		return usuarioAlta;
	}
	public void setUsuarioAlta(String usuarioAlta) {
		this.usuarioAlta = usuarioAlta;
	}
	public String getUsuarioBaja() {
		return usuarioBaja;
	}
	public void setUsuarioBaja(String usuarioBaja) {
		this.usuarioBaja = usuarioBaja;
	}
	
	public String getNombre() {
		return "";
	}
	
	public void setNombre(String nombre) {

	}
}