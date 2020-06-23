
/**
 * Muestra los números primos comprendidos entre 3 y un número definido por el usuario,
 * que debe ser menor que 3000
 */

import java.util.*;     // Incluye funciones en librerías

public class p25
{
    public static void main ( String[] args )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
        int numMax;
        
        // Pedimos, comprobamos y almacenamos el dato
        do
        {
            System.out.print ( "Introduce número mayor que 3 y menor que 3000: " );
            numMax = teclado.nextInt();
        } while ( numMax <= 3 || numMax >= 3000 );
        
        System.out.println ( "Los números primos menores que " + numMax + " son: " );
        System.out.print ( "1 2 3 " );  // Estos los ponemos directamente, ya sabemos que son primos
        // Realizamos el recorrido comprobando si son primos
        for ( int i=4 ; i < numMax ; i++ )    // for (int i=5 ; i < numMax ; i=i+2)
        {
            if ( esPrimo(i) )
                System.out.print ( i + " " );
        }
        System.out.print ( "\n" );  // Salto de línea
    }
    
    // Calcula si un número es primo (devuelve true) o no (devuelve false)
    static boolean esPrimo ( int numero )
    {
        // Declaramos variables
        boolean esNumPrimo=true;  // Comenzamos pensando que es primo
        // int recorre=2;    // Todos son divisibles por 1, así que obviamos ese número
        
        // Salimos del while si llegamos al tope (como mucho encontraremos divisores hasta
        // la mitad del número dado) o si encontramos un divisor (sabemos que no es primo)
        for (int i=2 ; i < numero/2 +1 && esNumPrimo==true; i++)
            if ( numero % i == 0 )
                esNumPrimo = false;
        
        /*
        while ( recorre < ( numero/2 + 1 ) && esNumPrimo == true )
        {
            if ( numero % recorre == 0 )
                esNumPrimo = false;
            recorre++;
        }
        */
        return esNumPrimo;
    }
}