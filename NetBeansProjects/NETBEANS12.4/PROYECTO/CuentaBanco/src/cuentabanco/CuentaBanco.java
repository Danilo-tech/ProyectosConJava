
package cuentabanco;


public class CuentaBanco {
    
    //--atributo
public static float a_CtaBan;
public CuentaBanco()
{
a_CtaBan=0;
}
//--devuelve el saldo actual de la cuenta
public static float obtenerSaldo()
{
return a_CtaBan;
}

//-- actualiza el valor de la cuenta
public static void actualizarSaldo(float nuevoSaldo)
{
a_CtaBan= nuevoSaldo;
}
    
}
