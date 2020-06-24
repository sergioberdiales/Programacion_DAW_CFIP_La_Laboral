import java.util.*;     // permite E/S de datos

public class problema7
{
   public static void main ( String[] args )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        int numeroIntroducido, mayores, menores;
        int iguales=0;
        
         mayores = menores =0 ;
        
        System.out.print ( "Introduce número :  (cero para finalizar)" );
        numeroIntroducido = teclado.nextInt();
        
        while  (numeroIntroducido != 0 )
        {
            if (numeroIntroducido > 50 )
            {
                mayores ++;
            }
            else
                if  (numeroIntroducido == 50 )
                    iguales = iguales + 1 ;// iguales ++;
                else
                    menores ++;
                    
             System.out.print ( "Introduce número : " );
             numeroIntroducido = teclado.nextInt();        
        }  
        
        System.out.println ( "los números mayores de 50 fueron : "+ mayores );
        System.out.println ( "los números menores de 50 fueron : "+ menores );
        System.out.println ( "los números iguales a 50 fueron : "+ iguales );
   }
}