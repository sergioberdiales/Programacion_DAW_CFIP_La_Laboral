
/**
 * Calcula la nota media de una serie de notas introducidas por teclado, que pueden tomar
 * valores de 0 a 10. -1 es testigo de finalización.
 */

import java.util.*;   // permite E/S de datos

public class p107
{
   public static void main (  )
   {
        // Inicializamos variables
        
        
        byte nota;
        int cuentaNotas=0,sumaNotas=0;
        float notaMedia;                    // No es necesaria, pero clarifica el código
        
        // Pedimos la primera nota
        nota = lecturaDato();
             
        // Mientras la nota no sea -1, procesamos los datos
        while ( nota != -1 )
        {
            cuentaNotas++;       // incrementa el contador
            sumaNotas += nota;   //proceso acumulación
            // Nos preparamos para la siguiente iteración
            nota = lecturaDato();
        } // fin del while
        
        // Si hubo notas, calculamos la media (EVITAR LA DIVISIÓN POR CERO)
        if ( cuentaNotas > 0 )
        {
            notaMedia = (float)sumaNotas/cuentaNotas;
            System.out.println ( "La nota media es " + notaMedia );
        }
        else
            System.out.println( "No hay notas para calcular la media." );
   }//fin del main
   
   
   
   public static byte lecturaDato ()
   {
       Scanner teclado;
       teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
       
       byte nota;
       
       do
       {
                System.out.print ( "Introduce nota entre 0 y 10 (-1 para terminar): " );
                nota = teclado.nextByte();
       }while ( nota<-1 || nota>10 ); 
    
       return nota;
    
    }
   
   
   
   
   
   
   
   
}
