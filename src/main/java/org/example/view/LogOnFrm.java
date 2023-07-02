package org.example.view;

import org.example.dao.UserDao;
import org.example.model.User;
import org.example.util.DBUtil;
import org.example.util.StringUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.util.Objects;
import java.util.Enumeration;


/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/12 23:48
 * @since JDK17
 */

public class LogOnFrm  extends JFrame {

    DBUtil dbUtil = new DBUtil();
    UserDao userDao = new UserDao();
    public static User s_currentUser = null;//保存登陆用户的参数
    private JPasswordField passwordTxt;
    private JTextField userNameTxt;

    /** Creates new form LogOnFrm */
    public LogOnFrm() {
        //改变系统默认字体
        Font font = new Font("Dialog", Font.PLAIN, 12);
        Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, font);
            }
        }
        initComponents();
        //设置frame居中显示
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        JLabel showLabel = new JLabel();
        JLabel usernameLabel = new JLabel();
        JLabel passwordLabel = new JLabel();
        JButton loginBtn = new JButton();
        JButton registerBtn = new JButton();
        userNameTxt = new JTextField();
        passwordTxt = new JPasswordField();
        JButton resetBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("系统");
        setResizable(false);

        showLabel.setFont(new java.awt.Font("宋体", 1, 24));
        showLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/OrderMeal.png"))));
        showLabel.setText("餐饮系统欢迎");

        usernameLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/userName.png"))));
        usernameLabel.setText("用户名：");

        passwordLabel.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/password.png"))));
        passwordLabel.setText("密  码：");

        loginBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/login.png"))));
        loginBtn.setText("登陆");
        loginBtn.addActionListener(this::loginBtnActionPerformed);

        registerBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/register.png"))));
        registerBtn.setText("注册用户");
        registerBtn.addActionListener(this::registerBtnActionPerformed);

        resetBtn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/reset.png"))));
        resetBtn.setText("重置");
        resetBtn.addActionListener(this::resetBtnActionPerformed);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(usernameLabel)
                                .addComponent(passwordLabel))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordTxt)
                                .addComponent(userNameTxt, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING,
                                layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(loginBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(resetBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(registerBtn))
                            .addComponent(showLabel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(54, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(showLabel, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(
                        userNameTxt,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTxt,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(resetBtn)
                    .addComponent(registerBtn))
                .addContainerGap(55, Short.MAX_VALUE)));

        pack();
    }

    //显示注册页面
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new RegisterFrm().setVisible(true);
    }

    //登陆验证显示登陆以后界面
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = this.userNameTxt.getText();
        String password = new String(this.passwordTxt.getPassword());
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(null, "用户名不能为空");
            return;
        }
        if (StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "密码不能为空");
            return;
        }
        User user = new User(userName, password);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            User currentUser = userDao.login(con, user);
            if (currentUser != null) {
                s_currentUser = currentUser;//保存登陆的用户
                int role = currentUser.getRank();
                if (role == 1) {
                    this.dispose();
                    new AdminFrm().setVisible(true);//进入管理员页面
                } else if (role == 0) {
                    this.dispose();
                    new UserOrderFrm().setVisible(true);//进入用户点餐界面
                }
            } else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误");
            }
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "用户名或密码错误");
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }
    //重置文本框内容
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.passwordTxt.setText("");
        this.userNameTxt.setText("");
    }

}
