
/**
 * Operaciones que se pueden hacer con vectores y sus elementos.
 * 
 */

public class OpVect
{
    // Imprime en pantalla el vector pasado como parámetro
    public static void muestraVector( int[] vector )
    {
        for ( int i=0 ; i<vector.length ; i++ )
            System.out.print ( vector[i] + "  " );
        System.out.println ();
    }
    
    // Genera valores aleatorios comprendidos entre los valores que se pasan por parámetro
    public static void generaAleatorio( int[] vector, int vInicial, int vFinal )
    {
        for ( int i=0 ; i<vector.length ; i++ )
            vector[i] = (int)(Math.random()*vFinal*100000)%(vFinal-vInicial+1)+vInicial;
    }
}