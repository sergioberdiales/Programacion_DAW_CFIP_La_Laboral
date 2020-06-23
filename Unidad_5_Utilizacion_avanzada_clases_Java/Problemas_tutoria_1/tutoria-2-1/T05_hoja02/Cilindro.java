
/**
 * Write a description of class Cilindro here
 */
public class Cilindro extends Cuerpo
{
    // Variables de instancia
    private float radioBase;
    private float altura;

    // Constructor
    Cilindro ( float radioBase, float altura, Color color )
    {
        this.radioBase = radioBase;
        this.altura = altura;
        this.color = color;
    }

    // Métodos setter y getter
    
    public void setRadioBase ( float radioBase )
    {
        this.radioBase = radioBase;
                    // this.calcularSuperficie();
    }
    
    public void setAltura ( float altura )
    {
        this.altura = altura;
    }
    
    public float getRadioBase ()
    {
        return radioBase;
    }
    
    public float getAltura ()
    {
        return altura;
    }
    
    // Resto de métodos
    
    public String toString()
    {
        return "Radio de la base: " + radioBase + " Altura: " + altura + super.toString();
    }
    
    public void calcularSuperficie()
    {
        superficie = (float)Math.PI * 2 * radioBase * ( radioBase + altura );
    }
    
    public void calcularVolumen()
    {
        volumen = (float)Math.PI * radioBase * radioBase * altura;
    }
}
