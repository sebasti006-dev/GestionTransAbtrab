/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab.object;

/**
 *
 * @author Sebas
 */
public abstract class Vehiculo {
    private String tipoVehiculos;
    private double capacidad; 

    public Vehiculo(String tipoVehiculos, double capacidad) {
        this.tipoVehiculos = tipoVehiculos;
        this.capacidad = capacidad;
    }

    public String getTipoVehiculos() {
        return tipoVehiculos;
    }

    public void setTipoVehiculos(String tipoVehiculos) {
        this.tipoVehiculos = tipoVehiculos;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    
  
    
public  double calcularDistancia( double velocidad){
      return velocidad * 1;
}
public  double calcularDistancia( double velocidad , double tiempo ){
    return velocidad *tiempo;
}
public  double calcularDistancia(double velocidad ,double tiempo,double eficiencia){
    return velocidad * tiempo * eficiencia; 
}
public abstract void transportar();
   
    
    
}
