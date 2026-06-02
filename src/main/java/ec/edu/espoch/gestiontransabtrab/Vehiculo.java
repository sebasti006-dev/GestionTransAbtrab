/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab;

/**
 *
 * @author Sebas
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo; 

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
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
