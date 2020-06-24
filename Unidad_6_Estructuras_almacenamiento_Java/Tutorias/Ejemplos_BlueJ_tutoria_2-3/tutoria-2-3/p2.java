
/**
 * Lee por teclado los componentes numéricos enteros de un vector de 10 elementos, y calcula 
 * dos nuevos vectores, uno vtraspuesto del voriginal y otro vrotado en una unidad, de manera que su
 * último elemento pase a ser el primero. 
 * Muestra por pantalla los dos vectores obtenidos
 */

import java.util.*;                   // Permite uso de librerías java

public class p2
{
    public static final int NUMELEMENTOS=8;  // Tamaño del vector
                                    
    public static void main ( String[] args )
    {
        // Declaración de variables
        Scanner teclado = new Scanner ( System.in );    // Permite entrada de datos por teclado
        int[] voriginal = new int[NUMELEMENTOS];                 // Vector voriginal
        int[] vtraspuesto = new int[NUMELEMENTOS];               // Vector vtraspuesto del voriginal
        int[] vrotado = new int[NUMELEMENTOS];                   // Vector vrotado del voriginal en una posición
                
        // Pedimos y almacenamos los datos
        for ( int i=0 ; i<NUMELEMENTOS ; i++ )
        {
            System.out.print ( "Introduce elemento de índice " + i + ": ");
            voriginal [ i ] = teclado.nextInt();
        }
        System.out.println();
        System.out.print ( "Vector voriginal:    ");
        muestraVector ( voriginal );
        System.out.println();
        // Calculamos el vtraspuesto 
        for ( int i=0; i<vtraspuesto.length ; i++ )
            vtraspuesto [ i ] = voriginal [NUMELEMENTOS-1-i] ;//[ voriginal.length-1 -i ];
        System.out.print ( "Vector vtraspuesto:  ");
        muestraVector ( vtraspuesto );
        System.out.println();
        // Calculamos el vrotado
        vrotado [ 0 ] = voriginal [ voriginal.length-1 ];
        for ( int i=1 ; i<vrotado.length ; i++ )
            vrotado [ i ] = voriginal [ i-1 ];
        System.out.print ( "Vector vrotado:      ");
        muestraVector ( vrotado );
    }
    
    public static void muestraVector ( int[] vector )
    {
        for ( int i=0 ; i<vector.length ; i++ )
            System.out.print ( vector[i] + "  " );
        System.out.println ();
    }
}
