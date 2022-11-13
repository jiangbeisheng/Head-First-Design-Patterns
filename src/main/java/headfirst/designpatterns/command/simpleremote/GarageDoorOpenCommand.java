package headfirst.designpatterns.command.simpleremote;

/**
 * 车库门打开命令
 *
 * @author lucas
 * @since 2022年11月13日13:31:21
 */
public class GarageDoorOpenCommand implements Command {
    /**
     * 车库门对象
     */
    GarageDoor garageDoor;

    /**
     * 有参构造
     *
     * @param garageDoor 车库门
     */
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
