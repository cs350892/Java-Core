// Assignment 1 — super.variable

// Vehicle parent class banao:

// brand = "Generic"
// speed = 100

// Car extends Vehicle banao:

// brand = "BMW"
// speed = 200

// display() method mein print karo:

// Child Brand: BMW
// Parent Brand: Generic
// Child Speed: 200
// Parent Speed: 100

import java.util.*;
class Vehicle {

    String brand ="Generic";
    int speed =100;

class Car extends Vehicle{

    String brand="BMW";
    int speed=200;
     
     void display(){
        System.out.println("CHild brand :"+ brand);
        System.out.println("The Parent brand:"+ super.brand);
        System.out.println("Child speed"+speed);
        System.out.println("Parent speed"+super.speed);
     }


     



}


}

class Main {

    
    public static void main(String[]args){

        Car c1=new Car();

        c1.display();



    }
}



// Parent class Person banao:

// class Person {

//     void introduce() {
//         System.out.println("I am a person");
//     }
// }
// Child class Student banao jo Person ko extend kare.

// Student ke andar same introduce() method override karo:

// I am a student

// Phir Student mein ek display() method banao jo:

// Pehle child ka introduce() call kare.
// Phir super.introduce() use karke parent ka introduce() call kare.

// Expected output:

// I am a student
// I am a person
// Conditions

// Tumhe specifically ye dono use karne hain:

// introduce();

// and

// super.introduce();

// Hint: super.introduce() ka matlab hai → "Student wala nahi, mere parent Person wala introduce() chalao."

import java.util.*;
class Person {

    void introduce (){
        System.out.println("I am a person");
    }

}



class Student extends Person{

void introduce(){
    System.out.println("I am a student");
  
}

void display(){
       introduce();
      super.introduce();
}


}

class Main{

    public static void main(String[]args){
        Student stu =new Student();
        stu.display();
    }
} 



// Assignment 3 — super() Constructor

// Parent:

// class Person {

//     Person() {
//         System.out.println("Person constructor");
//     }
// }

// Child:

// class Student extends Person {

//     Student() {
//         // use super() here

//         System.out.println("Student constructor");
//     }
// }
// Tumhara task

// super() use karke expected output lao:

// Person constructor
// Student constructor

// Important: super() ko constructor ki first statement rakhna.

import java.util.*;
class Person {

    Person(){
        System.out.println("Person COnstructor");
    }
}

class Student extends Person {
  Student () {
    super();
    System.out.println("Studnet constructor");
  }
}

class Main{
    public static void main(String[]args){

        Student stu =new Student();


    }
}