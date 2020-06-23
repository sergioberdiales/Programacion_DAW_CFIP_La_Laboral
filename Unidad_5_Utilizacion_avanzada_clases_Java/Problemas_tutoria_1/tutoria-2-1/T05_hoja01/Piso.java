
/**
 * Write a description of class Piso here.
 * 
 */
public class Piso extends Vivienda
{
    // Variables de instancia
    private double comunidad;
    private boolean exterior;

    // Constructores
    
    

    // Con parámetros
    Piso (TipoVivienda tipo, int numHabitaciones, double m2, double precio, String ciudad, String zona, double comunidad, boolean exterior )
    {
        super( tipo, numHabitaciones, m2, precio, ciudad, zona );
        this.comunidad = comunidad;
        this.exterior = exterior;
    }
    
    // Métodos setter y getter para las nuevas variables
    
    public void set_comunidad ( double comunidad )
    {
        this.comunidad = comunidad;
    }
    
    public void set_exterior ( boolean exterior )
    {
        this.exterior = exterior;
    }
    
    public double get_comunidad ()
    {
        return comunidad;
    }
    
    public boolean get_exterior ()
    {
        return exterior;
    }
    
    // Resto de métodos
    
    public double comision ()
    {
        double com;
        
        if ( m2 <= 100 )    // Podemos acceder directamente porque es protected y no private
            com = super.comision();
        else
            com = 0.035 * this.get_precio();
        com = Math.floor(com * 100) / 100;  // Trunca en el segundo decimal
        
        return com;
    }
    
    public String toString()
    {
        String cadena = super.toString();
        
        cadena += " Comunidad: " + comunidad + " Exterior: ";
        if ( exterior)
            cadena += "sí";
        else
            cadena += "no";
        cadena += " Comisión: " + comision();
        
        return cadena;
    }
}
