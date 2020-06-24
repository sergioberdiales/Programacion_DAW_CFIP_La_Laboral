
/**
 * Realizar un programa en lenguaje Java que conste de una función llamada “visualizarEntre”. 
 * La función recibirá dos parámetros que serán números enteros, que no tienen necesariamente que estar ordenados. 
 * Esta deberá mostrar/visualizar los números divisibles entre 3 comprendidos entre ambos (sin incluir los mismos)
 * ordenados de mayor a menor. Realizar también una función principal que sirva para comprobar que la primera
 * función visualizarEntre trabaja correctamente en diferentes casos.
 *  
 */
public class ejer2
{
   public static void main ( )
   {
       visualizarEntre (5,6);
       visualizarEntre(18,48);
       visualizarEntre(15,0);
       visualizarEntre2(-18,-39);
   }
    
    
    
    public static void visualizarEntre(int x, int y)
    {
        int mayor, menor, cont=0;
        
        if ( x > y )
        {
            mayor =x;
            menor =y;
        }
        else
        {
            mayor =y;
            menor =x;
        }
        
        System.out.println();
        System.out.println();
        
        for (int i = mayor-1; i > menor ; i-- )
        {
            if ( i % 3 == 0)
            {
                  System.out.print("  "+ i + "," );
                  cont++;
            }
        }
        if (cont ==0)
                System.out.print(" no se pudo crear la serie " );
    }



    public static void visualizarEntre2(int x, int y)
    {
        int mayor, menor;
        boolean sw= false;
        
        if ( x > y )
        {
            mayor =x;
            menor =y;
        }
        else
        {
            mayor =y;
            menor =x;
        }
        
        System.out.println();
        System.out.println();
        
        for (int i = mayor-1; i > menor ; i-- )
        {
            if ( i % 3 == 0)
            {
                  System.out.print("  "+ i + "," );
                  sw= true;
             }
        }
        if ( sw == false)    // ( !sw )
                System.out.print(" no se pudo crear la serie " );
     }
}






