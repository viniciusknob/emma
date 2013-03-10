package br.com.emma.bedroom;

import java.util.Hashtable;

import br.com.emma.helper.Helper;
import static br.com.emma.util.Validation.*;

public class Bedroom implements Room {

	private static final long serialVersionUID = 2602217775354116334L;
	
	private Hashtable<String, Object> _bedroom = new Hashtable<String, Object>();
	private String _nameBedroom;

	/**
	 * Um <i>"quarto"</i> recebe um nome como forma de identificacao para
	 * futuras visitas. O nome do quarto nao pode ser nulo e nem vazio.
	 * 
	 * @param nameBedroom
	 *            Nome do quarto para identificacao
	 * 
	 * @throws NullPointerException
	 *             se nameBedroom for nulo
	 * @throws IllegalArgumentException
	 *             se nameBedroom for vazio
	 */
	public Bedroom(String nameBedroom) {
		if (isNull(nameBedroom))
			throw new NullPointerException("nameBedroom is null");
		if (nameBedroom.isEmpty())
			throw new IllegalArgumentException("nameBedroom is empty");
		
		_nameBedroom = nameBedroom;
	}
	
	@Override
	public String getName() {
		return _nameBedroom;
	}

	@Override
	public Helper openDoor() {
		return new Helper() {
			
			@Override
			public void includeGuest(String nameObject, Object object) {
				if (nameObject.isEmpty())
					throw new IllegalArgumentException("nameObject is empty");
				if (isNull(object))
					throw new NullPointerException("objeto is null");
				
				_bedroom.put(nameObject, object);
			}
			
			@Override
			public Object fetch(String nameObject) {
				if (nameObject.isEmpty())
					throw new IllegalArgumentException("nameObject is empty");
				
				return _bedroom.get(nameObject);
			}
		};
	}
	
	public static class NotFound extends RuntimeException {

		private static final long serialVersionUID = -726590838221811488L;

		public NotFound() {
		}

		public NotFound(String message) {
			super(message);
		}

		public NotFound(Throwable throwable) {
			super(throwable);
		}

		public NotFound(String message, Throwable throwable) {
			super(message, throwable);
		}

	}

}
