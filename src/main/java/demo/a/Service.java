package demo.a;

/**
 * Created by caoyuncong on
 * 2017/7/7 20:04
 * JavaEE_Framework.
 */
public class Service {
    public static void main(String[] args) {
        Business business = new Business(new FloppyWriter());
        business.write();
    }
}
