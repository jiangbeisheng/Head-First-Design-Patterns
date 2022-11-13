package headfirst.designpatterns.command.simpleremote;

/**
 * 命令接口
 * 所有的命令类都要实现它，那么所有的实现类都具备了execute方法
 *
 * @author lucas
 * @since 2022年11月13日12:56:12
 */
public interface Command {
    /**
     * 默认public的执行方法
     */
    void execute();
}
