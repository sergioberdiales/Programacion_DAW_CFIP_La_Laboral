
public class CuentaBancaria
{
    private String titular;
    private float saldo;
    
    CuentaBancaria (String titular)
    {
        this.titular=titular;
        saldo=0;
    }
    
    
    CuentaBancaria(String titular, float saldo)
    {
        this.titular=titular;
        this.saldo=saldo;
    }
    
   
    public void setTitular (String titular)
    {
        this.titular=titular;
    }
    
    public void setSaldo (float saldo)
    {
          this.saldo=saldo; 
    }
    
    public String getTitular()
    {
        return titular;
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    // realizar reintegro
    public void realizarReintegro(float cantidad)
    {
        saldo=saldo-cantidad;
    }
    // realizar ingreso
    public void realizarIngreso(float cantidad)
    {
        saldo=saldo+cantidad;
    }
    
}
