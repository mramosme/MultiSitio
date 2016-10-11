package com.fyg.multisitio.web;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

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
		 JSONObject jsonObject = new JSONObject();
		 Actividad paramNombre = new Actividad();
		 
		 paramNombre.setNombre(f);
		 List<Actividad> lista = new ConsultasMultiSitioNegocio().busquedaActividad(paramNombre);
		 for(int i = 0; i < lista.size(); i++) {
			 String nombre = lista.get(i).getNombre();
			 String descripcion = lista.get(i).getDescripcion();
			 
			 jsonObject.put("nombre", nombre);
			 jsonObject.put("descripcion", descripcion);
		 }
		 String result = "" + jsonObject;
		 return Response.status(200).entity(result).build();
	 }
	
}
