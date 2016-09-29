package com.fyg.multisitio.web;

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
		  
		  
		    String result = "" + jsonObject;
			return Response.status(200).entity(result).build();
	  }

}
