
/**
 * Clase de pruebas para aprender POO
 * 
 * @author 1FC303 
 * @version 18/01/2013
 */
public class Miclase
{
    // Variables
    private int a;
    public int b;

    //Constructores
    Miclase()
    {
        a = 0;
        b = 0;
        //Esto se hace porque es el primer ejercicio, para comprobar, pero NO SE HACE
        System.out.println ("Ejecutado constructor sin parámetros");
    }
    Miclase( int valorInicial_a )
    {
        a = valorInicial_a;
        //Esto se hace porque es el primer ejercicio, para comprobar, pero NO SE HACE
        System.out.println ("Ejecutado constructor 1 parámetro");
    }
    Miclase( int valorInicial_a, int valorInicial_b )
    {
        a = valorInicial_a;
        b = valorInicial_b;
        //Esto se hace porque es el primer ejercicio, para comprobar, pero NO SE HACE
        System.out.println ("Ejecutado constructor 2 parámetros");
    }
    
    // Métodos setter y getter
    public void set_a ( int valorPara_a )
    {
        a = valorPara_a;
    }
    public int get_a ()
    {
        return a;
    }
}
