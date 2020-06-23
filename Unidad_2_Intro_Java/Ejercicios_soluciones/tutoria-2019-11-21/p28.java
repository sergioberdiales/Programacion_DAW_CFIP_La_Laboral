
import java.util.*;     // Incluye funciones en librerías

public class p28
{
    public static void main ( String[] args )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
         
        int filas;
        
        
        System.out.print ( "introduce un valor positivo para las filas :   " );
        filas =  teclado.nextInt();
        
        
        
        for (int f = 1; f <= filas ; f++ )
        {
            for (int c =1; c <= f ; c++)
            {
                   System.out.print ( c+" ");
            }
            
            System.out.println ();
        } 
    }
       
    
}