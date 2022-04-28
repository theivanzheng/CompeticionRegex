package competition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {
	public static void main(String[] args) {

		String ip = "192.168.1.1";

		Pattern p = Pattern.compile("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
		Matcher m = p.matcher(ip);

		boolean validarIp = m.matches();

		if (validarIp == true) {
			System.out.println("Es una IP");
		} else {
			System.out.println("No es una IP");
		}
	}
}
