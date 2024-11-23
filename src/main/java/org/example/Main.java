package org.example;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<bankAccount> users = new ArrayList<>();
        System.out.println("enter the money you want:");
        int money = sc.nextInt();
        sc.nextLine();
        users.add(new bankAccount(money, "shahul"));
        System.out.println("please enter the the withdraw or deposit:");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("withdraw")) {
                System.out.println("enter the amount to withdraw: ");
                int withdraw_amount = sc.nextInt();
                users.get(0).withdraw(withdraw_amount);
            } else if (response.equalsIgnoreCase("deposit")) {
                System.out.println("enter the amount to deposit");
                int deposit_amount = sc.nextInt();
                users.get(0).deposit(deposit_amount);
            }

        for (bankAccount bankAccount : users) {
            System.out.println(bankAccount);
        }
    }
}