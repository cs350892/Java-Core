// class First {
//      public static void main (String[] args){
//         System.out.println("Java Program")
        
//      }


// class Chandra {
//     public static void main(String[]args){

//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter first num:");
         
//          int a =sc.nextInt();
//          System.out.println("Enter second number :");
//          int b=sc.nextInt();

//          System.out.println("The Sum is : " + (a+b));
//     }
// }


//Profile 

class User {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:");
       String name = sc.next();
        System.out.print("Enter Your age :");
      int age = sc.nextInt();
      Sytem.out.println("Enter Your city");
      String city = sc.next();

      System.out.println("Name is :" + name);
      System.out.println("Age is :" + age);
      System.out.println("City is " + city);

    }
}

//Bill Generator 
// Customer Name
// Product Name
// Quantity
// Price per Item

// Calculate

// Total = Quantity × Price

// class Shop {
//     public static void main(String[]args){
     
//      Scanner sc=new Scanner(System.in);

//      System.out.println("Enter Customer name : ");
//      String customer_name=sc.next();
//      System.out.println("Enter Produce Name:")
//      String produce_name=sc.next();

//      System.out.print("Enter quantity  : ");
//      int quantity = sc.nextInt();

//      System.out.print("Enter  Price per item  : ");
//      int price = sc.nextInt();
     
//      System.out.println("The Price of Total items is : " + (quantity*price) + "billed to" + customer_name + "for buying the product" + produce_name + "of" + quantity);



//     }
// }

//Guess Number 
import java.util.Scanner;

class Game {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        int num =(int)(Math.random()*100+1);

        System.out.print("Enter the guess limit :");
        int k=sc.nextInt();
     

        while(k>0){

               System.out.print("Enter the guessed Value :");
        int guessedValue=sc.nextInt();
            if(guessedValue>num){
                System.out.println("Guessed the number is higher ...");
            }
            else if (guessedValue<num){
                System.out.println("Guessed number is lower ...");
            }
            else{
                System.out.println("Guessed number" + guessedValue + " is equals to" + num);
                break;
            }

            k--;
            System.out.println("Remaining limit is : " +k);
            if(k==0){
                System.out.println("You have crossed the limit")
            }
        }
        


    }
}

//employee management


import java.util.Scanner;

class Empl{

    //Taking Input
    String name;
    int salary;

    void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the salary of employeer per month :");
       salary= sc.nextInt();

    }

    //Calculating Yearly Salary

    int calculateSalary(int salary){
        return 12*salary;
    }

    //Showing Details

    void detailsView(int salary, String name){
        System.out.println("The Name of the Employee is "+name);
        SYstem.out.println("The salary of the employee is " + salary);
    }


    public static void main(String[]args){

        Empl obj = new Empl();
        int salary ;
        String name;
        obj.Input();
        obj.calculateSalary(salary);
        obj.detailsView(salary,name);


    }
}












import java.util.Scanner;

class Empl {

    // Taking Input
    String name;
    int salary;

    void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        name = sc.next();

        System.out.println("Enter the salary of employee per month:");
        salary = sc.nextInt();
    }

    // Calculating Yearly Salary
    int calculateSalary(int salary) {
        return 12 * salary;
    }

    // Showing Details
    void detailsView(int salary, String name) {
        System.out.println("The Name of the Employee is " + name);
        System.out.println("The salary of the employee is " + salary);
    }

    public static void main(String[] args) {

        Empl obj = new Empl();

        obj.Input();

        int yearlySalary = obj.calculateSalary(obj.salary);

        obj.detailsView(obj.salary, obj.name);

        System.out.println("Yearly Salary = " + yearlySalary);
    }
}


//Static Method

import java.io*
class Chandra {
    
    void static greet(){
        System.out.println("Hello Chandra ...!")
    }

    public static void main(String[]args){
        greet();
    }
}



// Create a BankAccount class.

// Include:

// Account Holder Name (instance variable)
// Balance (instance variable)
// Bank Name (static variable)

// Methods:

// deposit() → instance
// withdraw() → instance
// displayAccount() → instance
// displayBankName() → static

// Goal: Understand why some data belongs to each account while other data is shared.



import java.util.Scanner;

class Account {

    String name;
    int balance;

    static String bank = "SBI Bank of India";

    int deposit(int amount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to deposit:");
        amount = sc.nextInt();

        balance += amount;
        return balance;
    }

