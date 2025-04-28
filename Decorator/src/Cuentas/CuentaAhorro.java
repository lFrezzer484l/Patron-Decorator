package Cuentas;
import model.Cuenta;
import Cuentas.ICuentaBancaria;


public class CuentaAhorro implements ICuentaBancaria {

    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("------------------------");
        System.out.println("Se Abrio una cuenta de ahorros");
        System.out.println("Cliente: " + c.getCliente());
        System.out.println("------------------------");
    }
        
}
