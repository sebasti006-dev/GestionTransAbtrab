/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.gestiontransabtrab;

import ec.edu.espoch.gestiontransabtrab.object.Avion;
import ec.edu.espoch.gestiontransabtrab.object.Carro;
import ec.edu.espoch.gestiontransabtrab.object.Moto;


/**
 *
 * @author Sebas
 */
public class GestionTransAbtrab {

    public static void main(String[] args) {
       Carro carro= new Carro("Camioneta Mitsubishi L200", 3000);
       Avion avion= new Avion("Boing ", 22000);
       Moto moto=new Moto("Deportiva Dukati", 100);
       
    
        System.out.println("Nombre: " + carro.getTipoVehiculos());
        System.out.println("La capacidad maxima de carga: " + carro.getCapacidad() + " kg");
        carro.transportar();
        System.out.println("La velocidad es: " + carro.calcularDistancia(90) + " km");
      

        System.out.println("Nombre: " + moto.getTipoVehiculos());
        System.out.println("La capacidad maxima de carga: " + moto.getCapacidad()+ " kg");
        moto.transportar();
        System.out.println("La velocidad es: " + moto.calcularDistancia(60) + " km");
        System.out.println("La velocidad * tiempo es: " + moto.calcularDistancia(70, 1.8) + " km");
        System.out.println("La velocidad con constante es : " + moto.calcularDistancia(75, 1.5, 0.8) + " km");

        System.out.println("Nombre: " + avion.getTipoVehiculos());
        System.out.println("La capacidad maxima de carga: " + avion.getCapacidad()+ " kg");
        avion.transportar();
        System.out.println("La velocidad es: " + avion.calcularDistancia(800) + " km");
    
                
                    
                }
}
