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
import com.fyg.multisitio.dto.FiltroSitio;

@Path("/sitio")
public class JSONServiceSitio {

	  @Path("{i}")
	  @GET
	  @Produces("application/json")
	  public Response jsonSitio(@PathParam("i") Integer f) throws JSONException {
		  JSONObject jsonObject = new JSONObject();
		  FiltroSitio idSitio = new FiltroSitio();
		  idSitio.setIdSitio(f);
		  
		  List<FiltroSitio> listaSitio = new ConsultasMultiSitioNegocio().consultaSitio(idSitio);
		  for(int i = 0; i < listaSitio.size(); i++) {
			  String nombre = listaSitio.get(i).getNombre();
			  String domicilio = listaSitio.get(i).getDomicilio();
			  String telefono = listaSitio.get(i).getTelefono();
			  Date fechaRegistro = listaSitio.get(i).getFechaRegistro();
			  Boolean estatus = listaSitio.get(i).getEstatus();
			  String contactoNombre = listaSitio.get(i).getContactoNombre();
			  String contactoCalle = listaSitio.get(i).getContactoCalle();
			  String contactoColonia = listaSitio.get(i).getContactoColonia();
			  String contactoTelefono = listaSitio.get(i).getContactoTelefono();
			  String contactoCorreo = listaSitio.get(i).getContactoCorreo();
			  String urlGaleria = listaSitio.get(i).getUrlGaleria();
			  String latitud = listaSitio.get(i).getLatitud();
			  String longitud = listaSitio.get(i).getLongitud();
			  String zonaNombre = listaSitio.get(i).getZonaNombre();
			  String zonaDescripcion = listaSitio.get(i).getZonaDescripcion();
			  
			  jsonObject.put("nombre", nombre);
			  jsonObject.put("domicilio", domicilio);
			  jsonObject.put("telefono", telefono);
			  jsonObject.put("fechaRegistro", fechaRegistro);
			  jsonObject.put("estatus", estatus);
			  jsonObject.put("contactoNombre", contactoNombre);
			  jsonObject.put("contactoCalle", contactoCalle);
			  jsonObject.put("contactoColonia", contactoColonia);
			  jsonObject.put("contactoTelefono", contactoTelefono);
			  jsonObject.put("contactoCorreo", contactoCorreo);
			  jsonObject.put("urlGaleria", urlGaleria);
			  jsonObject.put("latitud", latitud);
			  jsonObject.put("longitud", longitud);
			  jsonObject.put("zonaNombre", zonaNombre);
			  jsonObject.put("zonaDescripcion", zonaDescripcion);
		  }
		  String result = "" + jsonObject;
		  return Response.status(200).entity(result).build();
	  }
}
