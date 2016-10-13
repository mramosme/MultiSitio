package com.fyg.multisitio.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.dto.FiltroNegocio;

@Path("/negocio")
public class JSONServiceNegocio {

	  @Path("{i}")
	  @GET
	  @Produces("application/json")
	  public Response jsonNegocio(@PathParam("i") Integer f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		FiltroNegocio idNegocio = new FiltroNegocio();
		idNegocio.setIdNegocio(f);
		
		List<FiltroNegocio> lista = new ConsultasMultiSitioNegocio().consultaNegocio(idNegocio);
		for(int i = 0; i < lista.size(); i++) {
			String nombre = lista.get(i).getNombre();
			String descripcionC =lista.get(i).getDescripcionCorta();
			String descripcionL = lista.get(i).getDescripcionLarga();
			String urlLogotipo = lista.get(i).getUrlLogo();
			Boolean estatus = lista.get(i).getStatus();
			String ligaFB = lista.get(i).getLigaFB();
			String ligaPagina = lista.get(i).getLigaPagina();
			Integer calificacion = lista.get(i).getCalificacion();
			Boolean wifi = lista.get(i).getWifi();
			Boolean areaN = lista.get(i).getAreaNinos();
			Boolean mascotas = lista.get(i).getMascotas();
			String urlGaleria = lista.get(i).getUrlGaleria();
			String contactoNombre = lista.get(i).getContactoNombre();
			String contactoCalle = lista.get(i).getContactoCalle();
			String contactoColonia = lista.get(i).getContactoColonia();
			String contactoTelefono = lista.get(i).getContactoTelefono();
			String contactoCorreo = lista.get(i).getContactoCorreo();
			String latitud = lista.get(i).getLatitud();
			String longitud = lista.get(i).getLongitud();
			String sitioNombre = lista.get(i).getSitioNombre();
			String sitioDomicilio = lista.get(i).getSitioDomicilio();
			String sitioTelefono = lista.get(i).getSitioTelefono();
			
			jsonObject.put("nombreNegocio", nombre);
			jsonObject.put("descripcionCorta", descripcionC);
			jsonObject.put("descripcionLarga", descripcionL);
			jsonObject.putOnce("urlLogotipo", urlLogotipo);
			jsonObject.putOnce("estatus", estatus);
			jsonObject.putOnce("ligaFB", ligaFB);
			jsonObject.putOnce("ligaPagina", ligaPagina);
			jsonObject.putOnce("calificacion", calificacion);
			jsonObject.putOnce("wifi", wifi);
			jsonObject.putOnce("areaN", areaN);
			jsonObject.putOnce("mascotas", mascotas);
			jsonObject.putOnce("urlGaleria", urlGaleria);
			jsonObject.putOnce("contactoNombre", contactoNombre);
			jsonObject.put("contactoCalle", contactoCalle);
			jsonObject.putOnce("contactoColonia", contactoColonia);
			jsonObject.putOnce("contactoTelefono", contactoTelefono);
			jsonObject.putOnce("contactoCorreo", contactoCorreo);
			jsonObject.putOnce("latitud", latitud);
			jsonObject.putOnce("longitud", longitud);
			jsonObject.putOnce("sitioNombre", sitioNombre);
			jsonObject.putOnce("sitioDomicilio", sitioDomicilio);
			jsonObject.putOnce("sitioTelefono", sitioTelefono);
        }
		
		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
}
