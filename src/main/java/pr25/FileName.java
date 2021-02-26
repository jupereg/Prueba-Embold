package pr25;

public class FileName {
	private String nombre, extension, path, nombreCompleto;
	

	//Incluye el código necesario requerido

	@Override
	public String toString() {
		return getPath() + " - " + getNombre() + " - " + getExtension() + " - " + getNombreCompleto();
	}

	@Override
	public boolean equals(Object object) {
		boolean iguales = false;
		if (object != null && object instanceof FileName) {
			iguales = compara(((FileName) object).getPath(), this.getPath())
					&& compara(((FileName) object).getNombre(), this.getNombre())
					&& compara(((FileName) object).getExtension(), this.getExtension());
		}
		return iguales;
	}

	public static boolean compara(String a, String b) {
		boolean resultado = false;
		if ((a == null || b == null) && !(a == null && b == null))
			resultado = false;
		else if (a == null && b == null)
			resultado = true;
		else
			resultado = a.equalsIgnoreCase(b);
		return resultado;
	}
}
