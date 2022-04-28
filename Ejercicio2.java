package competition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

	public static void main(String[] args) {
		String codigo = "Null";
		
		ArrayList <String> paises = new ArrayList<String>();
			String eeuucan = ("^[00-13]{2,3}$");
				paises.add(eeuucan);
			String alemania = ("^[40-44]{2,3}$");
				paises.add(alemania);
			String Taiwan = ("^[20.29]{2,3}$");
				paises.add(Taiwan);
			String Francia = ("^[30-37]{2,3}$");
				paises.add(Francia);
			String demas = (".*");
				paises.add(demas);
		
		Pattern p = Pattern.compile(codigo);
		Matcher m= p.matcher(codigo);
		
		for (int i = 0; i < paises.size(); i++) {
			String aux= paises.get(i);
			
			switch (codigo.matches(aux)) {
			case value:
				
				break;

			default:
				break;
			}
		}
		
	}
}
