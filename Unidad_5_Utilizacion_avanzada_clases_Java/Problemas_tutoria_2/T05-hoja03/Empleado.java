
public class Empleado extends Trabajador
{
    private double sueldo;
    private double impuesto;
    private final int PAGAS = 14;
    
    Empleado (String nombre, String nss , double sueldo)
    {
        super (nombre, nss);
        this.sueldo=sueldo;
        this.impuesto= 0.19*sueldo;
    
    }

    public double calcularPaga ()
    {
    
        return (sueldo - impuesto)/ PAGAS ;
    }

    public String toString()
    {
    
        return "Empleado : " + super.toString();
    }
    
    
    
}
