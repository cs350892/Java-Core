/* Employee Management System*
Part 1: Employee Class
Create an Employee class with the following specifications:

Fields (Private):
int id - employee ID (must be positive)

String name - employee name (cannot be null or empty)

double salary - employee salary (cannot be negative)

Constructor:
java
Employee(int id, String name, double salary)
Must validate all inputs before setting

Throw IllegalArgumentException for invalid values

Methods (Getters & Setters with Validation):
getId() - returns id

setId(int id) - validates positive

getName() - returns name

setName(String name) - validates not null/empty

getSalary() - returns salary

setSalary(double salary) - validates not negative

Additional Methods:
toString() - override to return formatted string like:

text
Employee{id=1, name='John Doe', salary=50000.00}
Part 2: EmployeeManager Class
Create an EmployeeManager class with:

Field:
List<Employee> employees - use ArrayList as implementation

IMPORTANT: Declare as List<Employee> NOT ArrayList<Employee>

Methods (with EXACT signatures):
boolean addEmployee(Employee e)

Check if employee with same ID already exists

If exists → return false

If not exists → add and return true

NO duplicate IDs allowed

List<Employee> getAllEmployees()

Return the list of all employees

Consider returning a copy to prevent external modification

Employee getEmployeeById(int id)

Find employee by ID

Return employee if found

Return null if not found

boolean updateSalary(int id, double newSalary)

Find employee by ID

If found → update salary, return true

If not found → return false

Validate newSalary is positive

boolean deleteEmployee(int id)

Remove employee by ID

Return true if removed

Return false if not found

Use removeIf() method

int getCount()

Return total number of employees

void printAllEmployees()

Print all employees in readable format

Use toString() method

Handle empty list case

Part 3: Main Method
Create a main() method that tests ALL functionality:

java
public static void main(String[] args) {
    EmployeeManager manager = new EmployeeManager();
    
    // 1. Test adding employees
    System.out.println("=== TEST 1: Adding Employees ===");
    // Add valid employees
    // Try adding duplicate ID
    // Print count after each add
    
    // 2. Test get all employees
    System.out.println("\n=== TEST 2: Get All Employees ===");
    // Print all employees
    
    // 3. Test get by ID
    System.out.println("\n=== TEST 3: Get Employee By ID ===");
    // Get existing employee
    // Get non-existent employee
    
    // 4. Test update salary
    System.out.println("\n=== TEST 4: Update Salary ===");
    // Update existing employee
    // Update non-existent employee
    // Try negative salary
    
    // 5. Test delete employee
    System.out.println("\n=== TEST 5: Delete Employee ===");
    // Delete existing employee
    // Delete non-existent employee
    // Print count after deletion
    
    // 6. Test print all
    System.out.println("\n=== TEST 6: Print All Employees ===");
    manager.printAllEmployees();
}
Expected Output Example:
text
=== TEST 1: Adding Employees ===
Added John: true
Added Jane: true
Added Duplicate: false
Count: 2

=== TEST 2: Get All Employees ===
Employee{id=1, name='John Doe', salary=50000.00}
Employee{id=2, name='Jane Smith', salary=60000.00}

=== TEST 3: Get Employee By ID ===
Employee with ID 1: Employee{id=1, name='John Doe', salary=50000.00}
Employee with ID 99: null

=== TEST 4: Update Salary ===
Update ID 1 to 55000: true
Update ID 99 to 55000: false
Update ID 1 to -1000: false

=== TEST 5: Delete Employee ===
Delete ID 2: true
Delete ID 99: false
Count after deletion: 1

=== TEST 6: Print All Employees ===
Employee{id=1, name='John Doe', salary=55000.00}
*/


import java.util.List;
import java.util.ArrayList;
class Employee {
    private int id;
    private String name;
    private double salary;

    Employee(int id, String name , double salary ){

        if(id<=0){
            throw new IllegalArgumentException("id must be positive...");
        }

        if(salary<0){
            throw new IllegalArgumentException("Salary must be positive ...");

        }

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name is required....");
        }

        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id<=0){
            throw new IllegalArgumentException("id must be positive...");
        }
        this.id =id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name is required....");
        }

        this.name=name;

    }

    public double getSalary (){
        return salary;
    }

    public void setSalary(double salary){
        
        if(salary<0){
            throw new IllegalArgumentException("Salary must be positive ...");

        }
        this.salary=salary;
}
@Override
public String toString(){

    return String.format("Employee{id=%d , name='%s', salary=%.2f}", id ,name, salary);


}

}

class EmployeeManager{
    List<Employee> employees =new ArrayList<>();

