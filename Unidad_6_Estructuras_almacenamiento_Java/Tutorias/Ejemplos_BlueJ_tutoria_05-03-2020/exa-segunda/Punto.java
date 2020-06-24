
public class Punto
{
    // Declaración de variables
    private int xx; //coordenada abcisa
    private int yy; //coordenada ordenada

    //A) constructor sin parámetros
    public Punto(){
        //inicializamos las variables
        xx = 0;
        yy = 0;
    }

    //B) constructor con dos parámetros
    public Punto(int xx, int yy){
        //asignamos valores a las variables
        this.xx=xx;
        this.yy=yy;
    }

    //C) método verpunto
    public void verPunto(){
        //mostramos los valores
        System.out.println("("+xx+","+yy+")");
    }

    //D) métodos setter y getter

    //método set para xx
    public void setXX (int valorXX){
        xx=valorXX;
    }

    //método get para xx
    public int getXX (){
        return xx;
    }

    //método set para yy
    public void setYY (int valorYY){
        yy=valorYY;
    }

    //método get para xx
    public int getYY (){
        return yy;
    }

    //E) método suma para dos puntos
    public static Punto suma (Punto p1, Punto p2){
        //inicializamos el objeto Punto resultante
        Punto suma= new Punto();

        //sumamos los valores y los asignamos al nuevo Punto
        //sumamos las abcisas
        suma.xx = p1.xx+p2.xx;
        //sumamos las ordenadas
        suma.yy = p1.yy+p2.yy;

        //devolvemos el valor del nuevo Punto
        return suma;
    }

    //F) método suma para tres puntos
    public static Punto suma (Punto p1, Punto p2, Punto p3){
        
        return (suma(suma(p1,p2),p3));
    }

    //G) método para saber si dos puntos son iguales
    public static boolean es_igual (Punto p1, Punto p2){
        //inicializamos la variable
        boolean iguales = false;

        //comparamos los valores
        if (p1.xx==p2.xx & p1.yy==p2.yy)
            iguales = true;

        //devolvemos el resultado
        return iguales;
    }

    //H) método para calcular distancia al origen
    public double distanciaOrigen() {
        //cálculamos el resultado mediante la raiz cuadrada utilizando la función sqrt de la clase Math
        return Math.sqrt(xx * xx + yy * yy);
    }

    //J) método para saber si un punto es mayor
    public static boolean mayor_que (Punto p1, Punto p2){
        //inicializamos la variable
        boolean mayor = false;

        //comparamos los valores
        if (p1.distanciaOrigen() > p2.distanciaOrigen())
            mayor = true;

        //devolvemos el resultado
        return mayor;
    }

    //K) método para comparar dos puntos
    public static int comparar (Punto p1, Punto p2){
        //inicializamos la variable
        int compara;

        //realizamos la primera comparación utilizando el método es_igual
        if (es_igual(p1,p2))
            compara = 0;
        else
        
        //realizamos la segunda comparación mediante el método mayor_que
        if (mayor_que(p1,p2))
            compara = 1;
            
        //si no cumple ninguna de las otras condiciones, establecemos el valor en -1
        else 
            compara = -1;
            
        //devolvemos el resultado
        return compara;
    }

}
