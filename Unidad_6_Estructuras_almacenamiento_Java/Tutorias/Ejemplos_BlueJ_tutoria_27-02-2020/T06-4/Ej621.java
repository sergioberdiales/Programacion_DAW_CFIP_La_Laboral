
/**
 * Genera aleatoriamente los elementos de dos vectores de 20 elementos numéricos enteros aleatorios 
 * (comprendidos entre 0 y 99) y realiza las siguientes cuestiones:
 * - ordena los vectores de menor a mayor (con cualquiera de las funciones estudiadas)
 * - una vez ordenados, realiza un proceso de fusión de ambos vectores, de forma que después de 
 * recorrerlos una única vez, se haya generado un tercer vector de 40 elementos con los mismos ya 
 * ordenados.
 * - muestra por pantalla el contenido de los tres vectores.
 */
public class Ej621
{
    public static final int LONGI = 4;         // Tamaño de los vectores A y B
    public static final int LONGF = 2*LONGI;    // Tamaño del vector fusión
    
    public static void main( )
    {
        // Declaramos variables
        int[] vectorA = new int[LONGI];     // Vector A
        int[] vectorB = new int[LONGI];     // Vector B
        int[] vectorF = new int[LONGF];     // Vector fusión de A y B (F)
        int iA, iB, iF;                     // índices para los vectores A, B y F
        
        // Generamos los vectores A y B (Pongo 10 y no 0 para que salgan cuadrados)
        OpVect.generaAleatorio(vectorA,10,99);
        OpVect.generaAleatorio(vectorB,10,99);
        System.out.println( "Vector A:" );
        OpVect.muestraVector( vectorA );
        System.out.println( "Vector B:" );
        OpVect.muestraVector( vectorB );
        // Ordenamos los vectores A y B
        OrdenaVector.baraja( vectorA );
        OrdenaVector.baraja( vectorB );
        
        // Fusionamos los vectores A y B
        // En los apuntes tengo la versión del profesor, quizá sea más eficiente
        iA = 0;
        iB = 0;
        for( iF=0 ; iF<LONGF ; iF++ )
        {
            // Comparamos las posiciones de A y B y avanzamos una posición en el vector que usemos
            // OJO: tener en cuenta que uno se terminará antes que otro
            if( iA == LONGI )// el vector VA ya no tenemos elementos y solo quedan del VB
            {
                vectorF[iF] = vectorB[iB];
                iB++;
            }
            else if( iB == LONGI ) // el vector VB ya no tenemos elementos y solo quedan del VA
            {
                vectorF[iF] = vectorA[iA];
                iA++;
            }
            else if( vectorA[iA] <= vectorB[iB] ) // el elemento del vector A se copia en VF
            {
                vectorF[iF] = vectorA[iA];
                iA++;
            }
            else
            {
                vectorF[iF] = vectorB[iB]; // el elemento del VB se copia en VF
                iB++;
            }
        }
        
        // Mostramos los tres vectores
        System.out.println( "Vector A:" );
        OpVect.muestraVector( vectorA );
        System.out.println( "Vector B:" );
        OpVect.muestraVector( vectorB );
        System.out.println( "Vector Fusión:" );
        OpVect.muestraVector( vectorF );
    }
}
