package ch13_abstraction.interfaces;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public void onPressPowerButton() {
        powerButton.onPressed();
    }
    /*
        onPressedChannelDownButton() 메서드와
        onDownChannelDownButton() 메서드를 정의하시오
        정의 방식을 이상을 참조할 것
        Main에서 tvRemoteController.onPressedChannelDown();
        Main에서 tvRemoteController.onDownChannelDown();
        메서드들을 호출하시오.
        실행 예
        Tv 리모컨 객체가 생성되었습니다. -> 생성자 건드리라는 의미
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
     */
    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }
    /*
        onPressedChannelUpButton()
        onUpChannelUpButton() 생성

                실행 예
        Tv 리모컨 객체가 생성되었습니다. -> 생성자 건드리라는 의미
        전원을 켭니다.
        채널을 한 칸 내립니다.
        채널을 계속 내립니다.
        채널을 한 칸 올립니다.
        채널을 계속 올립니다.
        전원을 끕니다
     */
    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton() {
        String onUp = channelUpButton.onUp();
        System.out.println(onUp + "올립니다.");
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.println(volumeUpButton.onUp());
    }

}
