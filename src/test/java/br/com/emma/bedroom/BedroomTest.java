package br.com.emma.bedroom;

import org.junit.Test;

import br.com.emma.bedroom.Bedroom;
import br.com.emma.helper.Helper;

public class BedroomTest {

	@Test(expected = IllegalArgumentException.class)
	public void testNameEmpty() {
		new Bedroom("");
	}
	
	@Test(expected = NullPointerException.class)
	public void testNameNull() {
		String nameBedroom = null;
		new Bedroom(nameBedroom);
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddObjectNull() {
		Bedroom bedroom = new Bedroom("Teste");
		String obj = null;
		bedroom.openDoor().includeGuest("Teste", obj);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNameObjectNull(){
		Bedroom bedroom = new Bedroom("Teste");
		bedroom.openDoor().includeGuest(null, "Teste");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNameObjectEmpty(){
		Bedroom bedroom = new Bedroom("Teste");
		bedroom.openDoor().includeGuest("", "Teste");
	}
	
	@Test(expected = NullPointerException.class)
	public void testVisitNull(){
		Bedroom bedroom = new Bedroom("Teste");
		Helper helper = bedroom.openDoor();
		helper.includeGuest("Teste", "Teste");
		helper.fetch(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testVisitEmpty(){
		Bedroom bedroom = new Bedroom("Teste");
		Helper helper = bedroom.openDoor();
		helper.includeGuest("Teste", "Teste");
		helper.fetch("");
	}
}
