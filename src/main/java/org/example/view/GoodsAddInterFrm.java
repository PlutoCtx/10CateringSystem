package org.example.view;

import org.example.dao.GoodsDao;
import org.example.model.Goods;
import org.example.util.DBUtil;
import org.example.util.StringUtil;

import java.io.File;
import java.sql.Connection;
import java.util.Objects;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/12 23:57
 * @since JDK17
 */

public class GoodsAddInterFrm extends javax.swing.JInternalFrame {

    DBUtil dbUtil = new DBUtil();
    GoodsDao goodsDao = new GoodsDao();

    /** Creates new form GoodsAddInterFrm */
    public GoodsAddInterFrm() {
        initComponents();
        this.setLocation(200, 80);

    }

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_chooser = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        iamgeLb = new javax.swing.JLabel();
        imageLinkTxt = new javax.swing.JTextField();
        goodsNameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodsDescTxt = new javax.swing.JTextArea();
        jb_add = new javax.swing.JButton();
        jb_reset = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("套餐添加");

        jLabel2.setText("套餐名称：");

        jLabel3.setText("套餐价格：");

        jLabel4.setText("套餐描述：");

        jb_chooser.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/2.png")))); // NOI18N
        jb_chooser.setText("请选择");
        jb_chooser.addActionListener(this::jb_chooserActionPerformed);

        jPanel1.setBorder(javax.swing.BorderFactory
                .createTitledBorder("套餐图片"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
                jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout.createSequentialGroup().addContainerGap(23,
                        Short.MAX_VALUE).addComponent(iamgeLb,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(21, 21,
                        21)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                jPanel1Layout.createSequentialGroup().addContainerGap()
                        .addComponent(iamgeLb,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE)));

        imageLinkTxt.setEditable(false);

        jLabel5.setText("套餐图片：");

        goodsDescTxt.setColumns(20);
        goodsDescTxt.setRows(5);
        jScrollPane1.setViewportView(goodsDescTxt);

        jb_add.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/add.png")))); // NOI18N
        jb_add.setText("添加");
        jb_add.addActionListener(this::jb_addActionPerformed);

        jb_reset.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/reset.png")))); // NOI18N
        jb_reset.setText("重置");
        jb_reset.addActionListener(this::jb_resetActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout
                        .createSequentialGroup()
                        .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout
                                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout
                                                    .createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(30, 30, 30)
                                                    .addGroup(layout
                                                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(goodsNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(49, 49, 49)
                                                                    .addComponent(jLabel5))
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel4))
                                        .addGap(4, 4, 4)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout
                                                        .createSequentialGroup()
                                                        .addGap(47, 47, 47)
                                                        .addComponent(jb_reset))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jb_chooser)
                                                        .addComponent(imageLinkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jb_add)))
                        .addContainerGap(32, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout
                        .createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(goodsNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(imageLinkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jb_chooser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_add)
                                .addComponent(jb_reset))
                        .addContainerGap()));

        pack();
    }

    //	套餐添加操作
    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {
        String goodsName = this.goodsNameTxt.getText();
        String goodsDesc = this.goodsDescTxt.getText();
        String price = this.priceTxt.getText();
        String imageLink = this.imageLinkTxt.getText();
        if (StringUtil.isEmpty(goodsName)) {
            JOptionPane.showMessageDialog(null, "套餐名称不能为空！");
            return;
        }
        if (StringUtil.isEmpty(price)) {
            JOptionPane.showMessageDialog(null, "套餐价格不能为空！");
            return;
        }
        if (!StringUtil.isNum(price)) {
            JOptionPane.showMessageDialog(null, "请重新输入套餐价格！");
            return;
        }
        Goods goods = new Goods(goodsName, goodsDesc, Float.parseFloat(price), imageLink);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int n = goodsDao.GoodsAdd(con, goods);
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "套餐添加成功");
                this.resetValues();
            } else {
                JOptionPane.showMessageDialog(null, "套餐添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "套餐添加失败2");
        }
    }
    //重置函数
    private void resetValues() {
        this.goodsNameTxt.setText("");
        this.goodsDescTxt.setText("");
        this.priceTxt.setText("");
        this.imageLinkTxt.setText("");
        this.iamgeLb.setIcon(null);
    }
    //重置表单操作
    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
        resetValues();
    }
    //点击选择图片操作
    private void jb_chooserActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();//创建文件对话框
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");//创建文件过滤器
        chooser.setFileFilter(filter);//为文件对话框设置文件过滤器
        int returnValue = chooser.showOpenDialog(getParent());//打开文件选择对话框
        if (returnValue == JFileChooser.APPROVE_OPTION) { // 判断是否选择了文件
            File file = chooser.getSelectedFile(); // 获得文件对象
            if (file.length() / 1024.0 > 50.0) {
                JOptionPane.showMessageDialog(null, "请选择小于等于50KB的图片文件。");
                return;
            }
            String picturePath = file.getAbsolutePath();//获取路径
            Icon icon = new ImageIcon(picturePath);//新建图标
            this.iamgeLb.setIcon(icon);//设置图片并显示
            this.imageLinkTxt.setText(picturePath);//文本框显示路径

        }
    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    private javax.swing.JTextArea goodsDescTxt;
    private javax.swing.JTextField goodsNameTxt;
    private javax.swing.JLabel iamgeLb;
    private javax.swing.JTextField imageLinkTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_chooser;
    private javax.swing.JButton jb_reset;
    private javax.swing.JTextField priceTxt;
    // End of variables declaration//GEN-END:variables

}