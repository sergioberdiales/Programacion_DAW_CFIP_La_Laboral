
import java.util.*;     // Incluye funciones en librerías

public class p23
{
    public static void main ( String[] args )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
         
        float base;
        int exponente;
        
        System.out.print ( "introduce un valor positivo para la base :   " );
        base =  teclado.nextFloat();
        
        System.out.print ( "introduce un valor positivo para el exponente :   " );
        exponente =  teclado.nextInt();
        
        System.out.print ( "el valor de la potencia es :   " + fPotencia(base, exponente));
          
    }
    
    static float fPotencia (float b , int exp)
    {
        float resultado;
        
        if (exp==0)
            resultado =1;
        else
        {
           // System.out.println("llamada a la funcion potencia con exp :"+ exp);
            resultado = b * fPotencia(b, exp-1);
           //   System.out.println("resultado parcial  :"+ resultado);
           //     System.out.println();
        }
        return resultado;
    
    }
    
    
    
}