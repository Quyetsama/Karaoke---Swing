package karaoke;
import BUS.SanPhamBUS;
import DAO.DanhMucDAO;
import DAO.SanPhamDAO;
import DTO.DanhMuc;
import DTO.SanPham;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class frmQLSP extends javax.swing.JPanel {

    DanhMuc dmSelected = null;
    String mspSelected = "";

    public frmQLSP() {
        initComponents();
        txtMSP.setEnabled(false);
        loadData();
        loadDanhMucToCBB();
        loadDanhMucToList();
        dmSelected = (DanhMuc)cbbDM.getModel().getSelectedItem();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDM = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        btnAddDM = new javax.swing.JButton();
        btnUpdateDM = new javax.swing.JButton();
        btnRemoveDM = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        cbbDM = new javax.swing.JComboBox<>();
        txtSL = new javax.swing.JSpinner();
        txtGia = new javax.swing.JTextField();
        txtNCC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSearchSP = new javax.swing.JTextField();
        btnSearchSP = new javax.swing.JButton();
        btnAddSP = new javax.swing.JButton();
        btnUpdateSP = new javax.swing.JButton();
        btnRemoveSP = new javax.swing.JButton();
        btnClearSP = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý sản phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel2)
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Danh mục", "Số lượng", "Đơn giá", "Nhà cung cấp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        listDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listDMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listDM);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh mục", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        btnAddDM.setText("Thêm");

        btnUpdateDM.setText("Sửa");

        btnRemoveDM.setText("Xóa");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAddDM, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateDM, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveDM, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdateDM, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addComponent(btnRemoveDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAddDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Mã sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Tên sản phẩm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Loại sản phẩm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Số lượng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Đơn giá");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Nhà cung cấp");

        cbbDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Tìm kiếm");

        btnSearchSP.setText("Tìm kiếm");

        btnAddSP.setText("Thêm");
        btnAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSPActionPerformed(evt);
            }
        });

        btnUpdateSP.setText("Sửa");
        btnUpdateSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSPActionPerformed(evt);
            }
        });

        btnRemoveSP.setText("Xóa");
        btnRemoveSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSPActionPerformed(evt);
            }
        });

        btnClearSP.setText("Làm mới");
        btnClearSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMSP)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(cbbDM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSL)
                    .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtSearchSP, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnClearSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbbDM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSearchSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        int index = tblSP.getSelectedRow();
        TableModel model = tblSP.getModel();

        mspSelected = model.getValueAt(index, 0).toString();
        txtMSP.setText(model.getValueAt(index, 0).toString());
        txtTenSP.setText(model.getValueAt(index, 1).toString());
        
        DanhMuc dm = (DanhMuc)model.getValueAt(index, 2);
