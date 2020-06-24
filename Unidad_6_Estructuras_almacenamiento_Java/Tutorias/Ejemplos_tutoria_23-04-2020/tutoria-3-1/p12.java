/**
 * Lee por teclado una cadena de caracteres. Introducir posteriormente un caracter a sustituir.
 * proceder a la sustitución del caracter anterior por guiones en la cadena pedida
 */


import java.util.*;

public class p12
{
    public static void main(  )
    {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        
        // Pedimos y almacenamos la cadena de caracteres
        System.out.print( "Introduce cadena:  " );
        cadena = teclado.nextLine();
        
        // Eliminamos los espacios del principio y del final
        cadena = cadena.trim();
        
         System.out.print( "\n Introduce caracter a sustituir :  " );
         char caracter = teclado.nextLine().charAt(0);
         
         cadena = cadena.replace(caracter, '-');
         
         System.out.println( " la cadena resultante es : " + cadena);
         
        
    }
}