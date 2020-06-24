import java.util.*;     // permite E/S de datos

public class problema20
{
   public static void main ( )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        long numeroSecreto, numeroDado, intentos=0;
        
        numeroSecreto = (long) (Math.random()*2000);
                
        System.out.println ( "el número secreto es  :  "+ numeroSecreto ); // esto no se debe poner
        
        do {
                System.out.print ( "que número crees que es :" );
                numeroDado = teclado.nextInt();   
                intentos ++;
                
                 if (numeroDado > numeroSecreto )
                        System.out.println ( "te has pasado " );
                 else
                         if (numeroDado < numeroSecreto )
                                System.out.println ( "te has quedado corto " );
                         else 
                                System.out.println ( "Enhorabuena. has acertado en  " + intentos + " intentos" );
        
        } while  (numeroDado != numeroSecreto );
        
   }
}