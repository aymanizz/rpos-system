package main.java.form;

import java.util.List;

import main.java.model.ItemModel;

public class BillPanel extends javax.swing.JPanel {

    public BillPanel() {
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

        javax.swing.JPanel InformationPanel = new javax.swing.JPanel();
        javax.swing.JLabel totalLabel = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        javax.swing.JLabel recievedLabel = new javax.swing.JLabel();
        recievedField = new javax.swing.JTextField();
        javax.swing.JLabel changeLabel = new javax.swing.JLabel();
        changeField = new javax.swing.JTextField();
        printButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        javax.swing.JPanel addItemPanel = new javax.swing.JPanel();
        javax.swing.JLabel searchDescLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        javax.swing.JScrollPane itemsPanel = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        quantityField = new javax.swing.JTextField();
        unitPriceField = new javax.swing.JTextField();
        javax.swing.JLabel unitPriceLabel = new javax.swing.JLabel();
        javax.swing.JLabel quantityLabel = new javax.swing.JLabel();
        javax.swing.JLabel totalPrice = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        javax.swing.JPanel CartPanel = new javax.swing.JPanel();
        tablePanel = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        InformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Information"));
        InformationPanel.setPreferredSize(new java.awt.Dimension(547, 75));

        totalLabel.setLabelFor(totalField);
        totalLabel.setText("Total");

        totalField.setEditable(false);
        totalField.setText("0.0");

        recievedLabel.setLabelFor(recievedField);
        recievedLabel.setText("Received");

        recievedField.setText("0.0");
        recievedField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                recievedFieldCaretUpdate(evt);
            }
        });

        changeLabel.setLabelFor(changeField);
        changeLabel.setText("Change");

        changeField.setEditable(false);
        changeField.setText("0.0");
        changeField.setToolTipText("");

        printButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/print.png"))); // NOI18N
        printButton.setText("Print");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/done.png"))); // NOI18N
        doneButton.setText("Done");
        doneButton.setEnabled(false);
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformationPanelLayout = new javax.swing.GroupLayout(InformationPanel);
        InformationPanel.setLayout(InformationPanelLayout);
        InformationPanelLayout.setHorizontalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalLabel)
                .addGap(18, 18, 18)
                .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recievedLabel)
                .addGap(18, 18, 18)
                .addComponent(recievedField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changeLabel)
                .addGap(18, 18, 18)
                .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(printButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doneButton)
                .addContainerGap())
        );
        InformationPanelLayout.setVerticalGroup(
            InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recievedLabel)
                    .addComponent(recievedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeLabel)
                    .addComponent(changeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton)
                    .addComponent(doneButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(InformationPanel, java.awt.BorderLayout.PAGE_END);

        addItemPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Item"));

        searchDescLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/find.png"))); // NOI18N
        searchDescLabel.setLabelFor(searchField);
        searchDescLabel.setText("Search by barcode or name");

        searchField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchFieldCaretUpdate(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        itemsList.setModel(new javax.swing.DefaultListModel());
        itemsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        this.populateItemsList(items);
        itemsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                itemsListValueChanged(evt);
            }
        });
        itemsPanel.setViewportView(itemsList);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        quantityField.setText("1");
        quantityField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                quantityFieldCaretUpdate(evt);
            }
        });
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        unitPriceField.setEditable(false);
        unitPriceField.setText("0.0");

        unitPriceLabel.setLabelFor(unitPriceField);
        unitPriceLabel.setText("Unit Price");

        quantityLabel.setLabelFor(quantityField);
        quantityLabel.setText("Quantity");

        totalPrice.setLabelFor(totalPriceField);
        totalPrice.setText("Total Price");

        totalPriceField.setEditable(false);
        totalPriceField.setText("0.0");

        javax.swing.GroupLayout addItemPanelLayout = new javax.swing.GroupLayout(addItemPanel);
        addItemPanel.setLayout(addItemPanelLayout);
        addItemPanelLayout.setHorizontalGroup(
            addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemsPanel)
                    .addComponent(searchDescLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addItemPanelLayout.createSequentialGroup()
                        .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unitPriceLabel)
                            .addComponent(quantityLabel)
                            .addComponent(totalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addItemPanelLayout.createSequentialGroup()
                                .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(unitPriceField)
                            .addComponent(quantityField))))
                .addContainerGap())
        );
        addItemPanelLayout.setVerticalGroup(
            addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemsPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(totalPrice)
                    .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        add(addItemPanel, java.awt.BorderLayout.LINE_START);

        CartPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cart"));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Unit Price", "Quantity", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cartTable.getTableHeader().setReorderingAllowed(false);
        cartTableModel = (javax.swing.table.DefaultTableModel) cartTable.getModel();
        tablePanel.setViewportView(cartTable);

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/update.png"))); // NOI18N
        updateButton.setText("update");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/images/delete.png"))); // NOI18N
        deleteButton.setText("delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CartPanelLayout = new javax.swing.GroupLayout(CartPanel);
        CartPanel.setLayout(CartPanelLayout);
        CartPanelLayout.setHorizontalGroup(
            CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartPanelLayout.createSequentialGroup()
                        .addGap(0, 377, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton)))
                .addContainerGap())
        );
        CartPanelLayout.setVerticalGroup(
            CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CartPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(CartPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void recievedFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_recievedFieldCaretUpdate
        boolean valid = validate(recievedField, positiveFloatValidator);
        if (valid) {
            double change = Double.parseDouble(recievedField.getText())
                        - Double.parseDouble(totalField.getText());
            if (change < 0) {
                valid = false;
                recievedField.setForeground(java.awt.Color.RED);
            } else if (cartTableModel.getRowCount() != 0) {
                changeField.setText(Double.toString(change));
                doneButton.setEnabled(true);
                printButton.setEnabled(true);
            }
        }
        
        if (!valid) { // this can happen even if the first `if` is executed
            changeField.setText("0.0");
            doneButton.setEnabled(false);
            printButton.setEnabled(false);
        }
    }//GEN-LAST:event_recievedFieldCaretUpdate

    private void quantityFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_quantityFieldCaretUpdate
        if (validate(quantityField, positiveIntegerValidator)) {
            double totalPrice = Double.parseDouble(quantityField.getText())
                                * Double.parseDouble(unitPriceField.getText());
            totalPriceField.setText(Double.toString(totalPrice));
        } else {
            totalPriceField.setText("0.0");
        }
        
        setButtonsEnabledState();
    }//GEN-LAST:event_quantityFieldCaretUpdate

    private void itemsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_itemsListValueChanged
        if (!evt.getValueIsAdjusting()) {
            int index = itemsList.getSelectedIndex();
            if (index != -1) {
                ItemModel item = (ItemModel) (
                    (javax.swing.ListModel)itemsList.getModel())
                        .getElementAt(index);
                try {
                    unitPriceField.setText(Double.toString(item.getPrice()));
                    totalPriceField.setText(Double.toString(item.getPrice()
                            * Integer.parseInt(quantityField.getText())));
                } catch (NumberFormatException ex) {
                    unitPriceField.setText("0.0");
                }
            } else {
                unitPriceField.setText("0.0");
            }
        }
        
        setButtonsEnabledState();
    }//GEN-LAST:event_itemsListValueChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int index = itemsList.getSelectedIndex();
        
        if (index != -1 && validate(quantityField, positiveIntegerValidator)) {
            int quantity = Integer.parseInt(quantityField.getText());
            int insertLocation = cartTableModel.getRowCount();
            double totalPrice = Double.parseDouble(totalPriceField.getText());
            double billTotal =
                    Double.parseDouble(totalField.getText()) + totalPrice;
            ItemModel item = (ItemModel) (
                (javax.swing.ListModel) itemsList.getModel())
                    .getElementAt(itemsList.getSelectedIndex());
            
            for (int row = 0; row < cartTable.getRowCount(); ++row) {
                ItemModel other_item = (ItemModel) cartTable.getValueAt(row, 0);
                
                if (other_item.equals(item)) {
                    insertLocation = row;
                    quantity += (Integer) cartTable.getValueAt(row, 2);
                    totalPrice += (Double) cartTable.getValueAt(row, 3);
                    cartTableModel.removeRow(row);
                    break;
                }
            }

            cartTableModel.insertRow(insertLocation, new Object[] {
                item, item.getPrice(), quantity, totalPrice
            });
            
            updateBill(billTotal);
        }
        
        setButtonsEnabledState();
    }//GEN-LAST:event_addButtonActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        if (validate(quantityField, positiveIntegerValidator))
            addButtonActionPerformed(null);
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        if (validate(searchField, searchFieldValidator)) {
            itemsList.setSelectedIndex(0);
            quantityField.requestFocusInWindow();
            quantityField.setText("1");
            quantityField.selectAll();
        }
    }//GEN-LAST:event_searchFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = cartTable.getSelectedRow();
        
        if (selectedRow != -1) {
            int selectedValue = javax.swing.JOptionPane.showConfirmDialog(
                this, "Are you sure you want to delete selected item?",
                "Delete Item", javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.WARNING_MESSAGE);
            
            if (selectedValue == 0) {
                ItemModel item = (ItemModel) cartTableModel
                        .getValueAt(selectedRow, 0);
                int quantity = (int) cartTableModel.getValueAt(selectedRow, 2);
                double total = Double.parseDouble(totalField.getText());
                total -= item.getPrice() * quantity;
                cartTableModel.removeRow(selectedRow);
                updateBill(total);
                setButtonsEnabledState();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int selectedRow = cartTable.getSelectedRow();
        
        if (selectedRow != -1) {
            ItemModel item = (ItemModel) cartTableModel
                    .getValueAt(selectedRow, 0);
            int quantity = (int) cartTableModel.getValueAt(selectedRow, 2);
            double total = Double.parseDouble(totalField.getText());
            total -= item.getPrice() * quantity;
            
            cartTableModel.removeRow(selectedRow);
            searchField.setText(item.getBarcode());
            searchFieldActionPerformed(null);
            quantityField.setText(Integer.toString(quantity));
            updateBill(total);
            setButtonsEnabledState();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        int selectedValue = javax.swing.JOptionPane.showConfirmDialog(
            this, "Are you sure you want to clear the cart?",
            "Clear Cart", javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.WARNING_MESSAGE);
        
        if (selectedValue == 0) {
            while (cartTableModel.getRowCount() != 0)
                cartTableModel.removeRow(0);
            recievedField.setText("0.0");
            recievedFieldCaretUpdate(null);
            searchField.setText("");
            quantityField.setText("1");
            searchFieldCaretUpdate(null);
            updateBill(0);
            setButtonsEnabledState();
        }
    }//GEN-LAST:event_doneButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            boolean complete = cartTable.print();
            if (complete) {
                
            } else {
                
            }
        } catch (java.awt.print.PrinterException ex) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Printing operation failed.", "Printing Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void searchFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchFieldCaretUpdate
        String text = searchField.getText();
        int len = text.length();
        
        if (len == 0) {
            populateItemsList(items);
        }
        
        try {
            Long.parseLong(text);
            updateListWithItemBarcodeLike(text);
        } catch (NumberFormatException ex) {
            updateListWithItemNameLike(text);
        }
            
        if (validate(searchField, searchFieldValidator))
            addButton.setEnabled(true);
        else
            addButton.setEnabled(false);
        
        setButtonsEnabledState();
        itemsList.setSelectedIndex(0);
    }//GEN-LAST:event_searchFieldCaretUpdate

    private void populateItemsList(List<ItemModel> it) {
        javax.swing.DefaultListModel listModel =
                (javax.swing.DefaultListModel) this.itemsList.getModel();
        
        listModel.removeAllElements();
        
        it.forEach(item -> {
            listModel.addElement(item);
        });
    }
    
    private void updateListWithItemBarcodeLike(String code) {
        List<ItemModel> itemsFound = ItemModel.findAllWithBarcodeLike(code);
        populateItemsList(itemsFound);
    }
    
    private void updateListWithItemNameLike(String name) {
        List<ItemModel> itemsFound = ItemModel.findAllWithNameLike(name);
        populateItemsList(itemsFound);
    }
    
    private boolean validate(javax.swing.JTextField tf,
            java.util.function.Function<String, Boolean> c) {
        if (c.apply(tf.getText())) {
            tf.setForeground(javax.swing.UIManager.getDefaults()
                    .getColor("Text.foreground"));
            return true;
        } else {
            tf.setForeground(java.awt.Color.RED);
            return false;
        }
    }
    
    private void updateBill(double total) {
        totalField.setText(Double.toString(total));
        recievedFieldCaretUpdate(null);
    }
    
    private void setButtonsEnabledState() {
        if (cartTableModel.getRowCount() == 0) {
            deleteButton.setEnabled(false);
            updateButton.setEnabled(false);
            printButton.setEnabled(false);
            doneButton.setEnabled(false);
        } else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(true);
            recievedFieldCaretUpdate(null);
        }
        
        if (itemsList.getSelectedIndex() < 0) {
            addButton.setEnabled(false);
        } else {
            addButton.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField changeField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JList<String> itemsList;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField recievedField;
    private javax.swing.JTextField searchField;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextField totalPriceField;
    private javax.swing.JTextField unitPriceField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    
    private List<ItemModel> items = ItemModel.findAll();
    
    private javax.swing.table.DefaultTableModel cartTableModel;
    
    private final java.util.function.Function positiveIntegerValidator =
            (java.util.function.Function<String, Boolean>) (String str) -> {
                try {
                    if (Integer.parseInt(str) > 0)
                    return true;
                } catch (NumberFormatException ex) {} // fall through
                return false;
            };
    private final java.util.function.Function positiveFloatValidator =
            (java.util.function.Function<String, Boolean>) (String str) -> {
                try {
                    if (Float.parseFloat(str) >= 0) {
                        return true;
                    }
                } catch (NumberFormatException ex) {} // fall through
                return false;
            };
    private final java.util.function.Function searchFieldValidator =
            (java.util.function.Function<String, Boolean>) (String str) -> {
                if (itemsList.getModel().getSize() == 0)
                    return false;
                else
                    return true;
            };
}