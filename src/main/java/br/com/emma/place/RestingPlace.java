package br.com.emma.place;

import br.com.emma.bedroom.Room;


/**
 * Um <i>"local de descanso"</i> fornece quartos para os objetos onde eles podem
 * repousar tranquilos e felizes.
 * 
 * @author Vinicius Knob
 * 
 */
public interface RestingPlace {

	/**
	 * Cria um novo quarto para descanso. Esse novo quarto recebe uma
	 * identificacao de nome e de tipo, este por sua vez identifica quais
	 * objetos poderao entrar no quarto. O nome do quarto nao pode ser nulo e
	 * nem vazio. O tipo dos objetos nao pode ser nulo.
	 * 
	 * @param <T>
	 *            Tipo dos objetos que poderao entrar no novo quarto
	 * 
	 * @param roomName
	 *            Todos os quartos criados possuem um nome, esse nome ajuda a
	 *            identificar o quarto para futuras visitas
	 * @param tipoDeObjetos
	 *            Tipo dos objetos que poderao entrar no novo quarto
	 * 
	 * @return Um novo quarto para descanso
	 */
	public <T extends Room> T createRoom(String roomName);

	/**
	 * <i>"Destruir"</i> um quarto, literalmente.
	 * 
	 * @param roomName
	 */
	public void destroyRoom(String roomName);
	
	/**
	 * <i>"Fechar"</i> um quarto.
	 * @param room
	 */
	public <T extends Room> void closeDoor(T room);
	
	/**
	 * Para <i>"visitar"</i> um quarto eh necessario localizar o quarto pelo
	 * nome.
	 * 
	 * @param roomName
	 *            Nome do quarto que deseja localizar
	 * @return
	 */
	public <T extends Room> T localize(String roomName);
	
}
