package pr22;
import java.util.*;
import java.sql.Date;
public class Calendario {
	public static boolean esLaborable(Calendar c) {  
		if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			return false;
		}
		return true;
	}
	public static Calendar siguienteLaborable(Calendar c) {
		Calendar aux=(Calendar) c.clone();
		aux.add(Calendar.DAY_OF_WEEK, 1);//sumamos un día a aux
		while(!esLaborable(aux)) {
			aux.add(Calendar.DAY_OF_WEEK, 1);
		}
		return aux;
	}
	public static Date calendarToDate(Calendar c) {
		//getTime() convierte a java.util.Date ¿Es otra opción correcta?
		Date date=new Date(c.getTimeInMillis());
		return date;
	}
	public static Calendar dateToCalendar(Date date) {
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		return c;
	}	
}
/*
 * Recuerda que, si deseas mostrar por pantalla los Calendars de este ejercicio, puedes utilizar la
clase SimpleDateFormat con el patrón que quieras (acuérdate de consultar el JavaDoc de
SimpleDateFormat para ver cómo se construyen los patrones). 
*/
