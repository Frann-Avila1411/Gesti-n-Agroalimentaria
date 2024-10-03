
package Ventanas;
import GestionAgroalimentaria.ProductoFresco;
import java.util.ArrayList;

public class FormularioProductoFresco extends javax.swing.JFrame {


    public FormularioProductoFresco() {
        initComponents();
        this.setLocationRelativeTo(null);
        textAreaMostrar.setEditable(false);

      
    }
    
        
    private void mostrarProductos() {
    ArrayList<ProductoFresco> productosFrescos = ProductoFresco.cargarProductosDesdeArchivo();

    // Limpiar el JTextArea antes de mostrar los nuevos productos
    textAreaMostrar.setText("");

    // Mostrar los productos en el JTextArea
    for (ProductoFresco producto : productosFrescos) {
        // Formatear la salida del producto
        String productoFormateado = String.format(
                "Nombre del producto: %s\n" +
                "Fecha de Caducidad: %s\n" +
                "Numero de lote: %s\n" +
                "Fecha de Envasado: %s\n" +
                "Pais de Origen: %s\n",
                producto.getNombreProducto(), producto.getFechaCaducidad(),
                producto.getNumeroLote(), producto.getFechaEnvasado(),
                producto.getPaisOrigen()
        );

        // Agregar cada producto al JTextArea
        textAreaMostrar.append(productoFormateado + "\n");
    }
}

   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        textAreaMostrar = new java.awt.TextArea();
        NombrePro = new javax.swing.JLabel();
        NumLote = new javax.swing.JLabel();
        FechaVen1 = new javax.swing.JLabel();
        FechaEnva = new javax.swing.JLabel();
        PaisOrigen = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        Txt2 = new javax.swing.JTextField();
        Txt3 = new javax.swing.JTextField();
        Txt4 = new javax.swing.JTextField();
        Txt5 = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btnVolverInicio.setBackground(new java.awt.Color(102, 102, 102));
        btnVolverInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverInicio.setText("Volver ");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 80, -1));

        btnMostrarProductos.setBackground(new java.awt.Color(102, 102, 102));
        btnMostrarProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setText("Mostrar Productos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        Titulo.setFont(new java.awt.Font("LEMON MILK", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Productos Frescos");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        textAreaMostrar.setVisible(false);
        getContentPane().add(textAreaMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 390, 340));

        NombrePro.setBackground(new java.awt.Color(102, 102, 102));
        NombrePro.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        NombrePro.setForeground(new java.awt.Color(255, 255, 255));
        NombrePro.setText("Nombre del Producto :");
        getContentPane().add(NombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        NumLote.setBackground(new java.awt.Color(102, 102, 102));
        NumLote.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        NumLote.setForeground(new java.awt.Color(255, 255, 255));
        NumLote.setText("Fecha de envasado :");
        getContentPane().add(NumLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        FechaVen1.setBackground(new java.awt.Color(102, 102, 102));
        FechaVen1.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        FechaVen1.setForeground(new java.awt.Color(255, 255, 255));
        FechaVen1.setText("Fecha de caducidad :");
        getContentPane().add(FechaVen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        FechaEnva.setBackground(new java.awt.Color(102, 102, 102));
        FechaEnva.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        FechaEnva.setForeground(new java.awt.Color(255, 255, 255));
        FechaEnva.setText("Numero de lote :");
        getContentPane().add(FechaEnva, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        PaisOrigen.setBackground(new java.awt.Color(102, 102, 102));
        PaisOrigen.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        PaisOrigen.setForeground(new java.awt.Color(255, 255, 255));
        PaisOrigen.setText("Pais de origen :");
        getContentPane().add(PaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, 30));
        getContentPane().add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 250, 30));
        getContentPane().add(Txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 250, 30));
        getContentPane().add(Txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 250, 30));
        getContentPane().add(Txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 250, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R (1).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 462, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
       dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombreProducto = txt1.getText();
    String fechaCaducidad = Txt2.getText();
        String numeroLote = Txt3.getText();
        String fechaEnvasado = Txt4.getText();
        String paisOrigen = Txt5.getText();

        // Verificar que todos los campos estén llenos
    if (!nombreProducto.isEmpty() && !fechaCaducidad.isEmpty() && 
        !numeroLote.isEmpty() && !fechaEnvasado.isEmpty() && !paisOrigen.isEmpty()) {
        
    
        // Crea un nuevo ProductoFresco con la información ingresada
        ProductoFresco productoFresco = new ProductoFresco(nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen);

        // Llama al método para guardar en el archivo de texto
        productoFresco.guardarProductoEnArchivo();

        // Limpiar los campos después de guardar
        txt1.setText("");
        Txt2.setText("");
        Txt3.setText("");
        Txt4.setText("");
        Txt5.setText("");
    } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        textAreaMostrar.setVisible(true); 
        mostrarProductos();
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaEnva;
    private javax.swing.JLabel FechaVen1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NombrePro;
    private javax.swing.JLabel NumLote;
    private javax.swing.JLabel PaisOrigen;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField Txt2;
    private javax.swing.JTextField Txt3;
    private javax.swing.JTextField Txt4;
    private javax.swing.JTextField Txt5;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btnVolverInicio;
    private java.awt.TextArea textAreaMostrar;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
