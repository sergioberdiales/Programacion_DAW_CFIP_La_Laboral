
/**
 * Genera aleatoriamente los elementos de un vector de 5000 elementos numéricos
 * enteros comprendidos entre 0 y 1000. Ese vector deberá preservarse como vector
 * original para ser copiado en otro antes de proceder a su ordenación con las 
 * funciones ya probadas.
 
 */
public class Ej620
{
    public static final int LONG=2000;    // Longitud del vector
    
    public static void main( )
    {
        // Declaramos variables
        int[] vBase = new int[LONG];
        int[] vOrden = new int[LONG];
        long tInicio, tFin, tTotal;
        long[] tiempos = new long[3];
        int indice=0;
        String metodo="";
        
        // Generamos el vector base
        for ( int i=0 ; i<vBase.length ; i++ )
            vBase[i] = (int)( Math.random()*1000000000 )%1001;
        // Rellenamos la copia
        copiaVector( vBase, vOrden );
        
        System.out.println( "Tiempos de ordenación de un vector de " + LONG + " elementos" );
        System.out.println();
        // Ordenamos el vector por el método de la baraja
        tInicio = System.currentTimeMillis();
        OrdenaVector.baraja( vOrden );
        tFin = System.currentTimeMillis();
        tTotal = tFin - tInicio;
        tiempos[indice++] = tTotal;
        System.out.println( "Método de la baraja: " + tTotal + " ms -- " + tTotal/1000.0 + " s" );
        
        // Restituimos la copia
        copiaVector( vBase, vOrden );
        
        // Ordenamos el vector por el método de la burbuja
        tInicio = System.currentTimeMillis();
        OrdenaVector.burbuja( vOrden );
        tFin = System.currentTimeMillis();
        tTotal = tFin - tInicio;
        tiempos[indice++] = tTotal;
        System.out.println( "Método de la burbuja: " + tTotal + " ms -- " + tTotal/1000.0 + " s" );
        
        // Restituimos la copia
        copiaVector( vBase, vOrden );
        
        // Ordenamos el vector por el método de la ordenación rápida
        tInicio = System.currentTimeMillis();
        OrdenaVector.rapida( vOrden, 0, (vOrden.length-1) );
        tFin = System.currentTimeMillis();
        tTotal = tFin - tInicio;
        tiempos[indice++] = tTotal;
        System.out.println( "Método de la ordenación rápida: " + tTotal + " ms -- " + tTotal/1000.0 + " s" );
        
        // Identificamos el método más rápido
        indice=0;
        for ( int i=1; i<tiempos.length; i++ )
            if( tiempos[i]<tiempos[i-1])
                indice=i;
        switch (indice)
        {
            case 0:
                metodo = "baraja";
                break;
            case 1:
                metodo = "burbuja";
                break;
            case 2:
                metodo = "ordenación rápida";
                break;
        }
        System.out.println();
        System.out.println( "El método más rápido es: " + metodo );
    }
    
    public static void copiaVector( int[] vOriginal, int[] vCopia )
    {
        for( int i=0 ; i<vCopia.length ; i++ )
            vCopia[i] = vOriginal[i];
    }
}
