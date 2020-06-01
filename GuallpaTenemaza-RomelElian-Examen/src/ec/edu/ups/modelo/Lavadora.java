/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author SteveMike
 */
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora(int codigo, int preciobase) {
        super(codigo);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public double obtenerPrecioFinal(int carga, int preciobase){
        double pf = 0;
        if (carga > 30) {
            pf = pf + 50;
        }
        return pf;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
}
