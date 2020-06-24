
public class tarea21
{
    //Definición del Método principal
    public static void main (){

        // declaracion de objetos
        Punto p0= new Punto(); // declaramos el primer objeto inicializado a 0
        Punto p1= new Punto(1,1);
        Punto p2= new Punto(2,2);
        Punto p3= new Punto(3,3);
        Punto p4= new Punto(3,3);
        Punto pSuma = new Punto();
        boolean iguales, mayor;
        int comparacion;

        //mostramos los valores de prueba utilizando el método verPunto
        System.out.println ("Valores iniciales de prueba:");
        System.out.println ("P0: ");
        p0.verPunto();
        System.out.println ("P1: ");
        p1.verPunto();
        System.out.println ("P2: ");
        p2.verPunto();
        System.out.println ("P3: ");
        p3.verPunto();
        System.out.println ("P4: ");
        p4.verPunto();

        //comprobación del método verPunto
        System.out.println ("El valor de P2 es:");
        p2.verPunto();

        //comprobación del método suma de 2 puntos
        pSuma=Punto.suma (p2,p3);
        System.out.println ("El resultado de la suma de P2 y P3 es:");
        pSuma.verPunto();

        //comprobación del método suma de 3 puntos
        pSuma=Punto.suma (p1,p2,p3);
        System.out.println ("El resultado de la suma de P1, P2 y P3 es:");
        pSuma.verPunto();

        //comprobación del método son iguales
        System.out.println ("Comprobamos si P3 y P4 son iguales");
        iguales = Punto.es_igual (p3,p4);
        if (iguales)
            System.out.println ("Los puntos son iguales");
        else
            System.out.println ("Los puntos no son iguales");

        //cálculo de la distancia al origen
        System.out.println ("La distancia de P3 al origen es:"+p3.distanciaOrigen());

        //comparación de 2 puntos para determinar cual es mayor
        System.out.println ("Comparamos P2 y P3 para ver cual es mayor");
        mayor= Punto.mayor_que (p2,p3);
        if (mayor)
            System.out.println ("p2 es mayor que p3");
        else
            System.out.println ("p2 es menor que p3");

        //comparación de 2 puntos
        System.out.println ("Comparamos P3 y P4, mostrando 1 si P3 es mayor, 0 si son iguales y -1 si P4 es mayor");
        comparacion= Punto.comparar (p3,p4);
        System.out.println ("Resultado de comparar P3 y P4: "+comparacion);

    }
}