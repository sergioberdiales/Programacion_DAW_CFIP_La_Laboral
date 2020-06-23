import java.util.*;     // Incluye funciones en librerías
public class p22
{
    static double sumar (double v1, double v2)
    {
        double suma;
        suma = v1 + v2;
        return suma;    
    }
    
    static double restar (double v1, double v2)
    {
        return v1-v2;    
    }

    static double multiplicar (double v1, double v2)
    {
        double multiplicacion= v1 * v2;
        return multiplicacion;    
    }

    static double dividir (double v1, double v2)
    {
       return v1/v2;    
    }    

    public static void main (  )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
        double resultado=0.0, n1, n2;
        int opcion;
        System.out.print ( "introduce el primer valor : " );
        n1=teclado.nextDouble();
        System.out.print ( "introduce el segundo valor : " );
        n2=teclado.nextDouble();
        
        System.out.println ( "1.- Sumar " );
        System.out.println ( "2.- Restar " );
        System.out.println ( "3.- Multiplicar " );
        System.out.println ( "4.- Dividir " );
        System.out.println ( );
        System.out.println ( "Introducir la opción elegida para la operación " );
        opcion=teclado.nextInt ();
        
        
        switch(opcion)
        {
            case 1: 
                    resultado=sumar(n1,n2);
                    break;
             case 2: 
                    resultado=restar(n1,n2);
                    break;
             case 3: 
                    resultado=multiplicar(n1,n2);
                    break;
             case 4: 
                    resultado=dividir(n1,n2);
                    break;
             default:
                    System.out.println ( "opción incorrecta " );
        
        }// fin de switch
        
        System.out.println ( "Resultado:  " + resultado);
    }// fin de la función main

}// fin del programa