    int withDraw(int amount) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw:");
        amount = sc.nextInt();

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }

        return balance;
    }

    static void DisplayBankName() {
        System.out.println("The bank name is: " + bank);
    }

    void displayAccount() {
        System.out.println("The name is: " + name);
        System.out.println("The Balance is: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.println("Enter Account Holder Name:");
        acc.name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        acc.balance = sc.nextInt();

        acc.deposit(0);
        acc.withDraw(0);

        acc.displayAccount();
        DisplayBankName();
    }
}


//assignment :Assignment 1 — Bank Account (Medium)

// Create a BankAccount class.

// Requirements:

// accountHolder → private
// balance → private

// Methods:

// deposit()
// withdraw()
// getBalance()
// Rule

// main() should never access

class BankAccount {
    private String accountHolder;
    private int balance;

    int deposit(){
      Scanner sc = new Scanner(System.in);
      System.out.println("ENter deposit ammount :");
int amount = sc.nextInt();
      balance +=amount;

      return balance;
    }

    int withDraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw :");
        int amount =sc.nextInt();

        if(this.balance > amount){
            balance -=amount;
        }else {
            System.out.println();
        }
        return balance;
    }

    int getBalance(){

        return balance;


    }
  
  void setAccountHolderName(){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Account Holder name:");
    accountHolder =sc.next();
  }

  String getAccountHolderName(){
    return accountHolder;
  }

    public static void main(String[]args){

        BankAccount a1 =new BankAccount();

        a1.deposit();
        a1.withDraw();
        a1.setAccountHolderName();
        a1.getAccountHolderName();
        a1.getBalance();

        
    }
}



//Java cli for Name, age ,job,city

class User {
    public static void main(String[]args){
  
        String name =args[0];
        int age = args[1];
          String job =args[2];
             System.out.println("Enter your name :",name);
        System.out.print("ENeter your age :",age);
    
      
        System.out.print("Enter Your Job",job);
  

      
        
    }
}


//Array 

class Arr{

    public static void main(String[]args){

        int[] arr = {10,20,30,40,50};

        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        String[] students={"Chandra","Shekhar", "Shahzadi","jhsb"};

        for(int i=0; i<students.length ; i++){
            System.out.print(students[i] + " ");
        }
    }
}



// Assignment 1 – Student Marks Analyzer ⭐⭐⭐

// Create an integer array of 10 student marks.

// Write separate methods to:

// Find the highest mark.
// Find the lowest mark.
// Calculate the average.
// Count how many students scored above 75.
// Display all marks.

// Restriction: Do not use Java library methods like Arrays.sort().


import java.util.*;
Class Students {

    int getHighestMark(int[] arr){
        int highestMarks=Integer.INT_MIN:
        for int(i=1; i<arr.length ; i++){

             if(arr[i]>highestMarks){
                highestMarks=arr[i];
             }

        }
        return highestMarks;
    }


    int lowestMarks(int[] arr){
        int lowestMarks=Integer.INT_MAX;
        for (int i=0; i<arr.length; i++){
            if(arr[i]<lowestMarks){
                lowestMarks=arr[i];
            }
        }

        return lowestMarks;

    }





    int getAverage(int[] arr){

        int n= arr.length;
        int sum=0;

        for(int i=0; i<n;i++){
            sum+=arr[i];

        }

        return sum/n;
    }

    int countAbove(int[] arr){

        int count =0;

        for(int i=0; i<arr.length ; i++){
            if(arr[i]>75){
                count++;
            }

        }

        return count ;
    }

    public static void main(String[]args){

        Students stu =new Students();
        int[] marks={60,70,50,80,50,90};

      System.out.println("The Highest mark is:"+ stu.getHighestMark(marks));
      System.out.println("The lowest mark is :"+  stu.getLowestMarks(marks));
      System.out.println("The avg marks is :" + stu.getAverage(marks))
      System.out.println("The count marks above 75 is :"+   stu.countAbove(marks))
       
     


    }
}


// Assignment 2 – Employee Salary System ⭐⭐⭐⭐

// Create an array of 7 employee salaries.

// Implement separate methods to:

// Display all salaries.
// Increase every salary by 10%.
// Find the second highest salary (without sorting).
// Count salaries greater than ₹50,000.
// Search whether a given salary exists.


class Emp {

    void displaySalaries(int [] salary){
        for(int i=0; i<salary.length ;i++){
            System.out.println(salary[i]+ " ");
        }
    }

    int IncrSalary(int[]salary){
        for (int i=0; i<salary.length;i++){
             salary[i] = salary + salary/10;

        }
    }

    int CountSalaries(int[] salary){
        int count=0;
        for(int i=0; i<salary.length ;i++){
            if(salary[i]>50000){
                count++;
            }
        }

        return count ;
    }

