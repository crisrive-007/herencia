/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author river
 */
public class EmpleadoTemporal extends Empleado{
    
    private double salarioFijo;

    public EmpleadoTemporal(int id, String nombre, double salarioFijo) {
        super(id, nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public double calcularBonificacion() {
        return 100;
    }
}
