package headfirst.designpatterns.command.party;

/**
 * 亮灯命令
 *
 * @author lucas
 * @since 2022年11月30日11:27:17
 */
public class LightOnCommand implements Command {
    /**
     * 开灯
     */
    Light light;

    /**
     * 构造
     *
     * @param light 灯
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 执行
     */
    public void execute() {
        light.on();
    }

    /**
     * 撤销
     */
    public void undo() {
        light.off();
    }
}
