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
    private String tipoMoto;

    public Moto(String tipoMoto, String marca, String modelo) {
        super(marca, modelo);
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    @Override
    public void transportar() {
        throw new UnsupportedOperationException("La moto transpota productos pequeños rapidamente en areas urbanas");
    }
    
    
}
