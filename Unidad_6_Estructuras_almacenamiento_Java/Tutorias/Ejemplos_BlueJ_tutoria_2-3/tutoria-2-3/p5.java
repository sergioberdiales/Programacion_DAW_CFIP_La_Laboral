
/**
 * Genere 25 valores enteros (comprendidos entre -50 y 50) en una matric de 5 por 5.
 * Calcula y muestra la tabla y las sumas de cada fila y de cada columna.

 */

public class p5
{
    // Tamaño de la matric
    public static final int TFIL=8;
    public static final int TCOL=8;

     public static void main ( String[] args )
    {
        // Declaramos la matric
        int[][] matric = new int[TFIL][TCOL];
        // Declaramos los vectores suma
       // int[] sumaF = new int [TFIL];
        int[] sumaC = new int [TCOL];
        
        // Rellenamos la matric
        for ( int f=0 ; f<TFIL ; f++ )
            for ( int c=0 ; c<TCOL ; c++ )
            {
                matric[f][c] = (int)( Math.random()*10000 )%101 -50;
            }
            
        // Mostramos la matric
        muestramatric ( matric );
        
       
        
         for ( int f=0 ; f<TFIL ; f++ )
         {
             int acum=0;
            for ( int c=0 ; c<TCOL ; c++ )
            {
                acum += matric[f][c];
            }
             System.out.println ( "La suma de los elementos de la fila de indice "+f+ " es:  "+ acum );
        }
         System.out.println ( );
       
         // Mostramos la suma de las columnas
        System.out.print ( "La suma por columnas da:" );
        sumaC = sumaColumnas ( matric );
        muestraVector ( sumaC );
    }
    
    // Imprime en pantalla la matric pasada como parámetro
    public static void muestramatric( int[][] matric )
    {
        System.out.println();
        for ( int f=0 ; f<TFIL ; f++ )
        {
            for ( int c=0 ; c<TCOL ; c++ )
            {
                System.out.print ( "\t" + matric[f][c] );
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Imprime en pantalla el vector pasado como parámetro
    public static void muestraVector ( int[] vector )
    {
        System.out.println();
        for ( int i=0 ; i<vector.length ; i++ )
            System.out.print ( vector[i] + "\t" );
        System.out.println ();
    }
    
         public static int[] sumaColumnas ( int[][]matriz  ) // devolviendo el vector en este caso
    {
        int[] suma = new int[TCOL];
        for ( int c=0 ; c<TCOL ; c++ )
            for ( int f=0 ; f<TFIL ; f++ )
                suma[c] += matriz[f][c];
        return suma;
    }
}
