package br.com.emma.place;

import org.junit.Test;

import br.com.emma.bedroom.Bedroom;
import br.com.emma.place.RestingPlace;
import br.com.emma.placeImpl.HashtablePlace;

public class HashtablePlaceTest {

	@Test(expected = IllegalArgumentException.class)
	public void testCreateBedroomNameEmpty() {
		RestingPlace place = new HashtablePlace();
		place.createRoom("");
	}
	
	@Test(expected = NullPointerException.class)
	public void testCreateBedroomNameNull() {
		RestingPlace place = new HashtablePlace();
		place.createRoom(null);
	}
	
	@Test
	public void testCreateBedroomSuccess(){
		RestingPlace place = new HashtablePlace();
		place.createRoom("Teste");
	}
	
	@Test(expected = NullPointerException.class)
	public void testVisitNull(){
		RestingPlace place = new HashtablePlace();
		Bedroom str = new Bedroom("Teste");
		place.closeDoor(str);
		place.localize(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVisitEmpty(){
		RestingPlace place = new HashtablePlace();
		Bedroom str = new Bedroom("Teste");
		place.closeDoor(str);
		place.localize("");
	}
	
	@Test(expected = Bedroom.NotFound.class)
	public void testVisitBedroomNotFound(){
		RestingPlace place = new HashtablePlace();
		place.localize("NotFound");
	}
	
	@Test
	public void testVisitSuccess(){
		RestingPlace place = new HashtablePlace();
		Bedroom str = new Bedroom("Teste");
		place.closeDoor(str);
		place.localize("Teste");
	}
	
	@Test(expected = NullPointerException.class)
	public void testDestroyNull(){
		RestingPlace place = new HashtablePlace();
		place.destroyRoom(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDestroyEmpty(){
		RestingPlace place = new HashtablePlace();
		place.destroyRoom("");
	}
	
	@Test(expected = Bedroom.NotFound.class)
	public void testDestroyBedroomNotFound(){
		RestingPlace place = new HashtablePlace();
		place.destroyRoom("NotFound");
	}
	
	@Test
	public void testDestroySuccess(){
		RestingPlace place = new HashtablePlace();
		Bedroom str = new Bedroom("Teste");
		place.closeDoor(str);
		place.destroyRoom("Teste");
	}
	
}
