package demo.mapper;

import demo.model.User;

import java.util.List;

/**
 * Created by caoyuncong on
 * 2017/7/7 10:00
 * JavaEE_Framework.
 */
public interface UserDao {
    int createUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> queryAll();

    User queryById(int id);
}
