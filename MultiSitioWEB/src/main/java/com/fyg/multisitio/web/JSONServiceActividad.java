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
import com.fyg.multisitio.dto.Actividad;


@Path("/busqueda")
public class JSONServiceActividad {

	 @Path("{i}")
	 @GET
	 @Produces("application/json")
	 public  Response jsonActividadBusqueda (@PathParam("i") String f) throws JSONException {
			
		 Actividad paramNombre = new Actividad();
		 
		 paramNombre.setNombre(f);
		 List<Actividad> lista = new ConsultasMultiSitioNegocio().busquedaActividad(paramNombre);

                 JSONArray jsonArray   = new JSONArray();

		 for(int i = 0; i < lista.size(); i++) 
		{
			JSONObject TEMP = new JSONObject();

			 TEMP.put("nombreNegocio", lista.get(i).getNombre());
			 TEMP.put("descripcionD", lista.get(i).getDescripcion());

			 jsonArray.put(TEMP);
			 
		 }
		 String result = "" + jsonArray;

		 return Response.status(200).entity(result).build(); 
	 }
	
}
