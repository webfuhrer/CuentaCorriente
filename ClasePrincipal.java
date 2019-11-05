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
        int opcion=EntradaSalida.mostrarMenu();
        CuentaCorriente c=null;
        while(opcion!=7)
        {
            switch(opcion)
            {
                case 1:
                    c=EntradaSalida.pedirDatosCuenta();
                    break;
                case 2:
                    c.gastar();
                    break;
                case 3:
                    c.ingresar();
                    break;
                case 4:
                    int cantidad=EntradaSalida.pedirCantidad();
                    c.gastar(cantidad);
                    break;
                case 5:
                    int cantidad2=EntradaSalida.pedirCantidad();
                    c.ingresar(cantidad2);
                    break;    
                case 6:
                    System.out.println("Cuenta corriente: "+c);
                    break;    
            }
            opcion=EntradaSalida.mostrarMenu();
        }
        
    }
}
