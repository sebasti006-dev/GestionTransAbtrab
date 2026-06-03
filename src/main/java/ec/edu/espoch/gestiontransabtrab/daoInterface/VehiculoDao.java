/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.gestiontransabtrab.daoInterface;

import ec.edu.espoch.gestiontransabtrab.object.Vehiculo;

/**
 *
 * @author Sebas
 */
public interface VehiculoDao {

   public  void guardar(Vehiculo v);

    public  Vehiculo[] listar();

    Vehiculo buscar(int posicion);

    public void eliminar(int posicion);
}

