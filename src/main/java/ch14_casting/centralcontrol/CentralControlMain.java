package ch14_casting.centralcontrol;

import java.util.Scanner;

public class CentralControlMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();
        //이하의 코드는 비어있는 배열을 CentralControl 클래스의 field인 devicArray에 집어넣었네요.
        CentralControl centralControl = new CentralControl(new Power[8]); // 여기서 업캐스팅이 이루어졌습니다.

        // 이하의 코드는 powers 배열을 만든 다음에 내부에 Power를 하위 클래스들의 객체를 집어넣었습니다.
        Power[] powers = {new AirConditioner(), new Computer(), new Mouse(), new LED()};

        /*
            근데 저희는 여기서 각 전자기기들의 객체를 생성하고 여기서 집어넣는 것까지 전체 다 실험할 예정이기 때문에
            powers를 직접 쓰지는 않을거고, Power가 interface이기 때문에 객체 생성이 안되는데 배열을 만들 수 있는가를
            검증하기 위해 코드를 남겨두겠습니다.
         */
//        centralControl1.deviceArray 에 접근하는 것이 불가능. 접근 제어자가 private이기 때문에
//        그렇다면 centralControl1.deviceArray에 Power의 하위 클래스인 AirConditioner 등의 객체를 집어넣기 위해서는
//        public method를 경유해야할 것 같습니다. -> CentralControl 클래스에 pulbic method를 정의해야만 하겠다.

        centralControl.addDevice(airConditioner1); // 여기서 업캐스팅이 이루어졌습니다.
        centralControl.addDevice(computer1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);
        centralControl.addDevice(printer1);
        centralControl.addDevice(speaker1);
        System.out.println("------------");
        centralControl.powerOn();
        System.out.println("--------------");
        centralControl.powerOff();
        System.out.println("-------------");
        centralControl.showInfo();
        System.out.println("--------------");
        centralControl.performSpecificMethod();
        System.out.println("-----------------");
        centralControl.deleteDevice1();



    }
}
