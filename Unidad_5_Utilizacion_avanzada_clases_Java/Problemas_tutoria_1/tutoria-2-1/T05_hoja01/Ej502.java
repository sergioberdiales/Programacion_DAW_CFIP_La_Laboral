
/**
 Construir las siguientes clases:
· Clase Vivienda, con atributos tipo (enumerado TipoVivienda), número de habitaciones (entero), metros
cuadrados (doble), precio (doble), ciudad (String) y zona (String). La clase debe tener dos constructores, uno
sin parámetros y otro parametrizado, para todos los atributos. Escribir algún método setter y getter para
alguno de los atributos. Definir un método toString para obtener un String con todos los datos. Definir
asimismo un método “comisión”, que nos devuelva el importe de la comisión por venta, que será el 3 por
ciento del precio de la vivienda.
· Clase Casa, derivada de la clase Vivienda, añadiendo los atributos privados “parcela” (doble) y “piscina”
(lógico). Debe incluir también un constructor parametrizado que use el constructor de la clase base y también
los datos para los nuevos atributos de esta clase. Sobre escribir el método toString de la clase base para
añadir los nuevos datos.
· Clase Piso, derivada de la clase Vivienda, añadiendo los atributos privados “comunidad”, tipo doble, y
“exterior”, que será de tipo lógico. Debe incluir también un constructor parametrizado que use el constructor
de la clase base y añada valores para los nuevos atributos. Sobrescribir el método “comisión” de forma que si
los metros cuadrados del piso son menores o iguales que 100, la comisión sigue siendo la misma que en
Vivienda, pero si esos metros cuadrados son mayores que 100, la comisión será del 3.5 por ciento de precio.
· Clase con función principal donde se declaren varios objetos de la clase Piso y de la clase Casa utilizando
diferentes constructores, para posteriormente ver los datos de los objetos creados a través del método
sobrescrito toString, con las correspondientes comisiones.
· Para la declaración del campo enumerado TipoVivienda se usarán los siguientes valores:
Piso, dúplex, ático, casa, chalet, adosado, pareado.

 
 */

import java.util.*;         // Permite uso de librerías

public class Ej502
{
    public static void main ( String[] args )
    {
        // Declaración de variables
        Scanner teclado = new Scanner ( System.in );    // Permite entrada de datos por teclado
        Casa casa1;
        Piso piso1;
        //TipoVivienda tipo;  // NO SE PUEDE PEDIR POR TECLADO
        int numHab;
        double m2, precio, parcela, comunidad;
        String ciudad, zona;
        boolean piscina, exterior;
        int decision;
        
        // Construimos los objetos
       
        
       /* 
        System.out.print ( "Dime número de habitaciones: " );
        numHab = teclado.nextInt();
        System.out.print ( "Dime los metros cuadrados: " );
        m2 = teclado.nextDouble();
        System.out.print ( "Dime el precio: " );
        precio = teclado.nextDouble();
        System.out.print ( "¿Qué ciudad es? " );
        ciudad = teclado.next();
        System.out.print ( "¿En qué zona está? " );
        zona = teclado.next();
        System.out.print ( "Dime el nº de parcela: " );
        parcela = teclado.nextDouble();
        System.out.print ( "Dime el nº de comunidad: " );
        comunidad = teclado.nextDouble();
        System.out.print ( "¿La casa tiene piscina? (0:No ; 1:Sí) " );
        decision = teclado.nextInt();
        if ( decision==1 )
            piscina = true;
        else
            piscina = false;
        System.out.print ( "¿El piso es exterior? (0:No ; 1:Sí) " );
        decision = teclado.nextInt();
        if ( decision==1 )
            exterior = true;
        else
            exterior = false;
        */
       
       
       casa1 = new Casa( TipoVivienda.CHALET, 5, 100, 400000, "gijon", "bibio", 230, true );
        System.out.println ( "Datos casa1:" + casa1.toString() );
        piso1 = new Piso( TipoVivienda.DUPLEX, 4, 98, 350000, "gijón", "viesques", 200, true );
        System.out.println ( "Datos piso1:" + piso1.toString() );
    }
}
