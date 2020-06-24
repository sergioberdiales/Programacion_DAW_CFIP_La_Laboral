
/**
 * Lee por teclado una cadena de caracteres compuesta de letras y dígitos, y 
 * calcula la media de los números, considerados individualmente.
 */

import java.util.*;

public class p15

{
    public static void main( )
    {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int cuentaDigitos = 0; // contador
        int sumaDigitos = 0;	//acumulador
        
         // Pedimos y almacenamos la cadena de caracteres
        System.out.print( "Introduce cadena:  " );
        cadena = teclado.nextLine();
        
        // Comprobamos los dígitos que hay, los sumamos y los contabilizamos
        for ( int i=0 ; i<cadena.length() ; i++ )
        {
            Character c = new Character( cadena.charAt(i) );
                       
            if ( Character.isDigit( c ) )
            {
                sumaDigitos += Character.digit( c, 10 ); // convertimos a digito y acumulamos
                cuentaDigitos++;						// contamos
            }
        }
        
        // Mostramos la media
        if( cuentaDigitos != 0 )
            System.out.println( "La media es " + ((float)sumaDigitos/cuentaDigitos) );
        else
            System.out.println( "No se pudo calcular la media." );
    }
}