    int secondHighestSalary(int[]salary){
        int maxi=Integer.MIN_VALUE;
        int secondHighest =Integer.MIN_VALUE;

        for(int i=0; i<salary.length ;i++){
          if(salary[i]>maxi){
            maxi=salary[i];
          }
        }

         for(int i=0; i<salary.length ;i++){
          if(salary[i]>secondHighest && salary[i]!=maxi){
            secondHighest=salary[i];
          }
        }

        return secondHighestSalary;
    }

    void findSalary(int [] salary, salary){

        for(int i=0; i<salary.length;i++){
            if(salary == salary[i]){
                return true;
            }else{
                false;
            }
        }
    }


    public static void main(String[]args){
        int sa
    }
 


}

//Multidimensional Array

// int[][] arr2d=new int[3][5]

// int[][][] arr3d=new int[3][3][3]

import java.util.*;

class Arr {
    public class static void main(String[]args){

        int [][] arr={
            {1,2,6},
            {3,4,5}
        }
    }

    //printing array

    for (int i =0; i<3 ;i++){
         for(int j=0; j<3; j++){
            System.out.print(arr[i][j]+ " ");
         }
    }
}


//taking input through user


class Main{

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int m,n;

        System.out.print("Enter the no. of rows :");
        m=sc.nextInt();
        System.out.print("Enter the no. of columns:");
        n=sc.nextInt();


        int[][] arr = new int[m][n];

        for(int i=0 ; i<m ;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //printing array

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


    }
}


// Assignment 1 ⭐⭐⭐ (Warm-up)

// Create a 5 × 5 matrix.

// Write separate methods to:

// Display the matrix.
// Find the sum of all elements.
// Find the largest element.
// Find the smallest element.


import java.util.*;

class Main{


    void displayMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    int matrixSum(int[][] arr){
        int sum=0;
        for(int i =0; i<arr.length ;i++){
            for(int j=0; j<arr[i].length; j++){

                sum +=arr[i][j];

            }
        }

        return sum;
    }



int largestElement(int[][] arr){
    int maxi=Integer.MIN_VALUE;

    for(int i=0; i<arr.length ; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j]>maxi){
                maxi=arr[i][j];
            }
        }
    }

    return maxi;
}

int smallestElement(int[][] arr){
    int smallest=Integer.MAX_VALUE;

    for(int i=0; i<arr.length ; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j]<smallest){
                smallest=arr[i][j];
            }
        }
    }

    return smallest;
}

    public static void main(String[]args){

        Main obj =new Main();
        int [][] arr= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {15,16,17,18,19 },
            {20,21,22,23,24}
        }

        obj.displayMatrix(arr);
       System.out.println( obj.matrixSum(arr));
       System.out.println( obj.largestElement(arr));
        System.out.println(obj.smallestElement(arr));



    }
}



// Assignment 2 ⭐⭐⭐⭐ (Matrix Analysis)

// Take a 3 × 3 matrix from the user.

// Write methods to:

// Calculate the sum of each row.
// Calculate the sum of each column.
// Find the row having the maximum sum.
// Find the column having the maximum sum.

import java.util.*;

Class Matrix{

    void TakingInput(int[][] arr){

        Scanner sc= new Scanner(System.in);

     System.out.println("Enter elements :");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] =sc.nextInt();
            }
        }

    }

    void RowSum(int[][] arr){


        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum+=arr[i][j];

            }
            System.out.println("The" + i + "ROwSUm is :"+ sum);
        }
    }

    void ColSum(int[][] arr){
        for(int i=0; i<arr[i].length; i++){
            int sum=0;
             for(int j=0 j<arr.length; j++){
                sum+=arr[j][i];

             }
             System.out.println("The COls"+ j+1 + "sum is :"+ sum);
        }

    }

 int RowMaxSum(int[][] arr){

int maxi=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum+=arr[i][j];

            }
           if(sum>maxi){
            maxi=sum;
           }
        }
        return maxi;
    }

   int ColMaxSum(int[][] arr){
    int maxi=Integer.MIN_VALUE;
        for(int i=0; i<arr[i].length; i++){
            int sum=0;
             for(int j=0 j<arr.length; j++){
                sum+=arr[i][j];

             }

             if(sum>maxi){
                maxi=sum;
             }
            
        }

        return maxi;

    }


    public static void main(String[]args){

        Matrix mtx =new Matrix();

        int [][] arr ;

        mtx.TakingInput(arr);
        mtx.RowSum(arr);
        mtx.ColSum(arr);
        System.out.println(mtx.RowMaxSum(arr));
        System.out.println(mtx.ColMaxSum(arr));

    }
}