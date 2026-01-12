package ch14_casting.centralcontrol;

import java.util.Scanner;

public class CentralControl2 {
    private Power[] deviceArray;

    public CentralControl2(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        int emptyIndex = checkEmpty();

        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");

    }

    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }

    public void powerOn() {

        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 켤 수 없습니다.");
                continue;
            }
            deviceArray[i].on();
        }
    }
    public void powerOff() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                continue;
            }
            device.off();
        }
    }


    public void showInfo() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] ==     null) {
                System.out.println("슬롯 [ " + (i + 1) + " ] 번 : Empty");
                continue;
            }
            System.out.println("슬롯 [ " + (i + 1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }
    public void showInfo2() {
        int i = 0;
        for (Power device : deviceArray) {
            System.out.println("슬롯 [ " + ++i + " ] 번 : Empty");
            continue;
        }
        System.out.println("슬롯 [ " + ++i + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
    }

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device != null) {
                device.perform();
            }
        }
    }
    public void deleteDevice(int slot) {
        int i = slot - 1;
        System.out.println(deviceArray[i].getClass().getSimpleName() + "을(를) 삭제했습니다.");
        deviceArray[i] = null;
    }

    public void deleteDevice(String deviceName) {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceName == deviceArray[i].getClass().getSimpleName()) {
                System.out.println(deviceArray[i].getClass().getSimpleName() + "을(를) 삭제했습니다.");
                deviceArray[i] = null;
                return;
            } else if (deviceArray[i] == null) {
                continue;
            }
        }
    }


}
