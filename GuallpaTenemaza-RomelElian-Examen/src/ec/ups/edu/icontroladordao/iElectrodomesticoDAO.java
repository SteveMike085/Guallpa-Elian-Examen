/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.icontroladordao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;

/**
 *
 * @author SteveMike
 */
public interface iElectrodomesticoDAO {
    
    public void crearTelevision(Television television);
    
    public void crearLavadora(Lavadora lavadora);
    
    public void listarTelevision(Television television);
    
    public void listarLavadora(Television television);
    
}
