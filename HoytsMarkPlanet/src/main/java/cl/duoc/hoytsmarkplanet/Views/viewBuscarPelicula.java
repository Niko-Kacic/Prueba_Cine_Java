package cl.duoc.hoytsmarkplanet.Views;

import cl.duoc.hoytsmarkplanet.DTO.MovieDTO;
import cl.duoc.hoytsmarkplanet.Services.Impl.MovieService;
import javax.swing.JOptionPane;

public class viewBuscarPelicula extends javax.swing.JInternalFrame {

    private MovieService movieService;
    
    private void limpiarCampos() {
        txtTituloBuscar.setText("");
    }
    
    public viewBuscarPelicula() {
        initComponents();
        movieService = new MovieService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBuscarPelicula = new javax.swing.JLabel();
        lblIngreseTitulo = new javax.swing.JLabel();
        txtTituloBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblConocerId = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblBuscarPelicula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscarPelicula.setText("Buscar Pelicula");

        lblIngreseTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreseTitulo.setText("Ingrese el titulo de la pelicula que desea buscar: ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblConocerId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConocerId.setText("Necesita conocer el id de la pelicula para poder modificarla / eliminarla");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConocerId)
                    .addComponent(lblBuscarPelicula)
                    .addComponent(lblIngreseTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar))
                        .addComponent(txtTituloBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblBuscarPelicula)
                .addGap(18, 18, 18)
                .addComponent(lblConocerId)
                .addGap(22, 22, 22)
                .addComponent(lblIngreseTitulo)
                .addGap(18, 18, 18)
                .addComponent(txtTituloBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String tituloABuscar = txtTituloBuscar.getText();

        MovieDTO peliculaEncontrada = movieService.buscarPeliculaPorTitulo(tituloABuscar);

        if (peliculaEncontrada != null) {
            String mensaje = "ID: " + peliculaEncontrada.getId() + "\n" +
                    "Título: " + peliculaEncontrada.getTitulo() + "\n" +
                    "Director: " + peliculaEncontrada.getDirector() + "\n" +
                    "Año: " + peliculaEncontrada.getAnno() + "\n" +
                    "Duración: " + peliculaEncontrada.getDuracion() + "\n" +
                    "Género: " + peliculaEncontrada.getGenero();

            JOptionPane.showMessageDialog(this, mensaje, "Detalles de la película", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ninguna película con ese título", "Error", JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblBuscarPelicula;
    private javax.swing.JLabel lblConocerId;
    private javax.swing.JLabel lblIngreseTitulo;
    private javax.swing.JTextField txtTituloBuscar;
    // End of variables declaration//GEN-END:variables
}
