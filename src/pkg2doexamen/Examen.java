/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2doexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionHabitaciones gestionHabitaciones = new GestionHabitaciones(); //Creamos el nuevo objeto 
        boolean continuar = true;

        while (continuar) { //Creamos un menu para solicitarle al usuario cual opcion desea 
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opcion:\n"
                    + "Todos los pisos son iguales\n"
                    + "1. Consultar habitaciones piso 1\n"
                    + "2. Consultar habitaciones piso 2\n"
                    + "3. Consultar habitaciones piso 3\n"
                    + "4. Consultar habitaciones piso 4\n"
                    + "5. Modificar estado de habitacion\n"
                    + "6. Salir"
            );

            switch (opcion) { //usamos un switch para llamar los metodos 1
                case "1":
                    gestionHabitaciones.consultarHabitacion1();
                    break;
                case "2":
                    gestionHabitaciones.consultarHabitacion2();
                    break;
                case "3":
                    gestionHabitaciones.consultarHabitacion3();
                    break;
                case "4":
                    gestionHabitaciones.consultarHabitacion4();
                    break;
                case "5":
                    gestionHabitaciones.modificarHabitacion();
                    break;
                case "6":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida Intente de nuevo.");
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema de gestion de habitaciones.");
    }
}
