
/**
 * Se introducen por teclado una serie de números enteros positivos mayores o iguales a cero,
 * finalizando cuando se lea el número 0. Se muestra por pantalla la cantidad de valores que 
 * son múltiplos de 2 y la cantidad de valores que son múltiplos de 3. Estas cantidades deben
 * estar ordenadas de mayor a menor.
 */

import java.util.*;   // permite E/S de datos

public class Prog105
{
   public static void main ( )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        int dato;             // Guarda el valor introducido por teclado 
        int multiplos2=0;     // Cuenta los múltiplos de 2
        int multiplos3=0;     // Cuenta los múltiplos de 3
        
        // Solicitamos el primer dato y lo comprobamos
        do
        {
            System.out.print ("Introduce número positivo (0 para terminar): ");
            dato = teclado.nextInt();
        } while ( dato < 0 );
        
        // Clasificamos los valores mientras no introduzcan un cero
        while ( dato != 0 )
        {
            if ( dato % 2 == 0 ) 
            {
                multiplos2++;
            }
            if ( dato % 3 == 0 )
                multiplos3++;
                
            // Nos preparamos para la siguiente iteración
            do
            {
                System.out.print ("Introduce número positivo (0 para terminar): ");
                dato = teclado.nextInt();
            } while ( dato < 0 );
        }// fin del while
        
        // Ordenamos los valores de salida y los sacamos por teclado
        if ( multiplos2 >= multiplos3 )
        {
            System.out.println ("Hubo " + multiplos2 + " múltiplos de 2");
            System.out.println ("Hubo " + multiplos3 + " múltiplos de 3");
        }
        else
        {
            System.out.println ("Hubo " + multiplos3 + " múltiplos de 3");
            System.out.println ("Hubo " + multiplos2 + " múltiplos de 2");   
        }
   }
}
