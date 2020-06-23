
/** 
 Realizar un programa en lenguaje Java que leídos por teclado los 6 datos correspondientes a dos horas determinadas,
 lógicamente 3 datos de cada una, (formato horas, minutos, segundos) me visualice en pantalla el tiempo transcurrido entre ambas, 
 en el mismo formato, ósea, en horas, minutos y segundos también. Se debe obligar que los datos introducidos sean correctos. 
    
 */
import java.util.Scanner; //permite importar desde teclado

public class ejer3
{  
    public static void main (){
        int hh1,mm1,ss1,hh2,mm2,ss2, horas, minutos, segundos;
        int seg1, seg2, diferencia;
    
        Scanner Teclado=new Scanner(System.in); // variable para introducir desde teclado
               
       hh1=fLecturaDato("introduce datos de la primera hora",0,23);
       
         do
        {
            System.out.println("Introducir mm1");
            mm1=Teclado.nextInt(); 
        }while (mm1<0 || mm1>59);
        
        do
        {
            System.out.println("Introducir ss1");
            ss1=Teclado.nextInt(); 
        }while (ss1<0 || ss1>59);
        
         do
        {
            System.out.println("Introducir hh2");
            hh2=Teclado.nextInt(); 
        }while (hh2<0 || hh2>23); 
        
         do
        {
            System.out.println("Introducir mm2");
            mm2=Teclado.nextInt(); 
        }while (mm2<0 || mm2>59);
        
        do
        {
            System.out.println("Introducir ss2");
            ss2=Teclado.nextInt(); 
        }while (ss2<0 || ss2>59);
        
        
        seg1= hh1*3600+mm1*60+ss1;
        seg2= hh2*3600+mm2*60+ss2;
        
        if (seg1>seg2)
            diferencia=seg1-seg2;
        else
            diferencia=seg2-seg1;
            
        horas= diferencia/3600;
        diferencia= diferencia- horas*3600;
        
        minutos= diferencia/60;
        diferencia= diferencia- minutos*60;
        
        segundos=diferencia;     
        
         System.out.println("horas "+ horas);
         System.out.println("minutos "+ minutos);
         System.out.println("segundos "+ segundos);
        
   }  // fin de la función main
   
   
     public static int fLecturaDato(String mensaje, int limiteinferior, int limitesuperior) 
     {                                               // posibilidad de mandar la cadena de caracteres de mensaje
        Scanner teclado=new Scanner(System.in);       
        int dato;
        do{
            System.out.println(mensaje);
            dato= teclado.nextInt();
        }while( dato < limiteinferior || dato > limitesuperior);
    
        return dato;
    }
   
     
}
