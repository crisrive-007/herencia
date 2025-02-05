/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author river
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> empleados = new ArrayList();
        
        Scanner entrada = new Scanner(System.in);
        
        int id;
        String nombre;
        String tipo_de_empleado;
        int opcion;
        int opcion_empleado;
        
        do {
            System.out.println("1. Agregar empleados");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Asignar horas de trabajo");
            System.out.println("4. Pagar empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Seleccione una opción: ");
                        System.out.println("1. Agregar empleados");
                        System.out.println("2. Mostrar empleados");
                        System.out.println("3. Asignar horas de trabajo");
                        System.out.println("4. Pagar empleados");
                        System.out.println("5. Salir");
                        opcion_empleado = entrada.nextInt();
                        entrada.nextLine();
                    } while (opcion_empleado != 5 || opcion_empleado < 1);
                    break;
                case 2:
                    mostrarEmpleados();
                    break;
                case 3:
                    asignarHorasTrabajo();
                    break;
                case 4:
                    pagarEmpleados();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5 || opcion < 1);
    }

    private static void mostrarEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void asignarHorasTrabajo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void pagarEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
