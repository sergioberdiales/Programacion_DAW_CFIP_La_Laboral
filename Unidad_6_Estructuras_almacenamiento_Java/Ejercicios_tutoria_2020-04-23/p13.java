
/**
 * Lee por teclado una cadena de caracteres que sea un NIF, y verifica si su formato es 
 * correcto o no. Si lo es, muestra por consola su parte numérica; si no lo es 
 * muestra el mensaje "NIF no válido". Se supone que los NIFs tienen 8 dígitos 
 * y, a continuación, una letra (no importa que sea mayúscula o minúscula).
 */

import java.util.*;

public class p13
{
     public static void main( )
    {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String nif;
        boolean valido = true;
        
        // Pedimos y almacenamos NIF
        System.out.println( "Introduce NIF (8 números y letra):" );
        nif = teclado.nextLine();
        
        // Comprobamos el nif       
        if( esCorrectoNif( nif ) )
            System.out.println( "DNI: " + nif.substring(0,nif.length()-1) );
        else
            System.out.println( "Nif no válido." );
    }
    
    public static boolean esCorrectoNif( String nif )
    {
        boolean respuesta=true;
        String dni;
        char letra;
        
        // Comprobamos la longitud
        if( nif.length()==9 )
        {
            // Obtenemos dni y letra a partir de nif
            dni = nif.substring(0,nif.length()-1);
            letra = nif.charAt( nif.length()-1 );
        
            // Comprobamos que el último carácter sea una letra
            if ( Character.isLetter(letra) )   
                // Comprobamos que el resto sea todo dígitos
                for ( int i=0 ; i<dni.length() ; i++ )
                {
                    if( !Character.isDigit(nif.charAt(i)) )
                    {
                        respuesta = false;
                        break;
                    }
                }
            else
                respuesta = false;
        }
        else
        {
            respuesta = false;
        }
        
        return respuesta;
    }
}
