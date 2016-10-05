package com.fyg.multisitio.dto;

import com.fyg.multisitio.comun.ObjetoValor;

/**
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:36:58 p.m.
 */
public class Negocio  extends ObjetoValor {
	/**
	 * serialVersionUID
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
	 * Identificador del giro
	 */
	private int idGiro;
	/**
	 * Se crea objeto para el uso del metodo registra contacto
	 */
	private Contacto objetoContacto;
	/**
	 * se crea objeto guro para recibir valor del id
	 */
	private Giro objetoGiro;
	/**
	 * Se crea objeto Galeria
	 */
	private Galeria objetoGaleria;
	/**
	 * Nombre del negocio
	 *
	 */
	private String nombre;
	/**
	 * Descripcion corta del negocio
	 */
	private String descripcionCorta;
	/**
	 * Descripcion larga del negocio
	 */
	private String descripcionLarga;
	/**
	 * Id unico del contacto
	 */
	private int idContacto;
	/**
	 * Ruta de la imagen logotipo del negocio
	 */
	private String urlLogotipo;
	/**
	 * id de la imagen de galeria
	 */
	private int idGaleria;
	/**
	 * A - Activo
	 * I - Inactivo
	 */
	private int estatus;
	/**
	 * Ruta de la p�gina de FaceBook
	 *
	 */
	private String ligaFB;
	/**
	 * Liga a la p�gina del negocio
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
	/**
	 * @return ,Se obtiene el id unico de registro
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id ,Ingresa el id unico de registro
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return ,Se obtiene el id unico de sitio
	 */
	public int getIdSitio() {
		return idSitio;
	}
	/**
	 * @param idSitio ,Ingresa el id unico del sitio
	 */
	public void setIdSitio(int idSitio) {
		this.idSitio = idSitio;
	}
	/**
	 * @return ,Se obtiene el objeto del contacto para el metodo registra contacto
	 */
	public Contacto getObjetoContacto() {
		return objetoContacto;
	}
	/**
	 * @param recibeContacto ,recibe la informacion del contacto para el metodo
	 */
	public void setObjetoContacto(Contacto recibeContacto) {
		this.objetoContacto = recibeContacto;
	}
	/**
	 * @return ,Se obtiene el nombre del negocio
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre ,Ingresa un nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,Se obtiene la descripcion corta del negocion
	 */
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	/**
	 * @param descripcionCorta ,Ingresa la descripcion corta del negocio
	 */
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}
	/**
	 * @return ,Se obtiene la descripcion larga del negocio
	 */
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	/**
	 * @param descripcionLarga ,Ingresa la descripcion larga del negocio
	 */
	public void setDescripcionLarga(String descripcionLarga) {
		this.descripcionLarga = descripcionLarga;
	}
	/**
	 * @return ,Se obtiene la url del logotipo
	 */
	public String getUrlLogotipo() {
		return urlLogotipo;
	}
	/**
	 * @param urlLogotipo ,Ingresa la url del logotipo
	 */
	public void setUrlLogotipo(String urlLogotipo) {
		this.urlLogotipo = urlLogotipo;
	}
	/**
	 * @return ,Se obtiene la liga de FB
	 */
	public String getLigaFB() {
		return ligaFB;
	}
	/**
	 * @param ligaFB , Ingresa la liga de FB
	 */
	public void setLigaFB(String ligaFB) {
		this.ligaFB = ligaFB;
	}
	/**
	 * @return ,Se obtiene la liga de la pagina
	 */
	public String getLigaPagina() {
		return ligaPagina;
	}
	/**
	 * @param ligaPagina ,Ingresa la liga de la pagina
	 */
	public void setLigaPagina(String ligaPagina) {
		this.ligaPagina = ligaPagina;
	}
	/**
	 * @return ,Se obtiene la calificacion del negocio
	 */
	public int getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion ,Ingresa la calificacion del negocio
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con wifi
	 */
	public Boolean getWifi() {
		return wifi;
	}
	/**
	 * @param wifi ,Ingresa si el negocio cuenta con wifi
	 */
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con estacionamiento
	 */
	public Boolean getEstacionamiento() {
		return estacionamiento;
	}
	/**
	 * @param estacionamiento ,Se ingresa si el negocio cuenta con estacionamiento
	 */
	public void setEstacionamiento(Boolean estacionamiento) {
		this.estacionamiento = estacionamiento;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con area de niños
	 */
	public Boolean getAreaNinos() {
		return areaNinos;
	}
	/**
	 * @param areaNinos ,Ingresa si el negocio cuenta con area de niños
	 */
	public void setAreaNinos(Boolean areaNinos) {
		this.areaNinos = areaNinos;
	}
	/**
	 * @return ,Se obtiene si el negocio permite mascotas
	 */
	public Boolean getMascotas() {
		return mascotas;
	}
	/**
	 * @param mascotas ,Ingresa si el negocio permite mascotas
	 */
	public void setMascotas(Boolean mascotas) {
		this.mascotas = mascotas;
	}
	/**
	 * @return ,Se obtiene el estatus del negocio
	 */
	public int getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ,Ingresa el estatus del negocio
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	/**
	 * @return ,Se obtiene el id del contacto unico del negocio
	 */
	public int getIdContacto() {
		return idContacto;
	}
	/**
	 * @param idContacto ,Ingresa el id unico del contacto del negocio
	 */
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	/**
	 * @return ,Obtiene el id del giro del negocio
	 */
	public int getIdGiro() {
		return idGiro;
	}
	/**
	 * @param idGiro ,Ingresa el id del giro del negocio
	 */
	public void setIdGiro(int idGiro) {
		this.idGiro = idGiro;
	}
	/**
	 * @return ,Se obtiene los valores para giro
	 */
	public Giro getObjetoGiro() {
		return objetoGiro;
	}
	/**
	 * @param recibeGiro , Ingresa el objeto giro
	 */
	public void setObjetoGiro(Giro recibeGiro) {
		this.objetoGiro = recibeGiro;
	}
	/**
	 * @return , obtiene el id de la galeria
	 */
	public int getIdGaleria() {
		return idGaleria;
	}
	/**
	 * @param idGaleria , ingresa el id de la galeria
	 */
	public void setIdGaleria(int idGaleria) {
		this.idGaleria = idGaleria;
	}
	/**
	 * @return ,Se obtiene el objeto de la galeria
	 */
	public Galeria getObjetoGaleria() {
		return objetoGaleria;
	}
	/**
	 * @param recibeGaleria ,ingresa la galeria
	 */
	public void setObjetoGaleria(Galeria recibeGaleria) {
		this.objetoGaleria = recibeGaleria;
	}
	}