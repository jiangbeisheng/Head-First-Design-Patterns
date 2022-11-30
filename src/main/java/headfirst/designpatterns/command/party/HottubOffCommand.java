package headfirst.designpatterns.command.party;


/**
 * 浴缸关闭命令
 *
 * @author lucas
 * @since 2022年11月30日14:23:40
 */
public class HottubOffCommand implements Command {
    /**
     * 热水浴缸
     */
    Hottub hottub;

    /**
     * 构造
     *
     * @param hottub 浴缸
     */
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    /**
     * 执行
     */
    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    /**
     * 撤销
     */
    public void undo() {
        hottub.on();
    }
}