    boolean addEmployee(Employee e){
        for(Employee emp:employees){
            if(emp.getId() == e.getId()){
                return false;
            }
        }

         employees.add(e);
                return true;
    }

    List<Employee> getAllEmployees(){

        return new ArrayList<>(employees);

    }


    Employee getEmployeeById(int id){

        for(Employee emp: employees){
            if(emp.getId()==id){
                return emp;
            }
        }
        return null;
    }


    boolean updateSalary(int id, double newSalary){

         if(newSalary<0){
            return false;
        }

        for(Employee emp:employees){
            if(emp.getId()==id){
                emp.setSalary(newSalary);
                return true;
            }
        }
        return false;
    }


    boolean deleteEmployee(int id){
       return  employees.removeIf(emp->emp.getId()==id);
       
    }

    int getCount(){
        return employees.size();
    }

    void printAllEmployees(){
        if(employees.isEmpty()){
            System.out.println("empty list ........");
            return;
        }

        for(Employee emp:employees){
            System.out.println(emp);
        }
    }
}

class Main{
    public static void main(String []args){

    

    EmployeeManager manager= new EmployeeManager();



    System.out.println("Adding employee 1 : ");

    Employee emp1= new Employee(101,"Chandra",80000);
     Employee emp2= new Employee(102,"Chandra",80000);
    System.out.println(manager.addEmployee(emp1));
    System.out.println(manager.addEmployee(emp2));

    System.out.println(manager.getCount());

    System.out.println("Get all Employees : ");
    manager.printAllEmployees();

    System.out.println("Get employee by ID : ");
    System.out.println(manager.getEmployeeById(101));
    System.out.println(manager.getEmployeeById(103));

    System.out.println("Update salary : ");
    System.out.println(manager.updateSalary(101,8000000));
    System.out.println(manager.updateSalary(1000,10000));
    System.out.println(manager.updateSalary(101,-10000));

    System.out.println("Delete employee : ");
    System.out.println(manager.deleteEmployee(101));
    System.out.println(manager.deleteEmployee(103));
   System.out.println(manager.getCount());

    System.out.println("Get All Employee details : ");

    manager.printAllEmployees();
}
}

//-------------------------------------------------------------------------------------------------------------------------------------//

/*
🎯 ASSIGNMENT 2: Product Inventory System
Part 1: Product Class
Create a Product class with:

Fields (Private):
int productId - unique identifier (1001)

String name - product name

int quantity - stock quantity (cannot be negative)

double price - price per unit (cannot be negative)

Constructor:
java
Product(String productId, String name, int quantity, double price)
Validate all inputs

Throw IllegalArgumentException for invalid values

Methods:
All getters and setters with validation

toString() override

equals() and hashCode() - based on productId (Important for Set/Map later)

Part 2: Inventory Class
Create an Inventory class with List<Product>:

Method	Return Type	Description
addProduct(Product p)	boolean	Add product, no duplicate productId
updateQuantity(int productId, int newQuantity)	boolean	Update quantity, validate not negative
updatePrice(int productId, double newPrice)	boolean	Update price, validate not negative
getProductById(int productId)	Product	Return product or null
getAllProducts()	List<Product>	Return copy of all products
getLowStockProducts(int threshold)	List<Product>	Return products with quantity < threshold
getProductsByPriceRange(double min, double max)	List<Product>	Return products within price range
sortByPrice()	void	Sort products by price ascending
sortByName()	void	Sort products alphabetically
removeOutOfStock()	int	Remove all quantity=0 products, return count removed
getTotalInventoryValue()	double	Sum of (quantity × price) for all products
getMostExpensiveProduct()	Product	Return product with highest price
printInventory()	void	Print all products in formatted table
Part 3: Main Method
Test ALL functionality:

java
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        // 1. Add Products
        // 2. Test duplicate (should fail)
        // 3. Print all
        // 4. Test get by ID
        // 5. Update quantity
        // 6. Update price
        // 7. Test low stock
        // 8. Test price range
        // 9. Sort by price
        // 10. Sort by name
        // 11. Remove out of stock
        // 12. Get total value
        // 13. Get most expensive
        // 14. Print final inventory
    }
}
*/

import java.util.List;
import java.util.ArrayList;

class Product {

    private int pid;
    private String name;
    private int quantity;
    private double price;

    Product(int pid, String name , int quantity, double price){

        if(pid<0){
            throw new IllegalArgumentException("product id must be postive ");
        }

        if(name == null || name.trim().isEmpty() ){
            throw new IllegalArgumentException("name is required ");
        }

        if(quantity <0){
            throw new IllegalArgumentException("quantitity must be positive ");
        }

        if(price<0){
            throw new IllegalArgumentException("price must be positive");
        }

        this.pid=pid;
        this.name=name;
        this.quantity=quantity;
        this.price=price;

    }

