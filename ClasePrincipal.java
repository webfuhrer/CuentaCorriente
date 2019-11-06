/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocc;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        
        CuentaCorriente c=null;
        int opcion=EntradaSalida.mostrarMenu(c);
        while(opcion!=7)
        {
            switch(opcion)
            {
                case 1:
                    c=EntradaSalida.pedirDatosCuenta();
                    break;
                case 2:
                    if (c==null){break;}
                    c.gastar();
                    break;
                case 3:
                    if (c==null){break;}
                    c.ingresar();
                    break;
                case 4:
                    if (c==null){break;}
                    int cantidad=EntradaSalida.pedirCantidad();
                    c.gastar(cantidad);
                    break;
                case 5:
                    if (c==null){break;}
                    int cantidad2=EntradaSalida.pedirCantidad();
                    c.ingresar(cantidad2);
                    break;    
                case 6:
                    if (c==null){break;}
                    System.out.println("Cuenta corriente: "+c);
                    break;    
            }
            if (c==null)
            {
                System.out.println("No existe la cuenta aún");
            }
            opcion=EntradaSalida.mostrarMenu(c);
        }
        
    }
}
