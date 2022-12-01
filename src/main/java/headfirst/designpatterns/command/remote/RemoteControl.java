package headfirst.designpatterns.command.remote;

/**
 * 遥控器
 *
 * @author lucas
 * @since 2022年12月01日16:15:00
 */
public class RemoteControl {
    /**
     * 打开命令的数组
     */
    Command[] onCommands;
    /**
     * 存放关闭开关的数组
     */
    Command[] offCommands;

    /**
     * 构造 初始化开关按钮
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置按钮的功能
     *
     * @param slot       位置
     * @param onCommand  打开开关
     * @param offCommand 关闭开关
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 按钮被按下时
     *
     * @param slot 位置
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 按下关闭按钮
     *
     * @param slot
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * 转string好打印
     *
     * @return 字符串
     */
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
