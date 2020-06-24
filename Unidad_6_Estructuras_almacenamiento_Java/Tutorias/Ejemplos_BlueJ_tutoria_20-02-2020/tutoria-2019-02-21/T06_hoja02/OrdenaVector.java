
/**
 * Métodos para ordenar los valores de un vector.
 *
 */
public class OrdenaVector
{
    // Método de ordenación de los elementos de un vector
    // de la BARAJA o de INSERCIÓN DIRECTA
    public static void baraja( int[] vector )
    {
        // Declaramos variables
        int i,j,aux;
        
        // Recorremos todos los elementos del vector. 
        // El primero no se incluye para que no casque el algoritmo
        for( i=1 ; i<vector.length ; i++)   
        {
            // Comparamos el elemento actual con todos los anteriores
            for( j=0 ; j<i ; j++ )      
            {
                // Si el elemento actual es menor que uno de los anteriores
                // Se intercambian sus posiciones
                if( vector[i]<vector[j] )
                {
                    aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                }
            }
        }
    }
    
    // Método de ordenación de los elementos de un vector
    // de la BURBUJA o de INTERCAMBIO DIRECTO
    public static void burbuja( int[] vector )
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
        }
    }
        
    // Método de ordenación de los elementos de un vector de ORDENACIÓN RÁPIDA
    // (QUICK SORT)
    // NECESITA: vector a ordenar, la primera y la última posición a ordenar
    public static void rapida( int[] vector, int izda, int dcha )
    {
        // Declaramos variables
        int i, j, aux, central;
        
        // Asignamos valores
        i = izda;
        j = dcha;
        central = vector[(izda+dcha)/2]; // calculamos la posición del centro
        
        do
        {
            // Mientras que el valor sea menor que el central aumentamos el
            // índice por la izquierda (recorremos el vector hacia la dcha)
            while( vector[i]<central && i<dcha )
                i++;
            // Mientras que el valor sea mayor que el central reducimos el
            // índice por la derecha (recorremos el vector hacia la izda)
            while( central<vector[j] && j>izda )
                j--;
            // Si el índice por la izquierda es menor o igual que el índice
            // por la derecha, intercambiamos los valores, aumentamos uno
            // por la izquierda y reducimos uno por la derecha
            if( i<=j )
            {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }
        } while( i<=j ); 
        // Repetimos el proceso mientras el índice por la izquierda sea
        // menor o igual que el índice por la derecha
        
        
        // Si el índice por la derecha es mayor que el original por la izda
        // llamamos a la función recursiva, actualizando el extremo derecho
        if( izda<j )
            rapida( vector, izda, j );
        // Si el índice por la izquierda es mmenor que el original por la dcha
        // llamamos a la función recursiva, actualizando el extremo izquierda
        if( i<dcha)
            rapida( vector, i, dcha );
    }
    
}
