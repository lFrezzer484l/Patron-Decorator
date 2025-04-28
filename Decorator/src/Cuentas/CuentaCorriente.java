package Cuentas;
import Cuentas.ICuentaBancaria;
import model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria{
    @Override
    public void abrirCuenta(Cuenta c) {
            System.out.println("-----------------------");
            System.out.println("Se abrira cuenta Corriente");
            System.out.println("Cliente: " + c.getCliente());
            System.out.println("-----------------------");
    }
    
}
