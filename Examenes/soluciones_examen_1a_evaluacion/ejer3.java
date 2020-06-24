/*
 * Realizar un programa en lenguaje Java que conste de una función llamada “primoAnterior”. 
 * Dicha función recibirá un parámetro que será un número entero. 
 * Esta deberá devolver el número primo que sea inmediatamente menor al número que se le ha enviado. 
 * En el caso de que el parámetro enviado fuera negativo , cero o uno, deberá devolver un 1.
 * Realizar también una pequeña función principal para comprobar que la función primoAnterior realizada trabaja correctamente.
 * Por ejemplo, en el caso de que se le enviase a la función el entero 35 deberá devolver el número primo que más se aproxime 
 * al número manteniéndose menor que él, que en este caso sería el 31.
 */

import java.util.*;
public class ejer3
{
    public static int fLecturaDato(int limiteinferior, int limitesuperior)
    {
        Scanner teclado=new Scanner(System.in);       
        int dato;
        do{
            System.out.println("dame un numero");
            dato= teclado.nextInt();
        }while( dato < limiteinferior || dato > limitesuperior);
    
        return dato;
    }

    public static boolean esPrimo(int dato)
    {
        int i=2 ;
        boolean primo=true;
         
        while ( i <= ((dato/2)+1) && primo == true )
        {
            if ( dato % i == 0 )
                primo = false;
            i++;
        }
        
        return primo;    
    
    }
    
    
    public static int primoAnterior(int numero)
    {
        int salida=0, i ;
        boolean encontrado=false;
        if (numero <= 2 )
        
                 salida = 1;
        else
        { 
          if (numero==3)
                 salida = 2;
          else 
          {
            for ( i=numero-1 ;  !encontrado   ; i--)
            {
                if (esPrimo (i))
                {   
                    encontrado=true;
                    salida= i;  
                }            
            }
             
          }
        }
        return salida;
    }
    
    
    
    
     public static void main(String[] args)
     {
         int numero;
            
         numero=fLecturaDato(-5000,5000);
         System.out.println();
         System.out.println();
         System.out.println("el primer número primo menor del dato es "+ primoAnterior(numero));
     }

}
