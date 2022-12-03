package headfirst.designpatterns.facade.hometheater;

/**
 * CD播放器
 *
 * @author lucas
 * @since 2022年12月03日12:33:03
 */
public class CdPlayer {
    /**
     * 描述
     */
    String description;
    /**
     * current Track
     */
    int currentTrack;
    /**
     * 放大器
     */
    Amplifier amplifier;
    /**
     * 标题
     */
    String title;

    /**
     * 构造
     *
     * @param description 描述
     * @param amplifier   放大器
     */
    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    /**
     * 开
     */
    public void on() {
        System.out.println(description + " on");
    }

    /**
     * 关
     */
    public void off() {
        System.out.println(description + " off");
    }

    /**
     * 弹出
     */
    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }

    /**
     * 播放
     *
     * @param title 标题
     */
    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    /**
     * 播放
     *
     * @param track 轨道
     */
    public void play(int track) {
        if (title == null) {
            System.out.println(description + " can't play track " + currentTrack +
                    ", no cd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack);
        }
    }

    /**
     * 停止
     */
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped");
    }

    /**
     * 暂停
     */
    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }

    /**
     * 返回字符串
     *
     * @return 描述
     */
    public String toString() {
        return description;
    }
}
