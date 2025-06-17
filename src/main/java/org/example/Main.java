package org.example;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String NombreVideojuego, NombreJefeProyecto, PlataformaPrincipal, MotorDedesarrollo;
        Double CostoPorHora, LicenciaSoftware, GastosAdiciones, CostoAdminstracion, CostoImprevisto, CostoTotal;
        byte horas;
        String NombreDelosGastosAdicionales;

        System.out.println("Escriba el nombre del videojuego");
        NombreVideojuego = scanner.nextLine();

        System.out.println("Escriba el nombre del jefe del proyecto");
        NombreJefeProyecto = scanner.nextLine();

        System.out.println("Seleccione la plataforma: PC, CONSOLAS, MOVIL, PS4, PS5, XBOX");
        PlataformaPrincipal = scanner.nextLine();

        System.out.println("Seleccione el motor de desarrollo: Unity, Unreal o Godot");
        MotorDedesarrollo = scanner.nextLine();

        System.out.println("Indique el costo por hora en valor numerico");
        CostoPorHora = scanner.nextDouble();

        System.out.println("Indique las horas");
        horas = scanner.nextByte();

        System.out.println("Indique el valor del precio de la licencia de software");
        LicenciaSoftware = scanner.nextDouble();
        double Subtotal;

        System.out.println("Indique cuanto es el valor de los gastos adicionales");
        GastosAdiciones = scanner.nextDouble();

        //Salidas

        LocalDate fechaActual = LocalDate.now();

        Double CostoHoras = horas * CostoPorHora;
        System.out.println("Nombre del videojuego: " +NombreVideojuego);

        System.out.println("Nombre del proyecto: " +NombreJefeProyecto);

   System.out.println("Plataforma: "+ PlataformaPrincipal);

        System.out.println("Motor: "+ MotorDedesarrollo);

        System.out.println("Costos de desarrollo: "+ CostoHoras);




         Subtotal = CostoHoras + LicenciaSoftware + GastosAdiciones;

        System.out.println("El subtotal es :"+ Subtotal);

        CostoAdminstracion = Subtotal * 0.10;
        CostoImprevisto = Subtotal * 0.05;

        System.out.println("Costos por administracion: "+ CostoAdminstracion);

        System.out.println("Costos por imprevistos: "+ CostoImprevisto);
        CostoTotal = Subtotal + CostoImprevisto + CostoAdminstracion;

        System.out.println("Costo total del proyecto: " + CostoTotal);

    }
}