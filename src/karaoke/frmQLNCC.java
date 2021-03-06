package karaoke;

import BUS.NhaCCBUS;
import DAO.NhaCCDAO;
import DAO.SanPhamDAO;
import DTO.NhaCC;
import DTO.SanPham;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class frmQLNCC extends javax.swing.JPanel {

    String mnccSelected = "";
    
    public frmQLNCC() {
        initComponents();
        loadData();
        
        txtMNCC.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSP = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMNCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSearchNCC = new javax.swing.JTextField();
        btnAddNCC = new javax.swing.JButton();
        btnUpdateNCC = new javax.swing.JButton();
        btnRemoveNCC = new javax.swing.JButton();
        btnClearNCC = new javax.swing.JButton();
        btnSearchNCC = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Quản lý nhà cung cấp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel2)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNCC);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm đã mua", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        jScrollPane2.setViewportView(listSP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Mã nhà cung cấp");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Tên nhà cung cấp");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Địa chỉ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Tìm kiếm");

        btnAddNCC.setText("Thêm");
        btnAddNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNCCActionPerformed(evt);
            }
        });

        btnUpdateNCC.setText("Sửa");
        btnUpdateNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateNCCActionPerformed(evt);
            }
        });

        btnRemoveNCC.setText("Xóa");
        btnRemoveNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNCCActionPerformed(evt);
            }
        });

        btnClearNCC.setText("Làm mới");
        btnClearNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearNCCActionPerformed(evt);
            }
        });

        btnSearchNCC.setText("Tìm kiếm");
        btnSearchNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 39, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT)
                            .addComponent(txtDiaChi)
                            .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMNCC)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnClearNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSearchNCC))
                .addGap(55, 55, 55))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClearNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAddNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNCCActionPerformed
        String tenncc = txtTenNCC.getText().trim();
        String sdt = txtSDT.getText().trim();
        String diachi = txtDiaChi.getText().trim();

        try{
            if(!tenncc.equals("") && !sdt.equals("") && !diachi.equals("")){   
                NhaCC ncc = new NhaCC("", tenncc, sdt, diachi);
                if(NhaCCBUS.insertNhaCC(ncc)){
                    JOptionPane.showMessageDialog(null, "Thêm nhà cung cấp thành công!");
                    loadData();
                    
                    txtTenNCC.setText("");
                    txtSDT.setText("");
                    txtDiaChi.setText("");
                    
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
    }//GEN-LAST:event_btnAddNCCActionPerformed

    private void tblNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCCMouseClicked
        int index = tblNCC.getSelectedRow();
        TableModel model = tblNCC.getModel();

        mnccSelected = model.getValueAt(index, 0).toString();
        txtMNCC.setText(model.getValueAt(index, 0).toString());
        txtTenNCC.setText(model.getValueAt(index, 1).toString());
        txtSDT.setText(model.getValueAt(index, 2).toString());
        txtDiaChi.setText(model.getValueAt(index, 3).toString());
        
        DefaultListModel<SanPham> listModel = new DefaultListModel<>();
            
        for (SanPham sp : SanPhamDAO.getByNCC(mnccSelected)) {
            listModel.addElement(sp);     
        }
        listSP.setModel(listModel);
    }//GEN-LAST:event_tblNCCMouseClicked

    private void btnUpdateNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateNCCActionPerformed
        String tenncc = txtTenNCC.getText().trim();
        String sdt = txtSDT.getText().trim();
        String diachi = txtDiaChi.getText().trim();

        try{
            if(!mnccSelected.equals("")){
                if(!tenncc.equals("") && !sdt.equals("") && !diachi.equals("")){   
                    NhaCC ncc = new NhaCC(mnccSelected, tenncc, sdt, diachi);
                    if(NhaCCBUS.updateNhaCC(ncc)){
                        JOptionPane.showMessageDialog(null, "Cập nhật nhà cung cấp thành công!");
                        loadData();
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
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một nhà cung cấp cần sửa");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
        }
    }//GEN-LAST:event_btnUpdateNCCActionPerformed

    private void btnClearNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearNCCActionPerformed
        txtMNCC.setText("");
        txtTenNCC.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        
        mnccSelected = "";
        loadData();
    }//GEN-LAST:event_btnClearNCCActionPerformed

    private void btnRemoveNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNCCActionPerformed
        try{
            if(!mnccSelected.equals("")){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Bạn có muốn xóa nhà cung cấp '"+ mnccSelected +"' này không?","Cảnh báo",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(NhaCCBUS.deleteNhaCC(mnccSelected)){
                        JOptionPane.showMessageDialog(null, "Xóa nhà cung cấp '"+ mnccSelected +"' thành công!");
                        
                        txtMNCC.setText("");
                        txtTenNCC.setText("");
                        txtSDT.setText("");
                        txtDiaChi.setText("");

                        mnccSelected = "";
                        DefaultListModel listModel = (DefaultListModel) listSP.getModel();
                        listModel.removeAllElements();
                        
                        loadData();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một nhà cung cấp cần xóa");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Xảy ra lỗi!");
        }
    }//GEN-LAST:event_btnRemoveNCCActionPerformed

    private void btnSearchNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNCCActionPerformed
        try{
            String tenncc = txtSearchNCC.getText();
            if(!tenncc.equals("")){
                List<NhaCC> listNCC = NhaCCDAO.searchNhaCC(tenncc);
                if(listNCC.size() > 0){
                    DefaultTableModel tblModel = (DefaultTableModel)tblNCC.getModel();
                    tblModel.setRowCount(0);

                    for(NhaCC ncc : listNCC){
                        String mncc = ncc.getMncc();
                        tenncc = ncc.getTenncc();
                        String sdt = ncc.getSdt();
                        String diachi = ncc.getDiachi();
                        
                        Object tbData[] = {mncc, tenncc, sdt, diachi};

                        tblModel.addRow(tbData);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Không tìm thấy");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhà cung cấp cần tìm");
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnSearchNCCActionPerformed

    private void loadData(){
        DefaultTableModel tblModel = (DefaultTableModel)tblNCC.getModel();
        tblModel.setRowCount(0);
        
        for(NhaCC ncc : NhaCCDAO.getAll()){
            String mncc = ncc.getMncc();
            String tenncc = ncc.getTenncc();
            String sdt = String.valueOf(ncc.getSdt());
            String diachi = ncc.getDiachi();
            Object tbData[] = {mncc, tenncc, sdt, diachi};

            tblModel.addRow(tbData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNCC;
    private javax.swing.JButton btnClearNCC;
    private javax.swing.JButton btnRemoveNCC;
    private javax.swing.JButton btnSearchNCC;
    private javax.swing.JButton btnUpdateNCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<SanPham> listSP;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearchNCC;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
}
