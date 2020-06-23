
/**
 * Write a description of class Vehiculo here.
 * @author 1IFC303
 */
public class Vehiculo
{
    // Variables de instancia
    private String matricula;
    private String color;
    private int numeroderuedas;
    private int cilindrada;
    private int potencia;

    // Constructores

    // Constructor con dos parámetros: matrícula y color
    Vehiculo ( String matricula, String color )
    {
        this.matricula = matricula;
        this.color = color;
        // no inicializa el resto, ni con valores por defecto
    }
    
    // Constructor con parámetros (todas las variables)
    Vehiculo ( String matricula, String color, int numRuedas, int cilindrada, int potencia )
    {
        this.matricula = matricula;
        this.color = color;
        this.numeroderuedas = numRuedas;    // no hace falta el this, pero lo dejo por armonía
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }
    
    // Métodos setter y getter (no los hace todos)
    
    public void set_matricula ( String matricula )
    {
        this.matricula = matricula;
    }
    
    public void set_cilindrada ( int cilindrada )
    {
        this.cilindrada = cilindrada;
    }
    
    public String get_matricula ()
    {
        return matricula;
    }
    
    public int get_cilindrada ()
    {
        return cilindrada;
    }
    
    // Resto de métodos
    
    // Devuelve, en formato cadena, la información almacenada en todos los atributos
    public String toString ()
    {
        return "Matrícula: " + matricula + " Color: " + color + " Nº ruedas: " + numeroderuedas + " Cilindrada: " + cilindrada + " Potencia: " + potencia;
    }
}
