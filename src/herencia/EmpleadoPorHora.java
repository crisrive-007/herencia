/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author river
 */
public class EmpleadoPorHora extends Empleado{
    
    private double tarifa;
    private int horas;
    
    public EmpleadoPorHora(int id, String nombre, double tarifa, int horas) {
        super(id, nombre);
        this.tarifa = tarifa;
        this.horas = horas;
    }
    
    @Override
    public double calcularSalario() {
        return tarifa * horas;
    }
    
    @Override
    public double calcularBonificacion() {
        return calcularSalario() * 0.05;
    }
    
    public void agregarHoras(int horas) {
        this.horas += horas;
    }
}
