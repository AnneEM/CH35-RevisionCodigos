package re6;
import java.util.Scanner; //Importar el scanner

public class Codigo6 {
	public static void main (String[] args) {
		
	int[] n = new int[20]; //New a int
    for (int i = 0; i < 20; i++) {//++ Para indicar como será la iteracion {
      n[i] = (int)(Math.random() * 381) + 20;
      
      
	System.out.println(n[i] + " "); //Agregamos el .out
    } //Cierra el ciclo for 
    
    System.out.println("\n¿Qué números quiere resaltar?  ");
    System.out.println("(1 – los múltiplos de 5,");
    System.out.println( "2 – los múltiplos de 7): "); //Separar en otro sys out
    
    //Abrimos el scanner que permite interactuar
    Scanner scanner = new Scanner(System.in);
    int opcion = scanner.nextInt();//Se emplea int porque se trata de numeros enteros
    
    int multiplo = (opcion == 1) ? 5 : 7;
    
    // Integer.parseInt(System.console().readLine(); Sobra

    for (int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.println(e + " "); //out yno in
        break; //break
      }
    }
  
    scanner.close(); //Cierre scanner
}
	
}//Cierre clase