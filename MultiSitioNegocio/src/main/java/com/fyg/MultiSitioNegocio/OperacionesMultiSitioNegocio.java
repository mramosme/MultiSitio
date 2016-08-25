package com.fyg.MultiSitioNegocio;



import com.fyg.MultiSitioDTO.Negocio;
import com.fyg.MultiSitioDTO.Sitio;
import com.fyg.MultiSitioDTO.Zona;
import com.fyg.MultiSitioDAO.RegistraMicroSitio;
import com.fyg.MultiSitioComun.LogHandler;


import com.fyg.MultiSitioComun.GUIDGenerator;

public class OperacionesMultiSitioNegocio {
	private GUIDGenerator uid;
	RegistraMicroSitio dat = new RegistraMicroSitio();
	
	@SuppressWarnings("static-access")
	public void registraNegocio(Negocio negocio) throws Exception {
		
		
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
			
			new RegistraMicroSitio().registraNegocio(negocio);
		
		   }
		catch(Exception Excepcion){
		String guid = uid.generateGUID(negocio);
        LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", Excepcion);
			
		}
		
	}
	
	
	
	//registro de sitio
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
			new RegistraMicroSitio().registraSitio(sitio);
		}
		catch(Exception e){
	        LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", e);
		}
	}
	
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
        	new RegistraMicroSitio().registraZona(zona);
			LogHandler.debug(guid,this.getClass(), "REGISTRO zona TEST");
        }
        catch (Exception e){
            LogHandler.error(guid, this.getClass(), "Error al registrar, intente mas tarde: ", e);
        }
	}
	
}