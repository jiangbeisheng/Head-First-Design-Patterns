package headfirst.designpatterns.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;

/**
 * 图片组件
 *
 * @author lucas
 * @since 2022年12月19日19:19:59
 */
class ImageComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    private Icon icon;

    /**
     * 构造
     *
     * @param icon 图标
     */
    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}
