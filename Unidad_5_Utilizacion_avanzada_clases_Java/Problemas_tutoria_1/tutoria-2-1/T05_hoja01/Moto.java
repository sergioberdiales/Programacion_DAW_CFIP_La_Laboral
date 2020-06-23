
/**
 * Write a description of class Moto here.
 * 
 */
public class Moto extends Vehiculo
{
    // Variables de instancia
    private int numerodeplazas;

    // Constructores
    
    Moto ( String matricula, String color, int numPlazas )
    {
        super ( matricula, color );     // Reutilizamos el constructor de la superclase
        numerodeplazas = numPlazas;
    }

    Moto(  String matricula, String color, int numRuedas, int cilindrada, int potencia, int numPlazas )
    {
        super ( matricula, color, numRuedas, cilindrada, potencia  );
        numerodeplazas = numPlazas;
    }
    
    // Métodos setter y getter - sólo uno, el resto están heredados
    public void set_numerodeplazas ( int numPlazas )
    {
        numerodeplazas = numPlazas;
    }
    
    public int get_numerodeplazas ()
    {
        return numerodeplazas;
    }
    
    // Resto de métodos
    
    public String toString ()
    {
        String cadena;
        
        cadena = super.toString();
        cadena += " Nº plazas: " + numerodeplazas;
        
        return cadena;
    }
}
