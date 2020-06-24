
/**
 * Genera aleatoriamente los elementos de un vector de 25 elementos numéricos 
 * enteros y luego los ordena utilizando una función por el método de la burbuja. 
 * Esta función debe estar comentada y deberá mostrar los pasos parciales hasta 
 * llegar a la ordenación final.
 *
 */
public class Ej615
{
    public static final int LONG=25;    // Longitud del vector
    
    public static void main( String[] args )
    {
        // Declaramos variables
        int[] vector = new int[LONG];
        int i;
        
        // Rellenamos el vector con valores entre 10 y 99
        for( i=0 ; i<vector.length ; i++ )
            vector[i] = (int)(Math.random()*100000)%90 + 10;
        
        // Mostramos el vector sin ordenar
        System.out.println( "Vector sin ordenar:" );
        OpVect.muestraVector( vector );
        
        // Ordenamos el vector por el método de la BURBUJA (INTERCAMBIO DIRECTO)
        System.out.println();
        System.out.println( "Ordenación paso a paso por el método de la BURBUJA:" );
        ordenarBurbuja( vector );
        
        // Mostramos el vector ordenado
        System.out.println();
        System.out.println( "Vector ordenado:" );
        OpVect.muestraVector( vector );
    }
    
    // Método de ordenación de los elementos de un vector
    // de la BURBUJA o de INTERCAMBIO DIRECTO
    public static void ordenarBurbuja( int[] vector )
    {
        // Declaramos variables
        int i, j, aux;
        
        // Recorremos el vector su dimensión menos una veces
        for( i=0 ; i<vector.length-1 ; i++ )
        {
            // Recorremos todos los elementos del vector, menos el último
            for( j=0 ; j<vector.length-1 ; j++ )
            {
                // Si el elemento actual es mayor que el siguiente
                // Intercambiamos sus posiciones
                if( vector[j]>vector[j+1] )
                {
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
            
            if( i != vector.length-1 )
                OpVect.muestraVector( vector );
        }
    }
}