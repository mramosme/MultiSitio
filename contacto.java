package Analisis.Componentes.MultiSitioDTO;

/**
 * Contactos
 * 
 * @author Administrador
 * @version 1.0
 * @created 21-jul-2016 12:38:09 p.m.
 */
public class contacto {

	/**
	 * Identificador único de registro
	 *        
	 */
	private static int id;
	private VARCHAR calle;
	private VARCHAR colonia;
	private VARCHAR telefono;
	private VARCHAR correo;

	public contacto(){

	}

	public void finalize() throws Throwable {

	}

	public int getid(){
		return id;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setid(int newVal){
		id = newVal;
	}

	public VARCHAR getcalle(){
		return calle;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcalle(VARCHAR newVal){
		calle = newVal;
	}

	public VARCHAR getcolonia(){
		return colonia;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcolonia(VARCHAR newVal){
		colonia = newVal;
	}

	public VARCHAR gettelefono(){
		return telefono;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settelefono(VARCHAR newVal){
		telefono = newVal;
	}

	public VARCHAR getcorreo(){
		return correo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcorreo(VARCHAR newVal){
		correo = newVal;
	}

	/**
	 * 
	 * @param id
	 */
	public PK_contacto(int id){

	}

	/**
	 * 
	 * @param id
	 */
	public UQ_contacto_id(int id){

	}

}