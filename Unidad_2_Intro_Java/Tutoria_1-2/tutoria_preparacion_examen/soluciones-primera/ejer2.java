
/**
 Realizar un  programa en Java que contenga una  función booleana que permita discernir si dos números (que serán enviados como parámetros) son amigos. 
 Dos números se dicen amigos cuando cada uno de ellos es igual a la suma de todos los divisores del otro,  excepto el mismo. 

Ejemplo:  	los números 220 (1+2+4+5+10+11+20+22+44+55+110=284)   y 284 (1+2+4+71+142=220)  son amigos. 

Hacer una función principal para comprobar la eficiencia de la función creada anteriormente, comprobando que los dos números introducidos son obligatoriamente positivos. 
 */
import java.util.*;

public class ejer2
{
    public static int lectura_dato()
    {
        Scanner teclado=new Scanner(System.in);       
        int dato;
        do{
            System.out.println("dame un numero");
            dato= teclado.nextInt();
        }while(dato<0);

        return dato;
    }

    public static long sumaDivisores (int num)
    {
        long sumaDivisores=0;
                
        for (int i=1;i<num/2 +1;i++)
        {
            if(num%i==0)
                sumaDivisores+=i;
                         
        }
    return sumaDivisores;    
    }
        
    public static boolean amigos(int num1,int num2)
    {
       long divisoresnum1=0;
       long divisoresnum2=0;
        
       divisoresnum1=sumaDivisores(num1);
        
        if (num2==divisoresnum1)
        {
               divisoresnum2=sumaDivisores(num2);
        }
        
        if(num1==divisoresnum2 && num2==divisoresnum1)  // se puede mejorar la eficiencia con el uso de &&
         
            return true;
        else
            return false;
               
    }
       
    public static void main ()
    {
       int numero1;
       int numero2;
        
       numero1=lectura_dato();
       numero2=lectura_dato();
        
      if (amigos(numero1,numero2))
            System.out.println("SON amigos" );
      else
            System.out.println("NO son amigos" );
    }

}
