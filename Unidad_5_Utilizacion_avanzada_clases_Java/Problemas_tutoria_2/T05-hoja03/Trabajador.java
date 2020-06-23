
/**
 * Write a description of class Trabajador here.
 */
public class Trabajador
{
   // Variables de instancia
    private String nombre;
    private String puesto;
    private String direccion;
    private String telefono;
    private String nss;
    
    Trabajador (String nombre, String nss)
    {
    
        this.nombre= nombre;
        this.nss= nss;
    
    }

   public boolean equals (Trabajador t)
   {
        return this.nss.equals(t.nss);
     
    }

    public String toString ()
    {
    
        return "Nombre : " + nombre + "NSS " + nss;
    
    }
    
    
}
