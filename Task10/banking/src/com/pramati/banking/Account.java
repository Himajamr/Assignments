package com.pramati.banking;
import java.util.*;
public class Account {
    static HashMap<Integer, List> hm = new HashMap<Integer, List>();
    static int AccNum = 1000;
    String AccHolder;
    int balance = 0;
    static int deposits = 0;
    static int withdraws = 0;

    public int create(String name) {
        AccNum =AccNum+ 1;
        AccHolder = name;
        hm.put(AccNum, new ArrayList<>());
        hm.get(AccNum).add(AccHolder);
        hm.get(AccNum).add(balance);
        hm.get(AccNum).add(deposits);
        hm.get(AccNum).add(withdraws);
        return AccNum;
    }

    public int deposit(int AccNum, int amount) {

        if ((int) hm.get(AccNum).get(1) + amount < 100000 && amount >= 500 && amount <= 50000 && (int) hm.get(AccNum).get(2) < 3) {
            hm.get(AccNum).set(1, (int) hm.get(AccNum).get(1) + amount);
            hm.get(AccNum).set(2, (int) hm.get(AccNum).get(2) + 1);
            return (int) hm.get(AccNum).get(1);
        } else if (amount < 500) {
            System.out.println("Minimum deposit amount is 500");
        } else if (amount > 50000) {
            System.out.println("Maximum deposit amount is 50000");
        } else if ((int) hm.get(AccNum).get(2) >= 3) {
            System.out.println("Only 3 deposits are allowed in a day");
        }
        return 0;
    }

    public int withdraw(int accNum, int amount) {
        if ((int) hm.get(accNum).get(1) - amount >= 0 && amount >= 1000 && amount <= 25000 && (int) hm.get(accNum).get(3) < 3) {
            hm.get(accNum).set(1, (int) hm.get(accNum).get(1) - amount);
            hm.get(accNum).set(3, (int) hm.get(accNum).get(3) + 1);
            return (int) hm.get(accNum).get(1);
        } else if (amount < 1000) {
            System.out.println("Minimum withdraw amount is 1000");
        } else if (amount > 25000) {
            System.out.println("Maximum withdraw amount is 25000");
        } else if ((int) hm.get(accNum).get(3) >= 3) {
            System.out.println("Only 3 withdrawals are allowed in a day");
        } else if (amount > (int) hm.get(accNum).get(1)) {
            System.out.println("Insufficient balance");
        }
        return 0;
    }

    public int getBalance(int accNum) {
        return (int) hm.get(accNum).get(1);
    }

    public void transfer(int srcAcc, int desAcc, int amount) {
        withdraw(srcAcc, amount);
        deposit(desAcc, amount);
        System.out.println("Money Transfered");
    }
}
