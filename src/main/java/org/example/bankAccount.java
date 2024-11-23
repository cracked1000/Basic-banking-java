package org.example;

public class bankAccount {
    private double amount;
    private String name;

    public bankAccount(double amount,String name){
        this.amount=amount;
        this.name=name;
    }
    public void getname(){
        System.out.println("The user is:" + name);
    }
    public void setname(String new_name){
        this.name= new_name;
    }
    public void withdraw(int withdraw_amount){
        amount = amount - withdraw_amount;
        System.out.println("your current amount is: " + amount);
    }
    public void deposit(int deposit_amount){
        amount = amount + deposit_amount;
        System.out.println("your current amount is: " + amount);
    }
    @Override
    public String toString() {
        return "Account Holder: " + name + ", Balance: " + amount;
    }
}


