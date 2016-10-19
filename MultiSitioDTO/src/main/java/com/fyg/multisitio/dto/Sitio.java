package com.fyg.multisitio.dto;

import java.util.Date;

import com.fyg.multisitio.comun.ObjetoValor;

/**
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:25 p.m.
 */
public class Sitio extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 2607168646605989798L;
	/**
	 * Identificador unico de registro
	 */
	private int id;
	/**
	 * Nombre del sitio
	 */
	private String nombre;
	/**
	 * Identificador contacto del sitio
	 */
	private int contacto;
	/**
	 * Dexcripcion de la zona
	 */
	private String descripcion;
	/**
	 * Id de la imagen de la galeria
	 */
	private int idGaleria;
	/**
	 * Crear tabla de domicilios
	 */
	private String domicilio;
	/**
	 * Telefono del sitio
	 */
	private String telefono;
	/**
	 * Fecha de registro del sitio
	 */
	private Date fechaRegistro;
	/**
	 * Estatus actual del sitio
	 */
	private int estatus;
	/**
	 * Estado donde se encuentra el sitio
	 */
	private String estado;
	/**
	 * Se crea objeto contacto para el uso del metodo registra ocntacto
	 */
	private Contacto objetoContacto;
	/**
	 * se crea objeto galeria para el uso del metodo registra galeria
	 */
	private Galeria objetoGaleria;
	/**
	 * Identificador de la Zona
	 */
	private int idZona;
	/**
	 * @return ,Se obtiene el id unico de registro del sitio
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id ,Ingresa el id unico de registro del sitio
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return ,Se obtiene el nombre del sitio
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre ,Ingresa el nombre del sitio
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return ,Se obtiene el id del contacto del sitio
	 */
	public int getContacto() {
		return contacto;
	}
	/**
	 * @param contacto ,Ingresa el id del contacto del sitio
	 */
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	/**
	 * @return ,Se obtiene el objeto para utilizarlo en el metodo registra contacto
	 */
	public Contacto getObjetoContacto() {
		return objetoContacto;
	}
	/**
	 * @param recibeContacto ,Se recibe los datos del contacto (uso del metodo registra contacto)
	 */
	public void setObjetoContacto(Contacto recibeContacto) {
		this.objetoContacto = recibeContacto;
	}
	/**
	 * @return ,Se obtiene el domicilio del sitio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio ,Ingresa el domicilio del sitio
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return ,Se obtiene el telefono del sitio
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono ,Ingresa el telefono del sitio
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return ,Se obtiene la fecha del registro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @param fechaRegistro ,Ingresa la fecha del registro del sitio
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	/**
	 * @return ,Se onbtiene el estatus del sitio
	 */
	public int getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus ,Ingresa el estatus del sitio
	 */
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	/**
	 * @return ,Se obtiene el id de la zona
	 */
	public int getIdZona() {
		return idZona;
	}
	/**
	 * @param idZona ,Ingresa el id de la zona
	 */
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	/**
	 * @return ,obtiene la descripcion de la zona
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion ,Ingresa la descripcion del sitio
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return ,Obtiene el id de la galeria
	 */
	public int getIdGaleria() {
		return idGaleria;
	}
	/**
	 * @param idGaleria ,Ingresa el id de la galeria
	 */
	public void setIdGaleria(int idGaleria) {
		this.idGaleria = idGaleria;
	}
	/**
	 * @return , obtiene un objeto galeria
	 */
	public Galeria getObjetoGaleria() {
		return objetoGaleria;
	}
	/**
	 * @param recibeGaleria , recibe objeto galeria
	 */
	public void setObjetoGaleria(Galeria recibeGaleria) {
		this.objetoGaleria = recibeGaleria;
	}
	/**
	 * @return , obtiene el estado donde se encuentra el sitio
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado ,ingresa el estado.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}