// Assignment 1 — Login Validator 🟢

// Create:

// class LoginService

// Create a method:

// void login(String username, String password)

// Requirements:

// If username is empty → throw IllegalArgumentException
// If password is empty → throw IllegalArgumentException
// If username is "admin" and password is "1234" → print:
// Login successful
// Otherwise print:
// Invalid username or password

// In main(), call the method inside try-catch.

// Example
// Username: admin
// Password: 1234


// Login successful

// Then test:

// Username: admin
// Password:

class LoginService {

    String username;
    String password;

    LoginService(String username, String password){
        this.username=username;
        this.password=password;
        
    }

    
    void login(){
        if(username.isEmpty() ){
            throw new IllegalArgumentException("Username cant be empty");
        }
        else if(password.isEmpty()){
            throw new IllegalArgumentException("Password cant be empty")
        }

        if("admin".equals(username) && "1234".equals(password)){
            System.out.println("Login Successfull ....");

        }
        else {
            System.out.println("Invalid Username or password");
        }
    }


}

class Main {

    public static void main(String[]args){
   
        LoginService[] creds = [
            new LoginService("admin","1234"),
            new LoginService("Chandra","12345"),
            new LoginService(" ", " ")
        ]

        for(LoginService cred :creds){
            try {
                creds.login();
            }
            catch(IllegalArgumentException e){
                System.out.println(e);
            }
        }
}
}


// Requirements:
// 1. Create class BankAccount with fields: accountNumber, balance
// 2. Methods: deposit(double amount), withdraw(double amount), transfer(BankAccount to, double amount)
// 3. Create custom exceptions:
//    - InsufficientBalanceException (unchecked)
//    - InvalidAmountException (unchecked)
// 4. Rules:
//    - Deposit: amount must be > 0, else throw InvalidAmountException
//    - Withdraw: amount > balance, throw InsufficientBalanceException
//    - Transfer: check sender's balance + receiver exists
// 5. In main(): Create 2 accounts, perform operations in try-catch

// Expected Output:
// Deposited ₹5000.00 to account ACC-001
// Withdrew ₹2000.00 from account ACC-001
// Transferred ₹3000.00 from ACC-001 to ACC-002
// ERROR: Insufficient balance in ACC-002 for withdrawal of ₹5000.00

class BankAccount {
  String accountNumber;
 double balance;
  
  BankAccount(String accountNumber, double balance){
    this.accountNumber=accountNumber;
    this.balance=balance;
  }
  

   void deposit(double amount){
   if(amount >0){
    balance=balance+amount;
    System.out.println(amount + "deposited in : " + accountNumber);
   } else {
    throw new InvalidAmountException("Invalid amount .........");
   }
   }

   void withDraw (double amount){
  if(amount>balance){
    throw new InsufficientBalanceException("insuffiscient balance in : "+ accountNumber );
  }
  else {
    balance=balance-amount;
   System.out.println("Withdrew : "+ amount + "from"+ accountNumber);
  }
   }

   void transfer(BankAccount to,double amount){
    if(to ==null){
        throw new IllegalArgumentException("account does not exist.......");
    }
    else if(amount <=0){
        throw new InvalidAmountException("Invalid amount.......");
    }
    else if(balance <amount){
        throw new InsufficientBalanceException("Bhikhari dusre ko paise kyu dega....");
    }
    else {
        balance=balance-amount;
        to.balance +=amount;
        System.out.println("Amount : "+ amount + "is transferred from" + accountNumber + "to "+ to.account);
    }
   }
}



class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String message){
        super(message);
    }
}

class InvalidAmountException extends RuntimeException{
    InvalidAmountException(String message){
        super(message);
    }
}

class Main{

    public static void main(String[]args){
        BankAccount ba1=new BankAccount("ACC-01" , 100000);
        BankAccount ba2=new BankAccount("ACC-02",2000);

        try {
            ba1.deposit(50000);
            ba1.withDraw(2000);
            ba1.transfer(ba2,4500);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}


