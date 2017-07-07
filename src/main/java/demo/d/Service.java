package demo.d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoyuncong on
 * 2017/7/6 11:42
 * JavaEE_Framework.
 */
public class Service {
    public static void main(String[] args) {
        /*
            使用 Spring 方式，输出 “Hello, Tom”
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Hello hello= (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
}
