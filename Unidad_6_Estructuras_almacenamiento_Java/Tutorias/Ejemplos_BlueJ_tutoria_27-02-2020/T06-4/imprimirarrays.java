import java.util.*;   
public class imprimirarrays
{
    
    public static final int TFIL=5;
    public static final int TCOL=5;

     public static void main ( String[] args )
    {
        int[] vector = {1,2,3,4,5};
        int[][] matriz = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        
        // con bucles for manajados por contadores
        
         System.out.println();
        for ( int f=0 ; f<TFIL ; f++ )
        {
            for ( int c=0 ; c<TCOL ; c++ )
            {
                System.out.print ( "\t" + matriz[f][c] );
            }
            System.out.println();
        }
        System.out.println();   System.out.println();
    
        // con un bucle for mejorado o extendido
       for (int i: vector)
             System.out.print ( "\t" + i);
        
      System.out.println();   System.out.println();
        
      // usando el método toString de la clase Arrays
      System.out.println ( Arrays.toString(vector) );
        
      System.out.println();   System.out.println();
        
       System.out.println ( Arrays.deepToString(matriz) );
        
      System.out.println();   System.out.println();
      
      // utilizando length
      
      for (int x=0; x < matriz.length; x++) {

            System.out.print("|");

            for (int y=0; y < matriz[x].length; y++) {

                    System.out.print (matriz[x][y]);

                    if (y!=matriz[x].length-1) 
                            System.out.print("\t");

            }

            System.out.println("|");

      }


      
      
      
      
      
    }
    
}
