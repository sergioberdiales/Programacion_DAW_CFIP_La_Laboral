
import java.util.*;   
public class TestCuenta1
{
    private static void imprimirCabecera ()
    {
        System.out.println ();
        System.out.println ();
        System.out.println ("DATOS DE LAS CUENTAS");
        System.out.println ("--------------------");
        System.out.println ("TITULAR \t SALDO");
        System.out.println ("-------------------");
    }
    
    public static void main()
    {
        CuentaBancaria c1=new CuentaBancaria("Rosario");            // con saldo cero
        CuentaBancaria c2=new CuentaBancaria("Carmen", 500);        // con saldo
        CuentaBancaria c3=new CuentaBancaria("Luis", 1000);
    
        // imprimir información de las cuentas
        imprimirCabecera();
        System.out.println (c1.getTitular()+ "\t" + "\t" + c1.getSaldo());
        System.out.println (c2.getTitular()+ "\t" + "\t" + c2.getSaldo());
        System.out.println (c3.getTitular()+ "\t" + "\t" + c3.getSaldo());
        
        // realizar movimientos de cuentas
        c1.realizarIngreso(100);
        c2.realizarReintegro(200);
        c3.realizarIngreso(300);
        c3.realizarReintegro(400);
        
        // imprimir información de las cuentas
        imprimirCabecera();
        System.out.println (c1.getTitular()+ "\t" + "\t" + c1.getSaldo());
        System.out.println(c2.getTitular()+ "\t" + "\t" + c2.getSaldo());
        System.out.println (c3.getTitular()+ "\t" + "\t" + c3.getSaldo());
        
        
        // saldo medio
        System.out.println ();
        System.out.println ();
        System.out.println ("el saldo medio de las tres cuentas es "+ (( c1.getSaldo()+c2.getSaldo()+c3.getSaldo() )/3  ) );
         
    }
       
}
