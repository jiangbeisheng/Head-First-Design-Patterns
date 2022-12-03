package headfirst.designpatterns.facade.hometheater;

/**
 * 流媒体播放器
 *
 * @author lucas
 * @since 2022年12月03日12:28:34
 */
public class StreamingPlayer {
    /**
     * 描述
     */
    String description;
    /**
     * 当前章节
     */
    int currentChapter;
    /**
     * 放大器
     */
    Amplifier amplifier;
    /**
     * 电影
     */
    String movie;

    /**
     * 构造
     *
     * @param description 描述
     * @param amplifier   功放
     */
    public StreamingPlayer(String description, Amplifier amplifier) {
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
     * 播放
     *
     * @param movie 电影
     */
    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    /**
     * 播放 章
     *
     * @param chapter 章
     */
    public void play(int chapter) {
        if (movie == null) {
            System.out.println(description + " can't play chapter " + chapter + " no movie selected");
        } else {
            currentChapter = chapter;
            System.out.println(description + " playing chapter " + currentChapter + " of \"" + movie + "\"");
        }
    }

    /**
     * 停止播放
     */
    public void stop() {
        currentChapter = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    /**
     * 暂停
     */
    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    /**
     * 设置双通道音频
     */
    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
    }

    /**
     * 设置环绕音响
     */
    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
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
