import java.util.Scanner;


public class Circunferencia
{
    public static void main(String[] args)
    {
        int radio;
        final double PI=3.1416;
        double longitud, area, volumen;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio");
        radio=teclado.nextInt();
        longitud=2*PI*radio;
        area=PI*radio*radio;
        volumen=4/3*PI*Math.pow(radio,3);
        System.out.println("Longitud: "+longitud);
        System.out.println("Area: "+area);
        System.out.println("Volumen: "+volumen);
    }
}