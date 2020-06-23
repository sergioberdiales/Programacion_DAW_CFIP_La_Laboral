
/**
 * Write a description of class Esfera here
 */

public class Esfera extends Cuerpo
{
    // Variables de instancia
    private float radio;

    // Constructor
    Esfera ( float radio, Color color )
    {
        this.radio = radio;
        this.color = color;
    }
    
    // Métodos setter y getter
    
    public void setRadio ( float radio )
    {
        this.radio = radio;
    }
    
    public float getRadio ()
    {
        return radio;
    }
    
    // Resto de métodos
    
    public String toString()
    {
        return " Radio: " + radio + super.toString();
    }
    
    public void calcularSuperficie()
    {
        superficie = 4 * (float)Math.PI * (float)Math.pow(radio,2);
    }
    
    public void calcularVolumen()
    {
        volumen = (float)4/3 * (float)Math.PI * (float)Math.pow(radio,3);
    }
    
}
