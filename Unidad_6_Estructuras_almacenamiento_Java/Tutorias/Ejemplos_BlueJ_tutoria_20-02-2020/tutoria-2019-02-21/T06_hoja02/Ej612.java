
/**
 * Introduzca datos ordenadamente en un vector de 10 elementos numéricos y 
 * realiza un proceso para encontrar un determinado elemento, pedido por 
 * teclado, en ese vector ordenado, a través de la búsqueda dicotómica
 */

import java.util.*;     // Permite uso de librerías Java

public class Ej612
{
    public static final int LONG = 20;   // Tamaño del vector
    
    public static void main( String[] args )
    {
        // Declaramos variables
        Scanner teclado = new Scanner(System.in);
        int[] vBase = new int[LONG];
        int numBuscado;
        boolean encontrado=false;
        int i;
        int izq=0;              // Límite izquierdo del vector
        int der=LONG-1;         // Límite derecho del vector
        int cen=(izq+der)/2;    // Centro del vector
        
        // Introducimos elementos ORDENADOS. El primer elemento aparte.
        System.out.print( "Introduce primer elemento: ");
        vBase[0] = teclado.nextInt();
        for( i=1 ; i<vBase.length ; i++)
        {
            do
            {
                System.out.print( "Introduce elemento de índice " + i + ": ");
                vBase[i] = teclado.nextInt();
            } while( vBase[i]<vBase[i-1]);
        }
        
        // Mostramos el vector
        System.out.print( "Vector:    " );
        muestraVector( vBase );
        
        // Pedimos y almacenamos el dato
        System.out.print( "Introduce número: " );
        numBuscado = teclado.nextInt();
        
        System.out.println ();
        mostrarValores(izq,der,cen);
        // Lo buscamos en el vector y mostramos el resultado
        // (BÚSQUEDA DICOTÓMICA)
        while( vBase[cen]!=numBuscado  && izq<der)
        {
            if( vBase[cen]<numBuscado )
                izq = cen+1;        // Se cambia el límite izquierdo
            else
                der = cen-1;        // Se cambia el límite derecho
            cen=(izq+der)/2; // Se recalcula el centro
            
               mostrarValores(izq,der,cen);
        }
        
      
        System.out.print( "El número " + numBuscado );
        if( vBase[cen]==numBuscado )
            System.out.println( " ha sido encontrado en la posición de índice" + cen);    
        else
            System.out.println( " no ha sido encontrado" );
    }
 
    // Imprime en pantalla el vector pasado como parámetro
    public static void muestraVector ( int[] vector )
    {
        for ( int i=0 ; i<vector.length ; i++ )
            System.out.print ( vector[i] + "  " );
        System.out.println ();
    }
    
    public static void mostrarValores(int izda, int derecha, int centro)
    {
            System.out.println ();
           System.out.println ("el limite izquierdo es " + izda);
           System.out.println ("el limite derecho es " + derecha);
           System.out.println ("el centro es " + centro);
           System.out.println ();
    }
    
    
    
    
    
    /*
     * while(vector[centro]!=numero && izq<dcha)
     * {
     *  if(vector[cen]<numero){izq = cen+1;}
     *  else{der = cen-1;}
     *  cen=(izq+der)/2;
     * }
     * 
     * // como se sale del while al no cumplir alguna de las dos condiciones,
     * hay que preguntar
     * 
     * if (vector[centro]==numero)
     *  System.out.println("Número encontrado");
     * else
     *  System.out.println("Número no encontrado");
     */
}
