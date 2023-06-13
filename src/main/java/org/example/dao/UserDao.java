package org.example.dao;

import org.example.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * CateringSystem
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/6/12 23:48
 * @since JDK17
 */

public class UserDao {

    /**
     * 登陆验证
     * @param con
     * @param user
     * @return
     * @throws Exception
     */
    public User login(Connection con,User user) throws Exception{
        User resultUser = null;
        String sql="select *from user where userName=? and password=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassword());
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){
            resultUser = new User();
            resultUser.setUserName(rs.getString("userName"));
            resultUser.setPassword(rs.getString("password"));
            resultUser.setRank(rs.getInt("rank"));
            resultUser.setId(rs.getInt("id"));
        }
        return resultUser;
    }
    public int userAdd(Connection con,User user) throws Exception{
        String sql="insert into `user` values(null,?,?,?,?)";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getEmail());
        pstmt.setInt(4, user.getRank());
        return pstmt.executeUpdate();
    }
    public boolean isUserExist(Connection con, User user) throws Exception{
        String sql="select *from user where userName=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        ResultSet rs =pstmt.executeQuery();
        return rs.next();
    }

    public int userModify(Connection con,User user) throws Exception{
        String sql="update `user` set userName=?,password=?,email=? where id=?";
        PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, user.getUserName());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getEmail());
        pstmt.setInt(4, user.getId());;
        return pstmt.executeUpdate();
    }
}
