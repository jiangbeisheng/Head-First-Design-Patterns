package headfirst.designpatterns.command.undo;

/**
 * 具有撤销功能的遥控器
 *
 * @author lucas
 * @since 2022年12月01日20:15:03
 */
public class RemoteControlWithUndo {
    /**
     * 存放开命令的数组
     */
    Command[] onCommands;
    /**
     * 存放关命令的数组
     */
    Command[] offCommands;
    /**
     * 撤消命令
     */
    Command undoCommand;

    /**
     * 构造方法 用于初始化数组及撤销命令对象
     */
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    /**
     * 设置命令
     *
     * @param slot       位置
     * @param onCommand  开命令
     * @param offCommand 关命令
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
        undoCommand = onCommands[slot]; //这里获取到的是某个on command实体
    }

    /**
     * 按下关闭按钮
     *
     * @param slot 位置
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot]; //这里获取的是某个off command实体
    }

    /**
     * 已按下撤消按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    /**
     * 线程不安全的 字符串拼接
     *
     * @return 拼接后的字符串
     */
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
