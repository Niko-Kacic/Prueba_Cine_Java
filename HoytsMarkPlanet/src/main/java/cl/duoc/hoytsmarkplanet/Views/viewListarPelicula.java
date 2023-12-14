package cl.duoc.hoytsmarkplanet.Views;

import cl.duoc.hoytsmarkplanet.DTO.MovieDTO;
import cl.duoc.hoytsmarkplanet.Services.Impl.MovieService;
import java.util.List;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class viewListarPelicula extends javax.swing.JInternalFrame {

    private MovieService movieService; 

    private void mostrarPeliculasEnTabla() {
        
        DefaultTableModel model = (DefaultTableModel) jTablePeliculas.getModel();
        model.setRowCount(0); 

        List<MovieDTO> peliculas = movieService.obtenerTodasLasPeliculas();

        for (MovieDTO pelicula : peliculas) {
            Object[] row = {pelicula.getId(), pelicula.getTitulo(), pelicula.getDirector(), pelicula.getAnno(), pelicula.getDuracion(), pelicula.getGenero()};
            model.addRow(row);
        }
    }
    
    private void mostrarPeliculasEnTabla(List<MovieDTO> peliculas) {
        DefaultTableModel model = (DefaultTableModel) jTablePeliculas.getModel();
        model.setRowCount(0); 

        for (MovieDTO pelicula : peliculas) {
            Object[] row = {pelicula.getId(), pelicula.getTitulo(), pelicula.getDirector(), pelicula.getAnno(), pelicula.getDuracion(), pelicula.getGenero()};
            model.addRow(row);
        }
    }
    
    private void mostrarTodasLasPeliculas() {
        mostrarPeliculasEnTabla(); 
}

    public viewListarPelicula() {
        initComponents();
        movieService = new MovieService();
        mostrarPeliculasEnTabla();
     
        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Por defecto", "Drama", "Comedia", "Acción", "Romance", "Terror", "Ciencia Ficcion", "Aventura", "Musical", "Fantasia", "Otros"}));
        
        SpinnerNumberModel modelInicio = new SpinnerNumberModel(2000, 1900, 2100, 1); // Rango de años
        spinnerInicio.setModel(modelInicio);

        SpinnerNumberModel modelFin = new SpinnerNumberModel(2023, 1900, 2100, 1); // Rango de años
        spinnerFin.setModel(modelFin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListarPeliculas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePeliculas = new javax.swing.JTable();
        comboBoxGenero = new javax.swing.JComboBox<>();
        spinnerInicio = new javax.swing.JSpinner();
        spinnerFin = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnQuitarFiltros = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblListarPeliculas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblListarPeliculas.setText("Lista de Peliculas");

        jTablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Director", "Anno", "Duracion", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePeliculas);

        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGeneroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filtrar por rango de años");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Filtrar por genero");

        jLabel3.setText("Inicio");

        jLabel4.setText("Fin");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnQuitarFiltros.setText("Quitar filtros");
        btnQuitarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblListarPeliculas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnQuitarFiltros)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBuscar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblListarPeliculas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spinnerFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuitarFiltros)
                    .addComponent(btnBuscar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGeneroActionPerformed
        
   
    }//GEN-LAST:event_comboBoxGeneroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String generoSeleccionado = comboBoxGenero.getSelectedItem().toString();
        int annoInicio = (int) spinnerInicio.getValue();
        int annoFin = (int) spinnerFin.getValue();

        List<MovieDTO> peliculasFiltradas = movieService.filtrarPeliculas(generoSeleccionado, annoInicio, annoFin);
        mostrarPeliculasEnTabla(peliculasFiltradas);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnQuitarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarFiltrosActionPerformed
        mostrarTodasLasPeliculas();
    }//GEN-LAST:event_btnQuitarFiltrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnQuitarFiltros;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePeliculas;
    private javax.swing.JLabel lblListarPeliculas;
    private javax.swing.JSpinner spinnerFin;
    private javax.swing.JSpinner spinnerInicio;
    // End of variables declaration//GEN-END:variables
}
