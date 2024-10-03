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

public class ProductoCongeladoAgua extends ProductoCongelado {
    private double salinidadAgua;

    public ProductoCongeladoAgua(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento, double salinidadAgua) {
        super(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    @Override
    public void guardarProductoEnArchivo() {
        try (FileWriter writer = new FileWriter("productosCongeladosAgua.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(bufferedWriter)) {
                out.println(this.toString());
            }catch (IOException e) {
                    e.printStackTrace();
            }
    }
    
    public static ArrayList<ProductoCongeladoAgua> cargarProductosDesdeArchivo() {
        ArrayList<ProductoCongeladoAgua> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productosCongeladosAgua.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String nombreProducto = parts[0].trim();
                String fechaCaducidad = parts[1].trim();
                String numeroLote = parts[2].trim();
                String fechaEnvasado = parts[3].trim();
                String paisOrigen = parts[4].trim();
                double temperaturaMantenimiento = Double.parseDouble(parts[5].trim());
                double salinidadAgua = Double.parseDouble (parts[6].trim());
                

                ProductoCongeladoAgua producto = new ProductoCongeladoAgua(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento, salinidadAgua);
                productos.add(producto);
            }
        } catch (IOException e) {
        }
        return productos;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + salinidadAgua;
    }
}
