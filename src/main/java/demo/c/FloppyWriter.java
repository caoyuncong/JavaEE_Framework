package demo.c;

/**
 * Created by caoyuncong on
 * 2017/7/6 9:39
 * JavaEE_Framework.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        System.out.println("write to Floppy.");
    }
}
