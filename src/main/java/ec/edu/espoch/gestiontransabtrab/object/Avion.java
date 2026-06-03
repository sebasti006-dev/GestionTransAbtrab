/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab.object;

/**
 *
 * @author Sebas
 */
public class Avion extends Vehiculo{

    public Avion(String tipoVehiculos, double capacidad) {
        super(tipoVehiculos, capacidad);
    }


    @Override
    public void transportar() {
        System.out.println("El avion transporta productos grandes o internacionales de forma rapida por aire"); 
    }
    
}
