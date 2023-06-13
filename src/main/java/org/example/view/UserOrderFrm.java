package org.example.view;

import javax.swing.*;
import java.util.Objects;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/13 0:03
 * @since JDK17
 */

public class UserOrderFrm extends javax.swing.JFrame {

    /** Creates new form UserFrm */
    public UserOrderFrm() {
        initComponents();
        //设置最大化
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        table = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_order = new javax.swing.JMenu();
        jmi_order = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_checkOrder = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmi_modify = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("用户点餐主界面");

        jm_order.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/order3.png")))); // NOI18N
        jm_order.setText("用户点餐");

        jmi_order.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/cart.png")))); // NOI18N
        jmi_order.setText("开始点餐");
        jmi_order.addActionListener(this::jmi_orderActionPerformed);
        jm_order.add(jmi_order);

        jMenuBar1.add(jm_order);

        jMenu2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/search1.png")))); // NOI18N
        jMenu2.setText("订单详情");

        jmi_checkOrder.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/ok.png")))); // NOI18N
        jmi_checkOrder.setText("查看订单");
        jmi_checkOrder.addActionListener(this::jmi_checkOrderActionPerformed);
        jMenu2.add(jmi_checkOrder);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/order2.png")))); // NOI18N
        jMenu3.setText("其他");

        jmi_modify.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/edit.png")))); // NOI18N
        jmi_modify.setText("信息修改");
        jmi_modify.addActionListener(this::jmi_modifyActionPerformed);
        jMenu3.add(jmi_modify);

        jmiExit.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/exit.png")))); // NOI18N
        jmiExit.setText("退出系统");
        jmiExit.addActionListener(this::jmiExitActionPerformed);
        jMenu3.add(jmiExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
                javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
                javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE));

        pack();
    }// </editor-fold>
    //GEN-END:initComponents
    //修改用户信息按钮
    private void jmi_modifyActionPerformed(java.awt.event.ActionEvent evt) {
        AccountModifyInterFrm accountModify = new AccountModifyInterFrm();
        accountModify.setVisible(true);
        this.table.add(accountModify);
    }
    //查看订单按钮
    private void jmi_checkOrderActionPerformed(java.awt.event.ActionEvent evt) {
        CheckOrderInterFrm CheckOrderInterFrm = new CheckOrderInterFrm();
        CheckOrderInterFrm.setVisible(true);
        this.table.add(CheckOrderInterFrm);
    }
    //退出按钮
    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {
        int result = JOptionPane.showConfirmDialog(null, "是否退出系统？");
        //System.out.println(result);
        if (result == 0) {
            this.dispose();
        }
    }
    //点餐按钮
    private void jmi_orderActionPerformed(java.awt.event.ActionEvent evt) {
        OrderGoodsInterFrm orderGoodsInterFrm = new OrderGoodsInterFrm();
        orderGoodsInterFrm.setVisible(true);
        this.table.add(orderGoodsInterFrm);
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new UserOrderFrm().setVisible(true);
//            }
//        });
//    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jm_order;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmi_checkOrder;
    private javax.swing.JMenuItem jmi_modify;
    private javax.swing.JMenuItem jmi_order;
    private javax.swing.JDesktopPane table;
    // End of variables declaration//GEN-END:variables

}