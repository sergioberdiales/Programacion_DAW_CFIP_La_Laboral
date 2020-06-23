
/**
 * Write a description of class Coche here.
 * 
 * @author 1IFC303 
 */
public class Coche extends Vehiculo
{
    // variables de instancia
    private int numerodepuertas;

    // Constructores
    
    Coche( String matricula, String color, int numPuertas )
    {
        super ( matricula, color );     // Reutilizamos el constructor de la superclase
        numerodepuertas = numPuertas;
    }

    Coche(  String matricula, String color, int numRuedas, int cilindrada, int potencia, int numPuertas )
    {
        super ( matricula, color, numRuedas, cilindrada, potencia  );
        numerodepuertas = numPuertas;
    }
    
    // Métodos setter y getter - sólo uno, el resto están heredados
    public void set_numerodepuertas ( int numPuertas )
    {
        numerodepuertas = numPuertas;
    }
    
    public int get_numerodepuertas ()
    {
        return numerodepuertas;
    }

    // Resto de métodos
    
    public String toString ()
    {
        String cadena;
        
        cadena = super.toString();
        cadena += " Nº puertas: " + numerodepuertas;
        
        return cadena;
    }
}
