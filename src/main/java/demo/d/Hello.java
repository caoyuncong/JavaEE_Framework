package demo.d;

/**
 * Created by caoyuncong on
 * 2017/7/6 11:40
 * JavaEE_Framework.
 */
public class Hello {
    private CharSequence name;

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public void setName(CharSequence name) {
        this.name = name;
    }
}
