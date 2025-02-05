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
        int tipo_de_empleado;
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
                    System.out.print("Nombre: ");
                    nombre = entrada.nextLine();
                    System.out.print("ID: ");
                    id = entrada.nextInt();
                    System.out.println("Tipo de empleado (1. Por hora, 2. Por ventas, 3. Temporal): ");
                    tipo_de_empleado = entrada.nextInt();

                    switch (tipo_de_empleado) {
                        case 1:
                            System.out.print("Tarifa por hora: ");
                            double tarifa = entrada.nextDouble();
                            System.out.print("Horas trabajadas: ");
                            int horas = entrada.nextInt();
                            empleados.add(new EmpleadoPorHora(id, nombre, tarifa, horas));
                            break;
                        case 2:
                            System.out.print("Ventas realizadas: ");
                            int ventas = entrada.nextInt();
                            System.out.print("Porcentaje de comisión: ");
                            double comision = entrada.nextDouble();
                            empleados.add(new EmpleadoPorVentas(id, nombre, ventas, comision));
                            break;
                        case 3:
                            System.out.print("Salario fijo: ");
                            double salario = entrada.nextDouble();
                            empleados.add(new EmpleadoTemporal(id, nombre, salario));
                            break;
                        default:
                            System.out.println("Tipo de empleado inválido.");
                    }
                    break;
                case 2:
                    for(Empleado empleado : empleados) {
                        empleado.toString();
                    }
                    break;
                case 3:
                    System.out.print("ID del empleado: ");
                    id = entrada.nextInt();
                    System.out.print("Horas adicionales: ");
                    int horas = entrada.nextInt();
           

                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i) instanceof EmpleadoPorHora) {
                            if (empleados.get(i).id ==id) {
                                EmpleadoPorHora temp = (EmpleadoPorHora) empleados.get(i) ;
                                temp.agregarHoras(horas);
                            }
                            System.out.println("Agregando horas");
                        }
                    }
                    System.out.println("Empleado no encontrado o no es del tipo adecuado.");
                    break;
                case 4:
                    for (Empleado e : empleados) {
                        double totalPago = e.calcularSalario() + e.calcularBonificacion();
                        System.out.println("ID: " + e.id + " | Nombre: " + e.nombre + " | Pago Total: " + totalPago);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5 || opcion < 1);
    }
}
