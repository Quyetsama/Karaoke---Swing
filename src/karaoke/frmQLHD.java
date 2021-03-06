package karaoke;

import BUS.HoaDonBUS;
import BUS.PhongBUS;
import DAO.ChiTietHDDAO;
import DAO.DanhMucDAO;
import DAO.PhongDAO;
import DAO.SanPhamDAO;
import DTO.ChiTietHD;
import DTO.DanhMuc;
import DTO.HoaDon;
import DTO.NhaCC;
import DTO.Phong;
import DTO.SanPham;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class frmQLHD extends javax.swing.JPanel {
    
    static Phong phongSelected = null;
    int currentIndexList = 0;
    SanPham spSelected = null;
    static int thanhTien = 0;

    public frmQLHD() {
        initComponents();
        loadPhongToList();
        loadData();
        loadDanhMucToCBB();
        phongSelected = listPhong.getSelectedValue();
        khongBietDatTenLaGi();
        
        txtTenSP.setEditable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPhong = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();
        panelSP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        panelThaoTac = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        cbbDM = new javax.swing.JComboBox<>();
        txtSL = new javax.swing.JSpinner();
        btnSearch = new javax.swing.JButton();
        btnAddSP = new javax.swing.JButton();
        txtTenSP = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTTorBD = new javax.swing.JButton();
        txtTien = new javax.swing.JLabel();
        txtTG = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("T???o H??a ????n");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel2)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh s??ch ph??ng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        listPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPhong);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "H??a ????n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSP", "T??n s???n ph???m", "SL", "Th??nh ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );

        panelSP.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh s??ch s???n ph???m"));

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "T??n s???n ph???m", "Gi??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane3.setViewportView(tblSP);

        javax.swing.GroupLayout panelSPLayout = new javax.swing.GroupLayout(panelSP);
        panelSP.setLayout(panelSPLayout);
        panelSPLayout.setHorizontalGroup(
            panelSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelSPLayout.setVerticalGroup(
            panelSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panelThaoTac.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Th??m s???n ph???m", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

        cbbDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDMActionPerformed(evt);
            }
        });

        txtSL.setValue(1);

        btnSearch.setText("T??m ki???m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddSP.setText("Th??m");
        btnAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThaoTacLayout = new javax.swing.GroupLayout(panelThaoTac);
        panelThaoTac.setLayout(panelThaoTacLayout);
        panelThaoTacLayout.setHorizontalGroup(
            panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThaoTacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(cbbDM, 0, 175, Short.MAX_VALUE)
                    .addComponent(txtSL)
                    .addComponent(txtTenSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelThaoTacLayout.setVerticalGroup(
            panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThaoTacLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(cbbDM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThaoTacLayout.createSequentialGroup()
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ph??ng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnTTorBD.setText("B???t ?????u");
        btnTTorBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTorBDActionPerformed(evt);
            }
        });

        txtTien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTien.setText("Th??nh ti???n: 0??");

        txtTG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTG.setText("Ch??a s??? d???ng");
        txtTG.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTG)
                            .addComponent(txtTien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTTorBD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtTG)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTien)
                                    .addGap(23, 23, 23))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnTTorBD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPhongMouseClicked
        try{
            DefaultTableModel tblModel = (DefaultTableModel)tblHD.getModel();
            tblModel.setRowCount(0);
            
            phongSelected = listPhong.getSelectedValue();
            currentIndexList = listPhong.getSelectedIndex();
            khongBietDatTenLaGi();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_listPhongMouseClicked

    private void btnTTorBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTorBDActionPerformed
        try{
            if(btnTTorBD.getText().equals("B???t ?????u")){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "B???t ?????u t??nh gi????","C???nh b??o",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    phongSelected.setTimestamp(currentTime);
                    phongSelected.setTrangthai(1);
                    PhongBUS.startPhong(phongSelected);
                    
                    loadPhongToList();
            
                    listPhong.setSelectedIndex(currentIndexList);
                    phongSelected = listPhong.getSelectedValue();

                    khongBietDatTenLaGi();
                }
            }
            else if(btnTTorBD.getText().equals("Thanh to??n")){
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "T???o h??a ????n cho "+ phongSelected.getTenphong() +"?","C???nh b??o",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    // Tr??? ph??ng
                    phongSelected.setTimestamp(null);
                    phongSelected.setTrangthai(0);
                    PhongBUS.stopPhong(phongSelected);

                    // Th??m h??a ????n
                    int idphong = phongSelected.getId();
                    String tg = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                    HoaDon hd = new HoaDon(null, idphong, tg, thanhTien);

                    String mahd = HoaDonBUS.insertHoaDon(hd);
                    if(mahd != null){
                        hd.setMahd(mahd);

                        // Chi ti???t h??a ????n
                        List<ChiTietHD> listCTHD = new ArrayList<>();
                        DefaultTableModel tblModel = (DefaultTableModel)tblHD.getModel();
                        for(int i = 0; i < tblModel.getRowCount(); i++){
                            String msp = tblModel.getValueAt(i, 0).toString();
    //                        String tensp = tblModel.getValueAt(i, 1).toString();
                            int sl = (int)tblModel.getValueAt(i, 2);
                            listCTHD.add(new ChiTietHD(0, hd.getMahd(), msp, sl));
                        }
                        if(listCTHD.size() > 0){
                            if(ChiTietHDDAO.insertChiTietHD(listCTHD)){
                                JOptionPane.showMessageDialog(null, "T???o h??a ????n th??nh c??ng!");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Th???t b???i!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "T???o h??a ????n th??nh c??ng!");
                        }
                        
                        tblModel.setRowCount(0);
                        loadPhongToList();
                        listPhong.setSelectedIndex(currentIndexList);
                        phongSelected = listPhong.getSelectedValue();
                        khongBietDatTenLaGi();
                        
                    }
                }
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnTTorBDActionPerformed

    private void cbbDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDMActionPerformed
        DanhMuc dmSelected = (DanhMuc)cbbDM.getModel().getSelectedItem();
        if(dmSelected.getTendm().equals("T???t c???")){
            loadData();
        }
        else{
            loadDataByDanhMuc(dmSelected);
        }
    }//GEN-LAST:event_cbbDMActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        int index = tblSP.getSelectedRow();
