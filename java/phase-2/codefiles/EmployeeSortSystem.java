/*

 ASSIGNMENT: Employee Sort System
Part 1: Employee Class with Comparable
java
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;

    // Constructor with validation
    // Getters
    // toString()
    // equals() and hashCode() based on id

    @Override
    public int compareTo(Employee other) {
        // Natural ordering: Sort by ID (ascending)
        return Integer.compare(this.id, other.id);
    }
}
Part 2: EmployeeManager with Sorting
java
class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    boolean addEmployee(Employee e) {
        // Check duplicate ID
        // Add to list
    }

    // 1. Natural order (by ID) - Uses Comparable
    void sortByNaturalOrder() {
        Collections.sort(employees);
    }

    // 2. Sort by Name (Custom)
    void sortByName() {
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));
    }

    // 3. Sort by Salary (Custom)
    void sortBySalary() {
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
    }

    // 4. Sort by Department then Salary (Custom)
    void sortByDepartmentThenSalary() {
        employees.sort((e1, e2) -> {
            // Compare department first
            int deptCompare = e1.getDepartment().compareTo(e2.getDepartment());
            if(deptCompare != 0) {
                return deptCompare;
            }
            // If same department, compare salary
            return Double.compare(e1.getSalary(), e2.getSalary());
        });
    }

    // 5. Reverse order
    void sortReverseByNaturalOrder() {
        employees.sort(Comparator.reverseOrder());
    }

    // 6. Print all employees
    void printAll() {
        // Print formatted list
    }
}
Part 3: Main Method
java
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add employees with different IDs, names, salaries
        // Test each sorting method
        // Show before/after sorting

        // Test natural order (by ID)
        // Test by name
        // Test by salary
        // Test by department then salary
        // Test reverse order
    }
}
🎯 TEST DATA
java
Employee e1 = new Employee(103, "Alice", 75000, "IT");
Employee e2 = new Employee(101, "Bob", 65000, "HR");
Employee e3 = new Employee(105, "Charlie", 85000, "IT");
Employee e4 = new Employee(102, "Diana", 70000, "Finance");
Employee e5 = new Employee(104, "Eve", 90000, "Finance");
Expected Sort Order:
By ID (Natural):

text
101 - Bob - 65000 - HR
102 - Diana - 70000 - Finance
103 - Alice - 75000 - IT
104 - Eve - 90000 - Finance
105 - Charlie - 85000 - IT
By Name:

text
Alice - 103 - 75000 - IT
Bob - 101 - 65000 - HR
Charlie - 105 - 85000 - IT
Diana - 102 - 70000 - Finance
Eve - 104 - 90000 - Finance
By Department then Salary:

text
Diana - 102 - 70000 - Finance
Eve - 104 - 90000 - Finance
Bob - 101 - 65000 - HR
Alice - 103 - 75000 - IT
Charlie - 105 - 85000 - IT


*/

class Employee Comparable<Employee>{



    private int id;
    private String name;
    private double salary;
    private String department;

    Employee(int id, String name , double salary, String department){

        if(id<=0){
            throw new IllegalArgumentException("id cant be negavtive or 0");

        }
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cant be null");
        }

        if(salary<=0){
            throw new IllegalArgumentException(
            "Salary cant be negative or zero"
            );

            if(department==null || department.trim()isEmpty()){
                throw new IllegalArgumentException("deaprtment cant be empty");
            }

            this.id;
            this.name=name;
            this.salary=salary;
            this.department=deaprtment;
        }

        @Override 
        public String toString(){
            return id + "-" + name + "-"+ salary + "-" + "-"+department;
        }

        @Override
        public int compareTo(Employee other){

            return Integer.(this.id,other.id);

        }

    }
}

class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public  List<Employee> getEmployee(){
        return employees;
     }

     public void addEmployee(Employee e){

        employees.add(e);

     }

    

}