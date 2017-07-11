package demo.c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by caoyuncong on
 * 2017/7/6 9:42
 * JavaEE_Framework.
 */
public class Service {
    public static void main(String[] args) {
//        Business business = new Business(new FloppyWriter());

//        Business business = new Business();
//        business.setDeviceWriter(new FloppyWriter());
//        business.write();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.write();
    }
}
