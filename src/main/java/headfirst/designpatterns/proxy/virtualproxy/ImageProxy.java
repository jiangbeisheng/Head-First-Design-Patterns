package headfirst.designpatterns.proxy.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 图片代理
 *
 * @author lucas
 * @since 2022年12月19日19:13:39
 */
class ImageProxy implements Icon {
    final URL imageURL;
    volatile ImageIcon imageIcon;
    Thread retrievalThread;
    boolean retrieving = false;

    /**
     * 构造
     *
     * @param url 统一资源定位符
     */
    public ImageProxy(URL url) {
        imageURL = url;
    }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

                retrievalThread = new Thread(() -> {
                    try {
                        setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();

            }
        }
    }
}
