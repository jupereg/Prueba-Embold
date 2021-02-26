import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pr24.Empleado;
import pr24.LeeFichero;

public class TestPr24 {
	private static final double DELTA = 1e-15;

	@Test
	public void testSalarioMedio() {
		double salarioMedio = LeeFichero.salarioMedio();
		assertEquals("El salario medio de los empleados debe ser: \"1560\" ", salarioMedio, 1560.0, DELTA);
	}

	@Test
	public void testCreaEmpleados() {
		List<Empleado> resultadoEsperado= new ArrayList<Empleado>();
		resultadoEsperado.add(new Empleado("Alberto", "Garcia Romero"));
		resultadoEsperado.add(new Empleado("Jose", "Marti Ramos"));
		resultadoEsperado.add(new Empleado("Jose Antonio", "Antolin de Juan"));
		resultadoEsperado.add(new Empleado("Maria Antonia", "Alfonsin Garcia"));
		List<Empleado> resultado=LeeFichero.creaEmpleados("Zaragoza");
		assertTrue(resultado.size() == resultadoEsperado.size() &&	
		resultado.containsAll(resultadoEsperado) && resultadoEsperado.containsAll(resultado));
	}
}
