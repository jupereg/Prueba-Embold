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
		int contLineas=0;
		float salario;
		float suma=0;
		int i=0;
		boolean camposVacios;
		 try {
			 BufferedReader f=new BufferedReader(new FileReader("src/main/java/pr24/datos.txt"));
			 //DataInputStream f = new DataInputStream(
			 //new FileInputStream(<nombre-fichero>));
			 String l = f.readLine();
			 String[] parts=l.split("\\|");
			 while (l != null) {
			 // Procesar la línea
				 camposVacios=false;
				 contLineas++;
				 if(parts.length==5) {
					 while(i<5 && !camposVacios) {
						 if(parts[i].isEmpty())
							 camposVacios=true;
						 i++;
					 }
					 if(i==4) {
					 salario=Float.parseFloat(parts[3]);
					 suma=suma+salario;
					 }
				  }	 
				 l = f.readLine();
			 	}
			 f.close();
			 } 
		 catch (IOException ex) {
			 ex.printStackTrace();
		 }
		 catch(NumberFormatException e) {
			 e.printStackTrace();
		 }
		 	
		 return suma/contLineas;
	}
	
	
	public static List<Empleado> creaEmpleados(String ciudad){
		List<Empleado> list=new ArrayList<Empleado>();
		int i=0;
		boolean camposVacios;
		try {
			 BufferedReader f=new BufferedReader(new FileReader("src/main/java/pr24/datos.txt"));
			 //DataInputStream f = new DataInputStream(
			 //new FileInputStream("src/main/java/pr24/datos.txt"));
			 String l = f.readLine();
			 String[] parts=l.split("\\|");
			 while (l != null) {
				 // Procesar la línea
				 camposVacios=false;
				 if(parts.length==5) {
					 while(i<5 && !camposVacios) {
						 if(parts[i].isEmpty())
							 camposVacios=true;
						 i++;
					 }
					 if(i==4 && ciudad=="Zaragoza") {
					 list.add(new Empleado(parts[0],parts[1]));
					 }
				  }	
				 l = f.readLine();
			 }
			 f.close();
			 } catch (IOException ex) {
			 ex.printStackTrace();
			 }
		return list;
	}
}
