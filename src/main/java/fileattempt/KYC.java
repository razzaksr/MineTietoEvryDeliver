package fileattempt;

import java.io.Serializable;

public class KYC {
    private int number;

    @Override
    public String toString() {
        return number+","+name+","+balance;
    }

    public KYC() {
    }

    public KYC(int number, String name, Double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    private String name;
    private Double balance;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
