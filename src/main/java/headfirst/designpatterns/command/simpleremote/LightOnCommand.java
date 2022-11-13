package headfirst.designpatterns.command.simpleremote;

/**
 * 开灯命令
 *
 * @author lucas
 * @since 2022年11月13日13:00:40
 */
public class LightOnCommand implements Command {
    /**
     * 灯类
     */
    Light light;

    /**
     * 开灯有参构造
     *
     * @param light 灯
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 具备执行功能
     */
    public void execute() {
        light.on();
    }
}
