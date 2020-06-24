
/** ejercicio 1
 * 
 * Realizar un  programa en Java que introduzca por teclado una serie de números enteros positivos (obligatorio), que finalizará en cero. Este último número, el cero, no se debe procesar, ya que solamente es el testigo (indicador) de finalización. 
Al final, después de la introducción de ese número indeterminado de números, el algoritmo deberá mostrar los siguientes resultados sobre la serie de números introducida:
•	El número menor de la serie.
•	Cuantas veces se repite este número menor.
•	La media aritmética de todos los elementos de la serie.
•	Si hubo o no algún número mayor de 100 en la citada serie.

Por ejemplo:
Si la serie de número fuera la siguiente:
9 , 8 , 13 , 22, 55 , 9 , 3 , 5 , 88 , 116 , 16, 3 , 14 , 26, 3 , 4 , 7 , 3 , 0
Los resultados obtenidos deberían ser:
El número menor de la serie fue: 3
Se repitió 4 veces
La media de los números es 22,4444
Si hubo, al menos, un número mayor de 100 en la citada serie.
 
 */
import java.util.*;

public class ejer1

{    
     public static void main(String [] args){
        
      Scanner teclado = new Scanner(System.in);
     
       int numero, suma=0, numMenor, contMenor=0 ,contadorNumeros=0;
       
       do{            
            System.out.println("Introducir un número para empezar");
            numero= teclado.nextInt();
       }while(numero<0 ); 
     
       numMenor= numero;
       
       while(numero != 0)
       {
           contadorNumeros++; 
           suma = suma + numero;
           
           if( numero <= numMenor )
           {
               if (numero == numMenor)
                    contMenor++;
                else
               {     
                   numMenor = numero;
                   contMenor=1;
                }    
           }
           
           System.out.println();
           
           do{            
                    System.out.println("Introducir un número para continuar, 0 para finalizar");
                    numero= teclado.nextInt();
           }while( numero<0 ); 
       } // fin del while            
          
       
       
       if ( contadorNumeros > 1  )
       {
                System.out.println("suma:  "+ suma);
                System.out.println("contadorNumeros:  "+ contadorNumeros);
                System.out.println(" el número menor es :  "+ numMenor);
                System.out.println(" y se ha repetido  "+ numMenor+ "   veces");
                
                System.out.println("la media de los números es:  "+ (float)suma/contadorNumeros);
       }
       else
              System.out.println("no se ha podido calcular le media, no hay serie");
   }
 }

