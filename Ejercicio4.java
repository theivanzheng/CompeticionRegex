package competition;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {
	public static void main(String[] args) {
		int contador;

		System.out.println("VALIDADOR DE PASSWORDS"
						 + "\n----------------------"
						 + "\n\nIntroduce una password");
		Scanner sc = new Scanner(System.in);
			String password= sc.nextLine();

		 String Reglas = "^(?=.*[0-9])" //Contener al menos un número (del 0-9)
	             + "(?=.*[a-z])(?=.*[A-Z])" //Contener al menos una mayuscula y una minuscula
	             + "(?=.*[@#$%^&+=])"//Contener alguno de estos caracteres especiales
	             + "(?=\\\\S+$).{8,30}$"; //Contener al menos 8 caracteres a 30

	        Pattern p = Pattern.compile(Reglas);

	        if (password == null) {
	            System.out.println("Esta vacio tio, esfuerzate mas que te hackean");
	        }

	        Matcher m = p.matcher(password);
	        boolean resultado = m.matches();

	        if(resultado == true) {
	        	System.out.println("Mejorala anda que te hackean la cuenta y le lloras a mama");
	        }else {
	        	System.out.println("Muy bien! Ahora apuntatela que no se te olvide la contaseña");
	        }


	}

	
}
