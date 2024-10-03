/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;


public class Interfaz extends javax.swing.JFrame {

   private FormularioProductoFresco formularioFresco;
   private FormularioProductoRefrigerado formularioRefrigerado;
   private FormularioProductoCongelado formularioCongelado;
   
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        btnProductoFresco.addActionListener(new java.awt.event.ActionListener(){
            public void
                    actionPerformed(java.awt.event.ActionEvent evt){
                        btnProductoFrescoActionPerformed (evt);
                    }
        } );
        
        btnProductoRefrigerado.addActionListener(new java.awt.event.ActionListener(){
            public void
                    actionPerformed(java.awt.event.ActionEvent evt) {
                        btnProductoRefrigeradoActionPerformed (evt);
                    }
        });
        
        btnProductoCongelado.addActionListener(new java.awt.event.ActionListener(){
            public void
                    actionPerformed(java.awt.event.ActionEvent evt) {
                        btnProductoCongeladoActionPerformed (evt);
                    }
        });
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JButton();
        Bienvenida = new javax.swing.JLabel();
        btnProductoFresco = new javax.swing.JButton();
        btnProductoRefrigerado = new javax.swing.JButton();
        btnProductoCongelado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCerrar.setBackground(new java.awt.Color(0, 0, 51));
        BotonCerrar.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        BotonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, -1));

        Bienvenida.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        Bienvenida.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenida.setText("¡Bienvenido!");
        jPanel1.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 20));

        btnProductoFresco.setBackground(new java.awt.Color(0, 0, 51));
        btnProductoFresco.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnProductoFresco.setForeground(new java.awt.Color(255, 255, 255));
        btnProductoFresco.setText("Producto Fresco");
        btnProductoFresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoFrescoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductoFresco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 40));

        btnProductoRefrigerado.setBackground(new java.awt.Color(0, 0, 51));
        btnProductoRefrigerado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnProductoRefrigerado.setForeground(new java.awt.Color(255, 255, 255));
        btnProductoRefrigerado.setText("Producto Refrigerado");
        btnProductoRefrigerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoRefrigeradoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductoRefrigerado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 40));

        btnProductoCongelado.setBackground(new java.awt.Color(0, 0, 51));
        btnProductoCongelado.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnProductoCongelado.setForeground(new java.awt.Color(255, 255, 255));
        btnProductoCongelado.setText("Producto Congelado");
        btnProductoCongelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoCongeladoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductoCongelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed

    System.exit(0);
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void btnProductoFrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoFrescoActionPerformed
 
        if (formularioFresco == null || ! formularioFresco.isVisible()){
            formularioFresco = new FormularioProductoFresco();
            formularioFresco.setVisible(true); 
        }
     
    }//GEN-LAST:event_btnProductoFrescoActionPerformed

    private void btnProductoRefrigeradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoRefrigeradoActionPerformed
        
        if (formularioRefrigerado == null || ! formularioRefrigerado.isVisible()){
            formularioRefrigerado = new FormularioProductoRefrigerado();
            formularioRefrigerado.setVisible(true); 
        }
    }//GEN-LAST:event_btnProductoRefrigeradoActionPerformed

    private void btnProductoCongeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoCongeladoActionPerformed
        
        if (formularioCongelado == null || ! formularioCongelado.isVisible()){
            formularioCongelado = new FormularioProductoCongelado();
            formularioCongelado.setVisible(true); 
        }
    }//GEN-LAST:event_btnProductoCongeladoActionPerformed

                                                      

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton btnProductoCongelado;
    private javax.swing.JButton btnProductoFresco;
    private javax.swing.JButton btnProductoRefrigerado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
