package demo.service;

import com.mysql.jdbc.Driver;
import demo.mapper.UserDao;
import demo.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyuncong on
 * 2017/7/7 11:29
 * JavaEE_Framework.
 */
public class Jdbc implements UserDao {
    @Override
    public int createUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public List<User> queryAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            new Driver();
            connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");
            preparedStatement = connection.prepareStatement("SELECT * FROM db_test.user");
            resultSet = preparedStatement.executeQuery();
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("username"),
                        resultSet.getString("password")
                );
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (resultSet!=null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public User queryById(int id) {
        return null;
    }
}
