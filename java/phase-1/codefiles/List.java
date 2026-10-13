/*
Assignment 1: Employee Management (Medium)
Create an Employee class with:

int id, String name, double salary

Constructor, getters, setters

Then implement a EmployeeManager class that uses List<Employee>:

addEmployee(Employee e) - add to list

getAllEmployees() - return all employees

getEmployeeById(int id) - return employee or null

updateSalary(int id, double newSalary) - update and return boolean

deleteEmployee(int id) - remove and return boolean

getEmployeeCount() - return size

printAllEmployees() - print each employee details

Constraints:

Use List<Employee> as the internal storage

Program to List interface

Use ArrayList as implementation

No duplicate IDs allowed (check before adding)
*/

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double  salary;

    Employee(int id, String name , double salary){

        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }
}


class EmployeeManager {

    List<Employee> employees= new ArrayList<>();

    void addEmployee(Employee e){

        employees.add(e);

    }

    List<Employee> getAllEmployees(){
        return employees;
    }

    Employee getEmployeeById(int id){
        for(Employee emp:employees){
            if(emp.getId()==id){
                return emp;
            }
        }
        return null;
    }


    void updateSalary(int id , double salary){
        for(Employee emp:employees){
            if(emp.getId() ==id){
                emp.setSalary(salary);
            }
        }
    }

    boolean deleteEmployee(int id){
      if(employees.removeIf(emp->emp.getId() == id)){
        return true;
      }
      else {
        return false;
      }
    }
 int cnt=0;
    int getCount(){
       return employee.size();
    }


    void printAllEmployees(){

        for(Employee emp:empoyees){
            System.out.println("ID is : "+emp.getId());
            System.out.println("Employee name is : "+emp.getName());
            System.out.println("EMployee salary is "+emp.getSalary());
        }

    }

}
