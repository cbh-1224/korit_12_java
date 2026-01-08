package ch14_casting.centralcontrol;

import java.util.Scanner;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    /*
        그래서 여기에 deviceArray에 element를 추가하는 메서드를 작성할건데,
        배열의 특성 상 lastIndex + 1 개의 방을 가지게 될겁니다. 그런데 5개의 방을
        가지고 있는데 6개 째의 Power 하위 클래스의 객체를 집어넣게 되면 오류가
        발생하게 될거라는 걸 추측할 수 있으므로,
        우리는 추가하기 전에 일단 배열에 비어있는 곳이 있는지를 체크하도록 할 예정입니다.
        그러면 추가하는 메서드를 정의할 때의 로직은
        1. deviceArray 필드 내에 비어있는 방이 있는지 체크
        2. 비어있다면 추가
        3. 없다면 거절
        의 단계로 메서드를 작성할 필요가 있을 것 같습니다.
     */
    public void addDevice(Power device) {
        // 1 . 비어 있는지 체크
        int emptyIndex = checkEmpty();

        // 2. 조건문 작성해서 비어있으면 추가 / 없으면 연결 못한다고 안내
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 추가되었습니다.");
        /*
            .getClass() -> 클래스명을 return하는 method -> 패키지명.클래스 형태로 return
            .getClass().getSimpleName() -> 클래스명만 return

            여기까지 작성했을 때, 결과적으로 addDevice()라는 메서드 내에
            1. 비어있는 index를 확인하는 메서드 하나
            2. 추가하는 메서드 하나
            로 두개로 이루어져 있음을 알 수 있습니다.
         */
    }

    // 비어있는 인덱스를 굳이 외부로 노출할 필요가 없기 때문에
    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }
    /*
        Java의 index 넘버에는 음수값이 없기 때문에(python에는 있지만), 실패를 나타낼 때 -1을
        쓰는 경우가 많습니다. 하지만 0과 너무 가까운 수이다보니까 조직에 따라서 -100이라든지
        아니면 return으로 나올 수 없을 만한 음수값을 지정하는 경우도 있는데,
        아까 위에 addDevice 메서드에서 if(emptyIndex == -4293058)로 쓰고 싶지 않으면
        -1 쓰는게 정신 건강에 좋습니다.
     */

    /*
        deviceArray는 Power[] 배열로 이루어져있습니다. -> 그러면 interface Power 내부에
        .on()이라는 메서드가 있으므로
        Power[]배열 내에 있는 element들은 전부 .on() 메서드를 강제로 구현했어야만 합니다.
        그러니까 객체명.on();을 호출해주기만 한다면 deviceArray() 내부에 있는 element들은 전부
        전원이 켜지겠네요.
     */

    public void powerOn() {
        /*
            해당 클래스의 필드인 Power[] 배열 내에 있는 객체들은 기본적으로
            Power의 서브 클래스의 객체들입니다.
            즉, on() / off() method를 공통적으로 지니고 있습니다.
            그리고 Power 자료형으로 업캐스팅도 되어있습니다.
         */
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

    // 근데 아까 말한 것처럼 비어있는 index가 있따면 오류 발생
    /*
        예를 들어 5개짜리 배열 만들었는데 3번지가 비어있으면
        0, 1, 2에서 on() 메서드를 호출하는데 성공하고,
        3에서 오류 발생하기 때문에 4번 인덱스에서 on() 메서드를 아예 호출하지 못합니다.
     */

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
    // downcasting 관련 - 즉 Power[]의 내부 element의 고유 메서드 호출
    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) {
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changeMode();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device == null) {
                System.out.println("연결되어 있지 않습니다.");
            } else {
                System.out.println("아직 지원되지 않는 기기입니다.");
            }
        }
    }
    public void deleteDevice1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 기기 입력: ");
        int deviceNum = scanner.nextInt();

        if (deviceArray[deviceNum] == null) {
            System.out.println("해당 기기가 없습니다.");
            return;
        }
        deviceArray[deviceNum] = null;
        System.out.println(deviceNum + "번 기기가 삭제되었습니다.");
    }

    public void deleteDevice2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("삭제할 기기 입력: ");
        String deviceName = scanner.next();

        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] != null && deviceName.equals(deviceArray[i].getClass().getSimpleName())) {
                deviceArray[i] = null;
                System.out.println(deviceName + " 기기가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 기기가 없습니다.");
    }
}
/*
    Printer 클래스와 Speaker 클래스를 생성하고 Power를 implement하시오.
    Printer의 고유 메서드는 print() - 프린터가 인쇄를 합니다.
    Speaker의 고유 메서드는  change(Equal() - 스피커의 이퀄라이저를 변경합니다.

    Main에서 Printer / Speaker 인스턴스를 deviceArray에 추가하고
    .powerOn()
    .powerOff()
    .showInfo()
    .performSpecificMethod()

    deleteDevice()를 2개 정의하시오.
    삭제 안내문
 */