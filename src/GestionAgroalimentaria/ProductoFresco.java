/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionAgroalimentaria;

import java.io.*;
import java.util.ArrayList;

public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(nombreProducto, fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
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

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }

    public void guardarProductoEnArchivo() {
    try (FileWriter writer = new FileWriter("productosFrescos.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(bufferedWriter)) {
                out.println(this.toString());
            }catch (IOException e) {
                    e.printStackTrace();
            }
}

    public static ArrayList<ProductoFresco> cargarProductosDesdeArchivo() {
        ArrayList<ProductoFresco> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productosFrescos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String nombreProducto = parts[0].trim();
                String fechaCaducidad = parts[1].trim();
                String numeroLote = parts[2].trim();
                String fechaEnvasado = parts[3].trim();
                String paisOrigen = parts[4].trim();

                ProductoFresco producto = new ProductoFresco(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + fechaEnvasado + ", " + paisOrigen;
    }
}

