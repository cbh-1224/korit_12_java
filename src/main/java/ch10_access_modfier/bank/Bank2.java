package ch10_access_modfier.bank;

public class Bank2 {
    int accountNum; //(계좌번호, 정수)
    String accountHolder; // (예금주이름, 문자열)
    int balance; // (잔액, 정수)
    int pinNumber; // (비밀번호, 4 자리 정수 0 ~ 9999)

    public Bank2() {
    }

    public Bank2(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank2(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank2(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank2(int accountNum, String accountHolder, int balance, int pinNumber) {
        if(pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        if(balance < 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("불가능한 잔액");
            return;
        }
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount, int inputPin) {
        if(!checkPassword(inputPin)) return;

        if(!checkBalance(amount)) return;

        balance += amount;
        System.out.println(amount + "원이 입금되었씁니다. 현재 잔액: " + balance + "원");
    }
    public void withdraw(int amount, int inputPin) {
        if(!checkPassword(inputPin)) return;

        if(!checkBalance(amount)) return;

        if(balance - amount < 0) {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
            return;
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었씁니다. 현재 잔액: " + (balance - amount) + "원");
    }
    // 이하의 내부 메서드가 통과해야 그 다음 과정으로 넘어가기 때문에 -> private boolean
    private boolean checkPassword(int inputPin) {
        boolean result = true; // 지역 변수 result 선언 및 초기화
        if(inputPin != pinNumber) { // 해당 조건식이 true라면 result를 false로 반전
            System.out.println("비밀번호가 틀렸습니다."); // 시켜서 다음 과정으로 못가게
            result = !result;
        }
        return result;
    }

    private boolean checkBalance(int amount) {
        boolean result = true;
        if(amount <= 0) {
            System.out.println("작업에 실패하였습니다.");
            result = !result;
        }
        return result;
    }

    public void showAccountInfo() {
        System.out.println("계좌 번호: " + accountNum);
        System.out.println("계좌 소유자: " + accountHolder);
        System.out.println("현재 잔액: " + balance + "원\n");
    }

}
