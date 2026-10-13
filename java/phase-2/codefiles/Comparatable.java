
class Student implements Comparable<Student>{

    int id;
    String name;

    Student(int id , String name){
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cant be null");
        }
        this.id=id;
        this.name=name;
    }

    @Override
    public int compareTo(Student other){
        if(other == null){
            throw new IllegalArgumentException("Object cant be null");
        }

        return Integer.compare(this.id, other.id);
    }

    @Override 
    public String toString(){
        return id+ "-"+ name;
    }

}

class Main{
    public static void main(String[]args){

        Student s1 = new Student(101,"Chandra");
        Student s2= new Student(102,"Shekhar");
        Student s3= new Student(10,"priya");
        List<Student> students= new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        Collection.sort(students);

        System.out.println(students);


    }
}

/*

Build Employee Sorting System.

Create:

Employee
 ├── id
 ├── name
 ├── salary
 └── department
Requirement 1 — Comparable

Make Employee implement:

Comparable<Employee>

Natural ordering:

Employee ID ascending

Requirement 2 — Sort

Create:

List<Employee>

with 5 employees and sort them using:

Collections.sort(employees);

*/

import java.util.*;
class Employee implements Comparable<Employee> {

    int id;
    String name;
    double salary;
    String department;


    Employee(int id , String name , double salary , String department){

        if(id<=0){
            throw new IllegalArgumentException("id cant be negative");
        }
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("name cant be null");
        }
        if(salary<0){
            throw new IllegalArgumentException("Salary cant be negative");
        }
         if(department==null || department.trim().isEmpty()){
            throw new IllegalArgumentException("department cant be null");
        }

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }

    @Override
     public int compareTo(Employee other){
        return Integer.compare(this.id,other.id);
     }


   @Override
   public String toString(){
    return id + " - "+ name + "-"+ salary;
   }

}

class Main{
    public static void main(String[]args){

    Employee e1 = new Employee(101, "Chandra", 80000 + "IT");
    Employee e2 = new Employee(102, "Shekhar",90000 + "IT");
    Employee e3= new Employee(103,"Priya",60000 + "IT");

    List<Employee> employees= new ArrayList<>();
     employees.add(e1);
     employees.add(e2);
     employees.add(e3);
    
    Collections.sort(employees)
   System.out.println(employees);
    }
}