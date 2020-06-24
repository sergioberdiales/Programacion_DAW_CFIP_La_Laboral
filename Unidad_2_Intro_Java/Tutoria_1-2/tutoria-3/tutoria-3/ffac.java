     
    // Función factorial, por recursividad
    static double ffactorialr ( int numero )
    {
        // Declaramos variables
        double respuesta;
        
        if ( numero == 0 )
            respuesta = 1;
        else
            respuesta = numero * ffactorialr( numero - 1 );
        
        return respuesta;
    }