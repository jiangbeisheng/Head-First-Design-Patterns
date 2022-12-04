package headfirst.designpatterns.templatemethod.frame;

import javax.swing.*;
import java.awt.*;

/**
 * Java UI 框架
 *
 * @author lucas
 * @since 2022年12月04日15:00:54
 */
public class MyFrame extends JFrame {
    private static final long serialVersionUID = 2L;

    /**
     * 构造
     * 不用管细节，就是一些初始化动作
     *
     * @param title 标题
     */
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }

    /**
     * 画画
     * 钩子
     *
     * @param graphics 图形对象
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }
}
