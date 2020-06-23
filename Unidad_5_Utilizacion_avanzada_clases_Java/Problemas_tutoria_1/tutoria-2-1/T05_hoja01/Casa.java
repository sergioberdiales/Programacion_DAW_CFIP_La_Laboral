
/**
 * Write a description of class Casa here.
 * 
 */
public class Casa extends Vivienda
{
    // Variables de instancia
    private double parcela;
    private boolean piscina;
    

    // Constructores
      
     Casa( TipoVivienda tipo, int numHabitaciones, double m2, double precio, String ciudad, String zona, double parcela, boolean piscina )
    {
        super( tipo, numHabitaciones, m2, precio, ciudad, zona );
        this.parcela = parcela;
        this.piscina = piscina;
    }
    
    // Métodos setter y getter para las nuevas variables
    
    public void set_parcela ( double parcela )
    {
        this.parcela = parcela;
    }
    
    public void set_piscina ( boolean piscina )
    {
        this.piscina = piscina;
    }
    
    public double get_parcela ()
    {
        return parcela;
    }
    
    public boolean get_piscina ()
    {
        return piscina;
    }
    
    // Resto de métodos
    
    public String toString()
    {
        String cadena = super.toString();
        cadena += " Parcela: " + parcela + " Piscina: ";
        if ( piscina )
            cadena += "sí";
        else
            cadena += "no";
        cadena += " Comisión: " + comision();
        
        return cadena;
    }
}
