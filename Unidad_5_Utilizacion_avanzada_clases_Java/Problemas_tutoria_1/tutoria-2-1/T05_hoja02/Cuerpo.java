
/**
 * Abstract class Cuerpo - write a description of the class here
 */
public abstract class Cuerpo
{
    // Variables de instancia
    protected float superficie;
    protected float volumen;
    protected Color color;

    // Es una clase abstracta --> no hay constructores pues no se instancian objetos
    
    // Si quisiéramos permitir el acceso a alguna de estas variables desde clases
    // externas, debemos escribir aquí los métodos set y get correspondientes.
    // OJO, en este caso el método set de superficie y volumen no tiene sentido.
    
    // Resto de Métodos
    
    public String toString()
    {
        return " Superficie: " + superficie + " Volumen: " + volumen + " Color: " + color;
    }
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
}
