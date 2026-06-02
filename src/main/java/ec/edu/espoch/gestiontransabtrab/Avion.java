/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab;

/**
 *
 * @author Sebas
 */
public class Avion extends Vehiculo{
    private int numMotores; 

    public Avion(int numMotores, String marca, String modelo) {
        super(marca, modelo);
        this.numMotores = numMotores;
    }

    public int getNumMotores() {
        return numMotores;
    }

    @Override
    public void transportar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
