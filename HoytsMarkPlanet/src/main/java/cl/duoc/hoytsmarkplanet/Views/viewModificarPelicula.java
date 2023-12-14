package cl.duoc.hoytsmarkplanet.Views;

import cl.duoc.hoytsmarkplanet.DTO.MovieDTO;
import cl.duoc.hoytsmarkplanet.Services.Impl.MovieService;
import javax.swing.JOptionPane;

public class viewModificarPelicula extends javax.swing.JInternalFrame {
    
    private void limpiarCampos() {
        txtId.setText("");
        txtTitulo.setText("");
        txtDirector.setText("");
        txtAnno.setText("");
        txtDuracion.setText("");
        txtGenero.setText("");
    }

    private MovieService movieService;
    
    public viewModificarPelicula() {
        initComponents();
        movieService = new MovieService();    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModificarPelicula = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        lblGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblDirector = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        lblAnno = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAnno = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lblModificar = new javax.swing.JLabel();
        lblIngreseDatos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblConoce = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblModificarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModificarPelicula.setText("Modificar Pelicula");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGenero.setText("Nuevo Genero >");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo.setText("Nuevo titulo >");

        lblDirector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDirector.setText("Nuevo Director >");

        txtDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirectorActionPerformed(evt);
            }
        });

        lblAnno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAnno.setText("Nuevo Año >");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nueva Duracion >");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Id >");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModificar.setText("Para poder modificar una pelicula debe ingresar el id que esta posee");

        lblIngreseDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseDatos.setText("Seguido a esto ingrese los nuevos datos de la pelicula");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Recuerde ingresar un genero valido, puede ver estos en la opcion \"Agregar Pelicula\"");

        lblConoce.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConoce.setText("Si no conoce el id, puede obtenerlo mediante la opcion \"Buscar Pelicula\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblConoce)
                        .addComponent(lblModificar)
                        .addComponent(lblIngreseDatos)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(26, 26, 26)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblAnno)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblDirector))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDirector)
                                    .addComponent(txtId)
                                    .addComponent(txtAnno)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblGenero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar))))
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblModificarPelicula)
                        .addGap(210, 210, 210))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblModificarPelicula)
                .addGap(18, 18, 18)
                .addComponent(lblModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConoce)
                .addGap(8, 8, 8)
                .addComponent(lblIngreseDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnno))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModificar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String titulo = txtTitulo.getText();
        String director = txtDirector.getText();
        int anno = Integer.parseInt(txtAnno.getText());
        int duracion = Integer.parseInt(txtDuracion.getText());
        String genero = txtGenero.getText();

        MovieDTO pelicula = new MovieDTO();
        pelicula.setId(id);
        pelicula.setTitulo(titulo);
        pelicula.setDirector(director);
        pelicula.setAnno(anno);
        pelicula.setDuracion(duracion);
        pelicula.setGenero(genero);

        boolean modificado = movieService.modificarPelicula(pelicula);

        if (modificado) {
            JOptionPane.showMessageDialog(this, "Película modificada exitosamente");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar la película");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirectorActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAnno;
    private javax.swing.JLabel lblConoce;
    private javax.swing.JLabel lblDirector;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIngreseDatos;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblModificarPelicula;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
