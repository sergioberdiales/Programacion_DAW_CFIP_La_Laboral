
/**
 * Write a description of class Vivienda here.
 *
 */

public class Vivienda
{
    // Variables de instancia
    protected TipoVivienda tipo;
    protected int numHabitaciones;
    protected double m2;
    private double precio;//*******************************************
    protected String ciudad;
    protected String zona;

    // Constructores
   
    // Con parámetros
    Vivienda ( TipoVivienda tipo, int numHabitaciones, double m2, double precio, String ciudad, String zona )
    {
        this.tipo = tipo;
        this.numHabitaciones = numHabitaciones;
        this.m2 = m2;
        this.precio = precio;
        this.ciudad = ciudad;
        this.zona = zona;
    }

    // Métodos setter y getter - no los hago todos
    
    public void set_tipo ( TipoVivienda tipo )
    {
        this.tipo = tipo;
    }
    
    public TipoVivienda get_tipo ()
    {
        return tipo;
    }
    
    public double get_m2 ()
    {
        return m2;
    }
    
    public double get_precio ()
    {
        return precio;
    }
    
    // Resto de métodos
    
    public double comision ()
    {
        return 0.03 * precio;
    }
    
    public String toString()
    {
        return "tipo: " + tipo + 
               " Nº hab.: " + numHabitaciones + 
               " m2: " + m2 + 
               " precio: " + precio + 
               " ciudad: " + ciudad + 
               " zona: " + zona;
    }
}
