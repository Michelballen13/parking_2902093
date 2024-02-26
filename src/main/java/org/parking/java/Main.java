package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
        //Sistema de gestion E/S
        // de vehiculos en un parking
        //1. dos carritos
        //Objetos (instancias)
        //1. Tipo de clase 
        //2. nombre del obejeto
        //3. asignacion y new 
        //4. constructor del obejto
        Vehiculo carrito1 = new Vehiculo ("ASD 789", TipoVehiculo.PARTICULAR);
        carrito1.placa = "ASD 789";
        carrito1.tipoVehiculo = TipoVehiculo .PARTICULAR;

        Vehiculo carrito2 = new Vehiculo ("ASF 321", TipoVehiculo.MOTO); 
        carrito2.placa = "ASF 321";
        carrito2.tipoVehiculo = TipoVehiculo .MOTO;

    //crear(instanciar) un cliente
    Cliente cliente1 = new Cliente();
    cliente1.nombre = "Michel";
    cliente1.apellidos =" Ballen Delgado";
    cliente1.numeroIdentificacion = 1031540738L;

    Cliente cliente2 = new Cliente();
    cliente2.nombre = "Kevin";
    cliente2.apellidos ="Paredes Quintero";
    cliente2.numeroIdentificacion = 1033700511L;

    
    //Invocar el metodo addVehicle
    cliente1.addVehicle(carrito1);
    cliente2.addVehicle(carrito2);
    cliente1.addVehicle("ESE 456", TipoVehiculo.CAMION);
    cliente2.addVehicle("WEE 756", TipoVehiculo.CAMIONETA);


    //recorrer la lista de vehiculos 
    //del cliente 
    for(Vehiculo vehiculo :cliente1.misVehiculos){
System.out.println(vehiculo.placa);  
System.out.println(vehiculo.tipoVehiculo);
System.out.println("--------");  }
    }
}
