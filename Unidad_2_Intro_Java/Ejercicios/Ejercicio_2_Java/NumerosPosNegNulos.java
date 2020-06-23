import java.util.Scanner;

/**
 * Construir un algoritmo que leído un número por teclado
 * nos diga si es positivo, negativo o nulo.
 *
 */
public class NumerosPosNegNulos
{
   public static void main(String[] args)
   {
       int num;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce numero");
       num=teclado.nextInt();
       if(num>0)
            System.out.println(num+" es positivo");
       else
            if(num<0)
                System.out.println(num+" es negativo");
            else
                System.out.println(num+" es nulo");
   }
}