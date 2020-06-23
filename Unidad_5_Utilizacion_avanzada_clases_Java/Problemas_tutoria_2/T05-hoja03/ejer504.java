
/**
 * Write a description of class ejer504
 * 
 * 2. Diseña una aplicación que defina 3 objetos:
- Un trabajado trabajador: Juan Granda; NSS=332020202
- Un empleado empleado: Dolores Pons; NSS=33209090; sueldo = 36000.0
- Un consultor consultor: Juan Granda; NSS=332020202; horas 10; tarifa/hora = 55.0
Y calcule el sueldo de cada uno de ellos, en aquellos objetos que se les pueda calcular.
Visualizar los datos de cada trabajador y su sueldo.
Comparar el trabajador con el empleado y el trabajador con el consultor.
 * 
 */
public class ejer504
{
    public static void main ()
    {
    
        Trabajador trab1 =new Trabajador ("Juan Granda " , "332020202");
        Empleado emple1 = new Empleado ("Dolores Pons " , "33209090" ,36000.0);
        Consultor consul1 = new Consultor ("Juan Granda " , "332020202", 10, 55.0);
    
        System.out.println( trab1);
        // no se puede calcular la paga de un trabajador por no existir el método calcularPaga()
        System.out.println( );
        System.out.println(emple1 );
        System.out.println("Sueldo  " + (Math.floor(emple1.calcularPaga()*100)/100 ));
        System.out.println( );
        System.out.println(consul1 );
        System.out.println("Sueldo   " + consul1.calcularPaga() );
        System.out.println( );
        // comprobación de objetos
        System.out.println( "comparando trabajador y empleado");
        System.out.println( trab1.equals (emple1));
        System.out.println( );
        System.out.println("comparando trabajador y consultor" );
        System.out.println(trab1.equals (consul1 ));
        System.out.println( );

              
    }
    

}
