package midterm_irish;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class inventory_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form inventory_dashboard
     */
    public inventory_dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        showData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Lusername1 = new javax.swing.JLabel();
        txtprodname = new javax.swing.JTextField();
        Lusername2 = new javax.swing.JLabel();
        txtstockqlty = new javax.swing.JTextField();
        Lusername3 = new javax.swing.JLabel();
        txtsupplier = new javax.swing.JTextField();
        Lusername4 = new javax.swing.JLabel();
        Lusername5 = new javax.swing.JLabel();
        bttnaddproduct = new javax.swing.JButton();
        bttnupdate = new javax.swing.JButton();
        bttndelete = new javax.swing.JButton();
        bttnlogout = new javax.swing.JButton();
        cmbstatus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(243, 244, 246));

        jPanel1.setBackground(new java.awt.Color(0, 31, 63));

        Lusername1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Lusername1.setForeground(new java.awt.Color(255, 255, 255));
        Lusername1.setText("Add New Product");

        txtprodname.setBackground(new java.awt.Color(240, 248, 255));
        txtprodname.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtprodname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Lusername2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Lusername2.setForeground(new java.awt.Color(255, 255, 255));
        Lusername2.setText("Product Name");

        txtstockqlty.setBackground(new java.awt.Color(240, 248, 255));
        txtstockqlty.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtstockqlty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Lusername3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Lusername3.setForeground(new java.awt.Color(255, 255, 255));
        Lusername3.setText("Stock Quantity");

        txtsupplier.setBackground(new java.awt.Color(240, 248, 255));
        txtsupplier.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtsupplier.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Lusername4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Lusername4.setForeground(new java.awt.Color(255, 255, 255));
        Lusername4.setText("Supplier");

        Lusername5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Lusername5.setForeground(new java.awt.Color(255, 255, 255));
        Lusername5.setText("Status");

        bttnaddproduct.setBackground(new java.awt.Color(0, 128, 0));
        bttnaddproduct.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bttnaddproduct.setForeground(new java.awt.Color(255, 255, 255));
        bttnaddproduct.setText("Add Product");
        bttnaddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnaddproductActionPerformed(evt);
            }
        });

        bttnupdate.setBackground(new java.awt.Color(0, 0, 128));
        bttnupdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bttnupdate.setForeground(new java.awt.Color(255, 255, 255));
        bttnupdate.setText("Update Product");
        bttnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnupdateActionPerformed(evt);
            }
        });

        bttndelete.setBackground(new java.awt.Color(192, 0, 0));
        bttndelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        bttndelete.setForeground(new java.awt.Color(255, 255, 255));
        bttndelete.setText("Delete Product");
        bttndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttndeleteActionPerformed(evt);
            }
        });

        bttnlogout.setBackground(new java.awt.Color(105, 105, 105));
        bttnlogout.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        bttnlogout.setForeground(new java.awt.Color(255, 255, 255));
        bttnlogout.setText("Logout");
        bttnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnlogoutActionPerformed(evt);
            }
        });

        cmbstatus.setBackground(new java.awt.Color(204, 204, 204));
        cmbstatus.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cmbstatus.setForeground(new java.awt.Color(0, 0, 0));
        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Stock", "Low Stock", "Out of Stock", " " }));
        cmbstatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lusername1)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lusername4)
                            .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lusername2)
                                .addComponent(Lusername3)
                                .addComponent(txtprodname, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(txtstockqlty))
                            .addComponent(Lusername5)
                            .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bttnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bttnaddproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bttndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Lusername1)
                .addGap(39, 39, 39)
                .addComponent(Lusername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprodname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lusername3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstockqlty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lusername4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lusername5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(bttnaddproduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttndelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(bttnlogout)
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Inventory List");

        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Stock", "Supplier", "Status"
            }
        ));
        maintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(maintable);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnaddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnaddproductActionPerformed
        String name = txtprodname.getText();
        String qty = txtstockqlty.getText();
        String supplier = txtsupplier.getText();
        String status = cmbstatus.getSelectedItem().toString();

        if (name.isEmpty() || qty.isEmpty() || supplier.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        try {
            String url = "jdbc:mysql://localhost/inventory_management";
            java.sql.Connection conn = java.sql.DriverManager.getConnection(url, "root", "");

            String sql = "INSERT INTO products (product_name, stock_qty, supplier, status) VALUES (?, ?, ?, ?)";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, qty);
            pst.setString(3, supplier);
            pst.setString(4, status);

            pst.executeUpdate();
            javax.swing.JOptionPane.showMessageDialog(this, "Product Added Successfully!");
            showData(); // Refresh table
            clearFields();
            conn.close();
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bttnaddproductActionPerformed

    private void bttnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnupdateActionPerformed
        int row = maintable.getSelectedRow();
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a product from the table to update.");
            return;
        }

        String id = maintable.getValueAt(row, 0).toString();
        String name = txtprodname.getText();
        String qty = txtstockqlty.getText();
        String supplier = txtsupplier.getText();
        String status = cmbstatus.getSelectedItem().toString();

        try {
            String url = "jdbc:mysql://localhost/inventory_management";
            java.sql.Connection con = java.sql.DriverManager.getConnection(url, "root", "");
            
            String sql = "UPDATE products SET product_name=?, stock_qty=?, supplier=? WHERE status=?";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, qty);
            pst.setString(3, supplier);
            pst.setString(4, status);

            pst.executeUpdate();
            
            javax.swing.JOptionPane.showMessageDialog(this, "Product Updated!");
            showData();
            clearFields();
            con.close();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_bttnupdateActionPerformed

    private void bttndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttndeleteActionPerformed
        int row = maintable.getSelectedRow();
        if (row == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a product to delete.");
            return;
        }

        String id = maintable.getValueAt(row, 0).toString();
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, "Delete this product?", "Confirm", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                String url = "jdbc:mysql://localhost/inventory_management";
                java.sql.Connection con = java.sql.DriverManager.getConnection(url, "root", "");

                String sql = "DELETE FROM products WHERE product_id=?";
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, id);
                pst.executeUpdate();

                showData();
                clearFields();
                con.close();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_bttndeleteActionPerformed

    private void bttnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnlogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Are you sure?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
            //mobalik sa login nga jframe
            inventory_login log = new inventory_login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_bttnlogoutActionPerformed

    private void cmbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstatusActionPerformed

    private void maintableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintableMouseClicked
        DefaultTableModel model = (DefaultTableModel) maintable.getModel();
        int i = maintable.getSelectedRow();

        txtprodname.setText(model.getValueAt(i, 1).toString());
        txtstockqlty.setText(model.getValueAt(i,2).toString());
        txtsupplier.setText(model.getValueAt(i,3).toString());
        cmbstatus.setSelectedItem(model.getValueAt(i, 4).toString());

        //I disable and username during pag edit para dili ma change ang ID
        txtprodname.setEditable(false);
    }//GEN-LAST:event_maintableMouseClicked

    public void showData() {
        try {
            DefaultTableModel model = (DefaultTableModel) maintable.getModel();
            model.setRowCount(0); // Clear existing rows

            String url = "jdbc:mysql://localhost:3306/inventory_management";
            java.sql.Connection con = java.sql.DriverManager.getConnection(url, "root", "");

            String sql = "SELECT * FROM products";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("product_id"),
                    rs.getString("product_name"),
                    rs.getString("stock_qty"),
                    rs.getString("supplier"),
                    rs.getString("status")
                });
            }
            con.close();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    // --- HELPER METHOD TO CLEAR FIELDS ---
    private void clearFields() {
        txtprodname.setText("");
        txtstockqlty.setText("");
        txtsupplier.setText("");
        cmbstatus.setSelectedIndex(0);
        txtprodname.setEditable(true); // Re-enable for new entries
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
            java.util.logging.Logger.getLogger(inventory_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lusername1;
    private javax.swing.JLabel Lusername2;
    private javax.swing.JLabel Lusername3;
    private javax.swing.JLabel Lusername4;
    private javax.swing.JLabel Lusername5;
    private javax.swing.JButton bttnaddproduct;
    private javax.swing.JButton bttndelete;
    private javax.swing.JButton bttnlogout;
    private javax.swing.JButton bttnupdate;
    private javax.swing.JComboBox<String> cmbstatus;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable maintable;
    private javax.swing.JTextField txtprodname;
    private javax.swing.JTextField txtstockqlty;
    private javax.swing.JTextField txtsupplier;
    // End of variables declaration//GEN-END:variables
}
