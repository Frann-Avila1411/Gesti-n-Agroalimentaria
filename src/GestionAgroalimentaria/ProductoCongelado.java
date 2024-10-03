/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionAgroalimentaria;

import java.io.FileWriter;
import java.io.IOException;


public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    public ProductoCongelado(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento) {
        super(nombreProducto, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }
    
    public void guardarProductoEnArchivo() {
        try (FileWriter writer = new FileWriter("productosCongelados.txt", true)) {
            writer.write(this.toString() + "\n");
        } catch (IOException e) {
        }
    }
    
     @Override
    public String toString() {
        return super.toString() + ", " + fechaEnvasado +  ", " + paisOrigen + ", " +temperaturaMantenimiento;
    }

}