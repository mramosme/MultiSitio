package com.fyg.multisitio.comun;


import java.util.HashMap;
import java.util.Map;

public class Language
{
	/**
	 * Se crea Language para almacenar
	 */
	private String language  = null;
	/**
	 * Mapa que almacena los msgs personalizados
	 */
	private Map<String, Map<String, String>>    dictionary = new HashMap<String, Map<String, String>>();
	/**
	 * @param getLanguage ,Se obtiene el lenguaje a usar
	 */
	public Language( String getLanguage )
	{

		language = getLanguage;

		Map<String,String>key = new HashMap<String,String>();

		//Español
		key.put("ERROR_REGISTRO"       , "No fue posible completar el registro, Intente mas tarde.");
		key.put("IMPOSIBLE_MODIFICAR"           , "No fue posible modificar el registro.");
		key.put("ERROR_MODIFICAR_BD"              , "No fue posible modificar el registro en la BD");
		key.put("ERROR_CONSULTAR_REGISTRO"    , "No se puede consultar el registro.");
		key.put("MODIFICACION_COMPLETA"           , "La modificacion ha sido correcta.");
		key.put("ERROR_BAJA"        , "No fue posible dar de baja el registro");
		key.put("BAJA_COMPLETA", "La baja ha sido correcta");

		dictionary.put("ES", key);

		//Inglés
		key.put("INCOMPLETE_REGISTRY"		, "Impossible compleer registry.");
		key.put("IMPOSSIBLE_MODIFY"    		, "Impossible to edit.");
		key.put("ERROR_CONSULT_REGISTRY"	, "Cannot consult registry.");

		dictionary.put("EN", key);

	}
	/**
	 * @param key ,Key generada
	 * @return ,Se obtiene la key
	 */
	public String get( String key )
	{
		return dictionary.get(language).get(key);
	}

}