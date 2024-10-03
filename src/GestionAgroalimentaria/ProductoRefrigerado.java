
package GestionAgroalimentaria;

import java.io.*;
import java.util.ArrayList;

public class ProductoRefrigerado extends Producto {
    private String codigoSupervision;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String nombreProducto, String fechaCaducidad, String numeroLote, String codigoSupervision, String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(nombreProducto, fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(String codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public void guardarProductoEnArchivo() {
        try (FileWriter writer = new FileWriter("productosRefrigerados.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            PrintWriter out = new PrintWriter(bufferedWriter)) {
                out.println(this.toString());
            }catch (IOException e) {
                    e.printStackTrace();
            }
    }
    
    public static ArrayList<ProductoRefrigerado> cargarProductosDesdeArchivo() {
        ArrayList<ProductoRefrigerado> productos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productosRefrigerados.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String nombreProducto = parts[0].trim();
                String fechaCaducidad = parts[1].trim();
                String numeroLote = parts[2].trim();
                String codigoSupervision = parts[3].trim();
                String fechaEnvasado = parts[4].trim();
                double temperaturaMantenimiento = Double.parseDouble(parts[5].trim());
                String paisOrigen = parts[6].trim();

                ProductoRefrigerado producto = new ProductoRefrigerado(nombreProducto, fechaCaducidad, numeroLote, codigoSupervision, fechaEnvasado, temperaturaMantenimiento, paisOrigen);
                productos.add(producto);
            }
        } catch (IOException e) {
        }
        return productos;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + codigoSupervision + ", " + fechaEnvasado + ", " + temperaturaMantenimiento + ", " + paisOrigen;
    }
}

