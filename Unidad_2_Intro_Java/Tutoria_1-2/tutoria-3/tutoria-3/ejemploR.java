public class ejemploR
{
    static void frecursiva (int i ) // función recursiva prototipo
    {
        if (i < 4) // condición de “finalización”
        {
            frecursiva (i+1); // llamada a la propia función desde la misma: recursividad
            System.out.println ( i );
        }
    } // fin de la función recursiva

    
    public static void main(String[] args)
    {
        frecursiva (10); // llamada desde la función principal a la función recursiva
    } // fin de la función principal
}