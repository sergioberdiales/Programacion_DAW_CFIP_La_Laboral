
/**
 * Calcula el cociente y el resto de la división de dos números enteros y positivos, 
 * mediante restas sucesivas
 */

import java.util.*;   // permite E/S de datos

public class Prog104
{
    public static void main ( String[] args )
    {
        // Inicializamos variables
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int dividendo,divisor;
        int cociente,resto;
              
        // Pedimos y almacenamos los datos
        do
        {
            System.out.print("Introduce el dividendo: (debe ser positivo) ");
            dividendo = teclado.nextInt();
        } while ( dividendo <= 0 );
        do
        {
            System.out.print("Introduce el divisor: ");
            divisor = teclado.nextInt();
        } while ( divisor <= 0 );
        
        // Asignamos valores
        resto = dividendo;
        cociente = 0; // contador para llevar la cuenta del nùmero de veces que restamos
        
        // Realizamos la división mediante restas sucesivas
        while ( resto >= divisor )
        {
            resto -= divisor;    //resto= resto-divisor
            cociente++;  // incremento del contador
        }
        
        // Mostramos los resultados
        System.out.println ("La división de " +dividendo+ " entre " +divisor+ " es: ");
        System.out.println ("   Cociente: " +cociente);
        System.out.println ("   Resto: " +resto);
        
    }
}
