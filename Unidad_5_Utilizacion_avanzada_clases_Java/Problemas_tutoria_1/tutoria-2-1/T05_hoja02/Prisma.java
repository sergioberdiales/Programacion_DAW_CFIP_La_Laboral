
/**
 * Write a description of class Prisma here
 */
public class Prisma extends Cuerpo
{
    // Variables de instancia
    private float ladoBase;
    private float altura;

    // Constructor
    Prisma ( float ladoBase, float altura, Color color)
    {
        this.ladoBase = ladoBase;
        this.altura = altura;
        this.color = color;
    }

    // Métodos setter y getter
    
    public void setLadoBase ( float ladoBase )
    {
        this.ladoBase = ladoBase;
    }
    
    public void setAltura ( float altura )
    {
        this.altura = altura;
    }
    
    public float getLadoBase ()
    {
        return ladoBase;
    }
    
    public float getAltura ()
    {
        return altura;
    }
    
    // Resto de métodos
    
    public String toString()
    {
        return "Lado de la base: " + ladoBase + " Altura: " + altura + super.toString();
    }
    
    public void calcularSuperficie()
    {
        superficie = 4 * ladoBase * altura + 2 * ladoBase * ladoBase;
    }
    
    public void calcularVolumen()
    {
        volumen = ladoBase * ladoBase * altura;
    }
}
