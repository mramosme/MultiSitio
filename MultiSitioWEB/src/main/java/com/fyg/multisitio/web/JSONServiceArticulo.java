package com.fyg.multisitio.web;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.fyg.multisitio.negocio.ConsultasMultiSitioNegocio;
import com.fyg.multisitio.dto.Articulo;


@Path("/articulo")
public class JSONServiceArticulo {
	
	  @Path("{i}")
	  @GET
	  @Produces("application/json")
	  public Response jsonArticulo (@PathParam("i") Integer f) throws JSONException {
		 
		  JSONObject jsonObject = new JSONObject();
		  Articulo idArticulo = new Articulo();
		  idArticulo.setId(f);
		  
		  List<Articulo> lista = new ConsultasMultiSitioNegocio().consultaArticulo(idArticulo);
		  for(int i = 0; i < lista.size(); i++) {
			  String nombre  = lista.get(i).getNombre();
			  String descripcion = lista.get(i).getDescripcion();
			  Double precio = lista.get(i).getPrecio();
			  Date fechaRegistro = lista.get(i).getFechaRegistro();
			  int estatus = lista.get(i).getEstatus();
			  
			  jsonObject.put("nombreArticulo", nombre);
			  jsonObject.put("descripcion", descripcion);
			  jsonObject.put("precio", precio);
			  jsonObject.put("fechaRegistro", fechaRegistro);
			  jsonObject.put("estatus", estatus);
		  }
		  
		    String result = "" + jsonObject;
			return Response.status(200).entity(result).build();
	  }

}
