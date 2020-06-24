
/**
 * Guarda horas, minutos y segundos, y realiza operaciones con ellos.
 */
public class Hora
{
    // Variables
    private int hh;         // horas
    private int mm;         // minutos
    private int ss;         // segundos

    /**
     * Constructores
     */
    
    // Inicialización de las variables a cero
   Hora()
    {
        hh = 0;
        mm = 0;
        ss = 0;
    }
    // Inicialización de las variables con un valor determinado
    Hora( int valorHoras, int valorMinutos, int valorSegundos )
    {
        if ( valorHoras>=0 && valorHoras<=23 )
            hh = valorHoras;
        else
            hh = 0;
        if ( valorMinutos>=0 && valorMinutos<=59 )
            mm = valorMinutos;
        else
            mm = 0;
        if ( valorSegundos>=0 && valorSegundos<=59 )
            ss = valorSegundos;
        else
            ss = 0;
    }

    /**
     * Métodos setter y getter
     */
    
    public void set_hh ( int valorHoras )
    {
        if ( valorHoras>=0 && valorHoras<=23 )
            hh = valorHoras;
        else
            hh = 0; 
    }
    public void set_mm ( int valorMinutos )
    {
        if ( valorMinutos>=0 && valorMinutos<=59 )
            mm = valorMinutos;
        else
            mm = 0;
    }
    
    public void set_ss ( int valorSegundos )
    {
        if ( valorSegundos>=0 && valorSegundos<=59 )
            ss = valorSegundos;
        else
            ss = 0;
    }
    
    public int get_hh ()
    {    
        return hh;
    }
    
     public int get_mm ()
    {    
        return mm;
    }
    
     public int get_ss ()
    {    
        return ss;
    }
    
     /**
     * Resto de métodos
     */
    
    public void verHora ()
    {
        System.out.println ( hh + ":" + mm + ":" + ss );
    }
    
    public void copiar ( Hora horaOriginal )
    {
        this.ss = horaOriginal.ss;
        this.mm = horaOriginal.mm;
        this.hh = horaOriginal.hh;
    }
    
    public static Hora copiar2 ( Hora horaOriginal ) // método de clase
    {
        Hora temp=new Hora();
        temp.ss = horaOriginal.ss;
        temp.mm = horaOriginal.mm;
        temp.hh = horaOriginal.hh;
        
        return temp;
    }
    
   
    public static Hora suma ( Hora t1, Hora t2 )
    {
        Hora temp = new Hora();
        
        temp.ss = t1.ss + t2.ss;
        temp.mm = t1.mm + t2.mm;
        temp.hh = t1.hh + t2.hh;
        
        if ( temp.ss > 59 )
        {
            temp.ss = temp.ss - 60;
            temp.mm++;
        }
        if ( temp.mm > 59 )
        {
            temp.mm = temp.mm - 60;
            temp.hh++;
        }
        if ( temp.hh > 23 )
            temp.hh = temp.hh - 24;
            
        return temp;
    }
  /*
    // Otra forma de hacer el método "suma" 
    public void suma ( Hora hora1, Hora hora2 )
    {
        ss = hora1.ss + hora2.ss;
        mm = hora1.mm + hora2.mm;
        hh = hora1.hh + hora2.hh;
        
        if ( ss > 59 )
        {
            ss -= 60;
            mm ++;
        }
        if ( mm > 59 )
        {
            mm -= 60;
            hh ++;
        }
        if ( hh > 23 )
            hh -= 24;
    }*/
    
    public static Hora suma ( Hora t1, Hora t2, Hora t3 )
    {
        Hora temp = new Hora();
        
        temp.ss = t1.ss + t2.ss + t3.ss;
        temp.mm = t1.mm + t2.mm + t3.mm;
        temp.hh = t1.hh + t2.hh + t3.hh;
        
        while ( temp.ss > 59 )
        {
            temp.ss = temp.ss - 60;
            temp.mm++;
        }
        while ( temp.mm > 59 )
        {
            temp.mm = temp.mm - 60;
            temp.hh++;
        }
        while ( temp.hh > 23 )
            temp.hh = temp.hh - 24;
            
        return temp;
    }



    public static boolean sonIguales ( Hora hora1, Hora hora2 )
    {
        boolean son_iguales = false;
        
        if ( hora1.hh==hora2.hh && hora1.mm==hora2.mm && hora1.ss==hora2.ss )
            son_iguales = true;
        
        return son_iguales;
    }
    
    
    public static boolean mayor_que ( Hora hora1, Hora hora2 )   // tambien se puede pasar todo a segundos
    {
        boolean esMayor = false;
        
        if ( hora1.hh>hora2.hh || ( hora1.hh==hora2.hh && hora1.mm>hora2.mm ) 
                               || ( hora1.hh==hora2.hh && hora1.mm==hora2.mm && hora1.ss>hora2.ss ) )
            esMayor = true;

        return esMayor;
    }
    
    // Ampliación del ejercicio
    
    public static int compara ( Hora hora1, Hora hora2 )
    {
        int resultado;
        
        if ( Hora.sonIguales(hora1, hora2) )
                 resultado = 0;
        else 
                if ( /*Hora.*/mayor_que(hora1, hora2) )
                        resultado = 1;
                else
                        resultado = -1;
            
        return resultado;
    }
    
    // sigue más abajo
    
      
    
    /*
    
    
    
    
    public static Hora suma ( Hora t1, Hora t2, Hora t3)
    {
        return (   suma( suma(t1,t2), t3 )  );
    }
    
    */
    
   
   
   
   
   
   
   
   
   
   
   
   
   
}
