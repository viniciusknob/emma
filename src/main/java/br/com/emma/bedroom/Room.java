package br.com.emma.bedroom;

import java.io.Serializable;

import br.com.emma.helper.Helper;

/**
 * Um <i>"quarto"</i> eh um local de repouso para objetos em comum.
 * 
 * @author Vinicius Knob
 *
 */
public interface Room extends Serializable {
	
	String getName();
	
	Helper openDoor();

}