package com.fyg.multisitio.dto;

import com.fyg.multisitio.comun.ObjetoValor;

public class Giro extends ObjetoValor {

	/**
	 *
	 */
	private static final long serialVersionUID = -230061793226354884L;
	/**
	 * Identificador unico del giro
	 */
	private Integer idGiro;
	/**
	 * Nombre del giro del negocio
	 */
	private String  nombreGiro;
	/**
	 * @return ,obtiene el id del giro
	 */
	public Integer getIdGiro() {
		return idGiro;
	}
	/**
	 * @param idGiro ,ingresa el id del giro del negocio
	 */
	public void setIdGiro(Integer idGiro) {
		this.idGiro = idGiro;
	}
	/**
	 * @return Obtiene el nombre del giro
	 */
	public String getNombreGiro() {
		return nombreGiro;
	}
	/**
	 * @param nombreGiro Ingresa el nombre del giro
	 */
	public void setNombreGiro(String nombreGiro) {
		this.nombreGiro = nombreGiro;
	}
}
