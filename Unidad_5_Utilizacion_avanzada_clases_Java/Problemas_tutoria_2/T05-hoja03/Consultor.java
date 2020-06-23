
public class Consultor extends Trabajador
{
    private int horas;
    private double tarifa;
    
    
    Consultor (String nombre, String nss , int horas , double tarifa)
    {
        super (nombre, nss);
        this.horas=horas;
        this.tarifa= tarifa;
    
    }

    public double calcularPaga ()
    {
    
        return (horas*tarifa) ;
    }

    public String toString()
    {
    
        return "Consultor : " + super.toString();
    }
      
    
}