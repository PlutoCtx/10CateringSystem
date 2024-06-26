package org.example.view;

import org.example.dao.UserDao;
import org.example.model.User;
import org.example.util.DBUtil;
import org.example.util.StringUtil;

import java.awt.*;
import java.sql.Connection;
import java.util.Objects;

import javax.swing.JOptionPane;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/13 0:01
 * @since JDK17
 */

public class RegisterFrm extends javax.swing.JFrame {
    DBUtil dbUtil = new DBUtil();
    UserDao userDao = new UserDao();

    /** Creates new form RegisterFrm */
    public RegisterFrm() {
        initComponents();
        //设置frame居中显示
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    //GEN-BEGIN:initComponents
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jb_register = new javax.swing.JButton();
        jb_reset = new javax.swing.JButton();
        userNameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        passwordConfirmTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("新用户注册");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", Font.BOLD, 18));
        jLabel1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/new_register.png")))); // NOI18N
        jLabel1.setText("新用户注册");

        jLabel2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/new_user.png")))); // NOI18N
        jLabel2.setText("用户名：");

        jLabel3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/new_password.png")))); // NOI18N
        jLabel3.setText("密码：");

        jLabel4.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/password_config.png")))); // NOI18N
        jLabel4.setText("确认密码：");

        jLabel5.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/email.png")))); // NOI18N
        jLabel5.setText("邮箱：");

        jb_register.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/register.png")))); // NOI18N
        jb_register.setText("注册");
        jb_register.addActionListener(this::jb_registerActionPerformed);

        jb_reset.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/reset.png")))); // NOI18N
        jb_reset.setText("重置");
        jb_reset.addActionListener(this::jb_resetActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addGroup(
                                                layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(95, 95, 95)
                                                                    .addComponent(jLabel1))
                                                        .addGroup(layout
                                                                .createSequentialGroup()
                                                                    .addGap(57, 57, 57)
                                                                    .addComponent(jb_register)
                                                                    .addGap(63, 63, 63)
                                                                    .addComponent(jb_reset)))
                                        .addContainerGap())
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                        .addGap(28, 28, 28)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(
                                                                passwordConfirmTxt,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                146,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                emailTxt,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                146,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                userNameTxt,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                146,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                passwordTxt,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                146,
                                                                Short.MAX_VALUE))
                                        .addGap(40, 40, 40)));
        layout
                .setVerticalGroup(layout
                        .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(
                                                                userNameTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(
                                                                passwordTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(
                                                                passwordConfirmTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                emailTxt,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                        .addGap(28, 28, 28)
                                        .addGroup(
                                                layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(
                                                                jb_register)
                                                        .addComponent(jb_reset))
                                        .addGap(55, 55, 55)));

        pack();
    }
    

    
    //注册验证操作
    private void jb_registerActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = this.userNameTxt.getText();
        String password = new String(this.passwordTxt.getPassword());
        String passwordConfirm = new String(this.passwordConfirmTxt
                .getPassword());
        String email = this.emailTxt.getText();
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(null, "用户名不能为空");
            return;
        }
        if (StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        if (!password.equals(passwordConfirm)) {
            JOptionPane.showMessageDialog(null, "两次输入的密码不一致！");
            return;
        }
        if (!StringUtil.checkEmail(email)) {
            JOptionPane.showMessageDialog(null, "邮箱格式错误！");
            return;
        }
        User user = new User(userName, password, email);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            if (!userDao.isUserExist(con, user)) {
                int addNum = userDao.userAdd(con, user);
                if (addNum == 1) {
                    JOptionPane.showMessageDialog(null, "注册成功！");
                    this.dispose();
                    new LogOnFrm().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "注册失败");
                }
            } else {
                JOptionPane.showMessageDialog(null, "用户名存在，请重新输入！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "注册失败，请重新注册！");
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    //重置表单
    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {
        this.userNameTxt.setText("");
        this.passwordTxt.setText("");
        this.passwordConfirmTxt.setText("");
        this.emailTxt.setText("");
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new RegisterFrm().setVisible(true);
//            }
//        });
//    }

    //GEN-BEGIN:variables
    // Variables declaration - do not modify
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jb_register;
    private javax.swing.JButton jb_reset;
    private javax.swing.JPasswordField passwordConfirmTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables

}