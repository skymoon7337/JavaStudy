package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance+= amount;
        System.out.println(amount+"원을 입금했습니다. 잔액은: " +balance+"원 입니다.");
    }

    void withdraw(int amount){
        if (amount<=balance){
            balance-= amount;
            System.out.println(amount+"원을 출금했습니다. 잔액은: " +balance+"원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다 잔액은 "+balance+"원 입니다.");
        }
    }
}
