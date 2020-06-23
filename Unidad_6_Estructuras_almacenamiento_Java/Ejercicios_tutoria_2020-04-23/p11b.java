
/**
 * Lee por teclado una cadena de caracteres con varias palabras separadas 
 * por UNO O VARIOS espacios en blanco, y nos diga cuantas palabras tiene 
 * la cadena. No considera los espacios del principio y del final.
 */
// "VOY  A     PONER      UNA       FRASE" 
import java.util.*;

public class p11b
{
    public static void main( )
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
        
        // Contamos los huecos entre palabras
        for( int i=0 ; i<cadena.length()-1 ; i++ )
            if( cadena.charAt(i)==' ' && cadena.charAt(i+1)!=' ')
                cuentaBlancos++;
                
        // Mostramos el número de palabras
        // Cuenta bloques de caracteres, un nº de tfno lo tomaría como una
        System.out.println( "La cadena tiene " + (cuentaBlancos+1) + " palabras" );
    }
}
