
/**
 * Calcula y visualiza los divisores de un número entero y positivo introducido por teclado.
 */

import java.util.*;     // permite E/S de datos

public class Prog110
{
   public static void main ( String[] args )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        int dato;
        
        // Pedimos, comprobamos y guardamos el dato
        do
        {
            System.out.print ( "Introduce número entero y positivo: " );
            dato = teclado.nextInt();
        } while ( dato <= 0 );
        
        // El mayor divisor de un número es, como mucho, la mitad de dicho número
        // La división es entera, luego se aplica lo mismo en los impares
        for ( int i=1; i <= (dato/2) ; i++ )
        {
            if ( dato % i == 0 )
                System.out.println ( i + " es divisor de " + dato );
        }
        System.out.println ( " 16 Se acabó." );
   }
}