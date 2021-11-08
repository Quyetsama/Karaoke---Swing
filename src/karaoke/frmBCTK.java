package karaoke;

import DAO.HoaDonDAO;
import DTO.DoanhThu;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class frmBCTK extends javax.swing.JPanel {

    
    public frmBCTK() {
        initComponents();
        addBarChart(7);
        
        lblDT.setText("Doanh thu ngày hôm nay: " + HoaDonDAO.getDoanhThuHomNay() + "đ");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelBCTK = new javax.swing.JPanel();
        lblDT = new javax.swing.JLabel();
        txtslNgay = new javax.swing.JSpinner();
        btnTK = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Báo Cáo - Thống Kê");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel2)
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBCTK.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biểu đồ doanh thu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 11))); // NOI18N
        panelBCTK.setLayout(new java.awt.BorderLayout());

        lblDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDT.setForeground(new java.awt.Color(255, 0, 51));
        lblDT.setText("Doanh thu ngày hôm nay: 0đ");

        txtslNgay.setValue(7);

        btnTK.setText("Thống kê");
        btnTK.setToolTipText("");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBCTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtslNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDT)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDT)
                    .addComponent(txtslNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBCTK, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        try{
            int slNgay = (int)txtslNgay.getValue();
            if(slNgay >= 2){
                addBarChart(slNgay);
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_btnTKActionPerformed
    
    private void addBarChart(int slNgay){
        ChartPanel chartPanel = new ChartPanel(createChart(slNgay));
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        panelBCTK.removeAll();
        panelBCTK.add(chartPanel);
        panelBCTK.validate();
    }
    
    public static JFreeChart createChart(int slNgay) {
        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ DOANH THU "+ slNgay +" NGÀY QUA",
                "", "Doanh thu",
                createDataset(slNgay));
        return barChart;
    }

    private static CategoryDataset createDataset(int slNgay) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(DoanhThu dt : HoaDonDAO.getDoanhThu(slNgay)){
            dataset.addValue(dt.getDoanhthu(), "Doanh thu", dt.getNgay().toString());
        }
//        dataset.addValue(680, "Số người", "2001");
//        dataset.addValue(800, "Số người", "2002");
//        dataset.addValue(880, "Số người", "2003");
//        dataset.addValue(950, "Số người", "2004");
//        dataset.addValue(680, "Số người", "2005");
//        dataset.addValue(800, "Số người", "2006");
//        dataset.addValue(880, "Số người", "2007");
//        dataset.addValue(680, "Số người", "2008");
//        dataset.addValue(800, "Số người", "2009");
//        dataset.addValue(880, "Số người", "2010");
//        dataset.addValue(950, "Số người", "2011");
//        dataset.addValue(680, "Số người", "2012");
//        dataset.addValue(800, "Số người", "2013");
//        dataset.addValue(880, "Số người", "2014");
//        dataset.addValue(680, "Số người", "2015");
//        dataset.addValue(800, "Số người", "2016");
//        dataset.addValue(880, "Số người", "2017");
//        dataset.addValue(950, "Số người", "2018");
//        dataset.addValue(680, "Số người", "2019");
//        dataset.addValue(800, "Số người", "2020");
//        dataset.addValue(880, "Số người", "2021");
        return dataset;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDT;
    private javax.swing.JPanel panelBCTK;
    private javax.swing.JSpinner txtslNgay;
    // End of variables declaration//GEN-END:variables
}
