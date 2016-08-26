package com.fyg.multisitio.negocio;



import com.fyg.multisitio.dto.Negocio;
import com.fyg.multisitio.dto.Sitio;
import com.fyg.multisitio.dto.Zona;
import com.fyg.multisitio.comun.GUIDGenerator;
import com.fyg.multisitio.comun.LogHandler;
import com.fyg.multisitio.dao.RegistraMicroSitio;

public class OperacionesMultiSitioNegocio {
	private GUIDGenerator uid;
	RegistraMicroSitio dat = new RegistraMicroSitio();
	
	/**
	 * 
	 * @param negocio
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public void registraNegocio(Negocio negocio) throws Exception {
		String guid = uid.generateGUID(negocio);
		
		negocio.setObjetoContacto(negocio.getObjetoContacto());
		negocio.setIdSitio(negocio.getIdSitio());
		negocio.setNombre(negocio.getNombre());
		negocio.setDescripcionCorta(negocio.getDescripcionCorta());
		negocio.setDescripcionLarga(negocio.getDescripcionLarga());
		negocio.setUrlLogotipo(negocio.getUrlLogotipo());
		negocio.setEstatus(negocio.getEstatus());
		negocio.setLigaFB(negocio.getLigaFB());
		negocio.setLigaPagina(negocio.getLigaPagina());
		negocio.setCalificacion(negocio.getCalificacion());
		negocio.setWifi(negocio.getWifi());
		negocio.setEstacionamiento(negocio.getEstacionamiento());
		negocio.setAreaNinos(negocio.getAreaNinos());
		negocio.setMascotas(negocio.getMascotas());
		
		try{
			
			new RegistraMicroSitio().registraNegocio(negocio , guid);
		
		   }
		catch(Exception Excepcion){
		Excepcion.printStackTrace();
		
        LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", Excepcion);
			
		}
		
	}
	
	
	
	/**
	 * 
	 * @param sitio
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public void registraSitio(Sitio sitio) throws Exception{
		String guid = uid.generateGUID(sitio);
		
	  
		sitio.setObjetoContacto(sitio.getObjetoContacto());
		
		sitio.setNombre(sitio.getNombre());
		sitio.setDomicilio(sitio.getDomicilio());
		sitio.setTelefono(sitio.getTelefono());
		sitio.setEstatus(sitio.getEstatus());
		sitio.setIdZona(sitio.getIdZona());
		
		
		try {
			new RegistraMicroSitio().registraSitio(sitio , guid);
		}
		catch(Exception e){
			e.printStackTrace();
	        LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", e);
		}
	}
	
	
	/**
	 * 
	 * @param zona
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public void registraZona(Zona zona) throws Exception
	{
		String guid = uid.generateGUID(zona);
		
		zona.setId(zona.getId());
		zona.setNombre(zona.getNombre());
		zona.setDescripcion(zona.getDescripcion());
		zona.setUrlImagen(zona.getUrlImagen());
        zona.setEstatus(zona.getEstatus());
        
        try{
        	new RegistraMicroSitio().registraZona(zona, guid);
        }
        catch (Exception e){
        	e.printStackTrace();
            LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", e);
        }
	}
	
}