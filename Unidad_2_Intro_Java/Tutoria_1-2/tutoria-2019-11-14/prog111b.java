
/**
 
 */
import java.util.*; 
public class prog111b
{
    
    public static void main ( )
   {
        // Inicializamos variables
        int dato, divisor=2;
        boolean esPrimo=true;
        
        // Pedimos, comprobamos y guardamos el dato
        
        dato = fLectura();
               
        // El mayor divisor de un número es, como mucho, la mitad de dicho número
        // La división es entera, luego se aplica lo mismo en los impares
        while ( divisor <= (dato/2+1) && esPrimo == true )
        {
            if ( dato % divisor == 0 )
                esPrimo = false;
            divisor++;
        }
        
        // Mostramos el resultado por pantalla
        if ( esPrimo )       // (....== true )
            System.out.println ( dato + " es primo." );
        else
            System.out.println ( dato + " NO es primo.");
   }
    
   public static int fLectura ( )
    {
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        int numero;
        // Pedimos, comprobamos y guardamos el dato
        do
        {
            System.out.print ( "Introduce número entero y positivo: " );
            numero = teclado.nextInt();
        } while ( numero <= 0 );
        return numero;
    }     
}
