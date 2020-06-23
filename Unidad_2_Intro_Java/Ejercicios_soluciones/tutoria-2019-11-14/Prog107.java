
/**
 * Calcula la nota media de una serie de notas introducidas por teclado, que pueden tomar
 * valores de 0 a 10. -1 es testigo de finalización.
 */

import java.util.*;   // permite E/S de datos

public class Prog107
{
   public static void main (  )
   {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);   // Para poder pedir los datos por teclado
        
        byte nota;
        int cuentaNotas=0,sumaNotas=0;
        float notaMedia;                    // No es necesaria, pero clarifica el código
        
        // Pedimos la primera nota
        do
        {
            System.out.print ( "Introduce nota entre 0 y 10 (-1 para terminar): " );
            nota = teclado.nextByte();
        }while ( nota<-1 || nota>10 );       //-1 no debe procesarse pero debe pasar
        
        // Mientras la nota no sea -1, procesamos los datos
        while ( nota != -1 )
        {
            cuentaNotas++;       // incrementa el contador
            sumaNotas += nota;   //proceso acumulación
            // Nos preparamos para la siguiente iteración
            do
            {
                System.out.print ( "Introduce nota entre 0 y 10 (-1 para terminar): " );
                nota = teclado.nextByte();
            }while ( nota<-1 || nota>10 ); 
        }
        
        // Si hubo notas, calculamos la media (EVITAR LA DIVISIÓN POR CERO)
        if ( cuentaNotas > 0 )
        {
            notaMedia = (float)sumaNotas/cuentaNotas;
            System.out.println ( "La nota media es " + notaMedia );
        }
        else
            System.out.println( "No hay notas para calcular la media." );
   }
}
