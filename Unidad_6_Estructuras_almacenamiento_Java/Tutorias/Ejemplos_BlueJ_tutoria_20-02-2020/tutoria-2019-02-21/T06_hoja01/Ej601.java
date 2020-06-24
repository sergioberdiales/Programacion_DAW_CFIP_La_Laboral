
/**
 * Lea por teclado los componentes numéricos enteros de un vector de 10 elementos, 
 * calcula y muestra por pantalla la media de los elementos que se encuentran en las 
 * posiciones pares y la media de los elementos que se encuentran en las posiciones 
 * impares. Se considera el índice cero como posición par.
 */

import java.util.*;                   // Permite uso de librerías java

public class Ej601
{
    public static final int DIM=8;  // Tamaño del vector. Aquí daría lo mismo declararla como local
                                      // aunque piden 10, en las pruebas se puede poner un 4 p.ej.
                                    
    public static void main ( )
    {
        // Declaración de variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada de datos por teclado
        int[] datos = new int[DIM];                    // Vector para guardar datos
        int acumPar=0, acumImpar=0, numpares=0;        // Acumulan la suma de las posiciones pares e impares
        
        for ( int i=0 ; i< DIM ; i++ )              //recorre todos los elementos del vector
        {
            // Pedimos y almacenamos los datos
            System.out.print ( "Introduce elemento de índice " + i + ": ");
            datos[i] = teclado.nextInt();
            // Acumulamos los elementos de las posiciones pares por un lado y de las impares por otro
            if ( i%2 == 0 )
            {
                acumPar += datos[i];
                numpares++;
            }
            else
                acumImpar += datos[i];
        }
       System.out.println ();
        // Mostramos el resultado por pantalla. ¡¡¡OJO!!! El tamaño del vector tiene que ser par
        System.out.print ( "El vector de datos es: " );
        for ( int i: datos)
            System.out.print ( i + "  " );
            
        System.out.println ();
        System.out.println ();
        System.out.println ( "La media de los números en las posiciones pares es " + (float)acumPar/(numpares));
        System.out.println ( "La media de los números en las posiciones impares es " + (float)acumImpar/(DIM-numpares));
    }
}
