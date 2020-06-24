/*
Codificar un programa en lenguaje Java para un proceso que genere valores enteros (comprendidos entre -5 y 5)
 para rellenar una matriz de 6 filas y 6 columnas, y compruebe y nos muestre por pantalla si la matriz es o no dispersa.
 (Una matriz se considera dispersa si TODAS las filas y TODAS las columnas contienen al menos un elemento nulo). 
*/

import java.util.Scanner;
import java.util.*;

public class Ej631
{
   final static int DIM = 6;
    
    public static void main(String[] args) {
                
        //int[][] matriz ={{0,2,3,4,5},{1,0,3,4,5},{1,2,0,4,5},{1,2,3,0,5},{1,2,3,4,0}};
        int[][] matriz=new int [DIM][DIM];
        generarMatriz(matriz);
             
        boolean esdispersa=true;
        int contceros=0;
        System.out.println();
        mostrarMatriz (matriz);
        // recorro las filas
        for (int f=0; f<DIM && esdispersa==true; f++)
        {
             contceros=0;
             for (int c=0; c< DIM; c++)
             {
                if (matriz [f][c]==0)
                   contceros++;
             }
             if (contceros==0)
                esdispersa=false;
        }
        // recorro las columnas
        
        for (int c=0; c<DIM && esdispersa==true; c++)
        {
            contceros=0;
             for (int f=0; f< DIM; f++)
             {
                if (matriz [f][c]==0)
                   contceros++;
             }
             if (contceros==0)
                esdispersa=false;
        }
        
        if (esdispersa==true)
            System.out.println ("la matriz es dispersa");
        else
            System.out.println ("la matriz NO es dispersa");
        
        
        System.out.println();
         
    }

    public static void mostrarMatriz (int[][] matriz)
    {
        for (int f=0; f<DIM; f++)
        {
           for (int c=0; c<DIM; c++)
           {
               System.out.print ( "   " + matriz[f][c]) ;
            }
             System.out.println ();
        }
       
    }
    
     public static void generarMatriz (int[][] matriz)
    {
        for (int f=0; f<DIM; f++)
        {
           for (int c=0; c<DIM; c++)
           {
               matriz[f][c]= (int) ((( Math.random()*10000)%5)) ;
            }
             System.out.println ();
        }
       
    }
    
}