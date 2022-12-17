package headfirst.designpatterns.state.gumball;

/**
 * 口香糖贩卖机
 *
 * @author lucas
 * @since 2022年12月16日18:43:42
 */
public class GumballMachine {
    /**
     * 售罄
     */
    final static int SOLD_OUT = 0;
    /**
     * 没有四分之一的人
     */
    final static int NO_QUARTER = 1;
    /**
     * 有四分之一
     */
    final static int HAS_QUARTER = 2;
    /**
     * 出售
     */
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    /**
     * 构造
     *
     * @param count 数量
     */
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 插入四分之一
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter 不能再插入四分之一");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter 你插入了25美分的硬币");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter, the machine is sold out 你不能投25美分硬币，这台机器已经卖完了");
        } else if (state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball 请稍候，我们已经在给你吃口香糖了");
        }
    }

    /**
     * 弹出四分之一
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned 已退回25美分");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter 你还没有插入25美分硬币");
        } else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank 对不起，你已经转动曲柄了");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't inserted a quarter yet 您无法弹出，您尚未插入四分之一");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball! 转两圈不会再给你一个口香糖！");
        } else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter 你转动了，却一分也没有");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there are no gumballs 你转身了，但没有口香糖");
        } else if (state == HAS_QUARTER) {
            System.out.println("You turned... 你转了");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 分配
     */
    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot 一个口香糖从狭缝里滚了出来");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs! 哎呀，口香糖用完了");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first 你需要先付钱");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed 未分配口香糖");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed 未分配口香糖");
        }
    }

    /**
     * 重新灌装
     *
     * @param numGumBalls num个口香糖
     */
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    /**
     * 转换成字符串
     *
     * @return 字符串
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc. 强大的口香糖公司。");
        result.append("\nJava-enabled Standing Gumball Model 支持Java的立式口香糖模型 #2004\n");
        result.append("Inventory 库存: ").append(count).append(" 口香糖 gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is 机器是 ");
        if (state == SOLD_OUT) {
            result.append("sold out 售罄");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter 等待季度");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank 等待曲柄转动");
        } else if (state == SOLD) {
            result.append("delivering a gumball 送口香糖");
        }
        result.append("\n");
        return result.toString();
    }
}


