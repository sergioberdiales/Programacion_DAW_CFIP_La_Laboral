import java.util.*;     // Permite E/S de datos

public class problema17
{
    public static void main ( String[] args )
    {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int factor1;
        int factor2;
        int trasvase;
        int producto=0;
        int i;
        
        // Solicitamos y almacenamos el primer factor
        do
        {
            System.out.print("Introduce el primer factor: ");
            factor1 = teclado.nextInt();
        } while ( factor1 <= 0 );
        // Solicitamos y almacenamos el segundo factor
        do
        {
            System.out.print("Introduce el segundo factor: ");
            factor2 = teclado.nextInt();
        } while ( factor2 <= 0 );
        // Comprobamos cuál es el mayor y los ordenamos
        if ( factor1 < factor2 )
        {
            trasvase = factor1;
            factor1 = factor2;
            factor2 = trasvase;
        }
        // Calculamos el producto. Sumamos tantas veces factor1 como nos diga factor2
        for ( i=0; i < factor2; i++ )
        {
            producto += factor1;
            System.out.println("El producto intermedio es " + producto);
        }
        // Mostramos el resultado
        System.out.println("El producto es " + producto);
    }
}

