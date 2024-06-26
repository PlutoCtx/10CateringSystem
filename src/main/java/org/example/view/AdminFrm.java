package org.example.view;

import javax.swing.*;
import java.util.Objects;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/13 0:02
 * @since JDK17
 */

public class AdminFrm extends javax.swing.JFrame {

    /** Creates new form AdminFrm */
    public AdminFrm() {
        initComponents();
        //设置最大化
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    private void initComponents() {

        table = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiGoodsAdd = new javax.swing.JMenuItem();
        jmiGoodsManage = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiDealOrder = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiModify = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("点餐系统管理主界面");

        jMenu1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/base.png")))); // NOI18N
        jMenu1.setText("套餐信息管理");

        jmiGoodsAdd.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/add.png")))); // NOI18N
        jmiGoodsAdd.setText("新增套餐");
        jmiGoodsAdd.addActionListener(this::jmiGoodsAddActionPerformed);
        jMenu1.add(jmiGoodsAdd);

        jmiGoodsManage.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/edit.png")))); // NOI18N
        jmiGoodsManage.setText("套餐维护");
        jmiGoodsManage.addActionListener(this::jmiGoodsManageActionPerformed);
        jMenu1.add(jmiGoodsManage);

        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/bookManager.png")))); // NOI18N
        jMenu3.setText("订单管理");

        jmiDealOrder.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/order2.png")))); // NOI18N
        jmiDealOrder.setText("订单处理");
        jmiDealOrder.addActionListener(this::jmiDealOrderActionPerformed);
        jMenu3.add(jmiDealOrder);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/about.png")))); // NOI18N
        jMenu4.setText("其他");

        jmiModify.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/modify.png")))); // NOI18N
        jmiModify.setText("修改密码");
        jmiModify.addActionListener(this::jmiModifyActionPerformed);
        jMenu4.add(jmiModify);

        jmiExit.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/exit.png")))); // NOI18N
        jmiExit.setText("退出系统");
        jmiExit.addActionListener(this::jmiExitActionPerformed);
        jMenu4.add(jmiExit);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
                javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
                javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE));

        pack();
    }

    //订单处理操作
    private void jmiDealOrderActionPerformed(java.awt.event.ActionEvent evt) {
        DealOrderInterFrm dealOrderInterFrm = new DealOrderInterFrm();
        dealOrderInterFrm.setVisible(true);
        this.table.add(dealOrderInterFrm);
    }
    //修改用户信息操作
    void jmiModifyActionPerformed(java.awt.event.ActionEvent evt) {
        AccountModifyInterFrm accountModify = new AccountModifyInterFrm();
        accountModify.setVisible(true);
        this.table.add(accountModify);
    }
    //套餐维护管理
    private void jmiGoodsManageActionPerformed(java.awt.event.ActionEvent evt) {
        GoodsManageInterFrm goodsManageInterFrm = new GoodsManageInterFrm();
        goodsManageInterFrm.setVisible(true);
        this.table.add(goodsManageInterFrm);
    }
    //套餐添加
    private void jmiGoodsAddActionPerformed(java.awt.event.ActionEvent evt) {
        GoodsAddInterFrm goodsAddInterFrm = new GoodsAddInterFrm();
        goodsAddInterFrm.setVisible(true);
        this.table.add(goodsAddInterFrm);
    }
    //退出系统
    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "是否退出点餐系统？");
        if (result == 0) {
            this.dispose();
        }

    }

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiDealOrder;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiGoodsAdd;
    private javax.swing.JMenuItem jmiGoodsManage;
    private javax.swing.JMenuItem jmiModify;
    private javax.swing.JDesktopPane table;

}