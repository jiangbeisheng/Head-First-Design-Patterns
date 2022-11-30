package headfirst.designpatterns.command.party;

/**
 * 灯光关闭命令
 *
 * @author lucas
 * @since 2022年11月30日14:17:46
 */
public class LightOffCommand implements Command {
    /**
     * 灯
     */
    Light light;

    /**
     * 灯光关闭命令
     *
     * @param light 灯
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行关
     */
    public void execute() {
        light.off();
    }

    /**
     * 撤销
     */
    public void undo() {
        light.on();
    }
}
