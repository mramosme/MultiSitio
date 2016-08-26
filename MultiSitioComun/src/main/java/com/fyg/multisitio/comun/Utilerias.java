package com.fyg.multisitio.comun;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * The Class Utilerias.
 *
 * @author out_gcorzo
 */
public final class Utilerias {

	/**
	 * variable de log
	 */
	private static final Logger LOGGER = Logger.getLogger(Utilerias.class.getName());
	/**
	 * variable VACIO.
	 */
	private static final String JAVASTRING = "class java.lang.String";

	/**
	 * variable VACIO.
	 */
	private static final String VACIO = "";
	/**
	 *constructor de la clase
	 */
	private Utilerias() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Datos requeridos.
	 *
	 * @param objeto
	 *            the objeto
	 * @return the string
	 */
	public static String datosRequeridos(final Object objeto) {
		try {
			BeanInfo info;
			info = Introspector.getBeanInfo(objeto.getClass());
			for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
				if ("class java.lang.String".equals(pd.getPropertyType().toString())) {
					if (pd.getReadMethod().invoke(objeto) == null
							|| VACIO.equals(pd.getReadMethod().invoke(objeto))) {
						return pd.getName().toString();
					}
				} else {
					if (pd.getReadMethod().invoke(objeto) == null) {
						return pd.getName().toString();
					}
				}
			}
		} catch (IntrospectionException ex) {
			LOGGER.error("IntrospectionException ", ex);
		} catch (IllegalAccessException ex) {
			LOGGER.error("IllegalAccessException ", ex);
		} catch (IllegalArgumentException ex) {
			LOGGER.error("IllegalArgumentException ", ex);
		} catch (InvocationTargetException ex) {
			LOGGER.error("InvocationTargetException ", ex);
		}
		return "";
	}

	/**
	 * Datos requeridos.
	 *
	 * @param objeto the objeto
	 * @param camposValidar the campos validar
	 * @return the string
	 */
	public static String datosRequeridos(final Object objeto, final String[] camposValidar) {

		try {
			Arrays.sort(camposValidar);
			BeanInfo info;
			info = Introspector.getBeanInfo(objeto.getClass());

			for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
				if (Arrays.binarySearch(camposValidar, pd.getName()) >= 0) {

					if (pd.getReadMethod().invoke(objeto) == null) {
						return pd.getName().toString();
					} else if (JAVASTRING
							.equals(pd.getPropertyType().toString())
							&& VACIO.equals(pd.getReadMethod().invoke(objeto))) {
							return pd.getName().toString();
					}
				}
			}
		} catch (IntrospectionException ex) {
			LOGGER.error("IntrospectionException ", ex);
		} catch (IllegalAccessException ex) {
			LOGGER.error("IllegalAccessException ", ex);
		} catch (IllegalArgumentException ex) {
			LOGGER.error("IllegalArgumentException ", ex);
		} catch (InvocationTargetException ex) {
			LOGGER.error("InvocationTargetException ", ex);
		}
		return "";
	}

}
