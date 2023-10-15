package group3project;


import javax.swing.JOptionPane;



public class MenuList extends javax.swing.JFrame {


    public MenuList() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jToggleButton2 = new javax.swing.JToggleButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        menumainPanel = new javax.swing.JPanel();
        menutablePanel = new javax.swing.JPanel();
        lbl_Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        menusearchPanel = new javax.swing.JPanel();
        opSearchCmb = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        addmenuPanel = new javax.swing.JPanel();
        lbl_mname = new javax.swing.JLabel();
        menuTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priceDouble = new javax.swing.JTextField();
        lbl_category = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        statCmb = new javax.swing.JComboBox<>();
        categoryCmb = new javax.swing.JComboBox<>();
        lblmID = new javax.swing.JLabel();
        lbl_mcode = new javax.swing.JLabel();
        mcodeTxt = new javax.swing.JTextField();
        lbl_ID = new javax.swing.JLabel();
        menubtnPanel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btn_mu = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton2.setText("jToggleButton2");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        menumainPanel.setBackground(new java.awt.Color(255, 0, 51));
        menumainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        menutablePanel.setBackground(new java.awt.Color(255, 255, 0));

        lbl_Title.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Title.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        lbl_Title.setText("FOOD MENU LIST ");

        menuTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Menu Code", "Menu", "Price", "Category", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(menuTable);

        menusearchPanel.setBackground(new java.awt.Color(255, 255, 0));

        opSearchCmb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        opSearchCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu", "Menu Code", "Category" }));

        searchTxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchTxt.setToolTipText("");
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 204, 204));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menusearchPanelLayout = new javax.swing.GroupLayout(menusearchPanel);
        menusearchPanel.setLayout(menusearchPanelLayout);
        menusearchPanelLayout.setHorizontalGroup(
            menusearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opSearchCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addContainerGap())
        );
        menusearchPanelLayout.setVerticalGroup(
            menusearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menusearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menusearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(searchTxt)
                    .addComponent(opSearchCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout menutablePanelLayout = new javax.swing.GroupLayout(menutablePanel);
        menutablePanel.setLayout(menutablePanelLayout);
        menutablePanelLayout.setHorizontalGroup(
            menutablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menutablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menutablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(menutablePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menusearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menutablePanelLayout.createSequentialGroup()
                        .addComponent(lbl_Title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menutablePanelLayout.setVerticalGroup(
            menutablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menutablePanelLayout.createSequentialGroup()
                .addGroup(menutablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Title)
                    .addGroup(menutablePanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(menusearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        addmenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 5));

        lbl_mname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_mname.setText("Menu Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Price:");

        lbl_category.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_category.setText("Category: ");

        lbl_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_status.setText("Status:");

        statCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Available", "Not Available" }));
        statCmb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        categoryCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Breakfast", "Lunch", "Dinner", "Drinks", "Dessert", "Snacks" }));

        lblmID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblmID.setText("0");

        lbl_mcode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_mcode.setText("Menu Code:");

        lbl_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ID.setText("Menu ID: ");

        javax.swing.GroupLayout addmenuPanelLayout = new javax.swing.GroupLayout(addmenuPanel);
        addmenuPanel.setLayout(addmenuPanelLayout);
        addmenuPanelLayout.setHorizontalGroup(
            addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addmenuPanelLayout.createSequentialGroup()
                        .addComponent(lbl_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addmenuPanelLayout.createSequentialGroup()
                        .addComponent(lbl_mcode)
                        .addGap(10, 10, 10)
                        .addComponent(mcodeTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addmenuPanelLayout.createSequentialGroup()
                        .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_mname)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuTxt)
                            .addComponent(priceDouble))
                        .addGap(15, 15, 15)))
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_category)
                    .addComponent(lbl_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statCmb, 0, 1, Short.MAX_VALUE)
                    .addComponent(categoryCmb, 0, 1, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        addmenuPanelLayout.setVerticalGroup(
            addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ID)
                    .addComponent(lblmID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_category)
                    .addComponent(categoryCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mcode))
                .addGap(14, 14, 14)
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mname)
                    .addComponent(lbl_status)
                    .addComponent(statCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(addmenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceDouble, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        menubtnPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3));

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("X");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btn_mu.setBackground(new java.awt.Color(51, 255, 255));
        btn_mu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_mu.setText("Modify Users");
        btn_mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 255, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(255, 255, 51));
        btnedit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnedit.setText("Edit List");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menubtnPanelLayout = new javax.swing.GroupLayout(menubtnPanel);
        menubtnPanel.setLayout(menubtnPanelLayout);
        menubtnPanelLayout.setHorizontalGroup(
            menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menubtnPanelLayout.createSequentialGroup()
                        .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_mu)
                            .addComponent(btnLogout))
                        .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menubtnPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(menubtnPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menubtnPanelLayout.createSequentialGroup()
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menubtnPanelLayout.setVerticalGroup(
            menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_mu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menubtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menumainPanelLayout = new javax.swing.GroupLayout(menumainPanel);
        menumainPanel.setLayout(menumainPanelLayout);
        menumainPanelLayout.setHorizontalGroup(
            menumainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menumainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menumainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menutablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menumainPanelLayout.createSequentialGroup()
                        .addComponent(addmenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menubtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        menumainPanelLayout.setVerticalGroup(
            menumainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menumainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menutablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menumainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addmenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menubtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menumainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menumainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        MethodMenuList callMethod = new MethodMenuList();
        String boxMessage = "";
        int boxIcon = 0;
        
        try {
            String mcode;
            String menu;
            double price;
            String cname;
            String status;
            
            mcode = mcodeTxt.getText();
            menu = menuTxt.getText();
            price = Double.parseDouble(priceDouble.getText());
            cname = categoryCmb.getSelectedItem().toString();
            status = statCmb.getSelectedItem().toString();   
            

            int result = callMethod.addNewRow(mcode,menu, price, cname, status);

            switch (result) {
                case 1:
                    boxMessage = "New Row Added";
                    boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                    boxMessage = "Row Not Added";
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
        callMethod.getAllRows(menuTable);
        JOptionPane.showMessageDialog(this, boxMessage, "Input Result", boxIcon);
    
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        MethodMenuList callMethod = new MethodMenuList();
        callMethod.getAllRows(menuTable);
        cleanForm();
    }//GEN-LAST:event_formWindowOpened

    
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        int tableRow = menuTable.getSelectedRow();
        
        lblmID.setText(menuTable.getValueAt(tableRow, 0).toString());
        mcodeTxt.setText(menuTable.getValueAt(tableRow, 1).toString());
        menuTxt.setText(menuTable.getValueAt(tableRow, 2).toString());
        priceDouble.setText(menuTable.getValueAt(tableRow,3).toString());
        categoryCmb.setSelectedItem(menuTable.getValueAt(tableRow,4).toString());
        statCmb.setSelectedItem(menuTable.getValueAt(tableRow,5).toString());   
        
        toUpdateDelete();

    }//GEN-LAST:event_btneditActionPerformed

    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        MethodMenuList callMethod = new MethodMenuList();
        String boxMessage = "";
        int boxIcon = 0;

        try {
            String mcode;
            String menu;
            double price;
            String cname;
            String status;
            int mID;
            
            mcode = mcodeTxt.getText();
            menu = menuTxt.getText();
            price = Double.parseDouble(priceDouble.getText());
            cname = categoryCmb.getSelectedItem().toString();
            status = statCmb.getSelectedItem().toString();
            mID = Integer.parseInt(lblmID.getText());


            int result = callMethod.updateRow(mcode, menu, price, cname, status, mID);

            switch (result) {
                case 1:
                    boxMessage = "Row Updated";
                    boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                    boxMessage = "Update Failed";
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
        callMethod.getAllRows(menuTable);
        cleanForm();
        JOptionPane.showMessageDialog(this, boxMessage, "Input Result", boxIcon);
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        MethodMenuList callMethod = new MethodMenuList();
        String boxMessage = "";
        int boxIcon = 0;
        
        int tableRow = menuTable.getSelectedRow();
        int ID = Integer.valueOf(menuTable.getValueAt(tableRow, 0).toString());
        String code = menuTable.getValueAt(tableRow, 1).toString();
        String menu = menuTable.getValueAt(tableRow, 2).toString();
        
        
        String deleteInfo = "ID: " + ID + "\nMenu: " + code + " " + menu;
        int result = JOptionPane.showConfirmDialog(this
                , String.format("Do you want to delete:%n%s",deleteInfo)
                , "DELETING ROW"
                , JOptionPane.YES_NO_OPTION
                , JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            int rowDeleted = callMethod.deleteRow(ID);
            switch (rowDeleted) {
                case 1:
                    boxMessage = "Row Deleted";
                    boxIcon = JOptionPane.INFORMATION_MESSAGE;
                break;
                case 0:
                    boxMessage = "Delete Failed";
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
        callMethod.getAllRows(menuTable);

    }//GEN-LAST:event_btnDeleteActionPerformed

    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        cleanForm();
        
    }//GEN-LAST:event_btnCancelActionPerformed

    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String refColumn = opSearchCmb.getSelectedItem().toString();
        String refValue = searchTxt.getText();
                           
        MethodMenuList callMethod = new MethodMenuList();
        callMethod.getAllRows(menuTable, refColumn, refValue);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        // TODO add your handling code here:
        String refColumn = opSearchCmb.getSelectedItem().toString();
        String refValue = searchTxt.getText();
                           
        MethodMenuList callMethod = new MethodMenuList();
        callMethod.getAllRows(menuTable, refColumn, refValue);
    }//GEN-LAST:event_searchTxtKeyReleased

    private void btn_muActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muActionPerformed
        // TODO add your handling code here:
        UsersUpdate callMethod = new UsersUpdate();
        callMethod.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_muActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "", JOptionPane.YES_NO_OPTION
                , JOptionPane.WARNING_MESSAGE);
        
        if (result == JOptionPane.YES_OPTION){
            LoginForm callLogOut = new LoginForm();
            callLogOut.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuList().setVisible(true);
            }
        });
    }
 
    public void cleanForm() {
         lblmID.setText("0");
         mcodeTxt.setText("");
         menuTxt.setText("");
         priceDouble.setText("");
         categoryCmb.setSelectedIndex(0);
         statCmb.setSelectedIndex(0); 
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
    private javax.swing.JPanel addmenuPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_mu;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> categoryCmb;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbl_ID;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_category;
    private javax.swing.JLabel lbl_mcode;
    private javax.swing.JLabel lbl_mname;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lblmID;
    private javax.swing.JTextField mcodeTxt;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField menuTxt;
    private javax.swing.JPanel menubtnPanel;
    private javax.swing.JPanel menumainPanel;
    private javax.swing.JPanel menusearchPanel;
    private javax.swing.JPanel menutablePanel;
    private javax.swing.JComboBox<String> opSearchCmb;
    private javax.swing.JTextField priceDouble;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox<String> statCmb;
    // End of variables declaration//GEN-END:variables
}
