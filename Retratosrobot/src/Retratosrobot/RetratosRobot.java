package Retratosrobot;

import java.util.Scanner;

public class RetratosRobot {

	public static void main(final String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		 boolean continuar = true;
		
		//Bucle
		
		while (continuar) {	 	
		
		// Variables
	
		System.out.println("Vas a crear un retrato robot");
		final String pelo = elegirPelo(scanner);
		final String ojos = elegirOjos(scanner);
		final String orejasNariz = elegirOrejasNariz(scanner);
		final String boca = elegirBoca(scanner);
		final String barbilla = elegirBarbilla(scanner);
		
		//Retrato ya hecho
		
		System.out.println("\nEste es el retrato robot");
		System.out.println(pelo);
		System.out.println(ojos);
		System.out.println(orejasNariz);
		System.out.println(boca);
		System.out.println(barbilla);
		
		//Pregunta para continuar el bucle
		
		System.out.println("\n¿Deseas crear otro retrato robot? (si/no) ");
		final String respuesta = scanner.next();
		continuar = respuesta.equalsIgnoreCase("si");
		
		}
		
		scanner.close();
}	
		
		// Lógica para elegir cada parte del retrato
		
		public static String elegirPelo(final Scanner scanner) {
		System.out.println("Elige el tipo de pelo");
		System.out.println("1: WWWWWWWWW");
		System.out.println("2. \\\\//////");
	    System.out.println("3. \"|||||||\"");
	    System.out.println("4. |||||||||");
	    final int opción = scanner.nextInt();
	    switch (opción) {
	    	case 1: return "WWWWWWWWW";
	    	case 2: return "\\\\//////";
	    	case 3: return "\"|||||||\"";
	    	case 4: return "|||||||||";
	    	default:
        		System.out.println("La opción no está disponible, se elegirá la opción 1 por defecto");
        		return "WWWWWWWWW";
	    
	    }
}

	    //Métodos para elegir las distintas partes del retrato
		
	    public static String elegirOjos(final Scanner scanner) {
		System.out.println("Elige el tipo de ojos");
		System.out.println("1. |  o o  |");
        System.out.println("2. |-(· ·)-|");
        System.out.println("3. |-(o o)-|");
        System.out.println("4. |  \\ /  |");
        final int opción = scanner.nextInt();
        switch (opción) {
	    	case 1: return "|  o o  |";
	    	case 2: return "|-(· ·)-|";
	    	case 3: return "|-(o o)-|";
	    	case 4: return "|  \\ /  |";
	    	default:
        		System.out.println("La opción no está disponible, se elegirá la opción 1 por defecto");
        		return "|  o o  |";
        }
}
	    
	    public static String elegirOrejasNariz(final Scanner scanner) {
		System.out.println("Elige el tipo de orejas/nariz");
		System.out.println("1. @ J @");
        System.out.println("2. { \" }");
        System.out.println("3. [ j ]");
        System.out.println("4. < - >");
        final int opción = scanner.nextInt();
        switch (opción) {
        	case 1: return "@   J   @";
        	case 2: return "{   \"   }";
        	case 3: return "[   j   ]";
        	case 4: return "<   -   >";
        	default:
        		System.out.println("La opción no está disponible, se elegirá la opción 1 por defecto");
        		return "@   J   @";
        }
}
        
	    public static String elegirBoca(final Scanner scanner) {
		System.out.println("Elige el tipo de boca");
		System.out.println("1. | === |");
        System.out.println("2. |  -  |");
        System.out.println("3. | ___ |");
        System.out.println("4. | --- |");
        final int opción = scanner.nextInt();
        switch (opción) {
        	case 1: return "|  ===  |";
        	case 2: return "|   -   |";
        	case 3: return "|  ___  |";
        	case 4: return "|  ---  |";
        	default:
        		System.out.println("La opción no está disponible, se elegirá la opción 1 por defecto");
        		return "|  ===  |";
        }
}
        
        
        public static String elegirBarbilla(final Scanner scanner) {
		System.out.println("Elige el tipo de barbilla");
		System.out.println("1. \\_______/");
        System.out.println("2. \\,,,,,,,/");
        System.out.println("3. \\......./");
        System.out.println("4. \\mmmmmmm/");
        final int opción = scanner.nextInt();
        switch (opción) {
        	case 1: return "\\_______/";
        	case 2: return "\\,,,,,,,/";
        	case 3: return "\\......./";
        	case 4: return "\\mmmmmmm/";
        	default:
        		System.out.println("La opción no está disponible, se elegirá la opción 1 por defecto");
        		return "\\_______/";
        }
    }
}


        
      

