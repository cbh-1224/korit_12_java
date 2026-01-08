package ch13_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelDownButton(),
                new ChannelUpBotton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDonwVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
        System.out.println("-------------------------");

        AirConditionerController airConditionerController = new AirConditionerController(
                new TemperatureDownButton(),
                new TemperatureUpButton(),
                new ModeCahngeButton(),
                new PowerButton()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onUpTemperatureUpButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}
