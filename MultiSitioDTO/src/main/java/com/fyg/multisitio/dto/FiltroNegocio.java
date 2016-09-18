package com.fyg.multisitio.dto;

import com.fyg.multisitio.comun.ObjetoValor;

public class FiltroNegocio extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = 3699000889471765036L;
	/**
	 * id unico del negocio resultante de la lista.
	 */
	private Integer idNegocio;
	/**
	 * Nombre del Negocio.
	 */
    private String nombre;
    /**
     * Descripcion del negocio.
     */
    private String descripcionCorta;
    /**
     * Descripcion larga del negocio.
     */
    private String descripcionLarga;
    /**
     * Direccion URL o unicacion del logotipo.
     */
    private String urlLogo;
    /**
     * Estatus del negocio
     */
    private Boolean status;
    /**
     * Liga de Facebook
     */
    private String ligaFB;
    /**
     * Liga de la pagina oficial
     */
    private String ligaPagina;
    /**
     * Calificacion del negocio
     */
    private Integer calificacion;
    /**
     * Si el negocio cuenta con WIFI
     */
    private Boolean wifi;
    /**
     * Si el negocio cuenta con estacionamiento
     */
    private Boolean estacionamiento;
    /**
     * Si el negocio cuenta con Area de Niños
     */
    private Boolean areaNinos;
    /**
     * Si el negocio cuenta con  area de mascotas
     */
    private Boolean mascotas;
    /**
     * URL o ubicacion de la imagen en galeria
     */
    private String urlGaleria;
    /**
     * Nombre del contacto
     */
    private String contactoNombre;
    /**
     * Calle del Contacto
     */
    private String contactoCalle;
    /**
     * Colonia del Contacto
     */
    private String contactoColonia;
    /**
     * Telefono del Contacto
     */
    private String contactoTelefono;
    /**
     * Correo del Contacto
     */
    private String contactoCorreo;
    /**
     * Nombre del Sitio
     */
    private String sitioNombre;
    /**
     * Domicilio del sitio
     */
    private String sitioDomicilio;
    /**
     * Telefono del Sitio
     */
    private String sitioTelefono;
    /**
     * @return ,Obtiene el id del negocio de la consulta.
     */
    public Integer getIdNegocio() {
		return idNegocio;
	}
    /**
     * @param idNegocio ,Ingresa el id para la consulta
     */
	public void setIdNegocio(Integer idNegocio) {
		this.idNegocio = idNegocio;
	}
	/**
	 * @return ,Obtiene el nombre del negocio.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return ,Se obtiene la descripcion.
	 */
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	/**
	 * @return ,Se obtiene la descripcion completa.
	 */
	public String getDescripcionLarga() {
		return descripcionLarga;
	}
	/**
	 * @return ,Se obtiene la direccion del logotipo.
	 */
	public String getUrlLogo() {
		return urlLogo;
	}
	/**
	 * @return ,Se obtiene el estatus.
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @return ,Se obtiene la liga de Facebook.
	 */
	public String getLigaFB() {
		return ligaFB;
	}
	/**
	 * @return ,Se obtiene la liga de la pagina oficial
	 */
	public String getLigaPagina() {
		return ligaPagina;
	}
	/**
	 * @return ,Se obtiene la calificacion de la pagina
	 */
	public Integer getCalificacion() {
		return calificacion;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con WIFI
	 */
	public Boolean getWifi() {
		return wifi;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con estacionamiento
	 */
	public Boolean getEstacionamiento() {
		return estacionamiento;
	}
	/**
	 * @return ,Se obtiene si el negocio cuenta con area Niños
	 */
	public Boolean getAreaNinos() {
		return areaNinos;
	}
	/**
	 * @return , Se obtiene si el negocio cuenta con area de mascotas
	 */
	public Boolean getMascotas() {
		return mascotas;
	}
	/**
	 * @return ,Se obtiene la URL o ubicacion de la galeria
	 */
	public String getUrlGaleria() {
		return urlGaleria;
	}
	/**
	 * @return ,Se obtiene el nombre del contacto
	 */
	public String getContactoNombre() {
		return contactoNombre;
	}
	/**
	 * @return ,Se obtiene la calle del contacto
	 */
	public String getContactoCalle() {
		return contactoCalle;
	}
	/**
	 * @return ,Se obtiene la colonia
	 */
	public String getContactoColonia() {
		return contactoColonia;
	}
	/**
	 * @return ,Telefono del contacto
	 */
	public String getContactoTelefono() {
		return contactoTelefono;
	}
	/**
	 * @return Correo del contacto
	 */
	public String getContactoCorreo() {
		return contactoCorreo;
	}
	/**
	 * @return Nombre del sitio
	 */
	public String getSitioNombre() {
		return sitioNombre;
	}
	/**
	 * @return Domicilio del sitios
	 */
	public String getSitioDomicilio() {
		return sitioDomicilio;
	}
	/**
	 * @return  telefono del sitio
	 */
	public String getSitioTelefono() {
		return sitioTelefono;
	}
}