//        cbbDM.getModel().setSelectedItem(dm.getTendm());
//        System.out.println(cbbDM.getSelectedItem().toString());
        int i = 0;
        while(true){
            if (cbbDM.getItemAt(i).toString ().contains (dm.toString())) 
            { 
                cbbDM.setSelectedIndex(i);
                break;
            }
            i++;
        }
        
        txtSL.setValue(Integer.parseInt(String.valueOf(model.getValueAt(index, 3))));
        txtGia.setText(model.getValueAt(index, 4).toString());
        txtNCC.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_tblSPMouseClicked

    private void listDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listDMMouseClicked
        dmSelected = listDM.getSelectedValue();
        cbbDM.setSelectedIndex(listDM.getSelectedIndex());
        loadDataByDanhMuc();
    }//GEN-LAST:event_listDMMouseClicked

    private void btnClearSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSPActionPerformed
        txtMSP.setText("");
        txtTenSP.setText("");
        txtSL.setValue(0);
        txtGia.setText("");
        txtNCC.setText("");
        
        loadData();
        loadDanhMucToCBB();
        loadDanhMucToList();
        dmSelected = null;
    }//GEN-LAST:event_btnClearSPActionPerformed

    private void btnAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSPActionPerformed
        String tensp = txtTenSP.getText().trim();
        DanhMuc dm = (DanhMuc)cbbDM.getModel().getSelectedItem();
        int iddm = 0;
        int sl = (int)txtSL.getValue();
        int dongia = 0;
        String ncc = txtNCC.getText().trim();
        
        try{
            if(!tensp.equals("") && dm != null && !ncc.equals("") && !txtGia.getText().equals("")){   
                iddm = dm.getId();
                try {
                    dongia = Integer.parseInt(txtGia.getText().trim());
                    if(dongia <= 0){
                        JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ!");
                        return;
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Đơn giá phải là một số!");
                    return;
                }

                SanPham sp = new SanPham(tensp, iddm, sl, dongia, ncc);
                if(SanPhamBUS.insertSanPham(sp)){
                    JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
                    loadDataByDanhMuc();
                    
                    txtMSP.setText("");
                    txtTenSP.setText("");
                    txtSL.setValue(0);
                    txtGia.setText("");
                    txtNCC.setText("");
                    
                    listDM.setSelectedIndex(cbbDM.getSelectedIndex());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui lòng điền đủ thông tin");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
        }
    }//GEN-LAST:event_btnAddSPActionPerformed

    private void cbbDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDMActionPerformed
        dmSelected = (DanhMuc)cbbDM.getModel().getSelectedItem();
    }//GEN-LAST:event_cbbDMActionPerformed

    private void btnUpdateSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSPActionPerformed
        String tensp = txtTenSP.getText().trim();
        DanhMuc dm = (DanhMuc)cbbDM.getModel().getSelectedItem();
        int iddm = 0;
        int sl = (int)txtSL.getValue();
        int dongia = 0;
        String ncc = txtNCC.getText().trim();
        
        try{
            if(!mspSelected.equals("")){
                if(!tensp.equals("") && dm != null && !ncc.equals("") && !txtGia.getText().equals("")){   
                    iddm = dm.getId();
                    try {
                        dongia = Integer.parseInt(txtGia.getText().trim());
                        if(dongia <= 0){
                            JOptionPane.showMessageDialog(null, "Đơn giá không hợp lệ!");
                            return;
                        }
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Đơn giá phải là một số!");
                        return;
                    }

                    SanPham sp = new SanPham(mspSelected, tensp, iddm, sl, dongia, ncc);
                    if(SanPhamBUS.updateSanPham(sp)){
                        JOptionPane.showMessageDialog(null, "Cập nhật sản phẩm thành công!");
                        loadDataByDanhMuc();
                        
                        listDM.setSelectedIndex(cbbDM.getSelectedIndex());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Vui lòng điền đủ thông tin");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui lòng chọn sản phẩm cần sửa");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
        }
    }//GEN-LAST:event_btnUpdateSPActionPerformed

    private void btnRemoveSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSPActionPerformed
        try{
            if(!mspSelected.equals("")){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có muốn xóa sản phẩm '"+ mspSelected +"' này không?","Cảnh báo",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(SanPhamBUS.deleteSanPham(mspSelected)){
                        JOptionPane.showMessageDialog(null, "Xóa sản phẩm '"+ mspSelected +"' thành công!");
                        loadDataByDanhMuc();
                        
                        mspSelected = "";
                        txtMSP.setText("");
                        txtTenSP.setText("");
                        txtSL.setValue(0);
                        txtGia.setText("");
                        txtNCC.setText("");
                        listDM.setSelectedIndex(cbbDM.getSelectedIndex());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một sản phẩm cần xóa");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
        }
    }//GEN-LAST:event_btnRemoveSPActionPerformed

    private void loadData(){
        DefaultTableModel tblModel = (DefaultTableModel)tblSP.getModel();
        tblModel.setRowCount(0);
        
        for(SanPham sp : SanPhamDAO.getAll()){
            String msp = sp.getMsp();
            String tensp = sp.getTensp();
            
            int iddm = sp.getIddm();
            String tendm = sp.getTendm();
            DanhMuc dm = new DanhMuc(iddm, tendm);
            
            String sl = String.valueOf(sp.getSl());
            String dongia = String.valueOf(sp.getDongia());
            String ncc = sp.getNcc();
            Object tbData[] = {msp, tensp, dm, sl, dongia, ncc};

            tblModel.addRow(tbData);
        }
    }
    
    private void loadDataByDanhMuc(){
        DefaultTableModel tblModel = (DefaultTableModel)tblSP.getModel();
        tblModel.setRowCount(0);
        
        if(dmSelected == null){
            dmSelected = (DanhMuc)cbbDM.getModel().getSelectedItem();
        }

        for(SanPham sp : SanPhamDAO.getByDanhMuc(dmSelected)){
            String msp = sp.getMsp();
            String tensp = sp.getTensp();
            
            int iddm = sp.getIddm();
            String tendm = sp.getTendm();
            DanhMuc dm = new DanhMuc(iddm, tendm);
            
            String sl = String.valueOf(sp.getSl());
            String dongia = String.valueOf(sp.getDongia());
            String ncc = sp.getNcc();
            Object tbData[] = {msp, tensp, dm, sl, dongia, ncc};

            tblModel.addRow(tbData);
        }
    }
    
    private void loadDanhMucToCBB(){
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        for(DanhMuc dm : DanhMucDAO.getAll()){
            cbbModel.addElement(dm);
        }
        cbbDM.setModel(cbbModel);
    }
    
    private void loadDanhMucToList(){
        DefaultListModel<DanhMuc> listModel = new DefaultListModel<>();
            
        for (DanhMuc dm : DanhMucDAO.getAll()) {
            listModel.addElement(dm);     
        }
        listDM.setModel(listModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDM;
    private javax.swing.JButton btnAddSP;
    private javax.swing.JButton btnClearSP;
    private javax.swing.JButton btnRemoveDM;
    private javax.swing.JButton btnRemoveSP;
    private javax.swing.JButton btnSearchSP;
    private javax.swing.JButton btnUpdateDM;
    private javax.swing.JButton btnUpdateSP;
    private javax.swing.JComboBox<DanhMuc> cbbDM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<DanhMuc> listDM;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMSP;
    private javax.swing.JTextField txtNCC;
    private javax.swing.JSpinner txtSL;
    private javax.swing.JTextField txtSearchSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
