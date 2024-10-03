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


public class ProductoCongeladoAire extends ProductoCongelado {
    private int porcentajeNitrogeno;
    private int porcentajeOxigeno;
    private int porcentajeDioxidoCarbono;
    private int porcentajeVaporAgua;

    public ProductoCongeladoAire(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double temperaturaMantenimiento,
                                 int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeDioxidoCarbono, int porcentajeVaporAgua) {
        super(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    public int getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public int getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(int porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public int getPorcentajeDioxidoCarbono() {
        return porcentajeDioxidoCarbono;
    }

    public void setPorcentajeDioxidoCarbono(int porcentajeDioxidoCarbono) {
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
    }

    public int getPorcentajeVaporAgua() {
        return porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    
    @Override //Metodo para guardar datos en el archivo txt
    public void guardarProductoEnArchivo() {
        try (FileWriter writer = new FileWriter("productosCongeladosAire.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(bufferedWriter)) {
                out.println(this.toString());
            }catch (IOException e) {
                
                    e.printStackTrace();
            }
    }
    
    public static ArrayList<ProductoCongeladoAire> cargarProductosDesdeArchivo() {
        ArrayList<ProductoCongeladoAire> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productosCongeladosAire.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String nombreProducto = parts[0].trim();
                String fechaCaducidad = parts[1].trim();
                String numeroLote = parts[2].trim();
                String fechaEnvasado = parts[3].trim();
                String paisOrigen = parts[4].trim();
                double temperaturaMantenimiento = Double.parseDouble(parts[5].trim());
                int porcentajeNitrogeno = Integer.parseInt(parts[6].trim());
                int porcentajeOxigeno = Integer.parseInt(parts[7].trim());
                int porcentajeDioxidoCarbono = Integer.parseInt(parts[8].trim());
                int porcentajeVaporAgua = Integer.parseInt(parts[9].trim());

                ProductoCongeladoAire producto = new ProductoCongeladoAire(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento, porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoCarbono, porcentajeVaporAgua);
                productos.add(producto);
            }
            
            } catch (IOException e) {
        }
        return productos;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + porcentajeNitrogeno + ", " + porcentajeOxigeno + ", "
                + porcentajeDioxidoCarbono + ", " + porcentajeVaporAgua;
    }
}
