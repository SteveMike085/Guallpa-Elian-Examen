/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.ups.edu.icontroladordao.iElectrodomesticoDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SteveMike
 */
public class ControladorElectrodomestico {

    Scanner t = new Scanner(System.in);
    
    VistaElectrodomestico vista;
    Electrodomestico modelo;
    iElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, iElectrodomesticoDAO dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }

    public ControladorElectrodomestico() {
    }
    
    public void registrarTelevison(){
        ArrayList<String> television = new ArrayList<String>();
        System.out.print("Ingrese el codigo: ");
        modelo.setCodigo(t.nextInt());
        System.out.print("Ingrese la descripcion: ");
        modelo.setDescripcion(t.next());
        System.out.print("Ingrese el precio: ");
        modelo.setPreciobase(t.nextDouble());
        System.out.print("Ingrese el Color: ");
        modelo.setColor(t.next());
        System.out.print("Ingrese el consumo: ");
        modelo.setConsumoe(t.next());
        System.out.print("Ingrese el peso: ");
        modelo.setPeso(t.nextInt());
    }
    
    public void registrarLavadora(){
        ArrayList<String> lavadora = new ArrayList<String>();
        System.out.print("Ingrese el codigo: ");
        modelo.setCodigo(t.nextInt());
        System.out.print("Ingrese la descripcion: ");
        modelo.setDescripcion(t.next());
        System.out.print("Ingrese el precio: ");
        modelo.setPreciobase(t.nextDouble());
        System.out.print("Ingrese el Color: ");
        modelo.setColor(t.next());
        System.out.print("Ingrese el peso: ");
        modelo.setPeso(t.nextInt());
    }
    
    public void listarTelevison(ArrayList<String> television){
        System.out.println(television);
    }
    
    public void listarLavadora(ArrayList<String> lavadora){
        System.out.println(lavadora);
    }
}
