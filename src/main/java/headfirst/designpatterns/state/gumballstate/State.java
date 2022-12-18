package headfirst.designpatterns.state.gumballstate;

/**
 * 状态
 *
 * @author lucas
 * @since 2022年12月17日18:33:55
 */
public interface State {
    /**
     * 插入四分之一
     */
    void insertQuarter();

    /**
     * 弹出四分之一
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 分配
     */
    void dispense();

    /**
     * 再填充
     */
    void refill();
}
