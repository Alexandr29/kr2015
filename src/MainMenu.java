
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {
    private Gym gym;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        gym = new Gym();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        addAccountButton = new javax.swing.JButton();
        removeAccountButton = new javax.swing.JButton();
        trainigsButton = new javax.swing.JButton();
        usedButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gym application");

        addAccountButton.setText("Add account");
        addAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountButtonActionPerformed(evt);
            }
        });

        removeAccountButton.setText("Remove account");
        removeAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAccountButtonActionPerformed(evt);
            }
        });

        trainigsButton.setText("+1 visit");
        trainigsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainigsButtonActionPerformed(evt);
            }
        });

        usedButton.setText("balance");
        usedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usedButtonActionPerformed(evt);
            }
        });

        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Account Type", "Account Number", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setResizable(false);
            accountTable.getColumnModel().getColumn(1).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setResizable(false);
            accountTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(addAccountButton)
                .addGap(18, 18, 18)
                .addComponent(removeAccountButton)
                .addGap(18, 18, 18)
                .addComponent(trainigsButton)
                .addGap(18, 18, 18)
                .addComponent(usedButton)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAccountButton)
                    .addComponent(removeAccountButton)
                    .addComponent(trainigsButton)
                    .addComponent(usedButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addContainerGap())
        );

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountButtonActionPerformed
        addAccountMenu menu = new addAccountMenu(this, true, gym);
        menu.setVisible(true);
        if(menu.getCustomer()!=null){
            addCustomerToTable(menu.getCustomer());
        }
    }//GEN-LAST:event_addAccountButtonActionPerformed

    private void removeAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAccountButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
         if(selectedRow>=0){
        Customer customer = getSelectedCostumer(selectedRow);
        gym.removeCustomer(customer);
        removeCustomerFromTable(selectedRow);
         }
        //getSelectedCostumer();
    }//GEN-LAST:event_removeAccountButtonActionPerformed

    private void usedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usedButtonActionPerformed
        int bal;
        int selectedRow = accountTable.getSelectedRow();
         if(selectedRow>=0){
        Customer customer = getSelectedCostumer(selectedRow);
        if(customer.getAccount().toString()=="4 Trainings"){
          customer.getAccount().setBalance(4-customer.getAccount().getUsed());
        }else if(customer.getAccount().toString()=="8 Trainings"){
            customer.getAccount().setBalance(8-customer.getAccount().getUsed());
        }else{
             customer.getAccount().setBalance(12-customer.getAccount().getUsed());
        }
        
        JOptionPane.showMessageDialog(this, customer.getAccount().getBalance());
         }
    }//GEN-LAST:event_usedButtonActionPerformed

    private void trainigsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainigsButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
         if(selectedRow>=0){
        Customer customer = getSelectedCostumer(selectedRow);
        if(customer.getAccount().getBalance()>0){
          customer.getAccount().setUsed(customer.getAccount().getUsed()+1);
        JOptionPane.showMessageDialog(this,customer.getAccount().getUsed());   
        }
       
         }
    }//GEN-LAST:event_trainigsButtonActionPerformed
    
    private void removeCustomerFromTable(int row){
              DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
              model.removeRow(accountTable.getSelectedRow());
    }
    
    private Customer getSelectedCostumer(int selectedRow){
        Customer customer = null;
        if(selectedRow>=0){
            int accountNumber = (Integer) accountTable.getValueAt(selectedRow, 3);
            customer = gym.getCustomerByAcoountNumber(accountNumber);
        }
        return customer;
    }
    
    private void addCustomerToTable(Customer customer){
       
      if(customer.getAccount().toString()=="4 Trainings"){
          customer.getAccount().setBalance(4-customer.getAccount().getUsed());
        }else if(customer.getAccount().toString()=="8 Trainings"){
            customer.getAccount().setBalance(8-customer.getAccount().getUsed());
        }else{
             customer.getAccount().setBalance(12-customer.getAccount().getUsed());
        }
        
       DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
       model.addRow(new Object[]{ customer.getFirstName(),customer.getLastName(), customer.getAccount(),customer.getAccount().getAccountNumber(),customer.getAccount().getBalance()});
    }
    
    private void reloadTable(){
        
        
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
            
            
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addAccountButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton removeAccountButton;
    private javax.swing.JButton trainigsButton;
    private javax.swing.JButton usedButton;
    // End of variables declaration//GEN-END:variables
}
