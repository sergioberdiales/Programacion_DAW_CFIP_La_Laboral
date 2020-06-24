/*
 * Codificar un programa en lenguaje Java para un proceso que genere valores enteros (comprendidos entre -5 y 5)
 * para rellenar una matriz de 8 filas y 8 columnas, y posteriormente declare dos vectores donde se almacenarán, 
 * en el primero cuantos ceros hay en cada fila,  y en el segundo cuantos ceros hay en cada columna, 
 * mostrando por pantalla la matriz (bien ordenada en filas y columnas), a través de una función declarada al efecto, 
 * y una vez realizados los cálculos, los dos vectores, también mediante otra función diferente a la anterior declarada
 * al efecto.
 */
import java.util.Scanner;
import java.util.*;

public class ejer2
{
    final static int DIM =6;
    public static void main(String[] args) {
                
        int[][] matriz =new int [DIM] [DIM];
        int [] vectorCerosFila= new int [DIM];
        int [] vectorCerosColumna= new int [DIM];
        
        
        // generar elementos y mostrar
        for (int f=0; f<DIM; f++)
        {
           for (int c=0; c<DIM; c++)
           {
               matriz[f][c]= (int) ((( Math.random()*100000)%11)-5) ;
           }
        }
        
        mostrarMatriz (matriz); 
        System.out.println();
        System.out.println();
       
        for (int f=0; f<DIM; f++) // calculamos los ceros por fila
        {
           for (int c=0; c<DIM; c++)
           {
                if (matriz [f][c]==0)
                        vectorCerosFila [f]++;
            }
           
        }
       
         for (int c=0; c<DIM; c++) // calculamos los ceros por columna
        {
           for (int f=0; f<DIM; f++)
           {
                if (matriz [f][c]==0)
                        vectorCerosColumna [c]++;
            }
           
        }             
         System.out.println();
         System.out.println("vector de ceros por fila");
        mostrarVector (vectorCerosFila);
        System.out.println();System.out.println();
        System.out.println("vector de ceros por columna");
        mostrarVector (vectorCerosColumna);
              
    }     // FIN DEL MAIN

   
     
   // mostrarMatriz (matriz);  
         
   public static void mostrarMatriz (int[][] mat)
    {
        for (int f=0; f<DIM; f++)
        {
           for (int c=0; c<DIM; c++)
           {
               System.out.print ( "\t" + mat[f][c]) ;
            }
             System.out.println ();
        }
       
    }     
        
         
public static void  mostrarVector (int[] vector)
    {
        for (int f=0; f<DIM; f++)
        {
           
               System.out.print ( "\t" + vector [f]) ;
        }
    }    

    
}    
