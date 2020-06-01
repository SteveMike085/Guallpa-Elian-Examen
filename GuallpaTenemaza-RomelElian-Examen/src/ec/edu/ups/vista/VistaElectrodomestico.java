/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.controlador.ControladorElectrodomestico;
import java.util.Scanner;
/**
 *
 * @author SteveMike
 */
public class VistaElectrodomestico {
    
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        ControladorElectrodomestico CE = new ControladorElectrodomestico();
        
        int op = 0;
        do {            
            System.out.println("        Manu");
            System.out.println("1. Ingresar Television");
            System.out.println("2. Ingresar Lavadora");
            System.out.println("3. Mostrar Lavadora");
            System.out.println("4. Mostrar Televisiones");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            op = t.nextInt();
            switch (op){
                case 1:
                    CE.registrarTelevison();
                    break;
                case 2:
                    CE.registrarLavadora();
                    break;
                case 3:
                    //CE.listarTelevison();
                    break;
                case 4:
                    //CE.listarLavadora();
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;
            }
        } while (op != 5);
    }
}
