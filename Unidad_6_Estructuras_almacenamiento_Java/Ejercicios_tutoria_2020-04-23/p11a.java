
/**
 * Lee por teclado una cadena de caracteres con varias palabras separadas 
 * por UN espacio en blanco, y nos diga cuantas palabras tiene la cadena. 
 * No considera los espacios del principio y del final.
 */

import java.util.*;

public class p11a
{
    public static void main(  )
    {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int cuentaBlancos=0;
        
        // Pedimos y almacenamos la cadena de caracteres
        System.out.print( "Introduce cadena:  " );
        cadena = teclado.nextLine();
        
        // Eliminamos los espacios del principio y del final
        cadena = cadena.trim();
        
        // Contamos los espacios en blanco
        for( int i=0 ; i<cadena.length() ; i++ )
            if( cadena.charAt(i)==' ' )
                        cuentaBlancos++;
                
        // Mostramos el número de palabras
        // Cuenta bloques de caracteres, un nº de tfno lo tomaría como una
        System.out.println( "La cadena tiene " + (cuentaBlancos+1) + " palabras" );
    }
}
