// Assignment 1 — ab ye karo

// Ek CyberSecurity System banao:

// User
//  ↓
// Admin
// User

// Private fields:

// name
// email

// Parameterized constructor.

// Method:

// login()

// Output:

// Chandra logged in
// Admin extends User

// Extra private field:

// role

// Constructor mein super(...) use karo.

// Extra method:

// deleteUser()

// login() ko override karo aur output:

// Admin Chandra logged in
// Main mein:
// Admin admin = new Admin(...);

// admin.login();
// admin.deleteUser();

// Condition:
// User ke fields ko Admin se directly access nahi karna. Encapsulation maintain rehni chahiye.



class User {

    private String name;
    private String email;

    User(String name, String email ){
        
        this.name=name;
        this.email=email;
     
       }

       public String getName(){
        return name;

       }

       void login(){
        System.out.println(getName()+ "Logggedn in...");
    }
}



class Admin extends User {
    private String role;

    Admin(String name, String email,String role){
        super(name,email);
        this.role=role;
        
    }

    public String getRole (){
        return role;

    }

    void login(){

            System.out.println(getRole()+" "+ getName()+ "logged in...");

        }

        void deleteUser(){
            if(role.equals("Admin")){
                System.out.println("User Deleted successfull...");
            }
            else{
                System.out.println("Not allowed...");
            }
        }
}

class Main{

    public static void main(String[]args){
        Admin admin=new Admin("Chandra","cs450@gmail.com","Admin");
        admin.login();
        admin.deleteUser();
    }
}





// 🔥 Assignment 2 — Cyber Security Access System

// Inheritance structure:

// User
//   ↓
// Employee
//   ↓
// SecurityAdmin
// 1️⃣ User class

// Private fields:

// private String name;
// private String email;

// Parameterized constructor:

// User(String name, String email)

// Method:

// void login()

// Output:

// User Chandra logged in

// Getter for name banao.

// 2️⃣ Employee extends User

// Extra private field:

// private int employeeId;

// Constructor:

// Employee(String name, String email, int employeeId)

// 👉 super(name, email) use karna hai.

// login() ko override karo:

// Employee Chandra logged in with Employee ID: 101
// 3️⃣ SecurityAdmin extends Employee

// Extra private field:

// private String securityLevel;

// Constructor:

// SecurityAdmin(
//     String name,
//     String email,
//     int employeeId,
//     String securityLevel
// )

// Yahan constructor chaining properly use karna hai.

// login() ko again override karo.

// But is baar twist hai. 😈

// Pehle parent Employee ka login execute karna hai using:

// super.login();

// Then apna message:

// Security Level: HIGH

// So output kuch aisa hona chahiye:

// Employee Chandra logged in with Employee ID: 101
// Security Level: HIGH
// 4️⃣ Extra method

// SecurityAdmin mein:

// void accessSecurityPanel()

// Agar security level "HIGH" hai:

// Security Panel Access Granted

// otherwise:

// Security Panel Access Denied
// Main

// Sirf ek object banao:

// SecurityAdmin admin =
//     new SecurityAdmin(
//         "Chandra",
//         "chandra@gmail.com",
//         101,
//         "HIGH"
//     );

// Then:

// admin.login();
// admin.accessSecurityPanel();
// 🎯 Rules

// Is assignment mein:

// ❌ Parent ke private fields directly access nahi karne
// ✅ Getters use karne
// ✅ this use karna
// ✅ super(...) use karna
// ✅ super.login() use karna
// ✅ @Override use karna
// ❌ koi static variable nahi
// ❌ unnecessary Scanner nahi

// Expected output:

// Employee Chandra logged in with Employee ID: 101
// Security Level: HIGH
// Security Panel Access Granted

class User {
    private String name; 
    private String email;

    User(String name, String email){
        this.name=name;
        this.email=email;
    }


    public String getUserName(){
        return name;

    }

    void login(){
        System.out.println(getUserName()+"Logged in success...");
    }
}

class Employee extends User {

private int employeeId;

Employee(String name, String email, int employeeId){
   super(name,email);
    this.employeeId=employeeId;

}

public int getEmpId(){
    return employeeId;
}

@Override
   void login(){
    System.out.println(getUserName()+ "Logged i successfull with emp id:"+getEmpId());
   }

}

class SecurityAdmin extends Employee{

    private String securityLevel;

 SecurityAdmin(String name, String email, int employeeId, String securityLevel){

    super(name,employeeId,securityLevel);

    this.securityLevel=securityLevel;

   
 }


public String getSecurityLevel(){
    return securityLevel;
}

@Override
 void login(){
 super.login();
    System.out.println("Security Level:"+getSecurityLevel());

 }

 void accessSecurityPanel(){
    if("HIGH".equals(getSecurityLevel())){
        System.out.println("Access granted.....");
    }
    else {
        System.out.println("Access denied !...");
    }
 }

}

 class Main{

    public static void main(String[]args){

        SecurityAdmin sa=new SecurityAdmin("Chandra","chandra@gmail.com",101,"HIGH");
        sa.login();
        sa.accessSecurityPanel();
    }
 }





 