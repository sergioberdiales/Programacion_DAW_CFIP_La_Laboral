 import java.util.*;     // permite E/S de datos

public class Problema2
{
   public static void main ( String[] args )
   {
        // Inicializamos variables
        /* pongo
        */
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
         int numeroIntroducido;   // declaración de la variable
        
        System.out.print ( "Introduce número : ") ;
        numeroIntroducido = teclado.nextByte();
        
        if(numeroIntroducido> 0)
            System.out.println ( "el  número es positivo "); // esta linea es para escribir
        else
            if (numeroIntroducido < 0 )
                System.out.println ( "el número es negativo " );
            else
                System.out.println ( "el número es nulo " );
   }
}