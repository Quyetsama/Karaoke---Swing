package karaoke;

import BUS.NhanVienBUS;
import DAO.NhanVienDAO;
import DTO.NhanVien;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;


public class frmQLNV extends javax.swing.JPanel {

    public static String message = "";
    private String mnvSelected = "";
    
    public frmQLNV() {
        initComponents();
        loadData();
        
        txtMNV.setEnabled(false);
        rdNam.setSelected(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtMNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        txtTuoi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Qu???n l?? nh??n vi??n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh s??ch nh??n vi??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? nh??n vi??n", "H??? v?? t??n", "Gi???i t??nh", "Tu???i", "?????a ch???", "S??? ??i???n tho???i"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nh??n vi??n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        rdNam.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rdNam.setText("Nam");
        rdNam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdNamStateChanged(evt);
            }
        });

        rdNu.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        rdNu.setText("N???");
        rdNu.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdNuStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("M?? nh??n vi??n");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("H??? v?? t??n");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Gi???i t??nh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Tu???i");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("?????a ch???");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("S??T");

        btnAdd.setText("Th??m");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("S???a");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("X??a");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("L??m m???i");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("T??m ki???m");

        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdNu)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSDT)
                            .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtDiaChi))
                        .addGap(34, 34, 34)
                        .addComponent(btnSearch))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNu)
                    .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int index = tblNhanVien.getSelectedRow();
        TableModel model = tblNhanVien.getModel();
        
        mnvSelected = model.getValueAt(index, 0).toString();
        
        txtMNV.setText(model.getValueAt(index, 0).toString());
        txtHoTen.setText(model.getValueAt(index, 1).toString());
        
        if(model.getValueAt(index, 2).toString().equals("Nam")){
            rdNam.setSelected(true);
            rdNu.setSelected(false);
        }
        else{
            rdNu.setSelected(true);
            rdNam.setSelected(false);
        }
        txtTuoi.setText(model.getValueAt(index, 3).toString());
        txtDiaChi.setText(model.getValueAt(index, 4).toString());
        txtSDT.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String hoten = txtHoTen.getText().trim();
        int gioitinh = -1;
        if(rdNam.isSelected()){
            gioitinh = 0;
        }
        else{
            gioitinh = 1;
        }
        int tuoi = 0;
        String diachi = txtDiaChi.getText().trim();
        String sdt = txtSDT.getText().trim();

        try{
            if(!mnvSelected.equals("")){
                if(!hoten.equals("") && !diachi.equals("") && !sdt.equals("")){
                    try {
                        tuoi = Integer.parseInt(txtTuoi.getText().trim());
                        if(tuoi <= 0){
                            JOptionPane.showMessageDialog(null, "Tu???i kh??ng h???p l???!");
                            return;
                        }
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Tu???i ph???i l?? m???t s???!");
                        return;
                    }

                    NhanVien nv = new NhanVien(mnvSelected, hoten, gioitinh, tuoi, diachi, sdt);
                    if(NhanVienBUS.updateNhanVien(nv)){
                        JOptionPane.showMessageDialog(null, "C???p nh???t nh??n vi??n th??nh c??ng!");
                        loadData();
                    }
                    else{
                        if(message.equals("M?? nh??n vi??n kh??ng t???n t???i!")){
                            JOptionPane.showMessageDialog(null, message);
                            message = "";
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "X???y ra l???i!");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Vui l??ng ??i???n ????? th??ng tin");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t nh??n vi??n c???n s???a");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "X???y ra l???i!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String hoten = txtHoTen.getText().trim();
        int gioitinh = -1;
        if(rdNam.isSelected()){
            gioitinh = 0;
        }
        else{
            gioitinh = 1;
        }
        int tuoi = 0;
        String diachi = txtDiaChi.getText().trim();
        String sdt = txtSDT.getText().trim();

        try{
            if(!hoten.equals("") && !diachi.equals("") && !sdt.equals("")){

                try {
                    tuoi = Integer.parseInt(txtTuoi.getText().trim());
                    if(tuoi <= 0){
                        JOptionPane.showMessageDialog(null, "Tu???i kh??ng h???p l???!");
                        return;
                    }
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Tu???i ph???i l?? m???t s???!");
                    return;
                }

                NhanVien nv = new NhanVien(hoten, gioitinh, tuoi, diachi, sdt);
                if(NhanVienBUS.insertSinhVien(nv)){
                    JOptionPane.showMessageDialog(null, "Th??m nh??n vi??n th??nh c??ng!");
                    loadData();
                    
                    txtMNV.setText("");
                    txtHoTen.setText("");
                    txtTuoi.setText("");
                    txtDiaChi.setText("");
                    txtSDT.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "X???y ra l???i!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui l??ng ??i???n ????? th??ng tin");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "X???y ra l???i!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void rdNuStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdNuStateChanged
        if(rdNu.isSelected()){
            rdNam.setSelected(false);
        }
        else{
            rdNam.setSelected(true);
        }
    }//GEN-LAST:event_rdNuStateChanged

    private void rdNamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdNamStateChanged
        if(rdNam.isSelected()){
            rdNu.setSelected(false);
        }
        else{
            rdNu.setSelected(true);
        }
    }//GEN-LAST:event_rdNamStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtMNV.setText("");
        txtHoTen.setText("");
        txtTuoi.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        txtSearch.setText("");
        
        mnvSelected = "";
        message = "";
        loadData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            if(!mnvSelected.equals("")){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "B???n c?? mu???n x??a nh??n vi??n n??y kh??ng?","C???nh b??o",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    if(NhanVienBUS.deleteNhanVien(mnvSelected)){
                        JOptionPane.showMessageDialog(null, "X??a nh??n vi??n th??nh c??ng!");
                        btnClear.doClick();
                    }
                    else{
                        if(message.equals("M?? nh??n vi??n kh??ng t???n t???i!")){
                            JOptionPane.showMessageDialog(null, message);
                            message = "";
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "X???y ra l???i!");
                        }
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t nh??n vi??n c???n x??a");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "X???y ra l???i!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try{
            String hoten = txtSearch.getText();
            if(!hoten.equals("")){
                List<NhanVien> listNV = NhanVienDAO.searchNhanVien(hoten);
                if(listNV.size() > 0){
                    DefaultTableModel tblModel = (DefaultTableModel)tblNhanVien.getModel();
                    tblModel.setRowCount(0);

                    for(NhanVien nv : listNV){
                        String mnv = nv.getMnv();
                        hoten = nv.getHoten();
                        String gioitinh = nv.getGioitinh() == 0 ? "Nam" : "N???";
                        String tuoi = String.valueOf(nv.getTuoi());
                        String diachi = nv.getDiachi();
                        String sdt = nv.getSdt();

                        String tbData[] = {mnv, hoten, gioitinh, tuoi, diachi, sdt};

                        tblModel.addRow(tbData);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kh??ng t??m th???y");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n nh??n vi??n c???n t??m");
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void loadData(){
        DefaultTableModel tblModel = (DefaultTableModel)tblNhanVien.getModel();
        tblModel.setRowCount(0);
        
        for(NhanVien nv : NhanVienDAO.getAll()){
            String mnv = nv.getMnv();
            String hoten = nv.getHoten();
            String gioitinh = nv.getGioitinh() == 0 ? "Nam" : "N???";
            String tuoi = String.valueOf(nv.getTuoi());
            String diachi = nv.getDiachi();
            String sdt = nv.getSdt();

            String tbData[] = {mnv, hoten, gioitinh, tuoi, diachi, sdt};

            tblModel.addRow(tbData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
