//Ania Itziar Morales Eslava
package re5;
import java.util.Scanner;//Empezar con la importación del escaner
public class Codigo5 {
	public static void main (String[] args) {//Agregar método main

	
	  Scanner s = new Scanner(System.in); //Agregar el system in
	    System.out.println("Introduzca un número: "); //Cambio de comillas
	    
	    int ni = s.nextInt(); //Debe ser un dato int, porque es nu,ero y por lo tanto el scanner también deberecibir numeros
	    // int c = ni; Podemos precindir deestey mantenerlo en ni
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		 // ni /= 10; No hace nada
	    } //Cierra el else
	      
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado."); //"print
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado."); //Sustituir "c" por ni, porque si se declaran iguales esindiferente traer a c o a ni. 
	    } //Cierra el else
	    
	    break; //Como no lo definimos previamente, debemos agregar un brak para detenerlo.
	  } //Cierra while
	    
	    s.close(); //Cierromi scanner
	}//Metodo
}//Clase
	