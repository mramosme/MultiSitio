package com.fyg.MultiSitioDTO;


import com.fyg.MultiSitioComun.ObjetoValor;
import com.fyg.MultiSitioDTO.Contacto;

/**
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:36:58 p.m.
 */
public class Negocio  extends ObjetoValor{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2622164735608068022L;
	/**
	 * Identificador �nico de registro
	 *        
	 */
	private int id;
	/**
	 * Identificador del Sitio
	 *        
	 */
	private int idSitio;
	/**
	 * Identificador del contacto
	 *        
	 */
	private Contacto ObjetoContacto;
	/**
	 * Nombre del negocio
	 *        
	 */
	private String nombre;
	private String descripcionCorta;
	private String descripcionLarga;
	private int idContacto;
	
	/**
	 * Ruta de la imagen logotipo del negocio
	 *        
	 */
	private String urlLogotipo;
	/**
	 * A - Activo
	 *        I - Inactivo
	 *        
	 */
	private int estatus;
	/**
	 * Ruta de la p�gina de FaceBook
	 *        
	 */
	private String ligaFB;
	/**
	 * Liga a la p�gina del negocio
	 *        
	 */
	private String ligaPagina;
	/**
	 * Calificaci�n del negocio otorgada por los clientes
	 *        
	 */
	private int calificacion = 0;
	/**
	 * El negocio ofrece servicio de Wifi
	 *        
	 */
	private Boolean wifi;
	/**
	 * El negocio cuenta con estacionamiento
	 *        
	 */
	private Boolean estacionamiento;
	/**
	 * El negocio cuenta con �rea para ni�os
	 *        
	 */
	private Boolean areaNinos;
	/**
	 * El negocio acepta mascotas
	 *        
	 */
	private Boolean mascotas;
	
	
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
	public Contacto getObjetoContacto() {
		return ObjetoContacto;
	}
	public void setObjetoContacto(Contacto RecibeContacto) {
		this.ObjetoContacto = RecibeContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}
	public String getUrlLogotipo() {
		return urlLogotipo;
	}
	public void setUrlLogotipo(String urlLogotipo) {
		this.urlLogotipo = urlLogotipo;
	}
	
	
	public String getLigaFB() {
		return ligaFB;
	}
	public void setLigaFB(String ligaFB) {
		this.ligaFB = ligaFB;
	}
	public String getLigaPagina() {
		return ligaPagina;
	}
	public void setLigaPagina(String ligaPagina) {
		this.ligaPagina = ligaPagina;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public Boolean getWifi() {
		return wifi;
	}
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	public Boolean getEstacionamiento() {
		return estacionamiento;
	}
	public void setEstacionamiento(Boolean estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	public Boolean getAreaNinos() {
		return areaNinos;
	}
	public void setAreaNinos(Boolean areaNinos) {
		this.areaNinos = areaNinos;
	}
	public Boolean getMascotas() {
		return mascotas;
	}
	public void setMascotas(Boolean mascotas) {
		this.mascotas = mascotas;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	
	
	

	}