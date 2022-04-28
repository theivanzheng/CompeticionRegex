package competition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		String vehiculo = "EC-WZZ";
		
		String general = ("^EC.[A-W][A-Z][A-Z]$");
		String artesanal = ("^EC.[X-Z][A-Z][A-Z]$");
		String ULTRALIGEROS = ("^EC.[A-Z][A-Z][0-9]$");
		String PYE = ("^EC.[0-9][0-9][1-9]$");

		Pattern p = Pattern.compile(general);
		Matcher m = p.matcher(vehiculo);
		
		if(vehiculo.matches(general)) {
			System.out.println("Es de aviacion general");
		}else if(vehiculo.matches(artesanal)) {
			System.out.println("Es de construccion artesanal");
		}else if (vehiculo.matches(ULTRALIGEROS)) {
			System.out.println("Es un ultraligero");
		}else if (vehiculo.matches(PYE)) {
			System.out.println("Es de pruebas y entregas");
		}else {
			System.err.println("No corresponde a ninguna clase");
		}
	}
}
