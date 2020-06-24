import java.util.*;

public class problema8
{

    static final int TAM=11;
    
    static void histograma(int [] vector)
    {
        for (int i=1; i<TAM ; i++)
        {
            System.out.print(i+": ");
            for (int a=1; a<=vector[i]; a++)
                 System.out.print("*");
             System.out.print(" "+vector[i]+"\n");
        
        }
    }

    public static void main()
    {
        int[]vector= new int [TAM];
        int numero;
        for (int i=1; i<=500; i++){
            numero = (int)(Math.random()*10 + 1);
            vector[numero]++;
            //System.out.print(" "+numero);
        }    
        System.out.println("frecuencia de aparición");
        histograma(vector);
    
    }




}