package headfirst.designpatterns.facade.hometheater;

/**
 * 放大器
 *
 * @author lucas
 * @since 2022年12月03日11:46:51
 */
public class Amplifier {
    /**
     * 描述
     */
    String description;
    /**
     * 调谐器
     */
    Tuner tuner;
    /**
     * 流媒体播放器
     */
    StreamingPlayer player;

    /**
     * 构造
     *
     * @param description 描述
     */
    public Amplifier(String description) {
        this.description = description;
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
     * 设置立体声
     */
    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    /**
     * 设置环绕立体声
     */
    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    /**
     * 设置音量
     *
     * @param level 级别
     */
    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    /**
     * 设置 调谐器
     *
     * @param tuner 调谐器
     */
    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + player);
        this.tuner = tuner;
    }

    /**
     * 设置流媒体播放器
     *
     * @param player 流媒体播放器
     */
    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " setting Streaming player to " + player);
        this.player = player;
    }

    /**
     * 返回描述
     *
     * @return 描述
     */
    public String toString() {
        return description;
    }
}
