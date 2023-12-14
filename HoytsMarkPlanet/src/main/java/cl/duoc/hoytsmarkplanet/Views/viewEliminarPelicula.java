package cl.duoc.hoytsmarkplanet.Views;

import cl.duoc.hoytsmarkplanet.Services.Impl.MovieService;

public class viewEliminarPelicula extends javax.swing.JInternalFrame {
    
    private MovieService movieService;
    
    private void limpiarCampos() {
        txtId.setText("");
    }

    public viewEliminarPelicula() {
        initComponents();
        movieService = new MovieService();    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblEliminarPelicula = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIngreseId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblEliminarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEliminarPelicula.setText("Eliminar Pelicula");

        lblEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEliminar.setText("Para poder eliminar una pelicula debe ingresar el id que esta posee");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Si no conoce el id, puede conseguirlo mediante la opcion \"Buscar Pelicula\"");

        lblIngreseId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseId.setText("Ingrese el id de la pelicula que desea eliminar: ");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEliminarPelicula)
                .addGap(199, 199, 199))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngreseId)
                    .addComponent(jLabel1)
                    .addComponent(lblEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEliminar)
                            .addGap(27, 27, 27)
                            .addComponent(btnLimpiar))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblEliminarPelicula)
                .addGap(39, 39, 39)
                .addComponent(lblEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(lblIngreseId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        movieService.eliminarPelicula(id);
        System.out.println("Pelicula agregada");
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEliminarPelicula;
    private javax.swing.JLabel lblIngreseId;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
