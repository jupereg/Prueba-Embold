package pr23;

public class Conversiones {
	public static String intToString(int i) {
		return String.valueOf(i);
	}
	public static int stringToInt(String s) {
		return Integer.parseInt(s);
	}
	public static Double stringToDouble(String s) {
		return Double.parseDouble(s);
	}
	public static char stringToChar(String s) {
		return s.charAt(0);
	}
	public static String charToString(char c) {
		return Character.toString(c);
	}
}
