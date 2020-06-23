/*
Construir un programa en Java que nos escriba los  n   primeros términos de la serie de Fibonacci3 mediante una función recursiva.
1, 1, 1, 3, 5, 9, 17, ………… n       (  donde cada término n = (n-1) + (n-2) + (n-3) )
En la citada serie, los tres primeros términos por definición son siempre 1, y el resto de los mismos se obtienen haciendo la suma de los tres términos anteriores.
Pedir el valor de la variable “n” de forma que sea un número entero positivo mayor de 5.
*/

import java.util.Scanner;

public class ejer1b
{

   static int fibonacci3 (int num)
   {
     if (num==0 || num==1 || num==2)
            return 1;
   
     return ( fibonacci3 (num-1)+ fibonacci3 (num-2)+ fibonacci3(num-3) );

   }

 
   public static void main()
   {
    Scanner teclado=new Scanner(System.in);
    int n;

    System.out.println("introduce numero de terminos positivo: ");
    n=teclado.nextInt();
    System.out.print ( "1 , ");
    for (int i =1; i < n; i++)
            System.out.print (fibonacci3 (i) + " , ");
    
   }
 
}