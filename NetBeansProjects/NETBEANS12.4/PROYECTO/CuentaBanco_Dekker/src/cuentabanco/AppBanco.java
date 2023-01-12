package cuentabanco;

public class AppBanco {


    public static void main(String[] args)
    {
CuentaBanco cuenta= new CuentaBanco();
Movimiento abono = new Movimiento(cuenta, 500,400);
Movimiento cargo = new Movimiento(cuenta, -300,300);
abono.start();
cargo.start();
try
{
abono.join();
cargo.join();
}
catch(InterruptedException e)
{
}
System.out.println("Saldo = "+cuenta.obtenerSaldo());
}

    }
    

