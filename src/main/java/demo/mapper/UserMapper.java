package demo.mapper;

import demo.model.User;

/**
 * Created by caoyuncong on
 * 2017/7/4 20:26
 * JavaEE_Framework.
 */
public interface UserMapper {
    int create(User user);

    int update(User user);

    int delete(int id);

}
