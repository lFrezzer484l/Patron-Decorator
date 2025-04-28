package patronDiseño;
import Cuentas.ICuentaBancaria;
import model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador{
    
    public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }
    
    public void abrirCuenta(Cuenta c){
        cuentaDecorada.abrirCuenta(c);
        agregarBindaje(c);
    }

    private void agregarBindaje(Cuenta c) {
        System.out.println("Se agrego blindaje a la cuenta del cliente: " + c.getCliente());
    }
}
