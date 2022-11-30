package headfirst.designpatterns.command.party;

/**
 * 宏命令
 *
 * @author lucas
 * @since 2022年11月30日14:26:47
 */
public class MacroCommand implements Command {
    /**
     * 命令数组
     */
    Command[] commands;

    /**
     * 构造
     *
     * @param commands 命令数组
     */
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    /**
     * 执行
     */
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure
     * proper undo functionality
     */
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}

