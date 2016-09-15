package com.fyg.multisitio.web.jsonservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fyg.multisitio.web.ListaResultado;

@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public ListaResultado getTrackInJSON() {

		ListaResultado track = new ListaResultado();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(ListaResultado track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

}