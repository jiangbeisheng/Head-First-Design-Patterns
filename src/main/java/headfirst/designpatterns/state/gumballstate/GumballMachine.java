package headfirst.designpatterns.state.gumballstate;

/**
 * 口香糖贩卖机
 *
 * @author lucas
 * @since 2022年12月17日18:49:31
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    /**
     * 构造 变厚了
     *
     * @param numberGumballs 口香糖数量
     */
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
        state.refill();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    /**
     * 打印口香糖贩卖机相关信息
     *
     * @return 打印内容
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc. 强大的口香糖公司");
        result.append("\nJava-enabled Standing Gumball Model #2004 支持Java的立式口香糖模型#2004");
        result.append("\nInventory: 库存：").append(count).append("口香糖 gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is 机器是").append(state).append("\n");
        return result.toString();
    }
}
