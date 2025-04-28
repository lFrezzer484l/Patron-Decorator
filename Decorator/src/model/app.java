package model;
import Cuentas.ICuentaBancaria;
import Cuentas.CuentaAhorro;
import patronDiseño.BlindajeDecorador;
import model.Cuenta;


public class app {

        public static void main(String[] args){
            Cuenta c = new Cuenta(1,"UninPahu");
            
            ICuentaBancaria cuenta = new CuentaAhorro();
            ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
            
            cuentaBlindada.abrirCuenta(c);
        }
}
