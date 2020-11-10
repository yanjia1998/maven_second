package com.qf.service.Impl;

import com.qf.pojo.User;
import com.qf.service.UserService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybase?useUnicode=true&characterEncoding=utf8","root","root");
            PreparedStatement preparedStatement = con.prepareStatement("select u_name name ,u_sex sex ,u_addr addr from user");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> userlist = new ArrayList<>();
            while (resultSet.next()){
                User user = new User();
                user.setSex(resultSet.getString("sex"));
                user.setName(resultSet.getString("name"));
                user.setAddr(resultSet.getString("addr"));
                userlist.add(user);
            }

            return userlist;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
