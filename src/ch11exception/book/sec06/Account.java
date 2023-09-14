package ch11exception.book.sec06;

public class Account {
    public long balance;

    public Account(){}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException { // 호출한 곳으로 예외 떠넘김
        if (balance < money){
            throw new InsufficientException("잔고 부족: " +(money-balance)+ " 모자람");
        }
        balance -= money;
    }
}
