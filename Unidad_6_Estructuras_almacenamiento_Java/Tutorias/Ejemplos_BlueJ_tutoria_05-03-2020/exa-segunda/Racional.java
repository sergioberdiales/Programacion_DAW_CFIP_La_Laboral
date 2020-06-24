
/**
 * Clase de los números racionales (quebrados o fracciones)
 */

public class Racional
{
    // Atributos
    
    private int numerador;
    private int denominador;

    // Constructores
    
    Racional()
    {
        // Inicialización por defecto
        numerador = 0;
        denominador = 1;
    }
    
     Racional( int num, int den )
    {
        numerador = num;
        if (den == 0)
            denominador = 1;
        else
            denominador = den;
    }

    // Métodos setter y getter
    
    public void set_numerador ( int num )
    {
        numerador = num;
    }
    
    public void set_denominador ( int den )
    {
        if (den == 0)
            denominador = 1;
        else
            denominador = den;
    }
    
    public int get_numerador ()
    {
        return numerador;
    }
    
    public int get_denominador ()
    {
        return denominador;
    }
    
    // Resto de métodos
    
    public void verQuebrado()
    {
        // Lo normal es llevarlo a una cadena (String), pero todavía no lo hemos visto
        System.out.println ( numerador + " / " + denominador );
    }
    
    public static Racional suma ( Racional q1, Racional q2 )
    {
        Racional resultado = new Racional();
        
        resultado.numerador = q1.numerador*q2.denominador + q1.denominador*q2.numerador;
        resultado.denominador = q1.denominador*q2.denominador;
        resultado.simplifica();
        
        return resultado;
    }
    
    // Añadido: suma de tres fracciones
    public static Racional suma3 ( Racional q1, Racional q2, Racional q3 )
    {
        Racional sumaIntermedia = new Racional();
        Racional resultado = new Racional();
        
        sumaIntermedia = suma ( q1, q2 );
        resultado = suma ( sumaIntermedia, q3 );
        resultado.simplifica();
        
        return resultado;
        
        //return suma(suma(q1,q2),q3);
    }
    
    /*public static Racional suma ( Racional q1, Racional q2, Racional q3 )
    {
        Racional q4 = new Racional();
        q4 = q4.suma ( q1, q2 );
        q4=q4.suma(q4,q3);
        
        return q4;
        
    }*/
    
    public static Racional suma ( Racional q1, Racional q2, Racional q3 )
    {
        return (suma(suma(q1,q2),q3));
    }
    
        
    public static Racional resta ( Racional q1, Racional q2 )
    {
        Racional resultado = new Racional();
        
        resultado.numerador = q1.numerador*q2.denominador - q1.denominador*q2.numerador;
        resultado.denominador = q1.denominador*q2.denominador;
        //resultado.simplifica();
        
        return resultado;
    }
    
    public static Racional multiplica ( Racional q1, Racional q2 )
    {
        Racional resultado = new Racional();
        
        resultado.numerador = q1.numerador * q2.numerador;
        resultado.denominador = q1.denominador * q2.denominador;
        resultado.simplifica();
        
        return resultado;
    }
    
    public static Racional divide ( Racional q1, Racional q2 )
    {
        Racional resultado = new Racional();
        
        if ( q2.numerador != 0 )
        {
            resultado.numerador = q1.numerador * q2.denominador;
            resultado.denominador = q1.denominador * q2.numerador;
            resultado.simplifica();
        }
        else    // indeterminación
        {
            resultado.numerador = 0;
            resultado.denominador = 1;
        }
        
        return resultado;
    }
    
    public static boolean igual ( Racional q1, Racional q2 )
    {
        boolean resultado=false;
        
        if ( q1.numerador*q2.denominador == q1.denominador*q2.numerador )
            resultado = true;
            
        return resultado;
    }
    
    public static boolean mayor_que ( Racional q1, Racional q2 )
    {
        boolean resultado=false;
        
        if ( resta(q1,q2).numerador > 0 )
            resultado = true;
            
        return resultado;
    }
    
    public static void copia ( Racional qCopia, Racional qOriginal )
    {
        qCopia.numerador = qOriginal.numerador;
        qCopia.denominador = qOriginal.denominador;
    }
    
    public void copia ( Racional qOriginal )
    {
       this.numerador =qOriginal.numerador;
       this.denominador= qOriginal.denominador;
        
    }
    
    
    
    
    public void simplifica ()
    {
        if ( numerador != 0 )
        {
            // El numerador puede ser negativo
            int mcdivisor = mcd ( Math.abs(numerador), Math.abs(denominador) );
        
            numerador /= mcdivisor;   // numerador= numerador / mcdivisor
            denominador /= mcdivisor;
        }
        // Si el numerador es cero, no hace nada
    }
         
    // Máximo Común Divisor de dos números enteros y positivos algoritmo de Euclides
    private int mcd ( int num1, int num2 )
    {
         int dividendo, divisor, resto;
            
         dividendo=Math.max (num1,num2);
         divisor = Math.min(num1,num2);
                  
       while( dividendo % divisor!=0)
       {
         	resto=dividendo%divisor;
        	dividendo= divisor;
        	divisor=resto;       
        
       }
       
       return divisor;
    }
} // fin clase Racional
