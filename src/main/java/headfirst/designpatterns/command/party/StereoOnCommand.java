package headfirst.designpatterns.command.party;

/**
 * 立体声打开命令
 *
 * @author lucas
 * @since 2022年11月30日13:56:38
 */
public class StereoOnCommand implements Command {
    /**
     * 立体声
     */
    Stereo stereo;

    /**
     * 构造
     *
     * @param stereo 立体声
     */
    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    /**
     * 执行
     */
    public void execute() {
        stereo.on();
    }

    /**
     * 撤销
     */
    public void undo() {
        stereo.off();
    }
}
