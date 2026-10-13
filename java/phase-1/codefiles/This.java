// 📝 Assignment 1 — this.id = id

// Student class banao.

// Fields:
// int id;
// String name;
// double marks;
// Constructor:
// Student(int id, String name, double marks)

// Constructor ke andar this ka use karke fields initialize karo.

// Method:
// void display()

// Student ki saari details print karo.

// Main:

// 3 students ke objects banao:

// Student 1 → id: 101, name: Chandra, marks: 85
// Student 2 → id: 102, name: Rahul, marks: 72
// Student 3 → id: 103, name: Amit, marks: 91

// Then teeno ka display() call karo.

// 🎯 Goal

// Is assignment mein specifically samajhna hai:

// this.id = id;
// this.name = name;
// this.marks = marks;

//  Left side vs right side clearly samajhna.

import java.util.*;
class Student{

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    void display(){
        System.out.println("The name is :"+name);
        System.out.println("The marks is :"+marks );
        System.out.println("The id is:"+id);
    }

public static void main(String[]args){

    Student s1 =new Student(101,"Chandra",89);
    Student s2=new Student(102,"jkhsjd",80);
    Student s3=new Student(103,"jnknjfd",78);

    s1.display();
    s2.display();
    s3.display();



}

}



// Next assignment — this as method argument 🔥

// Student class banao:

// int id;
// String name;
// double marks;

// Constructor se initialize karo.

// Ek method:

// void sendDetails()

// banao.

// Ek doosri class Result banao jisme:

// void showResult(Student student)
 
// ho.

// Student ke sendDetails() ke andar current Student object ko this se Result ke method mein pass karna hai.

// Expected concept:

// result.showResult(this);

// Result class student ki ID, name, marks aur Pass/Fail print kare.


class Student {

    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void sendDetails() {

        Result res = new Result();
        res.showResult(this);
    }
}

class Result {

    void showResult(Student student) {

        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.marks);

        if (student.marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Chandra", 90);

        s1.sendDetails();
    }
}
















// Assignment 2 — Constructor Chaining 🔥

// Ek Employee class banao jisme:

// id
// name
// salary

// ho.

// Requirements:

// Ek no-argument constructor banao jo this(0, "Unknown", 0) call kare.

// Ek 2-parameter constructor banao:

// Employee(int id, String name)

// jo salary ko 0 rakhe.

// Ek 3-parameter constructor banao:

// Employee(int id, String name, double salary)
// Teeno constructors mein initialization ka duplicate code mat likhna — this() use karke chaining karna.
// display() method banao jo employee ki details print kare.
// Main mein teeno tarike se objects create karo:
// Employee e1 = new Employee();
// Employee e2 = new Employee(101, "Chandra");
// Employee e3 = new Employee(102, "Rahul", 50000);

// Expected idea:

// ID: 0
// Name: Unknown
// Salary: 0.0

// ID: 101
// Name: Chandra
// Salary: 0.0

// ID: 102
// Name: Rahul
// Salary: 50000.0

import java.util.*;
class Employee {
    int id;
    String name;
    double salary;

    Employee (){

        this(0,"unknown",0);
        
    }

    Employee(int id, String name){

      this(id,name,0);

    }

    Employee(int id , String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    

    void display(){
        System.out.println("The id of the  employee is :"+id);
        System.out.println("The name of the employee  is :"+name);
        System.out.println("The salary of employee is :"+salary);
    }

    

public static void main(String[]args){
    Employee emp1=new Employee();
    Employee emp2=new Employee(101,"Chandra");
    Employee emp3=new Employee(102,"Chandra",5000000.00);
    emp1.display();
    emp2.display();
    emp3.display();


}


}







// 🔥 Assignment 3 — return this

// Iska goal hai method chaining samajhna.

// BankAccount banao:

// accountNumber
// holderName
// balance
// parameterized constructor
// deposit(double amount) → balance add kare + return this
// withdraw(double amount) → balance subtract kare + return this
// display() → details print kare

// Main mein ye chalna chahiye:

// BankAccount account =
//     new BankAccount(101, "Chandra", 5000);

// account.deposit(2000)
//        .withdraw(1000)
//        .display();

// Expected balance:

// 6000

// Important: deposit() aur withdraw() dono ka return type BankAccount hona chahiye, aur end mein:

// return this;

// Khud solve karo. Code bhejo — phir main review karunga. 😎

import java.util.*;
class BankAccount {
    
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount (String accountHolder, int accountNumber , double balance)
    
    {

      this.accountHolder=accountHolder;
      this.accountNumber=accountNumber;
      this.balance=balance;

      
    }


  BankAccount deposit(double amount){

            balance =balance+amount;

            return this;

        }


          BankAccount withDraw(double amount){
            if(balance>=amount){
                balance =balance-amount;
            }
            else{
                System.out.println("Insufficeint balance");
            }

            return this;
        }


    void display(){
        System.out.println("Name of the account holder is :"+accountHolder);
        System.out.println("The account number is :"+accountNumber);
        System.out.println("The balance is :"+balance);
    }


public static void main(String[]args){

    BankAccount ba=new BankAccount("Chandra Shekhar",12345,1200);
  
    ba.withDraw(500);
     .deposit(500);
     .display();
}

}