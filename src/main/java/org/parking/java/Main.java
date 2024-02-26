package org.parking.java;



import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List; 

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


    //instanciar cupos:
    Cupo cupito1= new Cupo('A');
    Cupo cupito2 = new Cupo('B');

    LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);
    LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY,10,6,15,5); 

    Empleado empleado = new Empleado( "Juan" , "Pérez" , "3000.0");
    Pago pago1 = new Pago(fechaHoraInicio, 
                            fechaHoraFin, 
                            5000.0, 
                            cliente1.misVehiculos.get(0), 
                            cupito1,
                            empleado);
    Pago pago2 = new Pago(fechaHoraInicio, 
                            fechaHoraFin, 
                            10000.0, 
                            cliente1.misVehiculos.get(1), 
                            cupito2,
                            empleado);


    //añadir pagos a una lista de pagos 
 List<Pago> misPagos = new ArrayList<Pago>();
    misPagos.add(pago1);
    misPagos.add(pago2);

// Crear un nuevo empleado


    

    //recorrer los pagos para mostrar informacion
    for( Pago p: misPagos )
    
    
    {
//evidenciar:
//mostrar:
//  -placa del vehiculo
//  -valor pago
//  -fecha y hora de inicio
//  -fecha y hora de fin 
//  -cupo (nombre)
System.out.println("|Placa:" + p.vehiculo.placa  + "|");
System.out.println("|valor:" + p.valor + "|");
System.out.println("|fecha y hora entrada:" + p.fechaHoraInicio.toString() + "|");
System.out.println("|fecha y hora fin:" + p.fechaHoraFin.toString() + "|");
System.out.println("|cupo:" + p.cupo.nombre + "|");
System.out.println("|empleado" + p.empleado.codigo + "|");
    }
 
    }

} 
