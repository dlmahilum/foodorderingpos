/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3project;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UsersUpdate extends javax.swing.JFrame {

    /**
     * Creates new form UsersUpdate
     */
    public UsersUpdate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersmainPanel = new javax.swing.JPanel();
        usersTablePanel = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        usersearchPanel = new javax.swing.JPanel();
        opSearchCmb = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        adduserPanel = new javax.swing.JPanel();
        lbluname = new javax.swing.JLabel();
        unameTxt = new javax.swing.JTextField();
        lblpswd = new javax.swing.JLabel();
        lblutype = new javax.swing.JLabel();
        utypeCmb = new javax.swing.JComboBox<>();
        lbluID = new javax.swing.JLabel();
        lblfullname = new javax.swing.JLabel();
        flnTxt = new javax.swing.JTextField();
        lbluid = new javax.swing.JLabel();
        pwdTxt = new javax.swing.JPasswordField();
        userbtnPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btn_mml = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        usersmainPanel.setBackground(new java.awt.Color(255, 0, 51));
        usersmainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        usersTablePanel.setBackground(new java.awt.Color(255, 255, 0));

        lbl_Title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Title.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        lbl_Title.setText("USER UPDATE");

        userTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Username", "User Type", "Date"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        usersearchPanel.setBackground(new java.awt.Color(255, 255, 0));

        opSearchCmb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        opSearchCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Name", "Username" }));

        searchTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchTxt.setToolTipText("");
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usersearchPanelLayout = new javax.swing.GroupLayout(usersearchPanel);
        usersearchPanel.setLayout(usersearchPanelLayout);
        usersearchPanelLayout.setHorizontalGroup(
            usersearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opSearchCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        usersearchPanelLayout.setVerticalGroup(
            usersearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchTxt)
                    .addComponent(opSearchCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout usersTablePanelLayout = new javax.swing.GroupLayout(usersTablePanel);
        usersTablePanel.setLayout(usersTablePanelLayout);
        usersTablePanelLayout.setHorizontalGroup(
            usersTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                    .addGroup(usersTablePanelLayout.createSequentialGroup()
                        .addGroup(usersTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usersearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Title))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        usersTablePanelLayout.setVerticalGroup(
            usersTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersTablePanelLayout.createSequentialGroup()
                .addComponent(lbl_Title)
                .addGap(7, 7, 7)
                .addComponent(usersearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        adduserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        lbluname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbluname.setText("Username:");

        unameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblpswd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblpswd.setText("Password:");

        lblutype.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblutype.setText("User Type");

        utypeCmb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        utypeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "admin", "cashier" }));

        lbluID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbluID.setText("0");

        lblfullname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblfullname.setText("Full Name:");

        flnTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lbluid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbluid.setText("User ID: ");

        pwdTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pwdTxt.setText("jPasswordField1");

        javax.swing.GroupLayout adduserPanelLayout = new javax.swing.GroupLayout(adduserPanel);
        adduserPanel.setLayout(adduserPanelLayout);
        adduserPanelLayout.setHorizontalGroup(
            adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adduserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adduserPanelLayout.createSequentialGroup()
                        .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpswd)
                            .addComponent(lbluname))
                        .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adduserPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(unameTxt))
                            .addGroup(adduserPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pwdTxt))))
                    .addGroup(adduserPanelLayout.createSequentialGroup()
                        .addComponent(lbluid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbluID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(adduserPanelLayout.createSequentialGroup()
                        .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblutype)
                            .addComponent(lblfullname))
                        .addGap(18, 18, 18)
                        .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flnTxt)
                            .addComponent(utypeCmb, 0, 418, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        adduserPanelLayout.setVerticalGroup(
            adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adduserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbluid)
                    .addComponent(lbluID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfullname)
                    .addComponent(flnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblutype)
                    .addComponent(utypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluname))
                .addGroup(adduserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adduserPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblpswd))
                    .addGroup(adduserPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pwdTxt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userbtnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));

        btnAdd.setBackground(new java.awt.Color(0, 255, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(255, 255, 51));
        btnedit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnedit.setText("Edit User Info");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("X");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btn_mml.setBackground(new java.awt.Color(0, 255, 255));
        btn_mml.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_mml.setText("Modify Menu List");
        btn_mml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mmlActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userbtnPanelLayout = new javax.swing.GroupLayout(userbtnPanel);
        userbtnPanel.setLayout(userbtnPanelLayout);
        userbtnPanelLayout.setHorizontalGroup(
            userbtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userbtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userbtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userbtnPanelLayout.createSequentialGroup()
                        .addComponent(btnedit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userbtnPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userbtnPanelLayout.createSequentialGroup()
                        .addComponent(btn_mml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        userbtnPanelLayout.setVerticalGroup(
            userbtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userbtnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userbtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userbtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mml, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        javax.swing.GroupLayout usersmainPanelLayout = new javax.swing.GroupLayout(usersmainPanel);
        usersmainPanel.setLayout(usersmainPanelLayout);
        usersmainPanelLayout.setHorizontalGroup(
            usersmainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usersmainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usersmainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(usersmainPanelLayout.createSequentialGroup()
                        .addComponent(adduserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(userbtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        usersmainPanelLayout.setVerticalGroup(
            usersmainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersmainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usersTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(usersmainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userbtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adduserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usersmainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usersmainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        String boxMessage = "";
        int boxIcon = 0;

        try {
            String flname;
            String username;
            String password;
            String usertype;
            int uID;

            flname = flnTxt.getText();
            username = unameTxt.getText();
            password = pwdTxt.getText();
            usertype = utypeCmb.getSelectedItem().toString();
            uID = Integer.parseInt(lbluID.getText());

            int result = callMethod.updateRow(flname, username, password, usertype, uID);

            switch (result) {
                case 1:
                boxMessage = "User Updated";
                boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                boxMessage = "Update User Failed";
                boxIcon = JOptionPane.WARNING_MESSAGE;
                break;
                case -1:
                boxMessage = "Connection Error";
                boxIcon = JOptionPane.ERROR_MESSAGE;
                break;
            }
        } catch (Exception e) {
            boxMessage = "One of the input is invalid";
            boxIcon = JOptionPane.ERROR_MESSAGE;
        }
        callMethod.getAllRows(userTable);
        cleanForm();
        JOptionPane.showMessageDialog(this, boxMessage, "Input Result", boxIcon);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        String boxMessage = "";
        int boxIcon = 0;

        int tableRow = userTable.getSelectedRow();
        int ID = Integer.valueOf(userTable.getValueAt(tableRow, 0).toString());
        String flname = userTable.getValueAt(tableRow, 1).toString();

        String deleteInfo = "ID: " + ID + "\nUser: " + flname;
        int result = JOptionPane.showConfirmDialog(this
            , String.format("Do you want to delete:%n%s",deleteInfo)
            , "DELETING ROW"
            , JOptionPane.YES_NO_OPTION
            , JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            int rowDeleted = callMethod.deleteRow(ID);
            switch (rowDeleted) {
                case 1:
                boxMessage = "User Deleted";
                boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                boxMessage = "Delete User Failed";
                boxIcon = JOptionPane.WARNING_MESSAGE;
                break;
                case -1:
                boxMessage = "Connection Error";
                boxIcon = JOptionPane.ERROR_MESSAGE;
                break;
            }
            JOptionPane.showMessageDialog(this, boxMessage
                , "Input Result", boxIcon);
        }
        callMethod.getAllRows(userTable);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        String boxMessage = "";
        int boxIcon = 0;

        try {
            String flname;
            String username;
            String password;
            String usertype;

            flname = flnTxt.getText();
            username = unameTxt.getText();
            password = pwdTxt.getText();
            usertype = utypeCmb.getSelectedItem().toString();

            int result = callMethod.addNewRow(flname,username, password, usertype);

            switch (result) {
                case 1:
                boxMessage = "New User Added";
                boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                boxMessage = " User Add Failed";
                boxIcon = JOptionPane.WARNING_MESSAGE;
                break;
                case -1:
                boxMessage = "Connection Error";
                boxIcon = JOptionPane.ERROR_MESSAGE;
                break;
            }

            cleanForm();
        } catch (Exception e) {
            boxMessage = "One of the input is invalid";
            boxIcon = JOptionPane.ERROR_MESSAGE;
        }
        callMethod.getAllRows(userTable);
        JOptionPane.showMessageDialog(this, boxMessage, "Input Result", boxIcon);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:

        int tableRow = userTable.getSelectedRow();

        lbluID.setText(userTable.getValueAt(tableRow, 0).toString());
        flnTxt.setText(userTable.getValueAt(tableRow, 1).toString());
        unameTxt.setText(userTable.getValueAt(tableRow, 2).toString());
        pwdTxt.setText(userTable.getValueAt(tableRow,3).toString());
        utypeCmb.setSelectedItem(userTable.getValueAt(tableRow,4).toString());

        toUpdateDelete();
    }//GEN-LAST:event_btneditActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        cleanForm();

    }//GEN-LAST:event_btnCancelActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        // TODO add your handling code here:
        String refColumn = opSearchCmb.getSelectedItem().toString();
        String refValue = searchTxt.getText();

        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        callMethod.getAllRows(userTable, refColumn, refValue);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String refColumn = opSearchCmb.getSelectedItem().toString();
        String refValue = searchTxt.getText();

        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        callMethod.getAllRows(userTable, refColumn, refValue);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        MethodsUsersUpdate callMethod = new MethodsUsersUpdate();
        callMethod.getAllRows(userTable);
        cleanForm();
    }//GEN-LAST:event_formWindowOpened

    private void btn_mmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mmlActionPerformed
        // TODO add your handling code here:
        MenuList callMethod = new MenuList();
        callMethod.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_mmlActionPerformed

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
            java.util.logging.Logger.getLogger(UsersUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersUpdate().setVisible(true);
            }
        });
    }
    
    public void cleanForm() {
         lbluID.setText("0");
         flnTxt.setText("");
         unameTxt.setText("");
         pwdTxt.setText("");
         utypeCmb.setSelectedIndex(0);
         btnAdd.setEnabled(true);
         btnedit.setEnabled(true);
         btnUpdate.setEnabled(false);
         btnDelete.setEnabled(false);
    }
    
    public void toUpdateDelete() {
        btnAdd.setEnabled(false);
        btnedit.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adduserPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_mml;
    private javax.swing.JButton btnedit;
    private javax.swing.JTextField flnTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lblfullname;
    private javax.swing.JLabel lblpswd;
    private javax.swing.JLabel lbluID;
    private javax.swing.JLabel lbluid;
    private javax.swing.JLabel lbluname;
    private javax.swing.JLabel lblutype;
    private javax.swing.JComboBox<String> opSearchCmb;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField unameTxt;
    private javax.swing.JTable userTable;
    private javax.swing.JPanel userbtnPanel;
    private javax.swing.JPanel usersTablePanel;
    private javax.swing.JPanel usersearchPanel;
    private javax.swing.JPanel usersmainPanel;
    private javax.swing.JComboBox<String> utypeCmb;
    // End of variables declaration//GEN-END:variables
}
