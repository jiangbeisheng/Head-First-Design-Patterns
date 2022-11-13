package headfirst.designpatterns.command.simpleremote;

/**
 * 灯光关闭命令
 *
 * @author lucas
 * @since 2022年11月13日13:54:57
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
