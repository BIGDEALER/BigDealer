
import Connection.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy
 */
public class Vehiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vehiculos
     */
    public Vehiculos() {
        initComponents();
        comboMarca();
        comboModelo();
        
    }
    
   

    public void comboMarca() {
        
      String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
   
        
      try{  
         
          
        
                            String sql = "Select * "
                                    + "     FROM list_marca";


                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    conn = DriverManager.getConnection(url, usuario, pass);
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                

                    while(rs.next()){
                        
                        int id = rs.getInt("id_marca");
                        

                   comboMarca.addItem(rs.getString("marcas"));
                   
                   

                    System.out.println(rs.getInt("id_marca"));


                    }   
                
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
      
    }   
    
    
    
     public void comboModelo() {
        
      String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
        comboModelo.removeAllItems();
        

      try{  
          
         
         

                    String sql = "SELECT list_marca.id_marca, modelos.Descripcion, modelos.id_marca \n" +
                                 "  FROM list_marca, modelos\n" +
                                 " WHERE list_marca.id_marca = modelos.id_marca";

                    String sql2 = "Select * "
                                + "FROM list_marca";            

                    
                    
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    conn = DriverManager.getConnection(url, usuario, pass);
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                   
                     

                  
                

                    while(rs.next()){

                       
                   comboModelo.addItem(rs.getString("Descripcion"));
                   
                   
                   
                        //System.out.print(rs.getString("Descripcion"));


                    }   
                
                      
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
      
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtMarca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        comboModelo = new javax.swing.JComboBox();

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("ALMACEN DE VEHICULOS");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFecha.setText("00/00/0000");
        lblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(93, 93, 93)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblFecha)
                    .addComponent(jLabel7))
                .addGap(16, 16, 16))
        );

        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Matricula:");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        comboMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMarcaItemStateChanged(evt);
            }
        });
        comboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo:");

        comboModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtMarcaLayout = new javax.swing.GroupLayout(txtMarca);
        txtMarca.setLayout(txtMarcaLayout);
        txtMarcaLayout.setHorizontalGroup(
            txtMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMarcaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        txtMarcaLayout.setVerticalGroup(
            txtMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtMarcaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(txtMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed
    
    }//GEN-LAST:event_comboMarcaActionPerformed

    private void comboModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboModeloActionPerformed
       comboModelo();
    }//GEN-LAST:event_comboModeloActionPerformed

    private void comboMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMarcaItemStateChanged
        comboModelo();
        
        
        
        
        
    }//GEN-LAST:event_comboMarcaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboMarca;
    private javax.swing.JComboBox comboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel txtMarca;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}