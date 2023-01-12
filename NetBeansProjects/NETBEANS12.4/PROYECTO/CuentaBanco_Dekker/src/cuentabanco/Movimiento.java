/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabanco;

/**
 *
 * @author danil
 */
public class Movimiento extends Thread{
 float a_monto;
CuentaBanco a_cta;
int a_tiempo;

public Movimiento(CuentaBanco p_cta, float p_monto, int p_tiempo)
{
a_cta=p_cta;
a_monto=p_monto;
a_tiempo=p_tiempo;
}

public void run()
{
try
{
float saldo= a_cta.obtenerSaldo();//---obtiene saldo anterior
sleep(a_tiempo); //--la cajera cuenta el dinero
saldo=saldo+a_monto; //--obtiene nuevo saldo
a_cta.actualizarSaldo(saldo);
}
catch(InterruptedException e)
{
}
}
}
