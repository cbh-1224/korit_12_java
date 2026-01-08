package ch13_abstraction.interfaces;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpBotton channelUpBotton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpBotton channelUpBotton, VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpBotton = channelUpBotton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpBotton.onPressed();
    }

    public void onUpChannelUpButton() {
        channelUpBotton.onUp();
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDonwVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        volumeUpButton.onUp();
    }
}
