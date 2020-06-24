
/**
 * Lee una cadena de caracteres pedida por teclado e indica cuántas vocales 
 * tiene. Utilizar una función que diga si un caracter es vocal o no.
 */

import java.util.*;

public class p14
{
    public static void main( )
    {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int cVocales = 0;
        
        System.out.println( "Introduce cadena de caracteres:  " );
        cadena = teclado.nextLine();
        
        for ( int i=0 ; i<cadena.length() ; i++ )// recorre toda la cadena
            if( esVocal(cadena.charAt(i)) )// estudia cada carater
                    cVocales++;             //incremento contador de vocales
        
        System.out.println();
        if( cVocales == 0 )       
            System.out.println( "No se encontraron vocales" );
        else if( cVocales == 1 )  
            System.out.println( "Se encontró " + cVocales + " vocal" );
        else
            System.out.println( "Se encontraron " + cVocales + " vocales" );
    }
    

    public static boolean esVocal( char letra )
    {
        boolean es_vocal=false;
        String vocales = "aAeEiIoOuUáÁéÉíÍóÓúÚüÜ";
        
        if( vocales.indexOf(letra)!=-1)
        {
                es_vocal = true;
        }   
        return es_vocal;
    }


    public static boolean esVocal2( char letra )
    {
        boolean es_vocal=false;
        char[] vocales = {'a','A','e','E','i','I','o','O','u','U','á','Á','é','É','í','Í','ó','Ó','ú','Ú', 'ü','Ü' };
        
        for( int i=0; i<vocales.length ; i++)
            if( letra == vocales[i] )
            {
                es_vocal = true;
                break; // Si no lo usamos debemos añadir && es_vocal==false
            }   
        return es_vocal;
    }


}
