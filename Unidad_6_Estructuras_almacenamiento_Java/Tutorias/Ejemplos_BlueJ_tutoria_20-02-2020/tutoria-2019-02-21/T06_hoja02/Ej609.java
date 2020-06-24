
/**
 * Genera una matriz de dimensiones 3 x 5. Muestra esta matriz y modifica 
 * los elementos de la misma de forma que se desplacen todas sus columnas 
 * un lugar hacia la derecha. Muestra la nueva composición de la matriz.
 */

public class Ej609
{
    public static final int NFIL = 8;
    public static final int NCOL = 4;
    
    public static void main ( )
    {
        // Declaramos variables
        int[][] matriz = new int[NFIL][NCOL];
        int[] vcopia = new int[NFIL];

        // Generamos los valores de la matriz
        for ( int f=0 ; f<NFIL ; f++ )
            for ( int c=0 ; c<NCOL ; c++ )
                matriz[f][c] = (int)(Math.random()*10000)%21;
          
        // Mostramos la matriz
        System.out.println ( "La matriz generada es: " );
        muestraMatriz( matriz );
        
        // Copiamos la última columna en el vector copia
        // paso 1 de la pizarra
        for ( int f=0 ; f<NFIL ; f++ )
            vcopia[f]=matriz[f][NCOL-1];
              
            
        // Movemos las columnas de la matriz un lugar a la derecha
        // Hay que ir de derecha a izquierda para NO machacar valores
        // paso 2 de la pizarra descompuesto en 21,22,23,24.....
        for ( int c= NCOL-1 ; c > 0 ; c-- )
            for ( int f=0 ; f < NFIL ; f++ )
                matriz[f][c] = matriz[f][c-1];
                       
        // Copiamos los valores del vector en la primera columna
        // PASO 3 de la pizarra
        for ( int f=0 ; f<NFIL ; f++ )
            matriz[f][0] = vcopia[f];
            
        // Mostramos de nuevo la matriz
        System.out.println ( "La matriz con las columnas movidas es: " );
        muestraMatriz( matriz );
    }
            
    // Imprime en pantalla la matriz pasada como parámetro
    public static void muestraMatriz( int[][] matriz )
    {
        System.out.println();
        for ( int f=0 ; f<NFIL ; f++ )
        {
            for ( int c=0 ; c<NCOL ; c++ )
            {
                System.out.print ( "\t" + matriz[f][c]);
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
