package com.fyg.multisitio.web.jservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

import com.fyg.multisitio.web.ListadoNegocio;

@Path("/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Response getTrackInJSON()throws JSONException {

		
		JSONObject jsonObject = new JSONObject();
		String artist = "Enter Sandman";
		String singer ="Metallica";
		
		jsonObject.put("Music", artist);
		jsonObject.put("Artist", singer);
		String res = "" +jsonObject;
        
		return Response.status(200).entity(res).build();

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(ListadoNegocio track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

}
