package demo.b;

/**
 * Created by caoyuncong on
 * 2017/7/6 9:43
 * JavaEE_Framework.
 */
public class Business {
    private DeviceWriter deviceWriter;

    public Business(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
