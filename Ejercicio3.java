package competition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
		String texto = "í";
		String patron = "^.*[á|é|í|ó|ú].*";
		
		Pattern p = Pattern.compile(texto);
		Matcher m = p.matcher(patron);
		
		if(texto.matches(patron)) {
			System.out.println("Tiene tilde");
		}
	}

}
