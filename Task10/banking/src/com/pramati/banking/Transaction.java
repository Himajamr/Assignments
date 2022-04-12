package com.pramati.banking;
import java.util.Scanner;
import java.util.ArrayList;

public class Transaction extends Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> account=new ArrayList<Account>();
        while(true)
        {
            String str[] = sc.nextLine().split(" ");
            Account ac = new Account();
            switch (str[0]) {
                case "create":
                    String st=String.join(" ",str);
                    System.out.println(ac.create(st.substring(7)));
                    account.add(ac);
                    System.out.println(hm);
                    break;
                case "deposit":
                    int res=ac.deposit(Integer.parseInt(str[1]),Integer.parseInt(str[2]));
                    if(res!=0){
                        System.out.println(res);
                    }
                    System.out.println(hm);
                    break;
                case "withdraw":
                    int re=ac.withdraw(Integer.parseInt(str[1]),Integer.parseInt(str[2]));
                    if(re!=0)
                        System.out.println(re);
                    System.out.println(hm);
                    break;
                case "balance":
                    System.out.println(ac.getBalance(Integer.parseInt(str[1])));
                    break;
                case "transfer":
                    ac.transfer(Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3]));
                    System.out.println(hm);
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }
}
