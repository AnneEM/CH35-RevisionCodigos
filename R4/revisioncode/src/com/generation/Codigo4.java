package com.generation;
import java.util.Scanner;

public class Codigo4 {
	
	public static void main(String[] args) { //Agregar el void main
		Scanner s = new Scanner(System.in); //Agregar el system in
		    
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine(); //j1 es jugador uno
		    
		    System.out.print("Turno del jugador 2  (introduzca piedra, papel o tijeras): ");
		    Scanner s2 = new Scanner(System.in);//Otro system in
		    String j2 = s2.nextLine(); //j2 de jugador dos
		    
		    if (j1.equals(j2)) { //Agregar equals
	            System.out.println("Empate");
	        } else {
	            int g = 2;
	            switch(j1) {
	                case "piedra":
	                    if (j2.equals("tijeras")) {
	                        g = 1;
	                    }
	                    break; //Agregar los breaks para cada switch

	                case "papel":
	                    if (j2.equals("piedra")) { //Agregar equals
	                        g = 1;
	                    }
	                    break; //Agregar los breaks para cada switch
	          
	                case "tijera":
	                    if (j2.equals("papel")) {
	                        g = 1;
	                    }
	                    break; //Agregar los breaks para cada switch

	                default:
	            }
	            System.out.println("Gana el jugador " + g);
	        }
		      s.close(); //Cierre de los scanners
		      s2.close();  //Cierre de los scanners
	
	
}
}
