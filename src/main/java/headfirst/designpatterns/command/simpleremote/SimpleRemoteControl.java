package headfirst.designpatterns.command.simpleremote;

/*
 * This is the invoker 这是调用者
 *
 * @author lucas
 * @since 2022年11月13日13:22:02
 */
public class SimpleRemoteControl {
    /**
     * 槽
     */
    Command slot;

    /**
     * 无参构造，可new对象
     */
    public SimpleRemoteControl() {
    }

    /**
     * 设置命令对象
     *
     * @param command 命令
     */
    public void setCommand(Command command) {
        slot = command;
    }

    /**
     * 按钮已按下
     */
    public void buttonWasPressed() {
        slot.execute();
    }
}
