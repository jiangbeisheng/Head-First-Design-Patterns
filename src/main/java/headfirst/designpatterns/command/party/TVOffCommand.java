package headfirst.designpatterns.command.party;

/**
 * 电视关闭命令
 *
 * @author lucas
 * @since 2022年11月30日14:21:40
 */
public class TVOffCommand implements Command {
    /**
     * 电视
     */
    TV tv;

    /**
     * 构造
     *
     * @param tv 电视
     */
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    /**
     * 执行
     */
    public void execute() {
        tv.off();
    }

    /**
     * 撤销
     */
    public void undo() {
        tv.on();
    }
}
