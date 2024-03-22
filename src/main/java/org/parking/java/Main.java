package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
       //Sistema de gestion de E/S
       //de vehiculos en un parking
       //1. dos carritos:
       //Objetos(instancias)
       //1.Tipo de clase
       //2.nombre del objeto
       //3.asignacion y new
       //4.constructor del objeto
       Vehiculo carrito1 = new Vehiculo("ASD 854", TipoVehiculo.PARTICULAR);

       Vehiculo carrito2 = new Vehiculo("ASD 457", TipoVehiculo.CAMION);

       //crear(instanciar)un cliente
       Cliente cliente1 = new Cliente("michel", "ballen", 1033700511L);
       //invocar el metodo addCar
       cliente1.addVehicle(carrito1);
       cliente1.addVehicle(carrito2);
       cliente1.addVehicle("ASD 587", TipoVehiculo.MOTO);
       //recorrer la lista de vehiculos del cliente
       for(Vehiculo veh :cliente1.misVehiculos){
            System.out.println(veh.placa);
            System.out.println(veh.tipoVehiculo);
            System.out.println("------------");
       }

    }
}