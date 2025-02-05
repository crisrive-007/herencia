/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author river
 */
public abstract class Empleado {
    
    public int id;
    public String nombre;
    public int salario;
    
    public Empleado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.salario = 0;
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularSalario();
    
    public abstract double calcularBonificacion();
}
