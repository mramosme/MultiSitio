package com.fyg.multisitio.comun;


import java.util.HashMap;
import java.util.Map;

public class Language 
{
	
	private String Language  = null;
	
	private Map<String, Map<String, String>>    Dictionary = new HashMap<String, Map<String, String>>();
	
	
	public Language( String getLanguage )
	{
		
		Language = getLanguage;

		Map<String,String>    Key   = new HashMap<String,String>();
		
		//Español
		Key.put("ERROR_REGISTRO"       , "No fue posible completar el registro, Intente mas tarde.");
		Key.put("IMPOSIBLE_MODIFICAR"           , "No fue posible modificar el registro.");
		Key.put("ERROR_MODIFICAR_BD"              , "No fue posible modificar el registro en la BD");
		Key.put("ERROR_CONSULTAR_REGISTRO"    , "No se puede consultar el registro.");
		Key.put("MODIFICACION_COMPLETA"           , "La modificacion ha sido correcta.");
		Key.put("ERROR_BAJA"        , "No fue posible dar de baja el registro");
		Key.put("BAJA_COMPLETA", "La baja ha sido correcta");
		
		
		Dictionary.put("ES", Key);
		
		//Inglés
		Key.put("INCOMPLETE_REGISTRY"		, "Impossible compleer registry.");
		Key.put("IMPOSSIBLE_MODIFY"    		, "Impossible to edit.");
		Key.put("ERROR_CONSULT_REGISTRY"	, "Cannot consult registry.");
		
		Dictionary.put("EN", Key);
				
		

	}
	 
	public String get( String Key )
	{
		return Dictionary.get(Language).get(Key);
	}

}