
/**
 * Lee por teclado los componentes numéricos enteros de un vector de 15 elementos, y 
 * calcula y muestra por pantalla el mayor, cuántas veces se repite y, en caso de repetirse, 
 * la primera posición en que se encuentra.
 */

import java.util.*;                   // Permite uso de librerías java

public class Ej602
{
    public static final int NUMERODEELEMENTOS=28;   // Tamaño del vector
                                    
    public static void main ( )
    {
        // Declaración de variables
        Scanner teclado = new Scanner ( System.in );    // Permite entrada de datos por teclado
        int[] datos = new int[NUMERODEELEMENTOS];                     // Vector para guardar datos
        int mayor;      // Guarda el valor mayor
        int indice;     // Primera posición del valor buscado
        int nRepite;    // Número de veces que se repite
        
        // Pedimos y almacenamos los datos
        for ( int i=0 ; i<datos.length ; i++ )
        {
            System.out.print ( "Introduce elemento de índice " + i + ": ");
            datos[i] = teclado.nextInt();
        }
        
        // Tratamos el primer dato aparte, para tener una referencia
        mayor = datos[0];
        indice = 0;
        nRepite = 1;
        
        // Ahora tratamos el resto
        for ( int i=1 ; i<datos.length ; i++ )    // recorremos el resto de los elementos del vector
        {
            if ( datos[i] > mayor ) // Si es mayor, actualizamos todo
            {
                mayor = datos[i];
                indice = i;
                nRepite = 1;
            }
            else
            {
                if ( datos[i] == mayor ) // Si es igual, contamos uno más
                        nRepite++;
            // Si es menor no hacemos nada
            }
        }
        
        // Mostramos el resultado por pantalla
        System.out.print ( "El vector de datos es: " );
        for ( int i=0 ; i<datos.length ; i++ )
            System.out.print ( datos[i] + " " );
        
        System.out.println (); System.out.println (); System.out.println ();
        
        System.out.println ( "El mayor es " + mayor + 
                             ", se ha repetido " + nRepite + 
                             " veces y aparece por primera vez en la posición " + (indice+1) );
    }
}
