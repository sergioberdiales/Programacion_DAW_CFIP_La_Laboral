/*.-  Partiendo de la clase Racional propuesta en la tarea 2-1, cuya estructura principal se pone a continuación y que no es necesario desarrollar:
public class Racional
{
   private int numerador;
   private int denominador;
   Racional( ) {…..}
   Racional( int num, int den )  {……..}
    public void set_numerador ( int num ) {……..}
    public void set_denominador ( int den ) {……..}
    public int get_numerador ( ) {……..}
    public int get_denominador ( ) {……..}
    public void verRacional( ) {……..}
    public static Racional suma ( Racional q1, Racional q2 ) {……..}
    public static Racional resta ( Racional q1, Racional q2 ) {……..}
    public static Racional multiplica ( Racional q1, Racional q2 ) {……..}
    public static Racional divide ( Racional q1, Racional q2 ) {……..}
    public static boolean igual ( Racional q1, Racional q2 ) {……..}
    public static boolean mayor_que ( Racional q1, Racional q2 ) {……..}
    public void simplifica ( ) {……..}
    private int mcd ( int num1, int num2 ) {……..}
} // fin clase Racional 
Se pide: 
A)	Añadir un nuevo método a la clase que sume tres objetos de tipo Racional.
B)	Añadir un nuevo método que nos permita copiar un objeto de tipo Racional en otro.
Para este ejercicio se tendrá en cuenta, de manera especial, la estructura, sencillez y simplicidad de su código.

*/

import java.util.*;

public class ejer1
{
    public static void main ( )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in );    // Permite entrada por teclado
        Racional fraccion1 = new Racional(3,4);            // Constructor sin parámetros
        Racional fraccion2= new Racional(1,2);
        Racional resultado = new Racional();
        Racional fraccion3 =new Racional(3,6);
        
        
        
        
        fraccion1.verQuebrado();                        // Probamos la visualización por pantalla
        
        System.out.println ("");   // separador
        
        fraccion2.verQuebrado(); 
         
        System.out.println ("");   // separador
        fraccion3.verQuebrado(); 
         
        System.out.println ("");   // separador
        // Probamos la suma
        resultado = Racional.suma ( fraccion1, fraccion2 );
        System.out.print ( "La suma de las dos fracciones es: " );
        resultado.verQuebrado();
        
        // Probamos la suma de tres fracciones
        resultado = Racional.suma ( fraccion1, fraccion2, fraccion3 );
        System.out.print ( "La suma de las tres fracciones es: " );
        resultado.verQuebrado();
        
        
        // Probamos la función de copia
        fraccion3 = new Racional ();
        Racional.copia( fraccion3, fraccion1 );
        System.out.print ( "Se ha copiado la primera fracción: " );
        fraccion3.verQuebrado();
        
        System.out.println (" otra versión");   // separador
        
        Racional fraccion6=new Racional();
        fraccion6.copia(fraccion1);
        fraccion6.verQuebrado();
            
    } // fin del main
}
