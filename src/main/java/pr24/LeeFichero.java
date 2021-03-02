package pr24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LeeFichero {
	public static float salarioMedio() {
		int contLineas = 0;// saber el número de líneas leidas
		float salario;// donde se almacenará el salario de cada empleado
		float suma = 0;// para ir sumando los salarios
		int i = 0;
		boolean camposVacios;
		try {
			BufferedReader f = new BufferedReader(new FileReader("src/main/java/pr24/datos.txt"));
			// DataInputStream f = new DataInputStream(
			// new FileInputStream(<nombre-fichero>));
			String l = f.readLine();
			while (l != null) {
				// Procesar la línea
				String[] parts = l.split("\\|");//Se tiene que hacer para cada líne
				camposVacios = false;
				i=0;
				if (parts.length == 5) {// tiene que tener 5 campos
					while (i < 5 && !camposVacios) {
						if (parts[i].trim().isEmpty())// con que haya una vacía ya no nos vale
							camposVacios = true;
						i++;
						
					}
					if (!camposVacios) {// los 5 campos están completos
						contLineas++;
						salario = Float.parseFloat(parts[3]);
						suma = suma + salario;
						
					}
					
				}
				l = f.readLine();//leer la siguiente línea
			}
			f.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		return suma / contLineas;
	}

	public static List<Empleado> creaEmpleados(String ciudad) {
		List<Empleado> list = new ArrayList<Empleado>();
		int i = 0;
		boolean camposVacios;
		try {
			BufferedReader f = new BufferedReader(new FileReader("src/main/java/pr24/datos.txt"));
			// DataInputStream f = new DataInputStream(
			// new FileInputStream("src/main/java/pr24/datos.txt"));
			String l = f.readLine();
			while (l != null) {
				// Procesar la línea
				String[] parts = l.split("\\|");//Se tiene que hacer para cada línea
				camposVacios = false;
				if (parts.length == 5) {// tiene que tener 5 campos
					while (i < 5 && !camposVacios) {
						if (parts[i].trim().isEmpty())// con que haya una vacía ya no nos vale
							camposVacios = true;
						i++;
					}
					if (!camposVacios && parts[4].equalsIgnoreCase(ciudad)) {// los 5 campos están completos y la ciudad es la misma que la pasada por parámetro
						list.add(new Empleado(parts[0], parts[1]));//añade un nuevo empleado a list con el nombre y apellido de la línea
					}
				}
				l = f.readLine();//leer la siguiente línea
			}
			f.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return list;
	}

}
