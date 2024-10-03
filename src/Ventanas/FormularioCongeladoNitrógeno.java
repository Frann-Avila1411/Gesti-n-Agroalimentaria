/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import GestionAgroalimentaria.ProductoCongeladoNitrógeno;
import java.util.ArrayList;


public class FormularioCongeladoNitrógeno extends javax.swing.JFrame {

    /**
     * Creates new form FormularioCongeladoNitrógeno
     */
    public FormularioCongeladoNitrógeno() {
        initComponents();
        this.setLocationRelativeTo(null);
        textAreaMostrar.setEditable(false);
    }
    
    private void mostrarProductos() {
        
    ArrayList<ProductoCongeladoNitrógeno> productoCongeladoNitrógeno = ProductoCongeladoNitrógeno.cargarProductosDesdeArchivo();

        // Limpiar el JTextArea antes de mostrar los nuevos productos
        textAreaMostrar.setText("");

        // Mostrar los productos en el JTextArea
        for (ProductoCongeladoNitrógeno producto : productoCongeladoNitrógeno) {
        // Formatear la salida del producto
        String productoFormateado = String.format(
                "Nombre del producto: %s\n" +
                "Fecha de Caducidad: %s\n" +
                "Numero de lote: %s\n" +
                "Fecha de Envasado: %s\n" +
                "Pais de Origen: %s\n" +
                "Temperatura de Mantenimiento: %s\n" +
                "Método de Congelación: %s\n" +
                "Tiempo de Exposición (seg): %s\n" ,
                        
                producto.getNombreProducto(), producto.getFechaCaducidad(),
                producto.getNumeroLote(), producto.getFechaEnvasado(),
                producto.getPaisOrigen(),
               producto.getTemperaturaMantenimiento(), producto.getMetodoCongelacion(),
               producto.getTiempoExposicion()
        );

        // Agregar cada producto al JTextArea
        textAreaMostrar.append(productoFormateado + "\n");
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        textAreaMostrar = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt1 = new javax.swing.JTextField();
        Txt2 = new javax.swing.JTextField();
        Txt3 = new javax.swing.JTextField();
        Txt4 = new javax.swing.JTextField();
        Txt5 = new javax.swing.JTextField();
        Txt6 = new javax.swing.JTextField();
        Txt7 = new javax.swing.JTextField();
        Txt8 = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(102, 102, 102));
        titulo.setFont(new java.awt.Font("LEMON MILK", 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Productos Congelados por Nitrógeno");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

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

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 30));

        btnMostrarProductos.setBackground(new java.awt.Color(102, 102, 102));
        btnMostrarProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setText("Mostrar Productos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, 30));

        btnVolver.setBackground(new java.awt.Color(102, 102, 102));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, 30));

        textAreaMostrar.setVisible(false);
        getContentPane().add(textAreaMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 410, 400));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del producto :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("fecha de caducidad :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("numero de lote :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("fecha de envasado :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("pais de origen :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("temperatura mantenimiento (°C)  :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metodo congelacion :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("tiempo exposicion (segundos):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));
        getContentPane().add(Txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 230, 30));
        getContentPane().add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, 30));
        getContentPane().add(Txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 230, 30));
        getContentPane().add(Txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, 30));
        getContentPane().add(Txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 230, 30));
        getContentPane().add(Txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 170, 30));
        getContentPane().add(Txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 230, 30));
        getContentPane().add(Txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 170, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R (1).jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 462, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          String nombreProducto = Txt1.getText();
    String fechaCaducidad = Txt2.getText();
        String numeroLote = Txt3.getText();
        String fechaEnvasado = Txt4.getText();
        String paisOrigen = Txt5.getText();
        String temperaturaMantenimiento = Txt6.getText();
        String metodoCongelacion = Txt7.getText();
        String tiempoExposicionTxt = Txt8.getText();
        
        // Verificar que todos los campos estén llenos
    if (!nombreProducto.isEmpty() && !fechaCaducidad.isEmpty() && 
        !numeroLote.isEmpty() && !fechaEnvasado.isEmpty() && 
        !paisOrigen.isEmpty() && !temperaturaMantenimiento.isEmpty() &&
        !metodoCongelacion.isEmpty() && !tiempoExposicionTxt.isEmpty()) {
        
        try {
            // Intentar convertir la temperatura de mantenimiento a un valor numérico
            double tempMantenimiento = Double.parseDouble(temperaturaMantenimiento);
            int tiempoExposicion = Integer.parseInt(tiempoExposicionTxt);
            
            // Crea un nuevo ProductoCongeladoAire con la información ingresada
            
            ProductoCongeladoNitrógeno productoCongeladoNitrógeno = new ProductoCongeladoNitrógeno(
                nombreProducto, fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimiento, metodoCongelacion, tiempoExposicion);
                
                // Llama al método para guardar en el archivo de texto
            productoCongeladoNitrógeno.guardarProductoEnArchivo();
    
          // Limpiar los campos después de guardar
            Txt1.setText("");
            Txt2.setText("");
            Txt3.setText("");
            Txt4.setText("");
            Txt5.setText("");
            Txt6.setText("");
            Txt7.setText("");
            Txt8.setText("");
            
        }
    catch (NumberFormatException e) {
            // Manejar el caso donde la temperatura de mantenimiento no es un número válido
            // Puedes mostrar un mensaje de error al usuario aquí
            System.out.println("La temperatura de mantenimiento debe ser un número válido.");
        
            }
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
    private javax.swing.JTextField Txt1;
    private javax.swing.JTextField Txt2;
    private javax.swing.JTextField Txt3;
    private javax.swing.JTextField Txt4;
    private javax.swing.JTextField Txt5;
    private javax.swing.JTextField Txt6;
    private javax.swing.JTextField Txt7;
    private javax.swing.JTextField Txt8;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.TextArea textAreaMostrar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
