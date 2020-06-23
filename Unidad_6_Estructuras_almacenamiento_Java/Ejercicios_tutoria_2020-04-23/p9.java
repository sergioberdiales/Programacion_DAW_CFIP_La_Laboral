
/**
 * Lee por teclado una cadena de caracteres y muestra por pantalla:
 *   - Su longitud
 *   - Carácter asociado al índice 7
 *   - El índice que ocupa el primer carácter que sea una 'x'
 *   - La String transformada en mayúsculas
 *   - Comprobar si el primer carácter es 'E' y mostrar por consola un mensaje
 *   que lo indique
 * 
 */

import java.util.*;

public class p9
{
    public static void main( )
    {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        System.out.print( "Introduce cadena de caracteres:  " );
        cadena = teclado.nextLine();
        
        // Muestra la longitud de la cadena
        System.out.println( "Longitud: " + cadena.length() );
        
        // Muestra el carácter asociado al índice 7
       if( cadena.length() > 7 )
            System.out.println( "Carácter asociado al índice 7: " 
                                + cadena.charAt(7) );
        else
            System.out.println( "La cadena es demasiado corta." );
       /*
       try
       {
        System.out.println( "Carácter asociado al índice 7: " 
                                + cadena.charAt(7) );
       } 
       
       catch (Exception e1)
       {
           System.out.println( "Cadena de caracteres demasiado corta");
        }
        
        finally {
            System.out.println( "sigo con el programa");
        }
       */
        // Muestra el índice de la primera posición en que lea una 'x'
        // Si no lo encuentra, devuelve -1
        if( cadena.indexOf("x") == -1 )
            System.out.println( "No se ha encontrado ninguna x" );
        else
            System.out.println( "Se ha encontrado una x en el índice: " 
                                + cadena.indexOf("x") );
                                
        // Muestra la cadena transformada en mayúsculas
        System.out.println( "En mayúsculas: " + cadena.toUpperCase() );
        
        // Muestra si el primer carácter es 'E'
        if( cadena.startsWith("E") )
            System.out.println( "La cadena empieza por E" );
        else
            System.out.println( "La cadena NO empieza por E" );
        
    }
}
