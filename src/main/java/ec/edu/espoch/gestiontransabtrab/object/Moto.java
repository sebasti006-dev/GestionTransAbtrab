/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab.object;

/**
 *
 * @author Sebas
 */
public class Moto extends Vehiculo {

    public Moto(String tipoVehiculos, double capacidad) {
        super(tipoVehiculos, capacidad);
    }

    @Override
    public void transportar() {
        System.out.println("La moto transpota productos pequeños rapidamente en areas urbanas");
    }
    
    
}
