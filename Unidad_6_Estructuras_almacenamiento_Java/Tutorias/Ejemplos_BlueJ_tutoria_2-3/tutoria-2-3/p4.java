
/**
 * Dado un número de DNI se obtiene la letra del NIF. 
 * Algoritmo: Tomamos el número en cuestión y lo dividimos por 23. Al cociente entero obtenido 
 * lo multiplicamos por 23 y se lo restamos al número del DNI (es lo mismo que coger el resto). 
 * El resultado, un valor comprendido entre 0 y 22, se busca en la tabla y obtenemos la letra del NIF.
 * 
 */

import java.util.*;                   // Permite uso de librerías java

public class p4
{                                    
    public static void main ( String[] args )
    {
        // Declaración de variables
        Scanner teclado = new Scanner ( System.in );    // Permite entrada de datos por teclado
        char[] letrasNIF = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int DNI;
        char letra;
        
        // Pedimos el DNI por teclado
        System.out.print ( "Introduce DNI: " );
        DNI = teclado.nextInt();
        
        // Calculamos el NIF
        letra = letrasNIF [ DNI%23 ];
        System.out.println ( "El NIF es: " + DNI + letra );
    }
}
