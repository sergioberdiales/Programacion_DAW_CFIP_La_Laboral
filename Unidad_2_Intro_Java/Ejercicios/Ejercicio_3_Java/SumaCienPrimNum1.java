
/**
 * 3.- Construir un algoritmo para calcular y escribir la suma de los 
 * 100 primeros números naturales. Utilizar las estructuras PARA, MIENTRAS
 *  Y REPETIR. 
 * Estructura "MIENTRAS".
 * 
 * @author (Sergio Berdiales)
 * @version (2020-01-22)
 */
public class SumaCienPrimNum1
{
  public static void main(String[] args)
   {
        int n, suma;
        n=1;
        suma=0;
        while (n<=100){
            suma+=n;
            n++;
        }
        System.out.println("Suma: "+suma);
    }
}
