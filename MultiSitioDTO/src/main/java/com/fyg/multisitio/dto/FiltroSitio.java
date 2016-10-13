package com.fyg.multisitio.dto;

import java.util.Date;

import com.fyg.multisitio.comun.ObjetoValor;

public class FiltroSitio extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 899984392545630359L;
	/**
	 * Id del sitio para la consulta
	 */
	private Integer idSitio;
	/**
	 * Nombre del negocio para la consulta
	 */
    private String nombre;
    /**
     * Domicilio del sitio
     */
    private String domicilio;
    /**
     * Telefono del Sitio
     */
    private String telefono;
    /**
     * Fecha de registro del sitio
     */
    private Date fechaRegistro;
    /**
     * Estatus
     */
    private Boolean estatus;
    /**
     * Id de la zona
     */
    private Integer idZona;
    /**
     * Nombre del contacto
     */
    private String contactoNombre;
    /**
     * Calle del contacto
     */
    private String contactoCalle;
    /**
     * Colonia del contacto
     */
    private String contactoColonia;
    /**
     * Telefono del contacto
     */
    private String contactoTelefono;
    /**
     * Correo del contacto
     */
    private String contactoCorreo;
    /**
     * latitud
     */
    private String latitud;
    /**
     * longitud
     */
    private String longitud;
    /**
     * Nombre de la zona
     */
    private String zonaNombre;
    /**
     * Descripcion de la zona
     */
    private String zonaDescripcion;
    /**
     * Url de la imagen
     */
    private String urlGaleria;
    /**
     * @return ,Obtiene el id del sitio para consulta
     */
	public Integer getIdSitio() {
		return idSitio;
	}
	/**
	 * @param idSitio ,Ingresa el id sitio
	 */
	public void setIdSitio(Integer idSitio) {
		this.idSitio = idSitio;
	}
	/**
	 * @return ,Se obtiene el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return ,Se onbtiene el domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @return ,Se obtiene el telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @return ,Regresa la fecha de registro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @return ,Regresa el estatus
	 */
	public Boolean getEstatus() {
		return estatus;
	}
	/**
	 * @return ,Regresa la zona
	 */
	public Integer getIdZona() {
		return idZona;
	}
	/**
	 * @return ,Regresa el nombre del contacto
	 */
	public String getContactoNombre() {
		return contactoNombre;
	}
	/**
	 * @return ,Regresa la calle del contacto
	 */
	public String getContactoCalle() {
		return contactoCalle;
	}
	/**
	 * @return ,Regresa la colonia del contacto
	 */
	public String getContactoColonia() {
		return contactoColonia;
	}
	/**
	 * @return Regresa el telefono del contacto
	 */
	public String getContactoTelefono() {
		return contactoTelefono;
	}
	/**
	 * @return , Regresa el telefono del contacto
	 */
	public String getContactoCorreo() {
		return contactoCorreo;
	}
	/**
	 * @return ,Regresa el nombre de la zona
	 */
	public String getZonaNombre() {
		return zonaNombre;
	}
	/**
	 * @return ,Regresa la descripcion de la zona
	 */
	public String getZonaDescripcion() {
		return zonaDescripcion;
	}
	/**
	 * @return latitud del sitio
	 */
	public String getLatitud() {
		return latitud;
	}
	/**
	 * @return regresa la longitud del sitio
	 */
	public String getLongitud() {
		return longitud;
	}
	/**
	 * @return , regresa la url de la imagen
	 */
	public String getUrlGaleria() {
		return urlGaleria;
	}
}
