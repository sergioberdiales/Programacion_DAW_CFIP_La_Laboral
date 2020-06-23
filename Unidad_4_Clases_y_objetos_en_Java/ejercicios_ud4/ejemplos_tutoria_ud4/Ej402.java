
/**
 * 
Crear una clase llamada “hora” que contenga en su parte privada tres variables enteras llamadas hh, mm y ss,
que representan las horas, los minutos y los segundos. Dicha clase tendrá además:
1) Un constructor sin parámetros para la clase de forma que se inicialicen las tres variables privadas a cero.
2) Otro constructor con parámetros para poder inicializar una hora con los valores que se quieran al declarar
un objeto. Si cualquiera de estos valores no fueran correctos (0-23 y 0-59), se les asignará el valor 0 a ese
único valor.
3) Método público llamado “verhora” para que nos muestre la hora que contiene un objeto, con la forma
23:59:59
4) Métodos “setter” y “getter” para una de las variables privadas, comprobando su rango de valores. Si no lo
cumple, asignar un cero
5) Crear un método llamado “suma” para realizar una suma de dos objetos de tipo hora. El resultado será
otro objeto de tipo hora con los valores correctos (0-23 y 0-59) de las variables privadas. Las horas que
excedan de 24 vuelven a comenzar en cero.
6) Crear un método para saber si dos objetos de la clase hora son iguales.
7) Crear un método para comparar dos objetos de la clase hora, llamado “mayor_que”, que devuelva true en
el caso que el primero sea mayor que el segundo y false en caso contrario.
8) Crear una función principal con varios objetos tipo hora inicializados convenientemente, utilizando ambos
constructores, y comprobar el funcionamiento de todos los apartados realizados.
 * 
 
 */
public class Ej402
{
    public static void main ( String[] args )
    {
        Hora horaPrimera = new Hora();
        Hora horaSegunda = new Hora(3,58,20);
        Hora horaTercera = new Hora(0,15,20);
        Hora horaCuarta = new Hora(12,55,10);
        Hora horaQuinta = new Hora(8,47,13);
        Hora horaSexta = new Hora(8,47,13);
        Hora horaSeptima= new Hora (23,59,59);
        Hora horaSuma = new Hora();
        boolean iguales, mayor;
        int comparacion;
        
        // comprobación de la SUMA
        System.out.println("hora tercera");
        horaTercera.verHora();
        System.out.println("hora CUARTA");
        horaCuarta.verHora();
        
                        // Es un método de clase, luego se llama desde la clase
        horaSuma = Hora.suma ( horaTercera, horaCuarta );
                        // El siguiente lo usaría si usase el método suma comentado
        // horaSuma.suma ( horaTercera, horaCuarta );
        
        System.out.println("hora suma");
        horaSuma.verHora();
        
        // suma de tres horas
        
        horaSuma = Hora.suma ( horaTercera, horaCuarta, horaQuinta);
                        // El siguiente lo usaría si usase el método suma comentado
        // horaSuma.suma ( horaTercera, horaCuarta );
        
        System.out.println("hora suma de tres");
        horaSuma.verHora();
        
        
        horaCuarta.copiar ( horaTercera );
        
        iguales = Hora.sonIguales ( horaTercera, horaCuarta );
        if ( iguales )
            System.out.println ( "Las horas son iguales" );
        else
            System.out.println ( "Las horas no son iguales" );
        
            
            
        System.out.println("hora septima");
        horaSeptima.verHora();
         
        System.out.println("hora sexta");
        horaSexta.verHora();   
        
        horaSexta= Hora.copiar2(horaSeptima); // con el método de clase
        // horaSexta.copiar(horaSeptima);
        System.out.println("hora nueva sexta");
        horaSexta.verHora();   
        
        iguales = Hora.sonIguales ( horaSeptima, horaSexta );
        if ( iguales )
            System.out.println ( "Las horas son iguales" );
        else
            System.out.println ( "Las horas no son iguales" );
            
            
            
        if ( horaTercera == horaCuarta )
            System.out.println ( "Las referencias son iguales" );
        else
            System.out.println ( "Las referencias no son iguales" );
            
            
            
            
            
            
        mayor = Hora.mayor_que ( horaTercera, horaCuarta );
        if ( mayor )
            System.out.println ( "La primera es mayor que la segunda" );
        else
            System.out.println ( "La primera no es mayor que la segunda" );
         
            
            
            
            
        horaQuinta = horaSexta;
        if ( horaQuinta == horaSexta )
            System.out.println ( "Las referencias son iguales" );
        else
            System.out.println ( "Las referencias no son iguales" );
        
            
            if ( Hora.sonIguales ( horaQuinta, horaSexta ) )
            System.out.println ( "Las horas son iguales" );
        else
            System.out.println ( "Las horas no son iguales" );
        
            
            
            
        comparacion = Hora.compara ( horaTercera, horaCuarta );
        System.out.println ( comparacion );
        
    }
}