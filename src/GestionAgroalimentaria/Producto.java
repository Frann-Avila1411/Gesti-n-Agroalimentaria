
package GestionAgroalimentaria;

public class Producto {
    private String nombreProducto;
    private String fechaCaducidad;
    private String numeroLote;
    
    
    public Producto(String nombreProducto, String fechaCaducidad, String numeroLote) {
        this.nombreProducto = nombreProducto;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public void setNombreProducto (String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
            
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }
    
    @Override
    public String toString() {
        return nombreProducto + ", " + fechaCaducidad + ", " + numeroLote;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
        System.out.println("Número de lote: " + numeroLote);
    }
}