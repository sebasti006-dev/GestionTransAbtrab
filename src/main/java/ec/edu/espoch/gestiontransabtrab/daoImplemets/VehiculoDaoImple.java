/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab.daoImplemets;

import ec.edu.espoch.gestiontransabtrab.object.Vehiculo;
import ec.edu.espoch.gestiontransabtrab.daoInterface.VehiculoDao;

/**
 *
 * @author Sebas
 */
public class VehiculoDaoImple implements VehiculoDao {

    public void mostrarDatos(Vehiculo vehiculo){
          System.out.println("Nombre: " + vehiculo.getTipoVehiculos());
        System.out.println("Capacidad maxima de carga: " + vehiculo.getCapacidad() + " kg");
        vehiculo.transportar();
        
    }

    public void mostrarDistancias(Vehiculo vehiculo, double velocidad, double tiempo, double capacidad){
        System.out.println("La  velocidad: " + vehiculo.calcularDistancia(velocidad) + " km");

        System.out.println("Distancia con velocidad y tiempo: "+ vehiculo.calcularDistancia(velocidad, tiempo) + " km");

        System.out.println("Distancia con constante: " + vehiculo.calcularDistancia(velocidad, tiempo, capacidad) + " km");
    }
}


   
