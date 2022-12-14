package headfirst.designpatterns.command.simpleremote;

/**
 * 远程控制类测试类
 *
 * @author lucas
 * @since 2022年11月13日13:35:43
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        //1.创建控制器对象
        SimpleRemoteControl control = new SimpleRemoteControl();
        //2.创建灯对象
        Light light = new Light();
        //3.创建车库门对象
        GarageDoor garageDoor = new GarageDoor();
        //4.创建开灯命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        //5.创建车库门开关
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        //控制器设置开灯命令
        control.setCommand(lightOnCommand);
        //控制器按钮已按下
        control.buttonWasPressed();

        //the same to above
        control.setCommand(lightOffCommand);
        control.buttonWasPressed();

        //控制器设置命令
        control.setCommand(garageDoorOpenCommand);
        //控制器按钮被按下
        control.buttonWasPressed();
    }

}
