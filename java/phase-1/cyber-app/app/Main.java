
// Next assignment

// Basic package Demo wala assignment nahi dunga. Tumhare level ke hisaab se ek realistic backend-style assignment karte hain:

// Imagine tum ek cybersecurity application bana rahe ho.

// Create these packages:

// security/
//     Alert.java
//     LoginAlert.java

// users/
//     User.java
//     SecurityAdmin.java

// app/
//     Main.java

// Requirements:

// Alert ko security package mein rakho.
// LoginAlert should extend Alert.
// User ko users package mein rakho.
// SecurityAdmin should extend User.
// Main app package mein ho.
// Main ko imports ke through Alert, LoginAlert, User, SecurityAdmin use karna hai.
// Kuch fields ko private, kuch ko protected, aur kuch ko default access do.
// Phir observe karo kaunsi fields Main se accessible hain aur kaunsi nahi.
// SecurityAdmin mein ek method banao jo inherited data ko use kare.
// Main mein objects create karke complete flow run karo.

// Important: Assignment ka solution abhi mat dekhna. Khud try karo. Tum code bhejoge, main sirf mistakes + reasoning check karunga, jaise hum ab tak kar rahe hain.


package app;
import security.Alert;
import security.LoginAlert;
import users.SecurityAdmin;
import users.Users;

public class Main{

    publics static void main(String[]args){

        System.out.println("===Cyber Security Application ===/n");

        User user=new User(101,"Chandra","cs350892","software engineer");
        System.out.println("User Details : ");
        user.display();

    }
}