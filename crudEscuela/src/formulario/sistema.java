/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author djosp
 */
public class sistema extends javax.swing.JFrame {

   conexionSQL cc=new conexionSQL();
   Connection con=cc.conectar();
    
    public sistema() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCalificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbEstatus = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel3.setText("Materia:");

        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematica", "Español", "Ingles ", "Geografia", "Programacion" }));

        jLabel4.setText("Calificacion:");

        jLabel5.setText("Estatus:");

        cbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Reprobado" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbMateria, 0, 187, Short.MAX_VALUE)
                                .addComponent(cbEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCalificacion, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jLabel6.setText("Busqueda:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        insertarDatos();
        limpiarCajas();
        mostrarDatos();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void mostrarDatos(){
        
        String[] titulos = {"ID","Nombres","Apelidos","Materia","Calificacion","Estatus"};
        String[] registros=new String[7];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        
        String SQL="select * from alumnos";
        
        try {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while(rs.next()){
                
                registros[0]=rs.getString("id");
                registros[1]=rs.getString("nombres");
                registros[2]=rs.getString("apellidos");
                registros[3]=rs.getString("materia");
                registros[4]=rs.getString("calificacion");
                registros[5]=rs.getString("estatus"); 
                
                modelo.addRow(registros);
                
            }
            
            tablaAlumnos.setModel(modelo);
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        
    }
    
    
    public void filtrarDatos(String valor){
        
        String[] titulos = {"ID","Nombres","Apelidos","Materia","Calificacion","Estatus"};
        String[] registros=new String[7];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        
        String SQL="select * from alumnos where nombres like '%"+valor+"%'";
        
        try {
            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while(rs.next()){
                
                registros[0]=rs.getString("id");
                registros[1]=rs.getString("nombres");
                registros[2]=rs.getString("apellidos");
                registros[3]=rs.getString("materia");
                registros[4]=rs.getString("calificacion");
                registros[5]=rs.getString("estatus"); 
                
                modelo.addRow(registros);
                
            }
            
            tablaAlumnos.setModel(modelo);
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos"+ e.getMessage());
        }
        
    }
    
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        limpiarCajas();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        
        int filaSeleccionada=tablaAlumnos.rowAtPoint(evt.getPoint());
        
        txtNombres.setText(tablaAlumnos.getValueAt(filaSeleccionada,1).toString());
        txtApellidos.setText(tablaAlumnos.getValueAt(filaSeleccionada,2).toString());
        cbMateria.setSelectedItem(tablaAlumnos.getValueAt(filaSeleccionada, 3));
        txtCalificacion.setText(tablaAlumnos.getValueAt(filaSeleccionada,4).toString());
        cbEstatus.setSelectedItem(tablaAlumnos.getValueAt(filaSeleccionada, 5));
        
    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        eliminarRegistros();
        mostrarDatos();
        limpiarCajas();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        
        filtrarDatos(txtBuscar.getText());
        
    }//GEN-LAST:event_txtBuscarKeyReleased

    
    public void eliminarRegistros(){
        
        int filaSeleccionada=tablaAlumnos.getSelectedRow();
               
        try {
            
            String SQL="delete from alumnos where id="+tablaAlumnos.getValueAt(filaSeleccionada, 0);
            
            Statement st=con.createStatement();
        
            int n=st.executeUpdate(SQL);
            
            if(n>=0){
           
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al eliminar Registros "+ e.getMessage());
            
        }
        
    }
    
    public void limpiarCajas(){
        
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCalificacion.setText("");
        cbEstatus.setSelectedItem(null);
        cbMateria.setSelectedItem(null);
        
    }
    
    
    public void insertarDatos(){
        
        try {
            
            String SQL="insert into alumnos(nombres,apellidos,materia,calificacion,estatus)values(?,?,?,?,?)";
            
            PreparedStatement pst=con.prepareStatement(SQL);
            
            pst.setString(1, txtNombres.getText());
            pst.setString(2, txtApellidos.getText());
            
            int seleccionado=cbMateria.getSelectedIndex();
            pst.setString(3, cbMateria.getItemAt(seleccionado));
            
            pst.setDouble(4, Double.parseDouble(txtCalificacion.getText()));
            
            int seleccionado1=cbEstatus.getSelectedIndex();
            pst.setString(5, cbEstatus.getItemAt(seleccionado1));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Eroor de Registro" +e.getMessage());
            
        }
        
    }
    
    
    public void actualizarDatos(){
        
        try {
            
            String SQL=" update alumnos set nombres=?,apellidos=?,materia=?,calificacion=?,estatus=? where id=? ";
            
            int filaSeleccionado=tablaAlumnos.getSelectedRow();
            String dao=(String)tablaAlumnos.getValueAt(filaSeleccionado, 0);
            
            PreparedStatement pst=con.prepareStatement(SQL);
            
            pst.setString(1, txtNombres.getText());
            pst.setString(2, txtApellidos.getText());
            
            int seleccionado=cbMateria.getSelectedIndex();
            pst.setString(3, cbMateria.getItemAt(seleccionado));
            
            pst.setDouble(4, Double.parseDouble(txtCalificacion.getText()));
            
            int seleccionado1=cbEstatus.getSelectedIndex();
            pst.setString(5, cbEstatus.getItemAt(seleccionado1));
            
            pst.setString(6,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Editado Exitoso");
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Eroor de Edicion" +e.getMessage());
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbEstatus;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCalificacion;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
