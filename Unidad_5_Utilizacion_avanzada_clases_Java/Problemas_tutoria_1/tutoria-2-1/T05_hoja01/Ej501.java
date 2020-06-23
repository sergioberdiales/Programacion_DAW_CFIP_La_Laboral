
/**
Construir las siguientes clases:
- Clase Vehículo, con atributos matricula, color, numeroderuedas, cilindrada y potencia. Los dos primeros serán
objetos String y los tres últimos serán enteros. La clase debe tener tres constructores parametrizados
diferentes y los correspondientes métodos setter y getter. Definir también un método toString para obtener
un String con todos los datos.
- Clase Coche, derivada de la clase Vehículo, añadiendo el atributo “numerodepuertas”, que será de tipo
entero. Debe incluir también dos nuevos constructores parametrizados, el método set y get para el nuevo
atributo y la sobrescritura del método toString de la clase base para añadir el dato del número de puertas.
- Clase Moto, derivada de la clase Vehículo, añadiendo el atributo “numerodeplazas”, que será de tipo entero.
Debe incluir también dos nuevos constructores parametrizados, el método set y get para el nuevo atributo y
la sobrescritura del método toString de la clase base para añadir el dato del número de plazas.
- Clase con función principal donde se declaren varios objetos de la clase Coche y de la clase Moto utilizando
diferentes constructores, para posteriormente ver los datos de los objetos creados a través del método
sobrescrito toString.

 */

import java.util.*;

public class Ej501
{
    public static void main ( String[] args )
    {
        // Declaramos variables
        Scanner teclado = new Scanner ( System.in ); // Permite entrada por teclado
        Coche miCocheNormal = new Coche("0000AAA", "blanco", 3);
        Coche miCocheBueno = new Coche("0001AAA", "blanco", 4, 2000, 140, 3);;
        Moto miMotoNormal = new Moto ("0003AAA", "azul", 1);
        Moto miMotoBuena = new Moto ("0004AAA", "azul", 2, 1000, 100, 2);
        String matricula;
        
        System.out.println ( "Características de mi coche normal:" ); 
        System.out.println ( miCocheNormal.toString() );
        
        System.out.println();   // separador de líneas
        
        System.out.println ( "Características de mi coche bueno:" ); 
        System.out.println ( miCocheBueno.toString() );
        
        System.out.println();   // separador de líneas
        
        System.out.println ( "Características de mi moto normal:" ); 
        System.out.println ( miMotoNormal.toString() );
        
        System.out.println();   // separador de líneas
        
        System.out.println ( "Características de mi coche bueno:" ); 
        System.out.println ( miMotoBuena.toString() );
        
        System.out.println();   // separador de líneas
        
        System.out.print ( "Introduce un nuevo valor de matrícula: " );
        matricula = teclado.next();
        System.out.println ( "Cambio el número de puertas a 5 " );
        miCocheNormal.set_matricula ( matricula );
        miCocheNormal.set_numerodepuertas ( 5 );
        System.out.println ( "Nuevas características de mi coche normal:" ); 
        System.out.println ( miCocheNormal.toString() );
        
        System.out.println();   // separador de líneas
        System.out.println();   // separador de líneas
        
        Vehiculo mio=new Vehiculo("MMMMMM","verde",5,5,5);
         System.out.println ( mio.toString() );
    }
}
