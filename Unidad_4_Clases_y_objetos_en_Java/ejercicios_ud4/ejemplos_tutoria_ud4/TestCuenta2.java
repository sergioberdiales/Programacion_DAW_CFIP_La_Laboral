
import java.util.*;   
public class TestCuenta2
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
       Scanner teclado=new Scanner(System.in);
        System.out.println ("introducir Titular : ");
        String titular = teclado.nextLine();
        CuentaBancaria cuenta1=new CuentaBancaria(titular);
        
        System.out.println ("introducir Titular : ");
        titular = teclado.nextLine();
        float saldo;
        System.out.println ("introducir saldo inicial : ");
        saldo=teclado.nextFloat();
        CuentaBancaria cuenta2=new CuentaBancaria(titular, saldo);
        System.out.println ();
        System.out.println ();
        imprimirCabecera();
        System.out.println (cuenta1.getTitular()+ "\t" + "\t" + cuenta1.getSaldo());
        System.out.println (cuenta2.getTitular()+ "\t" + "\t" + cuenta2.getSaldo());
        
        System.out.println ();
        System.out.println ();
        System.out.println ("introducir importe a ingresar en la cuenta 1 : ");
        float importe=teclado.nextFloat();
        cuenta1.realizarIngreso(importe);
        
        System.out.println ();
        System.out.println ();
        System.out.println ("introducir importe a reintegrar de la cuenta 2 : ");
        importe=teclado.nextFloat();
       while (importe>cuenta2.getSaldo())
       {
            System.out.println ("no dispone de saldo suficiente. su saldo disponible es "+ cuenta2.getSaldo());
              System.out.println ("introducir importe a reintegrar de la cuenta 2 : ");
              importe=teclado.nextFloat();
        }
        
        cuenta2.realizarReintegro(importe);
        
         
        imprimirCabecera();
        System.out.println (cuenta1.getTitular()+ "\t" + "\t" + cuenta1.getSaldo());
        System.out.println (cuenta2.getTitular()+ "\t" + "\t" + cuenta2.getSaldo());
        
               
        // saldo medio
        System.out.println ();
        System.out.println ();
        System.out.println ("el saldo medio de las dos cuentas es "+ (( cuenta1.getSaldo()+cuenta2.getSaldo() )/2  ) );
         
    }
       
}
