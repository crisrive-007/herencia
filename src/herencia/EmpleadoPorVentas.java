/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author river
 */
public class EmpleadoPorVentas extends Empleado{
    
    private int ventas;
    private double comision;
    
    public EmpleadoPorVentas(int id, String nombre, int ventas, double comision) {
        super(id, nombre);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return ventas * (comision/100);
    }
    
    @Override
    public double calcularBonificacion() {
        return calcularSalario() * 0.10;
    }
}
