
class Chandra {
    private String name;

    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name=name;
    }
}


// Encapsulation Assignment — Digital Wallet

// Ek Wallet class banao jo user's wallet balance ko protect kare.

// Requirements
// 1. Private fields
// private String ownerName;
// private double balance;
// private int pin;
// 2. Constructor

// Constructor se:

// owner name
// initial balance
// PIN

// initialize karo.

// Example:

// Wallet w = new Wallet("Chandra", 5000, 1234);
// 3. Deposit

// Method:

// deposit(double amount)

// Rules:

// amount > 0 hona chahiye
// valid hai → balance increase
// invalid hai → "Invalid deposit amount"
// 4. Withdraw

// Method:

// withdraw(double amount, int enteredPin)

// Rules:

// PIN wrong → "Invalid PIN"
// amount <= 0 → "Invalid amount"
// balance se zyada amount → "Insufficient balance"
// otherwise amount deduct karo.

// 5. Balance

// Directly balance access nahi hona chahiye.

// Getter:

// getBalance()
// 6. PIN change

// Method:

// changePin(int oldPin, int newPin)

// Rules:

// old PIN wrong → "Invalid old PIN"
// new PIN exactly 4 digits hona chahiye
// valid hone par PIN update.
// 7. Wallet summary

// Method:

// displayWallet()

// Output something like:

// Owner: Chandra
// Balance: ₹4200.0

// ⚠️ PIN kabhi display nahi karna.

// 🎯 Main mein ye scenario run karo
// Wallet create
//     ↓
// Deposit ₹2000
//     ↓
// Withdraw ₹1000 with correct PIN
//     ↓
// Withdraw ₹500 with wrong PIN
//     ↓
// Try withdraw ₹10000
//     ↓
// Change PIN
//     ↓
// Display final wallet
// Expected type of output
// Deposit successful
// Withdrawal successful
// Invalid PIN
// Insufficient balance
// PIN changed successfully

// Owner: Chandra
// Balance: ₹6000.0

// Important: main() se balance ya pin ko directly modify/read karne ki koshish mat karna. Encapsulation ka actual purpose wahi test karna hai.

import java.util.*;
class Wallet {

    private String owner;
    private double balance;
    private int pin;

    Wallet(String owner, double balance , int pin){
        this.owner=owner;
        this.balance=balance;
        this.pin =pin;
    }

    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println("deposit succesfull !...")
        }
        else {
        System.out.println("Invalid Ammount....");
        }
    }

    public void withDraw(double amount, int enteredPin){
        if(enteredPin != this.pin){
            System.out.println("Wrong Pin !");
        }

    else if(amount <=0){
        System.out.println("Invalid ammount !");
    }
    else if(amount>balance){
        System.out.println("Insufiscient Balance !");
    }
    else {
        balance = balance-amount;
        System.out.println("withdraw successfull ..!");
    }
        
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }


    public void changePin(int oldPin , int newPin){

        if(oldPin != this.pin){
            System.out.println("Wrong Pin !");
        }
        else if (newPin<0 || newPin>9999){
            System.out.println("invalid pin...!");
        }
        else {
            this.pin=newPin;
            System.out.println("Pin changed succesfully...!");
        }

    }

    public void displayWallet(){
        System.out.println(getBalance());
        System.out.println(getOwner());

    }

}

class Main{

    public static void main(String[]args){
        Wallet w1 =new Wallet("Chandra", 1500.00,1234);
        w1.deposit(2000);
        w1.withDraw(1000,1234);
        w1.withDraw(500,12345);
        w1.changePin(1234,12345);
        System.out.println(w1.getBalance());
        System.out.println(w1.getOwner());
    }
}