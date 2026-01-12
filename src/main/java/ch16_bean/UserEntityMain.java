package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity userEntity1 = new UserEntity();

        userEntity1.setUsername(1);
        userEntity1.setPassword(9876);
        userEntity1.setEmail("a@teset.com");
        userEntity1.setName("김일");

        System.out.println(userEntity1);
        System.out.println(userEntity1.getName());

        UserEntityLombok userEntityLombok1 = new UserEntityLombok("b@teset.com");
        UserEntityLombok userEntityLombok2 = new UserEntityLombok();
        System.out.println(userEntityLombok1.getEmail());
        userEntityLombok2.setPassword(12345);
        System.out.println(userEntityLombok1);
        System.out.println(userEntityLombok2);
        UserEntityLombok userEntityLombok3 = new UserEntityLombok(2, 3456, "김이", "c@test.com");
        System.out.println(userEntityLombok3);
    }
}
