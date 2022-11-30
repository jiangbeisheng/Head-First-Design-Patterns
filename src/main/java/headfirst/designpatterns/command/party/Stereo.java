package headfirst.designpatterns.command.party;

/**
 * 立体声
 *
 * @author lucas
 * @since 2022年11月30日11:17:53
 */
public class Stereo {
    /**
     * 位置
     */
    String location;

    /**
     * Stereo
     *
     * @param location 位置
     */
    public Stereo(String location) {
        this.location = location;
    }

    /**
     * 开
     */
    public void on() {
        System.out.println(location + " stereo is on");
    }

    /**
     * 关
     */
    public void off() {
        System.out.println(location + " stereo is off");
    }

    /**
     * 放置CD
     */
    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    /**
     * 放置DVD
     */
    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }

    /**
     * 设置收音机
     */
    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }

    /**
     * 设置音量
     *
     * @param volume 音量
     */
    public void setVolume(int volume) {
        // code to set the volume
        // valid range: 1-11 (after all 11 is better than 10, right?)
        System.out.println(location + " Stereo volume set to " + volume);
    }
}
