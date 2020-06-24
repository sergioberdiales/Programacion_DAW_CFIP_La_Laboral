/*
1.- Construir un programa en Java  que declare un vector de 100 elementos enteros y rellene el mismo con números enteros aleatorios
 comprendidos entre 0 y 80.  A continuación, pedir por teclado un índice comprendido, obligatoriamente, entre 0 y 98. 
 Eliminar del vector declarado al principio el elemento situado en la posición indicada por el índice leído por teclado anteriormente, 
 dejándolo sin huecos y añadiendo un cero al final del mismo. Ejemplo para 10 elementos:

 Vector original aleatorio:
22  8   16  13  8   60  35  88  36  55
 
Posición a eliminar introducida por teclado: 6. En este ejemplo sería el elemento de índice 6, que es el 35.

Vector resultante:
22  8   16  13  8   60  88  36  55  0
*/


import java.util.Scanner;
import java.util.*;

public class ejer3
{
    final static int TAMANO=20;
    public static void main( ) {
        
      int []vectorOriginal = new int [TAMANO];
       
       for (int i=0; i<TAMANO; i++)
       {
                vectorOriginal [i]= (int)(( Math.random()*100000)%81);
                System.out.print ("  " + vectorOriginal[i]);
       }
      
      System.out.println ();
      System.out.println ();
      
    
        Scanner teclado=new Scanner(System.in);       
        int posicion;
        do{
            System.out.println("dame un numero");
            posicion= teclado.nextInt();
        }while( posicion < 0 || posicion > TAMANO-2);
    
       for (int i=posicion; i<TAMANO-1; i++)
       {
                vectorOriginal[i]=vectorOriginal [i+1];
                
        }
        vectorOriginal [TAMANO-1]=0;
       System.out.println ();
      System.out.println ();
        for (int i=0; i<TAMANO; i++)
        {
                System.out.print ("  " + vectorOriginal[i]);
                
        }
   }

    
}


