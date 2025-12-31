package ch10_access_modfier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank(123456, "홍길동", 100000, 1234);

        account1.showAccountInfo();
        account1.deposit(50000, 1234);
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);
        account1.showAccountInfo();

        Bank account2 = new Bank(987654, "신사임당", 500000, 1234);

        account2.showAccountInfo();
        account2.withdraw(100000, 1234);
        account2.deposit(200000, 1234);
        account2.showAccountInfo();
    }
}
