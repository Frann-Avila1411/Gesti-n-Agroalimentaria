/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionAgroalimentaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ProductoCongeladoNitrógeno extends ProductoCongelado {
    private String metodoCongelacion;
    private int tiempoExposicion;

    public ProductoCongeladoNitrógeno(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento,
                                      String metodoCongelacion, int tiempoExposicion) {
        super(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(int tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public void guardarProductoEnArchivo() {
        try (FileWriter writer = new FileWriter("productosCongeladosNitrógeno.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(bufferedWriter)) {
                out.println(this.toString());
            }catch (IOException e) {
                    e.printStackTrace();
            }
        
    }
    
    public static ArrayList<ProductoCongeladoNitrógeno> cargarProductosDesdeArchivo() {
        ArrayList<ProductoCongeladoNitrógeno> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productosCongeladosNitrógeno.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String nombreProducto = parts[0].trim();
                String fechaCaducidad = parts[1].trim();
                String numeroLote = parts[2].trim();
                String fechaEnvasado = parts[3].trim();
                String paisOrigen = parts[4].trim();
                double temperaturaMantenimiento = Double.parseDouble(parts[5].trim());
                String metodoCongelacion = parts[6].trim();
                int tiempoExposicion = Integer.parseInt(parts[7].trim());
                

                ProductoCongeladoNitrógeno producto = new ProductoCongeladoNitrógeno(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento, metodoCongelacion, tiempoExposicion);
                productos.add(producto);
            }
            
            } catch (IOException e) {
        }
        return productos;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + metodoCongelacion + "," + tiempoExposicion;
    }
}
