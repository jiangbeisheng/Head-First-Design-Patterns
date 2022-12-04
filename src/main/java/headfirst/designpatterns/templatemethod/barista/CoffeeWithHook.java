package headfirst.designpatterns.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 带钩咖啡
 *
 * @author lucas
 * @since 2022年12月04日13:19:23
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * has顾客想要调味品
     *
     * @return true or false
     */
    @Override
    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    /**
     * 获取用户输入
     *
     * @return 字符串
     */
    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
