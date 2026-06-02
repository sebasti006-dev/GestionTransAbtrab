/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab;

/**
 *
 * @author Sebas
 */
 public class Carro extends Vehiculo{
    private int numRuedas;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
        this.numRuedas=4;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public void transportar() {
     System.out.println("El carro transporta productos por carretera de forma eficiente.");
    
   
        
    }
    
}
