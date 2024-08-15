/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2doexamen;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
class GestionHabitaciones {

    public String[][] habitaciones;
    public int contador; // Contador de habitaciones actuales

    public GestionHabitaciones() {
        habitaciones = new String[5][5]; // Inicia con un arreglo de tamano 5x5
        contador = 0; // Iniciamos un contador en cero 
        agregarHabitacionPrecargados1();  // Llamamos los metodos creados 
        agregarHabitacionPrecargados2();
        agregarHabitacionPrecargados3();
        agregarHabitacionPrecargados4();
    }

    public void consultarHabitacion1() {
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            // Imprimos los datos de la consulta 
            resultado += "NUMERO " + habitaciones[i][0]
                    + ", TIPO: " + habitaciones[i][1]
                    + ", ESTADO: " + habitaciones[i][2]
                    + ", PRECIO: " + habitaciones[i][3]
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void consultarHabitacion2() { //Realizamos la consulta igualmente 
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            // Cadena con la informacion de cada habitacion
            resultado += "NUMERO " + habitaciones[i][0]
                    + ", TIPO: " + habitaciones[i][1]
                    + ", ESTADO: " + habitaciones[i][2]
                    + ", PRECIO: " + habitaciones[i][3]
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void consultarHabitacion3() { //Realizamos la consulta igualmente 
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            // Cadena con la informacion de cada habitacion
            resultado += "NUMERO " + habitaciones[i][0]
                    + ", TIPO: " + habitaciones[i][1]
                    + ", ESTADO: " + habitaciones[i][2]
                    + ", PRECIO: " + habitaciones[i][3]
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void consultarHabitacion4() { //Realizamos la consulta igualmente 
        String resultado = "";
        for (int i = 0; i < contador; i++) {
            // Cadena con la informacion de cada habitacion
            resultado += "NUMERO " + habitaciones[i][0]
                    + ", TIPO: " + habitaciones[i][1]
                    + ", ESTADO: " + habitaciones[i][2]
                    + ", PRECIO: " + habitaciones[i][3]
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void modificarHabitacion() { //creamos metodos para modificar las habitaciones 
        String id = JOptionPane.showInputDialog("Ingrese el ID/numero de la habitacion a modificar:");
        for (int i = 0; i < contador; i++) {
            if (habitaciones[i][0].equals(id)) {
                String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la habitacion (libre/ocupada):");
                habitaciones[i][2] = nuevoEstado;
                JOptionPane.showMessageDialog(null, "Habitacion modificada correctamente.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Habitacion no encontrada.");
    }

    private void agregarHabitacionPrecargados1() { //Creamos metodos para la informacion preguardada 1 
        // Habitaciones precargadas 
        habitaciones[0] = new String[]{"1", "simple", "libre", "30$", "planta baja"};
        habitaciones[1] = new String[]{"2", "doble", "libre", "50$", "primer piso"};
        habitaciones[2] = new String[]{"3", "familiar", "libre", "90$", "segundo piso"};
        contador = 3;
    }

    private void agregarHabitacionPrecargados2() {//Creamos metodos para la informacion preguardada 2
        // Habitaciones precargadas 
        habitaciones[0] = new String[]{"1", "simple", "libre", "30$", "planta baja"};
        habitaciones[1] = new String[]{"2", "doble", "libre", "50$", "primer piso"};
        habitaciones[2] = new String[]{"3", "familiar", "libre", "90$", "segundo piso"};
        contador = 3;
    }

    private void agregarHabitacionPrecargados3() {//Creamos metodos para la informacion preguardada 3
        // Habitaciones precargadas 
        habitaciones[0] = new String[]{"1", "simple", "libre", "30$", "planta baja"};
        habitaciones[1] = new String[]{"2", "doble", "libre", "50$", "primer piso"};
        habitaciones[2] = new String[]{"3", "familiar", "libre", "90$", "segundo piso"};
        contador = 3;
    }

    public final void agregarHabitacionPrecargados4() {//Creamos metodos para la informacion preguardada4
        // Habitaciones precargadas
        habitaciones[0] = new String[]{"1", "simple", "libre", "30$", "planta baja"};
        habitaciones[1] = new String[]{"2", "doble", "libre", "50$", "primer piso"};
        habitaciones[2] = new String[]{"3", "familiar", "libre", "90$", "segundo piso"};
        contador = 3;
    }
}
