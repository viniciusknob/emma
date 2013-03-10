package br.com.emma.placeImpl;

import java.util.Hashtable;

import br.com.emma.bedroom.Bedroom;
import br.com.emma.bedroom.Room;
import br.com.emma.place.RestingPlace;
import static br.com.emma.util.Validation.*;

public class HashtablePlace implements RestingPlace {
	
	private Hashtable<String, Room> _restingPlace;
	
	public HashtablePlace() {
		_restingPlace = new Hashtable<String, Room>();
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T extends Room> T createRoom(String roomName) {
		return (T) new Bedroom(roomName);
	}

	@Override
	public void destroyRoom(String roomName) {
		if (isNull(roomName))
			throw new NullPointerException("nameBedroom is null");
		if (roomName.isEmpty())
			throw new IllegalArgumentException("nameBedroom is empty");
		if (!_restingPlace.containsKey(roomName))
			throw new Bedroom.NotFound("bedroom " + roomName + " not found");
		
		_restingPlace.remove(roomName);
	}
	
	@Override
	public <T extends Room> void closeDoor(T room) {
		_restingPlace.put(room.getName(), room);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Room> T localize(String roomName) {
		if (isNull(roomName))
			throw new NullPointerException("nameBedroom is null");
		if (roomName.isEmpty())
			throw new IllegalArgumentException("nameBedroom is empty");
		if (!_restingPlace.containsKey(roomName))
			throw new Bedroom.NotFound("bedroom " + roomName + " not found");
		
		return (T) _restingPlace.get(roomName);
	}

}
