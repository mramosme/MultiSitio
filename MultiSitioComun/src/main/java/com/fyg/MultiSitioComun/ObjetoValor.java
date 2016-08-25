package com.fyg.MultiSitioComun;

import java.io.Serializable;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

/**
 * The Class ObjetoValor.
 *
 * @author Gerardo Corzo Herrera
 * Objeto Serializable que serà la base para todos los mensajes.
 */
public abstract class ObjetoValor implements Serializable {

	/**
	 *Variable que permite el logging de las actividades.
	 */
	 private static final Logger LOGGER = Logger.getLogger(ObjetoValor.class);

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8L;

	/** The tipo. */
	private int tipo;

	/**
	 * Instancia una nueva objeto valor.
	 */
	public ObjetoValor() {
	}

	/**
	 * Obtiene tipo.
	 *
	 * @return the tipo
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * Establece tipo.
	 *
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer stringbuffer = new StringBuffer();
		StringBuffer stringbufferObjects =  new StringBuffer();
		try {
            Method[] m = this.getClass().getDeclaredMethods();
            for (Method miM : m) {
            	if ( stringbuffer.length() > 0 ) {
            		stringbuffer.append(" | ");
            	}
            	if ( miM.getName().startsWith("get") ||  miM.getName().startsWith("is") ) {
            		stringbuffer.append( miM.getName() );
            		stringbuffer.append("=" );
            		Object res = (Object) miM.invoke( this );
            		if ( res != null ) {
            			if ( res.getClass().isArray() ) {
            				Object[] array = (Object[]) res;

            				for (Object miO : array ) {
            					if ( stringbufferObjects.length() > 0 ) {
            						stringbufferObjects.append( ", " );
            					}
            					if ( miO != null ) {
            						stringbufferObjects.append(  miO.toString() );
            					}
            				}
            				stringbuffer.append(stringbufferObjects  );
            			} else {
            				stringbuffer.append(  res.toString() );
            				}
            		} else {
            			stringbuffer.append( res );
            			}
            	}
            }
         } catch (Exception e) {
        	 LOGGER.info( "Error : " + e.getMessage(), e );
         }
         stringbuffer.insert(0, this.getClass().getName() + "[");
         stringbuffer.append("]");
         return   stringbuffer.toString();
	}
	
	public abstract int getId();
	public abstract void setId(int Id);
	public abstract int getEstatus();
	public abstract void setEstatus(int estatus);
	public abstract String getNombre();
	public abstract void setNombre(String nombre);
	
}
	
