package headfirst.designpatterns.command.party;

/**
 * 命令接口
 *
 * @author lucas
 * @since 2022年11月28日17:06:19
 */
public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
