
/**
 * Calcula el factorial de un número entero y positivo introducido por teclado, limitado a 25
 */

import java.util.*;     // permite E/S de datos

public class Prog109
{
   public static void main ( String[] args )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        byte dato, i;
        long factorial=1;
        
        // Solicitamos, comprobamos y almacenamos el dato de partida
        do
        {
            System.out.print ( "Introduce número positivo menor o igual que 25: " );
            dato = teclado.nextByte();
        } while ( dato<=0 || dato>25 );
        
        // Calculamos el factorial
        for ( i=2 ; i<=dato ; i++ )
        {
             factorial *= i;  // factorial = factorial * i
        }
        
        // Mostramos el resultado por pantalla
        System.out.println ( "El factorial de " + dato + " es " + factorial );
   }
}