
/**
 * Genera una matriz 5x5 de valores enteros comprendidos entre -2 y 2.
 * Comprueba, a través de una función, si la matriz es diagonal o no.
 * Una matriz cuadrada es diagonal si todos los elementos que no pertenecen
 * a la diagonal principal son nulos.
 * la diagonal principal es aquella en que el índice de la fila es igual al índice de la columna
 */

public class Ej606
{
    // Fijamos el tamaño de la matriz
    public static final int NFIL=3;
    public static final int NCOL=NFIL;

    public static void main ( )
    {
        // Declaramos la matriz
        int[][] matriz = new int[NFIL][NCOL];           //{{1,0,0},{0,2,0},{0,0,3}};
        
        // Rellenamos la matriz
        for ( int f=0 ; f<NFIL ; f++ )
            for ( int c=0 ; c<NCOL ; c++ )
            {
                matriz[f][c] = (int)(Math.random()*10000)%2 ;
            }
        
            // Comprobamos si es diagonal
        if ( esDiagonal(matriz) )
            System.out.println ( "La matriz generada es diagonal." );
        else
            System.out.println ( "La matriz generada NO es diagonal." );
            
        // Mostramos la matriz
        muestraMatriz ( matriz );
    }
    
    // Comprueba si la matriz pasada como parámetro es diagonal
    public static boolean esDiagonal ( int[][] matriz )
    {
        boolean esDiag= true;   // Por defecto es diagonal
        
        // Recorremos la matriz. Para que pare usamos while en vez de for
        for ( int f=0 ; f<NFIL && esDiag ; f++ )
            for ( int c=0 ; c<NFIL && esDiag ; c++ )
                // Sólo tratamos los elementos de fuera de la diagonal ppal
                if ( f!=c && matriz[f][c]!=0 )
                    esDiag = false;

        return esDiag;
    }
    
    // Comprueba si la matriz pasada como parámetro es diagonal -- con break
    public static boolean esDiagonal1 ( int[][] matriz )
    {
        boolean esDiag= true;   // Por defecto es diagonal
        
        // Recorremos la matriz. Para que pare usamos while en vez de for
        for ( int f=0 ; f<NFIL ; f++ )
        {
            for ( int c=0 ; c<NFIL ; c++ )
            {
                // Sólo tratamos los elementos de fuera de la diagonal ppal
                if ( f!=c && matriz[f][c]!=0 )
                {
                    esDiag = false;
                    break;
                }
            }
            if ( !esDiag )
                break;
        }
        return esDiag;
    }
    
    // Comprueba si la matriz pasada como parámetro es diagonal -- con while
    public static boolean esDiagonal2 ( int[][] matriz )
    {
        boolean esDiag= true;   // Por defecto es diagonal
        int f=0, c=0;           // Índices para fila y columna
        
        // Recorremos la matriz. Para que pare usamos while en vez de for
        while ( f<NFIL && esDiag )
        {
            while ( c<NCOL && esDiag)
            {
                // Sólo tratamos los elementos de fuera de la diagonal ppal
                if ( f!=c && matriz[f][c]!=0 )
                    esDiag = false;
                c++;    // aumentamos el índice de las columnas
            }
            f++;    // aumentamos el índice de las filas
        }
        
        return esDiag;
    }
    
    // Imprime en pantalla la matriz pasada como parámetro
    public static void muestraMatriz( int[][] matriz )
    {
        System.out.println();
        for ( int f=0 ; f<NFIL ; f++ )
        {
            for ( int c=0 ; c<NCOL ; c++ )
            {
                System.out.print ( "      " + matriz[f][c] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
