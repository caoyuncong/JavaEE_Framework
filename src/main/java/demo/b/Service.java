package demo.b;

/**
 * Created by caoyuncong on
 * 2017/7/6 9:42
 * JavaEE_Framework.
 */
public class Service {
    public static void main(String[] args) {
        Business business = new Business(new FloppyWriter());

        business.write();
    }
}
