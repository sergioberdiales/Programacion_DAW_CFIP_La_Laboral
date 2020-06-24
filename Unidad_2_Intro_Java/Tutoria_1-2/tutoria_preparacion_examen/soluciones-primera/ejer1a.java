/**
 Sea la serie matemática siguiente: El primer elemento es el 1. Los sucesivos elementos se obtienen de la siguiente forma: multiplicando el anterior por 2 y 
 sumando  1 a este producto obtenido: 1  ,  3  ,  7  ,  15  ,  31  ,  63  ………….
 Hacer un programa en lenguaje Java  que pida, a través de una función de lectura,  por teclado un número comprendido obligatoriamente mayor que 0 y menor de 500
 (debe ser comprobado y rechazado en el caso de no cumplir), y que contenga una función llamada “calcular_termino”, a la que se le envié el número leído anteriormente por teclado
 y nos calcule y devuelva el término de la serie descrita arriba que corresponde con el número de orden del enviado por parámetros. 
 Por ejemplo, si el número leído por teclado fuera el 5, la función deberá devolver 31, que es el quinto número de la serie. 
 */
import java.util.*;
public class ejer1a
{

   public static int lectura_dato()
   {
        Scanner teclado=new Scanner(System.in);       
        int dato;
        do{
            System.out.println("dame un numero para calcular el término");
            dato= teclado.nextInt();
        }while(dato<0 || dato > 500);

        return dato;
   }  // fin de la función lectura datos

   public static double calcularTermino (int numero)
   {
        double anterior=1.0;
        double actual=1.0;
        
        for (int i=1 ;i< numero; i++)
        {
            actual=2*anterior+1;  // actual = actual *2 +1 ;
            anterior=actual;            
        }
        
        return actual;
        
   }  // fin de la función calcular Término
       
   public static void main ()
   {
       int numeroPedido;
             
       numeroPedido=lectura_dato();
       
      System.out.println("el número pedido para el término "+ numeroPedido+" según la serie es :  "+ calcularTermino(numeroPedido));
       
   }

}// fin de la clase


