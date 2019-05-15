/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajebuilder;

import logica.abstractfactory.factories.CivilEngineerFactory;

/**
 *
 * @author Zocalo
 */
public class AdapterCivilEngieener extends PersonajeBuilder{
    
    private CivilEngineerFactory ingeniero1;
    
    public AdapterCivilEngieener(){
        super();
        this.ingeniero1 = new CivilEngineerFactory();
                
    }
    
    @Override
    public void construirRaza(String raza) {
        
        personaje.setRaza(raza);
    }

    @Override
    public void construirTipo(String arma) {
        this.ingeniero1.createAccessory();
        this.ingeniero1.createTool();
        this.ingeniero1.createVehicle();
        personaje.setTipo(arma);
    }
        

    @Override
    public void construirAtaque(String ataque) {
        personaje.setAtaque(ataque);
    }
    
}
