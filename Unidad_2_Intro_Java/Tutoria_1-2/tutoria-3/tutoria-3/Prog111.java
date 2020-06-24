
/**
 * Dado un número entero y positivo por teclado, muestra si es primo o no.
 */

import java.util.*;     // permite E/S de datos

public class Prog111
{
   public static void main ( )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        int dato, divisor=2;
        boolean esPrimo=true;
        
        // Pedimos, comprobamos y guardamos el dato
        do
        {
            System.out.print ( "Introduce número entero y positivo: " );
            dato = teclado.nextInt();
        } while ( dato <= 0 );
        
        // El mayor divisor de un número es, como mucho, la mitad de dicho número
        // La división es entera, luego se aplica lo mismo en los impares
        while ( divisor <= (dato/2+1) && esPrimo == true )
        {
            if ( dato % divisor == 0 )
                esPrimo = false;
            divisor++;
        }
        
        // Mostramos el resultado por pantalla
        if ( esPrimo )       // (....== true )
            System.out.println ( dato + " es primo." );
        else
            System.out.println ( dato + " NO es primo.");
   }
}