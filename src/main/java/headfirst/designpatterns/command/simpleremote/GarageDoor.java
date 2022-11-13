package headfirst.designpatterns.command.simpleremote;

/**
 * 车库门
 *
 * @author lucas
 * @since 2022年11月13日13:23:47
 */
public class GarageDoor {
    /**
     * 无参构造new对象
     */
    public GarageDoor() {
    }

    /**
     * 开门
     */
    public void up() {
        System.out.println("Garage Door is Open");
    }

    /**
     * 关门
     */
    public void down() {
        System.out.println("Garage Door is Closed");
    }

    /**
     * 停门
     */
    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    /**
     * 车库开灯
     */
    public void lightOn() {
        System.out.println("Garage light is on");
    }

    /**
     * 车库关灯
     */
    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
