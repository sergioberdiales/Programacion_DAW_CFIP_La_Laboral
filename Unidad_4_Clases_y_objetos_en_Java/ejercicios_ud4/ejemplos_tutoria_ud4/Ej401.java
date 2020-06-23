
/**
* 
1. Crear un programa con la clase “Miclase”, definiendo las funciones miembro set_A y get_A, para una
variable privada llamada “a” de tipo entero.
2. Modificar la clase de forma que se añada una variable pública “b”, también de tipo entero.
3. Declarar para la clase varios métodos constructores: uno sin parámetros, otro con un parámetro para
inicializar la variable “a”, y otro con dos parámetros para inicializar las dos variables “a y b” que componen
la clase. Comprobar su ejecución con instrucciones de salida por pantalla que luego serán eliminadas.
4. Declarar en el programa principal tres objetos, utilizando todos los constructores, asignando a la variable
privada “a” de la clase los valores 13, 16 y 28 mediante el constructor y mediante el método
correspondiente. Asignarle también un valor cualquiera la variable “b”. Mostrar posteriormente los
mismos a través del método “get_A”.
5. Comprobar en el programa principal que no se puede trabajar directamente con la variable privada de la
clase. Introducir como comentario en el programa el error que da el compilador.
6. Comprobar posteriormente que se puede trabajar con la variable pública sin usar una función miembro de
la clase.
 * 
 * @author 1FC303 
 * @version 18/01/2013
 */

public class Ej401
{
    public static void main ( )
    {
        Miclase obj1 = new Miclase();
        Miclase obj2 = new Miclase(16);
        Miclase obj3 = new Miclase(28,40);
        
        obj1.set_a(13);         // a es privada, accedo a ella a través del setter/getter
        obj2.b = 60;           // b es pública, accedo a ella directamente
       
        // La siguiente linea de código da error de compilación. 
        // Demuestra que a una variable privada no se puede acceder directamente.
        
        //obj2.a = 555;         // Descomentar para comprobarlo
        
        // Mostramos por pantalla los valores de las variables de todos los objetos
        System.out.println("Obj1: a=" + obj1.get_a() + ", b=" + obj1.b);
        System.out.println("Obj2: a=" + obj2.get_a() + ", b=" + obj2.b);
        System.out.println("Obj3: a=" + obj3.get_a() + ", b=" + obj3.b);
    }
}