//        ((DefaultTableModel)tblSP.getModel()).removeRow(index);
        
        TableModel model = tblSP.getModel();
        txtTenSP.setText(model.getValueAt(index, 1).toString());
        String msp = model.getValueAt(index, 0).toString();
        String tensp = model.getValueAt(index, 1).toString();
        int dongia = Integer.parseInt(String.valueOf(model.getValueAt(index, 2).toString()));
        spSelected = new SanPham(msp, tensp, dongia);
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSPActionPerformed
        try{
            DefaultTableModel tblModel = (DefaultTableModel)tblHD.getModel();
        
            if((int)txtSL.getValue() == 0)
                return;

            for(int i = 0; i < tblModel.getRowCount(); i++){
                if(tblModel.getValueAt(i, 0).equals(spSelected.getMsp())){
                    int slMoi = (int)tblModel.getValueAt(i, 2) + (int)txtSL.getValue();
                    int dongia = slMoi * spSelected.getDongia();

                    if(slMoi <= 0){
                        thanhTien -= (int)tblModel.getValueAt(i, 2) * spSelected.getDongia();
                        txtTien.setText("Th??nh ti???n: " + thanhTien + "??");
                        tblModel.removeRow(i);
                        return;
                    }
                    tblModel.setValueAt(slMoi, i, 2);
                    tblModel.setValueAt(dongia, i, 3);
                    thanhTien += (int)txtSL.getValue() * spSelected.getDongia();
                    txtTien.setText("Th??nh ti???n: " + thanhTien + "??");
                    return;
                }
            }

            String msp = spSelected.getMsp();
            String tensp = spSelected.getTensp();
            int dongia = spSelected.getDongia();
            int sl = (int)txtSL.getValue();
            if(sl < 0){
                return;
            }
            int tongtien = dongia * sl;
            thanhTien += tongtien;
            txtTien.setText("Th??nh ti???n: " + thanhTien + "??");
            Object tbData[] = {msp, tensp, sl, tongtien};

            tblModel.addRow(tbData);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_btnAddSPActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try{
            String tensp = txtSearch.getText();
            if(!tensp.equals("")){
                List<SanPham> listSP = SanPhamDAO.searchSanPham(tensp);
                if(listSP.size() > 0){
                    DefaultTableModel tblModel = (DefaultTableModel)tblSP.getModel();
                    tblModel.setRowCount(0);

                    for(SanPham sp : listSP){
                        String msp = sp.getMsp();
                        tensp = sp.getTensp();
                        String dongia = String.valueOf(sp.getDongia());

                        Object tbData[] = {msp, tensp, dongia};

                        tblModel.addRow(tbData);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kh??ng t??m th???y");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Vui l??ng nh???p t??n s???n ph???m c???n t??m");
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new frmAddPhong().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Phong pUpdate = listPhong.getSelectedValue();
        if(pUpdate != null){
            new frmUpdatePhong(pUpdate).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t ph??ng!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Phong pDelete = listPhong.getSelectedValue();
        if(pDelete != null){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "B???n c?? mu???n x??a '"+ pDelete.getTenphong() +"' n??y kh??ng?","C???nh b??o",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                if(PhongBUS.deletePhong(String.valueOf(pDelete.getId()))){
                    JOptionPane.showMessageDialog(null, "X??a '"+ pDelete.getTenphong() +"' th??nh c??ng!");
                    
                    loadPhongToList();
                    khongBietDatTenLaGi();
                }
                else{
                    JOptionPane.showMessageDialog(null, "X???y ra l???i!");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Vui l??ng ch???n m???t ph??ng!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public static void khongBietDatTenLaGi(){
        try{
            phongSelected = listPhong.getSelectedValue();

            if(phongSelected.getTrangthai() == 1 && phongSelected.getTimestamp() != null){
                btnTTorBD.setText("Thanh to??n");
                
                String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date firstParsedDate = dateFormat.parse(currentTime);
                Date secondParsedDate = dateFormat.parse(phongSelected.getTimestamp());
                long diff = firstParsedDate.getTime() - secondParsedDate.getTime();

//                long seconds = TimeUnit.MILLISECONDS.toSeconds(diff);
                long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
//                long hours = TimeUnit.MILLISECONDS.toHours(diff);
//                long days = TimeUnit.MILLISECONDS.toDays(diff);

                txtTG.setText("???? s??? d???ng: " + minutes + " ph??t");
                
                thanhTien = Integer.parseInt(String.valueOf(Phong.MoneyPerMinute * minutes));
                        
                txtTien.setText("Th??nh ti???n: " + thanhTien + "??");
                
                setPanelEnabled(panelThaoTac, true);
            }
            else{
                btnTTorBD.setText("B???t ?????u");
                txtTG.setText("Ch??a s??? d???ng");
                thanhTien = 0;
                txtTien.setText("Th??nh ti???n: 0??");

                setPanelEnabled(panelThaoTac, false);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    private static void setPanelEnabled(JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);

        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) {
                setPanelEnabled((JPanel) component, isEnabled);
            }
        component.setEnabled(isEnabled);
    }
}
    
    public static void loadPhongToList(){
        DefaultListModel<Phong> listModel = new DefaultListModel<>();
            
        for (Phong p : PhongDAO.getAll()) {
            listModel.addElement(p);     
        }
        listPhong.setModel(listModel);
        listPhong.setSelectedIndex(0);
    }
    
    private void loadData(){
        DefaultTableModel tblModel = (DefaultTableModel)tblSP.getModel();
        tblModel.setRowCount(0);
        
        for(SanPham sp : SanPhamDAO.getAll()){
            String msp = sp.getMsp();
            String tensp = sp.getTensp();
            String dongia = String.valueOf(sp.getDongia());
            Object tbData[] = {msp, tensp, dongia};

            tblModel.addRow(tbData);
        }
    }
    
    private void loadDanhMucToCBB(){
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        
        DanhMuc getAll = new DanhMuc();
        getAll.setTendm("T???t c???");
        cbbModel.addElement(getAll);
        for(DanhMuc dm : DanhMucDAO.getAll()){
            cbbModel.addElement(dm);
        }

        cbbDM.setModel(cbbModel);
    }
    
    private void loadDataByDanhMuc(DanhMuc dmSelected){
        DefaultTableModel tblModel = (DefaultTableModel)tblSP.getModel();
        tblModel.setRowCount(0);

        for(SanPham sp : SanPhamDAO.getByDanhMuc(dmSelected)){
            String msp = sp.getMsp();
            String tensp = sp.getTensp();
            String dongia = String.valueOf(sp.getDongia());

            Object tbData[] = {msp, tensp, dongia};

            tblModel.addRow(tbData);
        }
    }
    
    private void clearAll(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddSP;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    public static javax.swing.JButton btnTTorBD;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<DanhMuc> cbbDM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JList<Phong> listPhong;
    private javax.swing.JPanel panelSP;
    private static javax.swing.JPanel panelThaoTac;
    private javax.swing.JTable tblHD;
    private javax.swing.JTable tblSP;
    private javax.swing.JSpinner txtSL;
    private javax.swing.JTextField txtSearch;
    private static javax.swing.JLabel txtTG;
    private javax.swing.JTextField txtTenSP;
    private static javax.swing.JLabel txtTien;
    // End of variables declaration//GEN-END:variables
}
