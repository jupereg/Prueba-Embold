import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import pr22.Calendario;

import java.text.SimpleDateFormat;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestPr22 {

	@Test
	//Test con una fecha laborable
	public void testEsLaborable1() {
		Calendar c = new GregorianCalendar(2021,1,25);
		assertTrue(Calendario.esLaborable(c));
	}	
	
	@Test
	//Test con una fecha NO laborable
	public void testEsLaborable2() {
		Calendar c = new GregorianCalendar(2021,1,27);
		assertTrue(!Calendario.esLaborable(c));
	}	
	
	@Test
	//Test con un sábado
	public void testSiguienteLaborable1() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = new GregorianCalendar(2021,1,20);
		Calendar cs = new GregorianCalendar(2021,1,22);
		assertEquals("El siguiente dia laborable al calendar: "+ sdf.format(c.getTime())+ ", es: "+sdf.format(Calendario.siguienteLaborable(c).getTime()), Calendario.siguienteLaborable(c),cs);
	}
	
	@Test
	//Test con un viernes
	public void testSiguienteLaborable2() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = new GregorianCalendar(2021,1,26);
		Calendar cs = new GregorianCalendar(2021,2,1);
		assertEquals("El siguiente dia laborable al calendar: "+ sdf.format(c.getTime())+ ", es: "+sdf.format(Calendario.siguienteLaborable(c).getTime()), Calendario.siguienteLaborable(c),cs);
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void testCalendarToDate() {
		Calendar c = new GregorianCalendar(2021,1,22);
		Date d = new Date(121,1,22);
		assertEquals(Calendario.calendarToDate(c),d);
	}
	
	@Test
	@SuppressWarnings("deprecation")
	public void testDateToCalendar() {
		Calendar c = new GregorianCalendar(2021,1,22);
		Date d = new Date(121,1,22);
		assertEquals(Calendario.dateToCalendar(d),c);
	}
	

}
