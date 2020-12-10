/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import main.DbHelper;

/**
 *
 * @author hasan
 */
public class Purchased_books extends javax.swing.JFrame {

   Connection connection;
    ResultSet resultSet;
    PreparedStatement preparedStatement;
    
    public Purchased_books() {
        super("Purchased Book");
        initComponents();
        connection = DbHelper.ConnectDb();
    }

    public void table(){
        try{
        String sql = "select * from issue";
         preparedStatement = connection.prepareStatement(sql);
         resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) { 
                String book_id = resultSet.getString("book_id");
                String name = resultSet.getString("name");
                String edition = resultSet.getString("edition");
                String writer = resultSet.getString("writer");
                String price = resultSet.getString("price");
                String pages = resultSet.getString("pages");
                String student_id=resultSet.getString("student_id");
                String s_name = resultSet.getString("s_name");
                String f_name = resultSet.getString("f_name");
                String division = resultSet.getString("division");
                String year = resultSet.getString("year");
                String date = resultSet.getString("date_of_issue");
        
                String tbData[] = {book_id, name, edition, writer , price, pages,student_id,s_name,division,year,date};
                DefaultTableModel tblModel = (DefaultTableModel) tblPurchased.getModel();

                tblModel.addRow(tbData);
        
        
            }
            
    }catch(Exception exception){    
    
    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchased = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPurchased.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "Edition", "Writer", "Price", "Pages", "Student ID", "Student Name", "Division", "Year", "Date of Issue"
            }
        ));
        tblPurchased.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPurchasedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPurchased);

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        AdminHome aHome = new AdminHome();
        aHome.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblPurchasedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPurchasedMouseClicked
         DefaultTableModel tblModel = (DefaultTableModel) tblPurchased.getModel();
        
        String book_id = tblModel.getValueAt(tblPurchased.getSelectedRow(), 0).toString();
        String name = tblModel.getValueAt(tblPurchased.getSelectedRow(), 1).toString();
        String edition = tblModel.getValueAt(tblPurchased.getSelectedRow(), 2).toString();
        String writer = tblModel.getValueAt(tblPurchased.getSelectedRow(), 3).toString();
        String price = tblModel.getValueAt(tblPurchased.getSelectedRow(), 4).toString();
        String pages = tblModel.getValueAt(tblPurchased.getSelectedRow(), 5).toString();
        String student_id = tblModel.getValueAt(tblPurchased.getSelectedRow(), 6).toString();
        String student_name = tblModel.getValueAt(tblPurchased.getSelectedRow(), 7).toString();
        String division = tblModel.getValueAt(tblPurchased.getSelectedRow(), 8).toString();
        String year = tblModel.getValueAt(tblPurchased.getSelectedRow(), 9).toString();
        String date_of_issue = tblModel.getValueAt(tblPurchased.getSelectedRow(), 10).toString();
       
    }//GEN-LAST:event_tblPurchasedMouseClicked

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
            java.util.logging.Logger.getLogger(Purchased_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchased_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchased_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchased_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchased_books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPurchased;
    // End of variables declaration//GEN-END:variables
}