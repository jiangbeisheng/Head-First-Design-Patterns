package headfirst.designpatterns.command.party;

/**
 * 热浴盆打开命令
 *
 * @author lucas
 * @since 2022年11月30日14:17:15
 */
public class HottubOnCommand implements Command {
    /**
     * 热水浴缸
     */
    Hottub hottub;

    /**
     * 构造
     *
     * @param hottub 热水浴缸
     */
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    /**
     * 执行
     */
    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    /**
     * 撤销
     */
    public void undo() {
        hottub.off();
    }
}
