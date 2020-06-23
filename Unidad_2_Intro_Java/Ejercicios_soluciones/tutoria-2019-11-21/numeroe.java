
/**
 * Calcula el número e por aproximación. El número de términos es pedido por teclado.
 */

import java.util.*;     // Permite E/S de datos

public class numeroe
{
    public static void main (  )
    {
        // Declaramos variables
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double e=1;
        int numTer, i;
        
        // Pedimos el número de términos por teclado
        do
        {
            System.out.print ( "Introduce número de términos (mayor que 10): " );
            numTer = teclado.nextInt();
        } while ( numTer <= 10 );
        
        // Calculamos la aproximación. El primer término se asignó a e en la declaración
        for ( i=1 ; i<=numTer ; i++ )
        {
            e += 1 / ffactorialr( i );
        }
        
        // Devolvemos el resultado por pantalla
        System.out.println ( "El valor de e por aproximación  es: " + e );
    }
 /*   
    // Se puede escribir antes de main, pero creo que así el programa queda más claro
    static double fcnFactorial ( int numero )
    {
        // Declaramos variables
        int i;
        double factorial=1;
        
        if ( numero < 0 )                          // el factorial de un número negativo no existe
            factorial = -1;
        else if ( numero == 0 || numero == 1 )     // por convenio factorial(0)=factorial(1)=1
            factorial = 1;
        else
            for ( i=2 ; i<=numero ; i++ )
                factorial *= i;
        
        return factorial;
    }
   */ 
     static double ffactorialr ( int numero )
    {
        // Declaramos variables
        double respuesta;
        
        if ( numero == 0 )
            respuesta = 1;
        else
            respuesta = numero * ffactorialr( numero - 1 );
        
        return respuesta;
    }
    
    
    
    
    
    
    
}