package ch17_static.singleton.factory;

import lombok.Getter;


public class Samsung {
    // 정적 field
    private static Samsung instance;
    // 일반 field;
    @Getter
    private String company = getClass().getSimpleName();
    private int serialNumber = 20260000;

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    // 일반 method
    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
    /*
        싱글톤 = 어차피 객체가 하나만 생성될거라는 것을 알고 있는 상태
        근데 이 메서드를 호출했을 때 ++가 적용은 되겠죠. 그러면 다수의 객체를 만들려고 시도해봤자
        하나만 만들어지기 때문에 모델명_20260000에서 1씩 증가된 값이 시리얼 넘버가 될 것
        그 결과 시리얼 넘버가 중복되지 않으리라는 결론을 낼 수 있다.
     */
}
/*
    정적 변수로 serialNumber를 선언하지 않고 일반 field로 선언한 이유는 그냥 객체 하나만 생성된다고
    보여주려고 입니다.
    이미 static 개념을 배우고 이해한 수강생들이 떠올릴 수 있는 의문이므로 이런 질문이 떠오른다면
    학습이 올바르게 되고 있는 중이라고 보시면 됩니다.
 */