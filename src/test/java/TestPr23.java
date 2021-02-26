import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.text.SimpleDateFormat;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import pr22.Calendario;
import pr23.Conversiones;

public class TestPr23 {

	
	@Test
	public void testIntToString() {
		int i=4;
		assertEquals(Conversiones.intToString(i),"4");
	}
	
	@Test
	public void testStringToInt1() {
		String s="4";
		assertEquals(Conversiones.stringToInt(s),4);
	}

	@Test(expected = NumberFormatException.class)
	public void testStringToInt2() {
		String s="Hola";
		assertEquals(Conversiones.stringToInt(s),4);
	}
	
	
	@Test
	public void testStringToDouble() {
		String s="5";
		assertEquals(Conversiones.stringToDouble(s),new Double(5));
	}
	
	@Test
	public void testStringToDouble2() {
		String s=" 5 ";
		assertEquals(Conversiones.stringToDouble(s),new Double(5));
	}
	
	@Test
	public void testStringToChar() {
		String s="Hola";
		assertEquals(Conversiones.stringToChar(s),'H');
	}
	
	@Test
	public void testCharToString() {
		char c='H';
		assertEquals(Conversiones.charToString(c),"H");
	}
}
