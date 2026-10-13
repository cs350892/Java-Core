// Assignment 1 (Easy) - Student Class

// Create a class Student.

// Data Members
// int id;
// String name;
// double marks;
// Methods
// void input()
// void display()
// boolean isPassed()

// isPassed() should return true if marks >= 40.

import java.util.*;
class Student{

int id;
String name;
double marks;

void input(){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter your id :");
    id=sc.nextInt();
    System.out.print("Enter Your name:");
    name=sc.next();
    System.out.print("Enter your marks");
    marks=sc.nextDouble();

}

void display( ){
    System.out.println("id:"+id);
    System.out.println("Name :"+name);
    System.out.println("Marks :"+marks);
}

boolean isPassed(){

   return marks>=40;



}






    public static void main(String[]args){

        Student stu =new Student();
        
        stu.input();

        stu.display();

        if(stu.isPassed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


    }
}


// Assignment 2 (Easy)

// Create a class Rectangle

// Variables

// length
// breadth

// Methods

// input()
// area()
// perimeter()
// display()

// Output

// Area : 200
// Perimeter : 60

import java.util.*;

class Rectangle {

    int length;
    int breadth;

    void input(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        length=sc.nextInt();
        System.out.println("Enter breadth:");
        breadth=sc.nextInt();
    }

    int perimeter(){
        return 2*(length+breadth);
    }
    int area(){
        return length*breadth;
    }



    public static void main(String[]args){

    Rectangle rect=new Rectangle();
    rect.input();
    System.out.println("The Perimeter is:"+rect.perimeter());
    System.out.println("The Area is:"+ rect.area());


    }
}


// Assignment 3 (Medium)

// Create an Employee class.

// Variables

// id
// name
// salary

// Methods

// input()
// display()
// increaseSalary(double percent)

// If salary is

// 50000

// and percentage is

// 20

// New salary should become

// 60000

// Formula

// salary = salary + (salary * percent / 100)

import java.util.*;
class Employee{
    int id;
    String name;
    double salary;

    void input(){
        Scanner sc=new Scanner();
        System.out.print("Enter id");
        id=sc.nextInt();
        System.out.print("Enter name:");
        name=sc.nextLine();
       
        System.out.print("Entar your salary:");
        salary=sc.nextDouble();

    }

    void display(){
        System.out.println("The name is:"+name);
        System.out.println("The emp id is :"+id);
        System.out.println("The salary is:"+salary);
    
    }


double increaseSalary(){

    double percentage;

    Scanner sc =new Scanner(System.in);

    percentage=sc.nextDouble();
   
    return salary + (salary*double/100);



}

public static void main(String[]args){
    Employee emp=new Employee();

    emp.input();
    emp.display();
    System.out.println(emp.increaseSalary());
}

}




// Assignment 4 (Good OOP Practice)

// Create a class BankAccount

// Variables

// accountNumber
// holderName
// balance

// Methods

// deposit(double amount)
// withdraw(double amount)
// displayBalance()

// Condition

// If withdrawing more than balance

// Insufficient Balance

// Otherwise deduct amount.

// Example

// Balance : 5000

// Withdraw : 7000

// Output
// Insufficient Balance


import java.util.*;

class BankAccount{

    double accountNumber;
    String accountHolder;
    double balance;

    void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter account number:");
        accountNumber=sc.nextDouble();
        System.out.println("Enter name:");
        accountHolder=sc.next();
        System.out.println("Enter balance");
        balance=sc.nextDouble();
    }


    void display (){
        System.out.println("The name is :"+accountHolder);
        System.out.println("The account number is:"+ accountNumber);
        System.out.println("The balance is"+balance);
    }



    double deposit(double amt){
      return  balance +=amt;
    }

    double withDraw(double amt){
        if(balance<amt){
            System.out.println("Insufficient balance");
        }
        balance =balance-amt;

        return balance;

    }


    public static void main(String[]args){

        double amount;
        Scanner sc=new Scanner(System.in);
        
        BankAccount ba=new BankAccount();
        ba.input();
        ba.display();
        System.out.println("Enter ammount to withdraw");
        amount=sc.nextDouble();

        System.out.println("The ammount is after widthdrwa :"+ba.withDraw(amount));
           
        System.out.println("Enter ammount to deposit");
        amount=sc.nextDouble();

        System.out.println("The ammount after deposit:"+ ba.deposit(amount));
        



    }
}

