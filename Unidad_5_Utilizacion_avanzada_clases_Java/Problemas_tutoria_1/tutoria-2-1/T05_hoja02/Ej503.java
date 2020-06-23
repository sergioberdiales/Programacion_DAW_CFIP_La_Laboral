
/**
Construir un programa en Java con las siguientes clases aplicando herencia:
· Clase Cuerpo, con atributos de tipo float superficie y volumen, con el modificador de acceso
adecuado, y otro atributo enumerado “Color”. La clase debe ser abstracta. Definir un método
toString para obtener un String con todos los datos. Definir asimismo dos métodos abstractos, uno
para calcular la superficie y otro para calcular el volumen, “calcularSuperficie” y “calcularVolumen”.
Para la declaración del campo enumerado Color se usarán los siguientes valores:
      ROJO, VERDE, AZUL, ROSA, BLANCO, AMARILLO
· Clase Esfera, derivada de la clase Cuerpo, añadiendo el atributo “radio” (float). Debe incluir
también un constructor parametrizado para darle un valor al radio y al color. Sobre escribir el
método toString de la clase base para añadir el nuevo dato. Escribir los métodos setter y getter para
el nuevo atributo “radio”. Redefinir los métodos “calcularSuperficie” y “calcularVolumen” para
asignar a los atributos heredados. 
      Superficie de la esfera= 4*PI*radio2. 
      Volumen de la esfera=(4/3)*PI*radio3
· Clase Prisma, (de base cuadrada) derivada de la clase Cuerpo, añadiendo los atributos “ladoBase” y
“altura” (float). Debe incluir también un constructor parametrizado para darle a estos dos nuevos
atributos y al color. Sobre escribir el método toString de la clase base para añadir los nuevos datos.
Escribir los métodos setter y getter para los nuevos atributos. Redefinir los métodos
“calcularSuperficie” y “calcularVolumen” para asignar a los atributos heredados.
      Superficie del prisma= 4*lado*altura+ 2*lado*lado;
      Volumen del prisma= lado*lado*altura;
· Clase Cilindro, derivada de la clase Cuerpo, añadiendo los atributos “radioBase” y “altura” (float).
Debe incluir también un constructor parametrizado para darle a estos dos nuevos atributos y al
color. Sobre escribir el método toString de la clase base para añadir los nuevos datos. Escribir los
métodos setter y getter para los nuevos atributos. Redefinir los métodos “calcularSuperficie” y
“calcularVolumen” para asignar a los atributos heredados.
      Superficie del Cilindro= PI* 2*radioBase* (radioBase + altura);
      Volumen del Cilindro= PI* radioBase*radioBase*altura;
· Clase con función principal donde se declaren varios objetos de las diferentes clases, calculando
luego para ellos su volumen y superficie, para posteriormente ver todos los datos de los objetos
creados a través del método sobrescrito toString.
 * 
 */

import java.util.*;                   // Permite uso de librerías java

public class Ej503
{
    public static void main ( String[] args )
    {
        // Declaramos variables
        Esfera e1 = new Esfera ( 2, Color.ROJO );
        Prisma p1 = new Prisma ( 2, 5, Color.AZUL );
        Cilindro c1 = new Cilindro ( 2, 5, Color.VERDE );
        
        
        System.out. println ( "Esfera1.- " + e1.toString() );
        System.out. println ( "Prisma1.- " + p1.toString() );
        System.out. println ( "Cilindro1.- " + c1.toString() );
       
        System.out. println ();
        System.out. println ();
        // Calculamos superficies y volúmenes
        e1.calcularSuperficie();
        e1.calcularVolumen();
        p1.calcularSuperficie();
        p1.calcularVolumen();
        c1.calcularSuperficie();
        c1.calcularVolumen();
        
        // Mostramos la información por pantalla
        System.out. println ( "Esfera1.- " + e1.toString() );
        System.out. println ( "Prisma1.- " + p1.toString() );
        System.out. println ( "Cilindro1.- " + c1.toString() );
        
         System.out. println ();
        System.out. println ();
        
        c1.setRadioBase(8);
                      
        System.out. println ( "Cilindro.- " + c1.toString() );
        
         c1.calcularSuperficie();
        c1.calcularVolumen();
        
        
        System.out. println ( "Cilindro.- " + c1.toString() );
    }
}