   public int getProductId(){
        return pid;
    }

    public void setProductId(int pid){

         if(pid<0){
            throw new IllegalArgumentException("product id must be postive ");
        }
        this.pid=pid;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("name is required");
        }
        this.name=name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        if(quantity<0){
            throw new IllegalArgumentException("quantity must be positve ");
        }
        this.quantity=quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price<0){
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price=price;
    }
    
    @Override
    public String toString(){
        return String.format("Product{pid=%d , name='%s', quantity=%d, price=%.02f}",pid,name,quantity,price);
    }


}


class Inventory {
    List<Product> products = new ArrayList<>();

    boolean addProduct(Product p){
        for(Product prod:products){
            if(prod.getProductId() == p.getProductId()){
                return false;
            }
        }
        products.add(p);
        return true;
    }

boolean updateQuantity(int pid,int quantity){
    
    if(quantity<0){
        return false;
    }

        for(Product prod: products){

            if(prod.getProductId()==pid){
                prod.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }


boolean updatePrice(int pid, double price){
    if( price<0){
        return false;
    }

    for(Product prod:products){

        if(prod.getProductId() == pid){
         prod.setPrice(price);
         return true;

        }
    }

    return false;
}

 
 Product getProductById(int pid){
   
    for(Product prod:products){
        if(prod.getProductId() == pid){
         return prod;
        }
       
    }

    return null;
 }


  List<Product> getAllProduct (){

   return new ArrayList<>(products);

  }

  List<Product> getLowStockProduct(int threshold){

    List<Product> lowStockProduct =new ArrayList<>();

    if(threshold <0){
        return null;
    }

    for(Product prod: products){
        if(prod.getQuantity()<threshold){
            lowStockProduct.add(prod);
    
        }
    }
  
  return lowStockProduct;

  }

  
  List<Product> getProductByPriceRange(double min , double max){

    List<Product> productInRange = new ArrayList<>();
    for(Product prod:products){
      double actualPrice=prod.getPrice();
        if(actualPrice >= min && actualPrice <= max){
            productInRange.add(prod);
        }

    }

    return productInRange;
  }

  int removeOutOfStock(){

    int fixSize=products.size();
 
   products.removeIf(prod->prod.getQuantity()== 0);
   return fixSize - products.size();
 
   }


 double getTotalInventoryValue(){
    double sum=0;

    for(Product prod: products){
        double value=prod.getPrice() * prod.getQuantity();

        sum +=value;
    }

    return sum;
 }


Product getMostExpensiveProduct(){

    if(products.isEmpty()){
        return null;
    }

    double highestExpensive=0;

    Product p = products.get(0);

    for(Product prod:products){

        if(highestExpensive<prod.getPrice()){
            highestExpensive=prod.getPrice();
            p=prod;
        }

    }

    return p;
}


void printInventory(){
 if(products.isEmpty()){
    System.out.println("EMpty list ");
 }

 for(Product prod : products){
    System.out.println(prod);
 }
}


}


class Main {

    public static void main(String []args){

    Inventory inventory=new Inventory();

   System.out.println("Added product Choclate : " + inventory.addProduct(new Product(101,"Choclate",100,40)));
    System.out.println("Added product Biscuit : " + inventory.addProduct(new Product(102,"Biscuit",10,10)));
    System.out.println("Added product namkeen : " + inventory.addProduct(new Product(103,"Namkeen",18,140)));
    System.out.println("Added product namak : " + inventory.addProduct(new Product(103,"Namak",0,10)));
     System.out.println("Added product namkeen again : " + inventory.addProduct(new Product(103,"Namkeen",18,140)));
   
    inventory.printInventory();
    System.out.println("testing get by id for 101 : " +inventory.getProductById(101));

    System.out.println("Updating quantity of pid 101 : "+ inventory.updateQuantity(101,10000));

    System.out.println("Updating price of 102 pid : "+ inventory.updatePrice(102,1000));

    System.out.println("Products with low stock value 10 : "+inventory.getLowStockProduct(30));
    System.out.println("Product within range 50 and 100 is : "+ inventory.getProductByPriceRange(50,100));

    System.out.println("Count after removing out of stock product is : "+ inventory.removeOutOfStock());
    System.out.println("Get total value of invetory is "+ inventory.getTotalInventoryValue());
    System.out.println("Get product with highest price is : " + inventory.getMostExpensiveProduct());
    inventory.printInventory();


    }
}