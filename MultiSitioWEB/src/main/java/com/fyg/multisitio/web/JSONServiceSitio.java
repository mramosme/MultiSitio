package com.fyg.multisitio.web;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.dto.FiltroSitio;

@Path("/sitio")
public class JSONServiceSitio {

	  @Path("{i}")
	  @GET
	  @Produces("application/json")
	  public Response jsonSitio(@PathParam("i") String f) throws JSONException {
		 
		  FiltroSitio estadoBusqueda = new FiltroSitio();
		  estadoBusqueda.setEstado(f);
		  
		  List<FiltroSitio> listaSitio = new ConsultasMultiSitioNegocio().consultaSitio(estadoBusqueda);
		  JSONArray jsonArray   = new JSONArray();
		  
		  for(int i = 0; i < listaSitio.size(); i++) {
			  
			  JSONObject TEMP = new JSONObject();
			   
			  TEMP.put("nombre", listaSitio.get(i).getNombre());
			  TEMP.put("domicilio", listaSitio.get(i).getDomicilio());
			  TEMP.put("telefono", listaSitio.get(i).getTelefono());
			  TEMP.put("fechaRegistro", listaSitio.get(i).getFechaRegistro());
			  TEMP.put("estatus", listaSitio.get(i).getEstatus());
			  TEMP.put("contactoNombre", listaSitio.get(i).getContactoNombre());
			  TEMP.put("contactoCalle", listaSitio.get(i).getContactoCalle());
			  TEMP.put("contactoColonia", listaSitio.get(i).getContactoColonia());
			  TEMP.put("contactoTelefono", listaSitio.get(i).getContactoTelefono());
			  TEMP.put("contactoCorreo", listaSitio.get(i).getContactoCorreo());
			  TEMP.put("urlGaleria", listaSitio.get(i).getUrlGaleria());
			  TEMP.put("latitud", listaSitio.get(i).getLatitud());
			  TEMP.put("longitud", listaSitio.get(i).getLongitud());
			  TEMP.put("zonaNombre", listaSitio.get(i).getZonaNombre());
			  TEMP.put("estado", listaSitio.get(i).getEstado());
			  TEMP.put("zonaDescripcion", listaSitio.get(i).getZonaDescripcion());
			  jsonArray.put(TEMP);
		  }
		  String result = "" + jsonArray;
		  return Response.status(200).entity(result).build();
	  }
}
