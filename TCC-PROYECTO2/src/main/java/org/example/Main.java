package org.example;

import clases.Cliente;
import clases.Empanada;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion=100;
        Empanada empanada= new Empanada("Empanada luxury","papa",1500,5000);
        Cliente susana= new Cliente();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("***MENU***");
        System.out.println("1.Agregar Empanada: ");
        System.out.println("2.Ver la Empanada: ");
        System.out.println("3.Editar Precio Empanada: ");
        System.out.println("5.Salir");

        while (opcion!=5){
            System.out.println("Digite una opcion: ");
            opcion= entradaTeclado.nextInt();
            if(opcion==1){
                System.out.println("Ingrese su saldo disponible: ");
                susana.setSaldoDisponible(entradaTeclado.nextInt());

                if (susana.getSaldoDisponible()>5000){
                    System.out.println("Ingrediente de empanada: "+empanada.getIngrediente());
                    System.out.println("Valor de empanada: "+empanada.getPrecioVenta());
                    System.out.println("Ingrese la cantidad de empanadas: ");
                    empanada.setCantidad(entradaTeclado.nextInt());
                   if (empanada.calcularVenta()>susana.getSaldoDisponible()) {
                       System.out.println("No tienes dinero suficiente");
                       System.out.println("Ingresa una cantidad menor: ");
                       empanada.setCantidad(entradaTeclado.nextInt());
                   }else {
                       susana.setSaldoDisponible(susana.getSaldoDisponible()- empanada.calcularVenta());
                       System.out.println("Gracias por su compra.");
                       System.out.println("Su nuevo saldo es: "+susana.getSaldoDisponible());
                   }

                }else {
                    System.out.println("No tiene dinero");
                    break;
                }

            }else if(opcion==2){
                System.out.println("***"+empanada.getNombre()+"***");
                System.out.println("-Regimen Comun-");
                System.out.println(dtf.format(LocalDateTime.now()));
                System.out.println("Producto: Empanada de "+empanada.getIngrediente());
                System.out.println("Valor unitario: "+empanada.getPrecioVenta());
                System.out.println("Cantidad de empanadas compradas: "+empanada.getCantidad());
                System.out.println("El valor total: "+empanada.calcularVenta());
                System.out.println("***GRACIAS POR SU COMPRA***");

            }else if (opcion==3){

            }else if (opcion==5){
                break;
            }else{
                System.out.println("Digite una opcion valida: ");
            }
        }
    }
}