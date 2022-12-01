package headfirst.designpatterns.command.undo;

/**
 * 吊扇中等命令
 *
 * @author lucas
 * @since 2022年12月01日20:42:27
 */
public class CeilingFanMediumCommand implements Command {
    /**
     * 吊扇
     */
    CeilingFan ceilingFan;
    /**
     * 上一速度
     */
    int prevSpeed;

    /**
     * 构造
     *
     * @param ceilingFan 吊扇
     */
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    /**
     * 执行
     */
    public void execute() {
        //获取操作前的速度用于undo中使用
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    /**
     * 撤销
     */
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
