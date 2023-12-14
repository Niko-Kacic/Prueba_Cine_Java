package cl.duoc.hoytsmarkplanet;

import cl.duoc.hoytsmarkplanet.Views.viewAgregarPelicula;
import cl.duoc.hoytsmarkplanet.Views.viewBuscarPelicula;
import cl.duoc.hoytsmarkplanet.Views.viewEliminarPelicula;
import cl.duoc.hoytsmarkplanet.Views.viewListarPelicula;
import cl.duoc.hoytsmarkplanet.Views.viewModificarPelicula;

public class HoytsMarkPlanet extends javax.swing.JFrame {

    public HoytsMarkPlanet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAgregar = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Bienvenido al Sistema de Gestion de Peliculas de HoytsMarkPlanet");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Realizado por: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nicolas Kacic");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("y Andhre Cruz");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Para empezar con la gestion de peliculas haga click en el menu de \"Opciones\"");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Este se ubica en la parte superior izquierda");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("- Eliminar peliculas por medio de su id");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("- Listar todas las peliculas almacenadas, incluso utilizar filtros");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Con este sistema puede realizar las siguientes funciones: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("- Agregar peliculas");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("- Buscarlas por su titulo y asi poder ver el resto de sus datos");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("- Modificar datos ya almacenados de las peliculas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28))
        );

        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Opciones");

        menuAgregar.setText("Agregar Pelicula");
        menuAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarActionPerformed(evt);
            }
        });
        jMenu1.add(menuAgregar);

        menuBuscar.setText("Buscar Pelicula");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        jMenu1.add(menuBuscar);

        menuModificar.setText("Modificar Pelicula");
        menuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarActionPerformed(evt);
            }
        });
        jMenu1.add(menuModificar);

        menuEliminar.setText("Eliminar Pelicula");
        menuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(menuEliminar);

        menuListar.setText("Listar Peliculas");
        menuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarActionPerformed(evt);
            }
        });
        jMenu1.add(menuListar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarActionPerformed
        // TODO add your handling code here:
        System.out.println("Listar");

        // 1. Crear objeto de tipo ventana.
        viewListarPelicula ventana = new viewListarPelicula();

        // 2. Agregar esa ventana al DesktopPane (escritorio).
        Escritorio.add(ventana);

        // 3. Decirle a la ventana agregada que se muestre (por defecto esta oculta).
        ventana.setVisible(true);
    }//GEN-LAST:event_menuListarActionPerformed

    private void menuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarActionPerformed
        // TODO add your handling code here:
        System.out.println("Eliminar");

        // 1. Crear objeto de tipo ventana.
        viewEliminarPelicula ventana = new viewEliminarPelicula();

        // 2. Agregar esa ventana al DesktopPane (escritorio).
        Escritorio.add(ventana);

        // 3. Decirle a la ventana agregada que se muestre (por defecto esta oculta).
        ventana.setVisible(true);
    }//GEN-LAST:event_menuEliminarActionPerformed

    private void menuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarActionPerformed
        // TODO add your handling code here:
        System.out.println("Modificar");

        // 1. Crear objeto de tipo ventana.
        viewModificarPelicula ventana = new viewModificarPelicula();

        // 2. Agregar esa ventana al DesktopPane (escritorio).
        Escritorio.add(ventana);

        // 3. Decirle a la ventana agregada que se muestre (por defecto esta oculta).
        ventana.setVisible(true);
    }//GEN-LAST:event_menuModificarActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        // TODO add your handling code here:
        System.out.println("Buscar");

        // 1. Crear objeto de tipo ventana.
        viewBuscarPelicula ventana = new viewBuscarPelicula();

        // 2. Agregar esa ventana al DesktopPane (escritorio).
        Escritorio.add(ventana);

        // 3. Decirle a la ventana agregada que se muestre (por defecto esta oculta).
        ventana.setVisible(true);
    }//GEN-LAST:event_menuBuscarActionPerformed

    private void menuAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println("Agregar");

        // 1. Crear objeto de tipo ventana.
        viewAgregarPelicula ventana = new viewAgregarPelicula();

        // 2. Agregar esa ventana al DesktopPane (escritorio).
        Escritorio.add(ventana);

        // 3. Decirle a la ventana agregada que se muestre (por defecto esta oculta).
        ventana.setVisible(true);
    }//GEN-LAST:event_menuAgregarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoytsMarkPlanet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAgregar;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuItem menuModificar;
    // End of variables declaration//GEN-END:variables
}
