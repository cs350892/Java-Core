// 🔥 Constructor Assignment 1 — Student Result

// Ek Student class banao.

// Instance variables:
// int id
// String name
// double marks
// Requirements:
// 1. Parameterized constructor

// Constructor ke through id, name, aur marks initialize karo.

// Example:

// Student(int id, String name, double marks)

// Use:

// Student s1 = new Student(101, "Chandra", 78.5);
// 2. display() method

// Student ki details print karo:

// ID: 101
// Name: Chandra
// Marks: 78.5
// 3. isPassed() method

// Agar marks >= 40, return true, otherwise false.

// 4. Main mein 3 Student objects banao

// Example structure:

// Student s1 = new Student(...);
// Student s2 = new Student(...);
// Student s3 = new Student(...);

// Har student ko display karo aur batao:

// Passed

// ya

// Failed
// 🧠 Important restriction

// Is baar input() method mat banana.

// Matlab:

// ❌

// s1.input();

// Instead constructor use karo:

// ✅

// Student s1 = new Student(101, "Chandra", 78.5);


class Student{

    int id;
    String name;
    double marks;

    Student (int id, String name, double marks){

    }

    void display(){
        System.out.println("The Name is :"+name);
        System.out.println("The id is:"+id);
        System.out.println("The marks is :"+marks);

    }

    void resultPassFail(){
        if(marks>=40){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

    public static void main(String[]args){
        Student s1 = new Student(26,"Chandra Shekhar", 90);
        Student s2= new Student(27,"Dipanshi",86);
        Student s3=new Studnet(45,"jnks",78);
        s1.display();
        s2.display();
        s3.display();
    }
}



// Assignment 2 — Constructor Overloading

// Ek Rectangle class banao:

// int length
// int breadth

// Teen constructors banao:

// Rectangle()

// Default values:

// length = 1
// breadth = 1
// Rectangle(int length)

// Is case mein:

// length = given length
// breadth = 1
// Rectangle(int length, int breadth)

// Dono values initialize karo.

// Methods:
// int area()
// int perimeter()
// void display()

// Main mein:

// Rectangle r1 = new Rectangle();

// Rectangle r2 = new Rectangle(10);

// Rectangle r3 = new Rectangle(10, 20);

// Aur teeno ka area/perimeter print karo.

// 🎯 Is assignment ka goal

// Ye samajhna:

// new Rectangle()
//         ↓
// Rectangle()

// new Rectangle(10)
//         ↓
// Rectangle(int)

// new Rectangle(10,20)
//         ↓
// Rectangle(int,int)

import java.util.*;
class Rectangle {

    int length=1;
    int breadth=1;

    Rectanle(int length){
        this.length=length;
    }

    Rectangle(int breadth){
        this.breadth=breadth;
    }

    Recatangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }


    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }

    public static void main(String[]args){

        Rectangle r1=new Rectangle(10);
        Rectangle r2=new Rectangle(20);
        Rectangle r3=new Rectangle(10,20);
        System.out.println("area of r1 is :"r1.area());
         System.out.println("perimeter of r1 is :"r1.perimeter());

         System.out.println("area of r2 is :"r2.area());
            System.out.println("perimeter of r2 is :"r2.perimeter());
           System.out.println("area of r3 is :"r3.area());
              System.out.println("perimeter of r3 is :"r3.perimeter());


    }


    public static void main(String[]args){
        Employee emp=new Employee();
    }

}