package com.fyg.MultiSitioDTO;

import java.util.Date;
import com.fyg.MultiSitioComun.ObjetoValor;
import com.fyg.MultiSitioDTO.Contacto;

/**
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:25 p.m.
 */
public class Sitio extends ObjetoValor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2607168646605989798L;
	
	private int id;
	private String nombre;
	private int contacto;
	/**
	 * Crear tabla de domicilios
	 *        
	 */
	private String domicilio;
	private String telefono;
	private Date fechaRegistro;
	private int estatus;
	private Contacto ObjetoContacto;
	/**
	 * Identificador de la Zona
	 *        
	 */
	private int idZona;
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
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public Contacto getObjetoContacto() {
		return ObjetoContacto;
	}
	public void setObjetoContacto(Contacto RecibeContacto) {
		this.ObjetoContacto = RecibeContacto;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public int getIdZona() {
		return idZona;
	}
	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}
	
	
}