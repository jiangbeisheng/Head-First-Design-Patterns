package headfirst.designpatterns.command.party;

/**
 * 电视开机指令
 *
 * @author lucas
 * @since 2022年11月30日14:11:30
 */
public class TVOnCommand implements Command {
    /**
     * 电视
     */
    TV tv;

    /**
     * 构造
     *
     * @param tv 电视
     */
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    /**
     * 执行
     */
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    /**
     * 撤销
     */
    public void undo() {
        tv.off();
    }
}
