
/*
 * Codificar un programa en lenguaje Java que declare una matriz cuadrada 5 X 5 de elementos enteros generados aleatoriamente
 * y comprendidos entre 0 y 100, y posteriormente  nos debe crear una nueva matriz 2 X 5 donde en la primera fila 
 * se almacenen los menores de cada fila y en la segunda fila los menores de cada columna. 
 * Calculará además la media de todos los elementos de esta matriz de menores. Se deben mostrar por pantalla la nueva matriz
 * y la media de sus elementos. 
 */
import java.util.Scanner;
import java.util.*;

public class Ej632
{
   final static int FIL = 5;
    final static int COL =5;
    public static void main(String[] args) {
                
        int[][] matriz =new int [FIL] [COL];
        int [][] matAux =new int [2][COL];
        int menor;
        float suma=0;
        
        generarMatriz (matriz);
        System.out.println();
        mostrarMatriz (matriz);
       System.out.println();
       
       
       // calculo de los menores
        for (int f=0; f<FIL; f++)
        {
            menor=200;
           for (int c=0; c<COL; c++)
           {
               if (matriz[f][c]< menor )
                    menor = matriz[f][c];
            }
            matAux[0][f]= menor;
           // System.out.println ( "el menor de la fila   "+  f + " es " + menor );
        }
        System.out.println();
         System.out.println();
        for (int c=0; c<COL; c++)
        {
            menor=1000;
            for (int f=0; f<FIL; f++)
            {
               if (matriz[f][c]< menor )
                    menor = matriz[f][c];
             }  
              matAux[1][c]= menor;
           // System.out.println ( "el menor de la columna   "+  c + " es " + menor );
             
             
        }
          System.out.println();
        // calculo de la media
        for (int f=0; f<2; f++)
        {
           for (int c=0; c<COL; c++)
           {
               suma=suma+matAux[f][c];
                System.out.print(matAux[f][c]+" ");
            }
        System.out.println();
        }
         System.out.println ( "la media es  " + suma/(2*COL) );
        
        
         
    }

    public static void mostrarMatriz (int[][] matriz)
    {
        for (int f=0; f<FIL; f++)
        {
           for (int c=0; c<COL; c++)
           {
               System.out.print ( "   " + matriz[f][c]) ;
            }
             System.out.println ();
        }
       System.out.println ();
    }
    
    public static void generarMatriz (int[][] matriz)
    {
        for (int f=0; f<FIL; f++)
        {
           for (int c=0; c<COL; c++)
           {
               matriz[f][c]= (int) ((( Math.random()*10000)%101)) ;
            }
             System.out.println ();
        }
       
    }
    
    
}