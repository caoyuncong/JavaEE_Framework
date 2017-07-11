package demo.a;

/**
 * Created by caoyuncong on
 * 2017/7/7 20:10
 * JavaEE_Framework.
 */
public class Business {
    private FloppyWriter floppyWriter;

    public Business(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void write() {
        floppyWriter.writeToFloppy();
    }
}