// Assignment 5 (Object Practice)

// Create 3 Student objects

// Student s1
// Student s2
// Student s3

// Take input for all three.

// Then print

// Student with Highest Marks

// Hint

// if(s1.marks > s2.marks)

import java.util.*;
class Student {

    int marks;
    String name;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name :");
        name=sc.next();
        System.out.print("Enter your marks:");
        marks=sc.nextInt();
    }

    void display(){
        System.out.println("The Name is :" +name);
        System.out.println("The marks is :"+marks);
    }

   static int highestMark(int m1,int m2, int m3){
        if(m1>m2 && m1>m3){
            return m1;
        }
        else if (m2>m1 && m2>m3){
            return m2;
        }
        else{
            return m3;
        }
    }

    public static void main (String[]args){

        Student s1=new Student();
        Student s2 = new Student();
        Student s3=new Student();

        s1.input();
        s2.input();
        s3.input();

        s1.display();
        s2.display();
        s3.display();

        int m1=s1.marks;
        int m2=s2.marks;
        int m3=s3.marks;

        System.out.println("The highest mark is"+ highestMark(m1,m2,m3));




    }
}



// Assignment 6 (Very Important ⭐)

// Create a class Car

// Variables

// brand
// model
// price

// Methods

// input()
// display()

// Create

// Car c1
// Car c2

// Print

// Most Expensive Car

import java.util.*;
class Car {

    String brand;
    String model;
    double price;

    void input(){

        System.out.print("Enter brand of the Car :");
        brand=sc.next();
        System.out.print("Enter model name:");
        model=sc.next();
        System.out.print("Enter price of the car");
        price=sc.nextDouble();

        
    }

    void display(){
        System.out.println("The brande name is:"+brand);
        System.out.println("The model name is:"+model);
        System.out.println("The price of the car is"+price);
    }


    static double highestprice(double p1, double p2, double p3){

        if(p1>p2 && p1>p3){
            return p1;
        }
        else if(p2>p1 && p2>p3){
            return p2;
        }
        else{
            return p3;
        }
    }


    public static void main(String[]args){

        Car c1=new Car();
        Car c2=new Car();
        Car c3=new Car();

        c1.input();
        c2.input();
        c3.input();

        c1.display();
        c2.display();
        c3.display();

        int p1=c1.price;
        int p2=c2.price;
        int p3=c3.price;

        System.out.println("The Highest price of the car is:"+highestprice(p1,p2,p3));

    }
}


// Assignment 7 (Real Life)

// Create a class Mobile

// Variables

// Brand
// Model
// RAM
// Storage
// Price

// Methods

// input()
// display()
// discount(double percent)

// If mobile price is

// 50000

// Discount

// 10%

// Final price

// 45000
// Rules (Very Important)

// ❌ Don't use:

// Constructor
// this
// ArrayList
// Inheritance
// Encapsulation

// ✅ Use only:

// Class
// Object
// Instance variables
// Methods
// Scanner
// Method calling using objects


import java.util.*;


class Mobile {

    String brand;
    String model;
    String name;
    int ram;
    int storage;
    double price;

    void input(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter brand name :");
        brand=sc.next();
        System.out.println("Enter model :");
        model=sc.next();
        System.out.println("Enter name :");
        name=sc.next();
       System.out.println("Enter ram size in GB:");
       ram=sc.nextInt();
       System.out.println("Enter storage size in GB:");
       storage=sc.nextInt();
       System.out.println("Enter price of the mobile:");
       price=sc.nextDouble();
    }

    void display(){

        System.out.println("The brand is:"+brand);
        System.out.println("The model is :"+model);
        System.out.println("The name is :"+name);
        System.out.println("The ram size in Gb is:"+ram);
        System.out.println("The storage size in GB is :"+storage);
        System.out.println("The price of the mobile is :"+price);
    }

    double discount (double dsc){
        return price+(price*dsc/100);
    }




    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        double dsc ;

        Molbile mb=new Mobile();
        mb.input();
        mb.display();

        System.out.println("Enter discount in %:");
        dsc=sc.nextDouble();
        System.out.println("The price after discount is :"+ mb.discount(dsc));

        

    }
}