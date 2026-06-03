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
   

    private Vehiculo[] vehiculos;
    private int contador;

    @Override
    public void guardar(Vehiculo v) {

        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
            System.out.println("Vehículo guardado correctamente.");
        } else {
            System.out.println("Arreglo lleno.");
        }
    }

    @Override
    public Vehiculo[] listar() {
        return vehiculos;
    }

    @Override
    public Vehiculo buscar(int posicion) {

        if (posicion >= 0 && posicion < contador) {
            return vehiculos[posicion];
        }

        return null;
    }

    @Override
    public void eliminar(int posicion) {

        if (posicion >= 0 && posicion < contador) {

            for (int i = posicion; i < contador - 1; i++) {
                vehiculos[i] = vehiculos[i + 1];
            }

            vehiculos[contador - 1] = null;
            contador--;

            System.out.println("Vehículo eliminado.");
        } else {
            System.out.println("Posición inválida.");
        }
    }
}

   
