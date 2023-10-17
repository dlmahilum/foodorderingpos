package group3project;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class POS extends javax.swing.JFrame {

    
    public POS() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        btnAddToOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblForOrderRecord = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiptRecorded = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalQty = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        txtRemove = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtRecieptNum = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        Cashier = new javax.swing.JLabel();
        jLabelCashier = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Menu Code", "Menu", "Price", "Category", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblProductList);
        if (tblProductList.getColumnModel().getColumnCount() > 0) {
            tblProductList.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Point of Sale (POS)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(263, 263, 263))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Quantity");

        txtQty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtQty.setText("1");

        btnAddToOrder.setBackground(new java.awt.Color(0, 255, 0));
        btnAddToOrder.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddToOrder.setText("ADD");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddToOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblForOrderRecord.setBorder(new javax.swing.border.MatteBorder(null));
        tblForOrderRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MID", "Price", "Qty", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblForOrderRecord);
        if (tblForOrderRecord.getColumnModel().getColumnCount() > 0) {
            tblForOrderRecord.getColumnModel().getColumn(0).setResizable(false);
            tblForOrderRecord.getColumnModel().getColumn(1).setResizable(false);
            tblForOrderRecord.getColumnModel().getColumn(2).setResizable(false);
            tblForOrderRecord.getColumnModel().getColumn(3).setResizable(false);
        }

        receiptRecorded.setColumns(20);
        receiptRecorded.setRows(5);
        jScrollPane3.setViewportView(receiptRecorded);

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Qty:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Price:");

        txtTotalQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalQty.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalQty.setText("0");

        txtTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalPrice.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pay:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Balance:");

        txtPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayActionPerformed(evt);
            }
        });

        txtBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalPrice)
                    .addComponent(txtTotalQty)
                    .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(txtPay))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalQty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));

        txtRemove.setBackground(new java.awt.Color(255, 102, 0));
        txtRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtRemove.setText("Remove");
        txtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemoveActionPerformed(evt);
            }
        });

        btnCheckOut.setBackground(new java.awt.Color(0, 255, 0));
        btnCheckOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCheckOut.setText("Print");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckOut))
        );

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reciept ID:");

        txtRecieptNum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRecieptNum.setForeground(new java.awt.Color(255, 255, 255));
        txtRecieptNum.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name:");

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Cashier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cashier.setForeground(new java.awt.Color(255, 255, 255));
        Cashier.setText("Cashier:");

        jLabelCashier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCashier.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCashier.setText("CashierName");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRecieptNum, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Cashier)
                                .addGap(17, 17, 17)
                                .addComponent(jLabelCashier)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustomerName)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRecieptNum)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cashier)
                    .addComponent(jLabelCashier)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed
        
        Object[] forTblPOut = new Object[5];
        forTblPOut[0] = tblProductList.getValueAt(tblProductList.getSelectedRow(), 0);
        forTblPOut[1] = tblProductList.getValueAt(tblProductList.getSelectedRow(), 3); 
        forTblPOut[2] = Integer.parseInt(txtQty.getText());
        Double odTotal = Double.parseDouble(txtQty.getText()) 
                * Double.parseDouble(tblProductList.getValueAt(tblProductList.getSelectedRow(), 3).toString());
        
        forTblPOut[3] = String.format("%.2f", odTotal);
        
        DefaultTableModel tblModel = (DefaultTableModel) tblForOrderRecord.getModel();
        tblModel.addRow(forTblPOut);
        
        double totalReceipt = 0;
        int itemSold = 0;
        String printout="";
        for(int i = 0; i < tblForOrderRecord.getRowCount(); i++){
//        JOptionPane.showMessageDialog(this, "awooo");
            itemSold+= Integer.parseInt(tblForOrderRecord.getValueAt(i, 2).toString());
            totalReceipt += Double.parseDouble(tblForOrderRecord.getValueAt(i, 3).toString());
        }
        printout += "Items Sold: " + itemSold;
        printout += "\nTotal Amount: " + totalReceipt;
        JOptionPane.showMessageDialog(this, printout);
        txtTotalQty.setText(String.valueOf(itemSold));
        txtTotalPrice.setText(String.format("%.2f",totalReceipt));
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        POSMethods callPOSMethods = new POSMethods();
        callPOSMethods.getAllRows(tblProductList);
    }//GEN-LAST:event_formWindowOpened

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed

        String customer = txtCustomerName.getText();
        if (customer.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the customer name.");
        return;
    }
        String cashierName = getCashierNameForCurrentUser();  
        int rcQty = Integer.parseInt(txtTotalQty.getText());
        double rcTotal = Double.parseDouble(txtTotalPrice.getText());
        double paymentAmount = Double.parseDouble(txtPay.getText());
        int receiptNumber = 0;
        POSMethods callPOS = new POSMethods();
        
        int result= 0;
        result = callPOS.addNewReceipt(customer, cashierName, rcQty, rcTotal);
        if (result == 1) {
            receiptNumber = callPOS.getReceiptID(customer, cashierName, rcQty, rcTotal);
            txtRecieptNum.setText(String.valueOf(receiptNumber));
            receiptRecorded.setText(receiptRecorded + "\n-reciept " + receiptNumber);
        }
           double balance = paymentAmount - rcTotal;
           txtBalance.setText(String.format("%.2f", balance));

            JOptionPane.showMessageDialog(this, "Receipt " + receiptNumber + "\nBalance: " + String.format("%.2f", balance));
        if (receiptNumber > 0) {
            for(int i = 0; i < tblForOrderRecord.getRowCount(); i++){
    //        JOptionPane.showMessageDialog(this, "awooo");
                int currentPID = Integer.parseInt(tblForOrderRecord.getValueAt(i, 0).toString());
                double currentPrice = Double.parseDouble(tblForOrderRecord.getValueAt(i, 1).toString());  
                int currentQTY = Integer.parseInt(tblForOrderRecord.getValueAt(i, 2).toString());
                double currentTotal = Double.parseDouble(tblForOrderRecord.getValueAt(i, 3).toString());  
                int orderRec = callPOS.addNewOrder(currentPID, currentPrice, currentQTY, currentTotal, receiptNumber);
                if (orderRec == 1) {
                    LocalDateTime dateTimeNow = LocalDateTime.now();
                    LocalDate dateNow = dateTimeNow.toLocalDate();
                    LocalTime timeNow = dateTimeNow.toLocalTime();
                    String rn = txtRecieptNum.getText();
                    receiptRecorded.setText(receiptRecorded + "\n-recorded " + i + 
                            "\n-----------------------------------------------------------------------" +
                            "\n                               CASH RECEIPT                                " +
                            "\n-----------------------------------------------------------------------" +
                            "\n                             retail restaurant                             " + "\n" +
                            "\n      #time                                     "+ timeNow +
                            "\n      #data                                     "+ dateNow +        
                            "\n      #cashier                                  " + cashierName +
                            "\n-----------------------------------------------------------------------" +
                            "\n      Customer Name:    "+customer+
                            "\n      Receipt No.  " + rn +
                            "\n      Product Quantity:       " +rcQty + 
                            "\n      Total Amount:                           " + rcTotal + "  " + "\n" +
                            "\n      Pay:                           " + paymentAmount + "  " + "\n" +
                            "\n      Change:                           " + balance + "  " + "\n" +
                            "\n                        THANK YOU AND COME AGAIN!!!");
                    
                }
            }
        }
        
        
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void txtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemoveActionPerformed
        int selectedRow = tblForOrderRecord.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to remove.");
        return; // No row selected, exit the method
    }

    // Remove the selected row from the table
    DefaultTableModel tblModel = (DefaultTableModel) tblForOrderRecord.getModel();
    tblModel.removeRow(selectedRow);
       
    }//GEN-LAST:event_txtRemoveActionPerformed

    private void txtPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayActionPerformed
            double paymentAmount = Double.parseDouble(txtPay.getText());
    
    // Calculate the balance
    double rcTotal = Double.parseDouble(txtTotalPrice.getText());
    double balance = paymentAmount - rcTotal;
    
    // Display the balance in the txtBalance field
    txtBalance.setText(String.format("%.2f", balance));
    }//GEN-LAST:event_txtPayActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
      
    }//GEN-LAST:event_txtBalanceActionPerformed

    private String getCashierNameForCurrentUser() {
    // Add your logic here to fetch the cashier's name
    return "John Doe"; // Replace with the actual logic
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }
    public void cleanForm(){
        txtQty.setText("1");
        txtTotalQty.setText("0");
        txtTotalPrice.setText("0.00");
        receiptRecorded.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cashier;
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCashier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea receiptRecorded;
    private javax.swing.JTable tblForOrderRecord;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtQty;
    private javax.swing.JLabel txtRecieptNum;
    private javax.swing.JButton txtRemove;
    private javax.swing.JLabel txtTotalPrice;
    private javax.swing.JLabel txtTotalQty;
    // End of variables declaration//GEN-END:variables
}
