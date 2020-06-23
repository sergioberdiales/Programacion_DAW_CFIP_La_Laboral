
/**
 * Escribe los números perfectos existentes entre dos números positivos pedidos por teclado
 * NUM. PERFECTO: La suma de sus divisores, excepto él mismo, dan el propio número
 */

import java.util.*;     // Incluye funciones en librerías

public class p27
{
    public static void main (  )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
        int trasvase, numMenor, numMayor;
        
        // Pedimos, comprobamos y almacenamos los datos
        do
        {
            System.out.print ( "Introduce primer número (>0): " );
            numMenor = teclado.nextInt();
        } while ( numMenor <= 0 );
        
        do
        {
            System.out.print ( "Introduce segundo número (>0) distinto del anterior: " );
            numMayor = teclado.nextInt();
        } while ( numMayor <= 0 || numMayor == numMenor );
        
        // Si no lo están, los ordenamos
        if ( numMenor > numMayor )
        {
            trasvase = numMayor;
            numMayor = numMenor;
            numMenor = trasvase;
        }
        
        // Imprimimos los números perfectos
        System.out.println ( "Los números perfectos entre " + numMenor + " y " + numMayor + " son: " );

        for ( int i=numMenor+1 ; i<numMayor ; i++ )
            if ( esPerfecto(i) )
                System.out.print ( i + "       " );
        System.out.println (); // salto de línea
   
   }// fin del main
    
   
   // versión reutilizable
   static boolean esDivisor ( int num1, int num2 )
    {
        if ( num1 % num2 == 0 || num2 % num1 == 0 )
           return true;
        else
            return false;
    }
   
   
    // Comprueba si un número es perfecto
    static boolean esPerfecto ( int numero )
    {
        int sumaDivisores=1;   // Inicializado en 1 porque siempre es divisor
        
        for ( int i=2 ; i<numero/2+1 ; i++)
            if ( esDivisor(numero,i) )
                sumaDivisores += i;
        
        if ( sumaDivisores == numero && numero !=1)
            return true;
        else
            return false;
    }
}