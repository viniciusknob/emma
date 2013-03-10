package br.com.emma.helper;

import br.com.emma.place.RestingPlace;

/**
 * <b>Explorador</b><br>
 * Um explorador pode explorar um local de descanso.<br>
 * Implemente esta interface para, por exemplo, explorar um quarto, ou mesmo
 * para obter um objeto especifico.
 * 
 * @author Vinicius Knob
 * 
 */
public interface Explorer {

	/**
	 * Explore um quarto, obtenha um objeto, faca o que quiser.
	 * 
	 * @param restingPlace
	 */
	public void explore(RestingPlace restingPlace);

}
