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
public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean HDMI;

    public Television(int codigo, double preciobase) {
        super(codigo);
    }

    public Television() {
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isHDMI() {
        return HDMI;
    }

    public void setHDMI(boolean HDMI) {
        this.HDMI = HDMI;
    }
    
    public double obtenerPrecioFinal(int resolucion, boolean HDMI, double preciobase){
        double pfh = 0,pfr = 0; 
        double pb =0;
        if (HDMI = true) {
            pfh = pfh + 50;
        }
        if (resolucion > 40) {
            pb = ((preciobase * 100)/30);
            pfr = pfr + pb;
        }
        double pf = 0;
        pf = pfh + pfr;
        return pf;
    }
    
    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", HDMI=" + HDMI + '}';
    }
    
    
}
