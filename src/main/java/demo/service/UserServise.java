package demo.service;

import demo.mapper.UserMapper;
import demo.model.User;
import demo.util.MyBatisSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by caoyuncong on
 * 2017/7/4 20:37
 * JavaEE_Framework.
 */
public class UserServise {
    private static int createUserViaXml() { // via 通过
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.insert("demo.mapper.UserMapper.create", new User(null, "Jerry1", "123"));
        }
    }

    private static int updateUserViaXml() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.update("demo.mapper.UserMapper.update", new User(1, "Tom", "123"));
        }
    }

    private static int deleteUserViaXml() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.delete("user.delete", 1);
        }
    }

    private static List<User> queryAllViaXml() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.selectList("user.queryAll");
//            return sqlSession.select("user.queryAll",);
//            return sqlSession.selectCursor()
        }
    }

    private static User queryByIdViaXml() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            return sqlSession.selectOne("user.queryById",2);
        }
    }

    private static int createUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "Jerry2", "123"));
        }
    }

    public static void main(String[] args) {
//        System.out.println(createUser()); // MyBatis method 2: Type Safer
//        System.out.println(createUserViaXml()); // MyBatis method 1
//        System.out.println(updateUserViaXml());
        System.out.println(deleteUserViaXml());
//        List<User> users = queryAllViaXml();
//        for (User user : users) {
//            System.out.println(user);
//        }

        System.out.println(queryByIdViaXml());
    }
}
