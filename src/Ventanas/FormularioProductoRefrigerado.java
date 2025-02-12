/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;
import GestionAgroalimentaria.ProductoRefrigerado;
import java.util.ArrayList;

public class FormularioProductoRefrigerado extends javax.swing.JFrame {

    
    public FormularioProductoRefrigerado() {
        initComponents();
        this.setLocationRelativeTo(null);
        textAreaMostrar.setEditable(false);
    }
    
    private void mostrarProductos() {
    ArrayList<ProductoRefrigerado> productosRefrigerados = ProductoRefrigerado.cargarProductosDesdeArchivo();

    // Limpiar el JTextArea antes de mostrar los nuevos productos
    textAreaMostrar.setText("");

    // Mostrar los productos en el JTextArea
    for (ProductoRefrigerado producto : productosRefrigerados) {
        // Formatear la salida del producto
        String productoFormateado = String.format(
                "Nombre del producto: %s\n" +
                "Fecha de Caducidad: %s\n" +
                "Numero de lote: %s\n" +
                "Codigo de Supervisión: %s\n" +
                "Fecha de Envasado: %s\n" +
                "Temperatura de Mantenimiento: %s\n" +
                "Pais de Origen: %s\n",
                producto.getNombreProducto(), producto.getFechaCaducidad(),
                producto.getNumeroLote(),producto.getCodigoSupervision(), producto.getFechaEnvasado(),
               producto.getTemperaturaMantenimiento(), producto.getPaisOrigen()
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

        Titulo = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnMostrarProductos = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        textAreaMostrar = new java.awt.TextArea();
        NombrePro = new javax.swing.JLabel();
        FechaCad = new javax.swing.JLabel();
        NumLot = new javax.swing.JLabel();
        CodSuper = new javax.swing.JLabel();
        FechaEnva = new javax.swing.JLabel();
        TempMant = new javax.swing.JLabel();
        PaisOrig = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(102, 102, 102));
        Titulo.setFont(new java.awt.Font("LEMON MILK", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Productos Refrigerados");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        btncerrar.setBackground(new java.awt.Color(102, 102, 102));
        btncerrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        btnMostrarProductos.setBackground(new java.awt.Color(102, 102, 102));
        btnMostrarProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarProductos.setText("Mostrar Productos");
        btnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        btnVolverInicio.setBackground(new java.awt.Color(102, 102, 102));
        btnVolverInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverInicio.setText("Volver");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        textAreaMostrar.setVisible(false);
        getContentPane().add(textAreaMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 370));

        NombrePro.setBackground(new java.awt.Color(102, 102, 102));
        NombrePro.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        NombrePro.setForeground(new java.awt.Color(255, 255, 255));
        NombrePro.setText("Nombre del Producto :");
        getContentPane().add(NombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        FechaCad.setBackground(new java.awt.Color(102, 102, 102));
        FechaCad.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        FechaCad.setForeground(new java.awt.Color(255, 255, 255));
        FechaCad.setText("Fecha de Caducidad :");
        getContentPane().add(FechaCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        NumLot.setBackground(new java.awt.Color(102, 102, 102));
        NumLot.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        NumLot.setForeground(new java.awt.Color(255, 255, 255));
        NumLot.setText("Numero de Lote :");
        getContentPane().add(NumLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        CodSuper.setBackground(new java.awt.Color(102, 102, 102));
        CodSuper.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        CodSuper.setForeground(new java.awt.Color(255, 255, 255));
        CodSuper.setText("Codigo de Supervision :");
        getContentPane().add(CodSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        FechaEnva.setBackground(new java.awt.Color(153, 153, 153));
        FechaEnva.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        FechaEnva.setForeground(new java.awt.Color(255, 255, 255));
        FechaEnva.setText("Fecha de Envasado :");
        getContentPane().add(FechaEnva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        TempMant.setBackground(new java.awt.Color(102, 102, 102));
        TempMant.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        TempMant.setForeground(new java.awt.Color(255, 255, 255));
        TempMant.setText("Temperatura Mantenimiento (°C) :");
        getContentPane().add(TempMant, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        PaisOrig.setBackground(new java.awt.Color(102, 102, 102));
        PaisOrig.setFont(new java.awt.Font("LEMON MILK", 0, 10)); // NOI18N
        PaisOrig.setForeground(new java.awt.Color(255, 255, 255));
        PaisOrig.setText("Pais de Origen :");
        getContentPane().add(PaisOrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, 30));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 230, 30));

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 230, 30));

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 230, 30));
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 230, 30));
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 210, 30));
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 230, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R (1).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 462, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
       dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreProducto = txt1.getText();
    String fechaCaducidad = txt2.getText();
        String numeroLote = txt3.getText();
        String codigoSupervision = txt4.getText();
        String fechaEnvasado = txt5.getText();
        String temperaturaMantenimiento = txt6.getText();
        String paisOrigen = txt7.getText();

        // Verificar que todos los campos estén llenos
    if (!nombreProducto.isEmpty() && !fechaCaducidad.isEmpty() && 
        !numeroLote.isEmpty() && !codigoSupervision.isEmpty() && 
        !fechaEnvasado.isEmpty() && !temperaturaMantenimiento.isEmpty() &&
        !paisOrigen.isEmpty()) {
        
    
        try {
            // Intentar convertir la temperatura de mantenimiento a un valor numérico
            double tempMantenimiento = Double.parseDouble(temperaturaMantenimiento);

            // Crea un nuevo ProductoRefrigerado con la información ingresada
            ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(
                nombreProducto, fechaCaducidad, numeroLote, 
                codigoSupervision, fechaEnvasado, 
                tempMantenimiento, paisOrigen
            );

            // Llama al método para guardar en el archivo de texto
            productoRefrigerado.guardarProductoEnArchivo();

            // Limpiar los campos después de guardar
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            txt7.setText("");
        } catch (NumberFormatException e) {
            // Manejar el caso donde la temperatura de mantenimiento no es un número válido
            // Puedes mostrar un mensaje de error al usuario aquí
            System.out.println("La temperatura de mantenimiento debe ser un número válido.");
        }

    } else {
        // Manejar el caso donde no todos los campos están llenos
        // Puedes mostrar un mensaje de error al usuario aquí
        System.out.println("Todos los campos deben estar llenos.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProductosActionPerformed
        textAreaMostrar.setVisible(true); 
        mostrarProductos();
    }//GEN-LAST:event_btnMostrarProductosActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodSuper;
    private javax.swing.JLabel FechaCad;
    private javax.swing.JLabel FechaEnva;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NombrePro;
    private javax.swing.JLabel NumLot;
    private javax.swing.JLabel PaisOrig;
    private javax.swing.JLabel TempMant;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarProductos;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JButton btncerrar;
    private java.awt.TextArea textAreaMostrar;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    // End of variables declaration//GEN-END:variables
}
