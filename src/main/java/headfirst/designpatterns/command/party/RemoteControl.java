package headfirst.designpatterns.command.party;

/**
 * 远程控制
 *
 * @author lucas
 * @since 2022年11月28日17:28:59
 */
public class RemoteControl {
    /**
     * 打开命令集合
     */
    Command[] onCommands;
    /**
     * 关闭命令集合
     */
    Command[] offCommands;
    /**
     * 撤消命令
     */
    Command undoCommand;

    /**
     * 远程控制构造方法
     * 初始化插槽
     */
    public RemoteControl() {
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
     * @param slot       插槽的位置
     * @param onCommand  开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 当按钮被按下
     *
     * @param slot 插槽
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    /**
     * 按下关闭按钮
     *
     * @param slot 插槽
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * 按下关闭按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    /**
     * toString
     *
     * @return 字符串
     */
    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }
        stringBuff.append("[undo] ").append(undoCommand.getClass().getName()).append("\n");
        return stringBuff.toString();
    }
}
