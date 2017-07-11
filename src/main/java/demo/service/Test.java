package demo.service;

import demo.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoyuncong on
 * 2017/7/11 9:37
 * JavaEE_Framework.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/beas.xml");
        UserServise userServise = (UserServise) applicationContext.getBean("userService");

        for (User user : userServise.queryAll()) {
            System.out.println(user.getUsername());
        }
    }
}
