package headfirst.designpatterns.command.party;

/**
 * 立体声关闭命令
 *
 * @author lucas
 * @since 2022年11月30日14:19:28
 */
public class StereoOffCommand implements Command {
    /**
     * 音响
     */
    Stereo stereo;

    /**
     * 构造
     *
     * @param stereo 立体声
     */
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    /**
     * 执行
     */
    public void execute() {
        stereo.off();
    }

    /**
     * 撤销
     */
    public void undo() {
        stereo.on();
    }
}
