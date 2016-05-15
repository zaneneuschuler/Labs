/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author zane
 */
public class CheckingAccount {
    private String accountNo;
    private String name;
    private String address;
    private float balance;

    public CheckingAccount() {
        //initialize the field variables
        accountNo = "";
        name = "";
        address = "";
        balance = 0.0f;
    }

    public CheckingAccount(String accountNo, String name, String address, float balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public String toString() {
        String fmt = "$0.00";
        return "Account no. " + accountNo + ", Name: " + name + ", Address: " + address + ", Balance: " + MyUtils.formatNum(balance, fmt);
    }
    public void debit(float amount){
        balance = balance - amount;
    }
    public void credit(float amount){
        balance = balance + amount;
    }
    
    
    
    
    
    
    
}
