// Assignment 1 ⭐⭐⭐ (String Methods)

// Create a class StringAnalyzer.

// Input a full name from the user (use nextLine()).

// Implement methods:

// int getLength(String name)

// char getFirstCharacter(String name)

// char getLastCharacter(String name)

// String toUpper(String name)

// String toLower(String name)

// boolean containsWord(String name, String word)

// Call all methods from main().\



import java.util.*;

Class Main {

    public static void main (String[]args){

        Scanner sc=new Scanner(System.in);
        String name;

        System.out.print("Enter Your Full Name:");
        name=sc.nextLine();

        System.out.println("The length of the Name is "+ name.length());

        System.out.println("The First character is " + name.charAt(0));
        System.out.println("The Last char is "+ name.charAt(name.length()-1));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("chand"));


        


    }
}


// Assignment 2 ⭐⭐⭐⭐ (Interview Level)

// Create a Password Validator.

// Rules:

// Minimum 8 characters
// Must contain "@"
// Must contain at least one digit
// Must not contain spaces

// Print either:

// Valid Password

// Invalid Password

// Use String methods only (no regex).

import java.util.*;
class Main{

    void passwordValidator(String password){

        boolean hasDigit=false;

        for(int i=0; i<password.length();i++){

            char ch = password.charAt(i);

            if(ch>='0' && ch<='9'){
                hasDigit=true;
            }


        }

        if(password.length()>=8 && password.contains("@") && (password ==password.trim()) && hasDigit){
            System.out.print("Valid Password");
            
        }
        else{
            System.out.println("Invalid password");
        }




    }

    public static void main(String[]args){

        Main m1 = new Main();

        Scanner sc = new Scanner(System.in);

        String pass =sc.nextLine();

        m1.passwordValidator(pass);




    }
}


// Assignment 3 ⭐⭐⭐⭐

// Input an email.

// Example

// chandra@gmail.com

// Extract:

// Username : chandra

// Domain : gmail.com

// Hint: Use

// indexOf()
// substring()

import java.util.*;
class Main(){


public static void main (String[]args){


    Scanner sc=new Scanner(System.in);

    String email=sc.nextLine();

    int idx= email.indexOf("@");
    System.out.println(email.subString(0,idx));
    System.out.println(email.subString(idx+1,email.length()));




}



}



// Assignment 4 ⭐⭐⭐⭐⭐ (Mini Project)

// Create a Student Name Manager.

// Input 5 student names into a String[].

// Implement methods:

// Display all names
// Convert all names to uppercase
// Search a student by name (ignore case)
// Count how many names start with 'A'
// Find the longest name

// This combines Strings + Arrays, which is excellent practice before moving into OOP-heavy Java and Spring Boot.

// Complete Assignment 1 first. Once I review it, we'll move to the others progressively, just like we've been doing.


import java.util.*;
class StudentNameManager{

    void takeInput(){
         String[] names;
        Scanner sc= new Scanner(System.in);

        for(int i=0; i<names.length;i++){
            names[i]=sc.nextLine();
        }

    }

    void displayNames(String[] names){
        for(int i =0; i<names.length ;i++){
            System.out.print(names[i]+ " ");
        }
    }

    String convertUpperCase(String[] names){

        for(int i=0; i<names.length; i++){
            names[i]=names[i].toUpperCase();
        }

        return names;

    }

     String convertLowerCase(String[] names){

        for(int i=0; i<names.length; i++){
            names[i]=names[i].toLowerCase();
        }

        return names;

    }

    void findNames(String [] names,String name){

        for(int i=0; i<names.length; i++){
            if(names[i].toLowerCase()==name.toLowerCase()){
                System.out.println("The Student Exist");
            }
        }
    }

int StartsWithA(String [] names){
    int count =0;

    for(int i=0; i<names.length; i++){
        if(names.startsWith('A')){
            count++;
        }
    }

    return count;
}

String LongestName(String[] names){

    int maxLength=0;
    String longestName;

for(int i=0; i<names.length; i++){

    if(names[i].length()>maxLength){
    longestName=names[i];
    }

}

return longestName;

}

public static void main(){

String [] names ;

StudentNameManager st = new StudentNameManager();

st.takeInput();

st.displayNames(names);

st.convertUpperCase(names);
st.displayNames(names);
st.convertLowerCase(names);
st.displayNames(names);
st.findNames(names,"chandra");

System.out.println("The names starsts with A " + StartsWithA(names));


System.out.println("The Longest name " + LongestName(names));

}

}



// Medium-Level Assignment (No Repetition)

// Create a class UserLogin.

// Input
// Registered Username
// Entered Username
// Registered Password
// Entered Password


//login success , invalid pass, invalid user


import java.util.*;
class Login {

    boolean checkUserName(String registeredName, String EnteredName  ){

        boolean res =EnteredName.equalsIgnoreCase(registeredName)
          
          return res;
   
}

    }

    boolean checkPassword(String registeredPassword , String enteredPassword ){
            
            boolean res=EnteredPassword.equals(registredPassword);

            return res;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Main mn =new Main();
        String registeredName=new String();
        String enteredName = new String();
        String registeredPassword = new String();
        String enteredPassword = new String();

        System.out.print("Enter Registration user name");
        registeredName =sc.nextLine();
        System.out.print("Enter Registartion Password :");
        registeredPassword=sc.nextLine();

         System.out.print("Enter Login user name");
        enteredName =sc.nextLine();
        System.out.print("Enter Login Password :");
        enteredPassword=sc.nextLine();

     boolean isCorrectName = mn.checkUserName(registeredName,enteredName);
     boolean isCorrectPassword mn.checkPassword(registeredPassword,enteredPassword);

     if(isCorrectName&& isCorrectPassword){
        System.out.println("Login Success");
     }
     else if(!isCorrectName){
        System.out.println("Invalid name");
     }
     else{
        System.out.println("Invalid password");
     }






    }
}


// Assignment 1 (Medium)

// Create a class UsernameFormatter

// Take username input.

// Example

//     Chandra_Shekhar123

// Print:

// Original :
// Trimmed :
// Uppercase :
// Lowercase :
// Length :
// Starts with "C" :
// Contains "_" :
// First occurrence of '_' :
// Last occurrence of 'a' :
// Replace '_' with space :

import java.util.*;

class UserNameFormatter {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        Sysetm.out.print("Enter Your name :");

        String name =sc.nextLine();

        System.out.println("The original name i s:"+ name);
        System.out.println("The trimmed name is :"+ name.trim());
        System.out.println("The Uppercase is :"+ name.toUpperCase());
        System.out.println("The Lowercase is :"+name.toLowerCase());
        System.out.println("The length is :"+ name.length());
        System.out.println("The startswith _ :"+ name.contains("_"));
        System.out.println("The first occurence of a is"+name.indexOf('a'));
        System.out.println("The last indes of a is :"+ name.lastIndexOf('a'));
        System.out.println("The replace _ with ": name.replace(':'));
    }
}


// Assignment 2 (Medium-Hard)
// Email Validator

// Take an email.

// Example

// chandra.tech123@gmail.com

// Print

// Username : chandra.tech123
// Domain : gmail.com
// Starts with alphabet : true
// Contains @ : true
// Contains . : true
// Number of dots : 1

// Restriction

// Don't use split().

// Use only

// charAt()
// substring()
// indexOf()
// lastIndexOf()
// contains()

class EmailValidator {



void generateUserNameandDomain(String name){

    int getIdx=name.indexOf('@');
    System.out.println("The username is :" + name.substring(0,getIdx));
    System.out.println("The domain is :"+ name.substring(getIdx+1));

}

boolean isConatains (String email ){
    return email.contains("@");

}

boolean isContainsDot(String email){
    return email.contains(".");
}

int numberOfDots(String name){

    int count=0;

    for(int i =0; i<name.length(); i++){
        if(name[i]=='.'){
            count++;
        }

    }
    return count;
}



 public static void main(String[] args){

Scanner sc =new Scanner(System.in);

System.out.println("Enter email id :");
String email=sc.nextLine();

EmailValidator eml =new EmailValidator();

eml.generateUserNameandDomain(email);
System.out.println(eml.isConatains(email));
System.out.println(eml.isContainsDot(email));
System.out.println(eml.numberOfDots(email));


    }
}


// Assignment 3 (Hard)
// Text Analyzer

// Input

// Java Spring Boot Backend

// Print

// Total Characters :
// Total Vowels :
// Total Consonants :
// Total Spaces :
// Total Words :
// Reverse String :

// Restrictions:

// Don't use StringBuilder.reverse().
// Don't use split().
// Count everything manually using loops and charAt().

import java.util.


class TextAnalyzer {

int countVowels(String s){
    int cnt=0;
    
   for (int i=0; i<s.length(); i++){

    char ch =Character.toLowerCase(s.charAt(i));

    if(ch =='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'){
        cnt++;
    }


   }


    return cnt;
}


int countConsonants(String s){

    int cnt=0;

    for(int i=0; i<s.length(); i++){
        char ch =Character.toLowerCase(s.charAt(i));
        if(ch>='a' && ch<='z'){
            if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
                cnt++;
            }
        }
    }

    return cnt;
}


int countTotalSpaces(String s){

    int cnt=0;
    

    for(int i=0; i<s.length();i++){
        if(s[i]==' '){
            cnt++;
        }
    }
    return cnt;

}
    

    int countTotalWords(String s){

    int cnt=0;
    

    for(int i=0; i<s.length();i++){
        if(s[i]==' '){
            cnt++;
        }
    }
    return cnt+1;

}



String reversString(String s){
    int start=0;
    int l=s.length()-1;

    while(start<=l){
        swap(s[start],s[l]);
        s++;
        l++;
    }

    return s;
}








public static void main(String[]){

TextAnalyzer ta=new TextAnalyzer();

Scanner sc =new Scanner(System.in);

  System.out.print("Enter paragraph :");
  String para=sc.nextLine();
  System.out.println("The total char is :" + para.length());

System.out.println("The total vowels is :" + ta.countVowels(para) );
System.out.println("The total consonant is :"+ ta.countConsonants(para));
System.out.println("Total Space is :"+ta.countTotalSpaces(para));
System.out.println("The total words is :"+ ta.countTotalWords(para))
System.out.println("The reverse is :"+ta.reversString(para));











    }
}





// Assignment 4 (Developer Level)

// Create a class PasswordStrengthChecker

// Rules:

// Minimum 10 characters
// At least one uppercase
// At least one lowercase
// At least one digit
// At least one special character (@#$%&*!)
// No spaces
// Must not contain the username

// Example

// Username : chandra

// Password : Chandra@123

// Output

// Weak Password
// Reason :
// Contains username

// Another

// Password : Dev@2026Java

// Output

// Strong Password


import java.util.*;

class PasswordStrengthChecker {


    boolean isUpparCase(string s){

        for int(i=0; i<s.length();i++){
            char ch=Character.charAt(s[i]);

            if(ch>='A' && ch<='Z'){
                return true;
            }
        }

        return false;
        

    }


 boolean isLowerCase(String s){
    for(int i=0; i<s.length(); i++){
        char ch =Character.charAt(s[i]);

        if(ch>='a' && ch<='z'){
            return true;
        }
    }

    return false;
 }

 boolean isDigit(String s){
    
    for(int i =0; i<s.length(); i++){
        char ch= Character.charAt(s[i]);

        if(ch>='0' && ch<='9'){
            return true;
        }
    }
    return false;
 }


boolean isCOntainseUserName(String s1, String s2){
    return s1.contains(s2);
}

boolean isSpace(String s){

    for (int i=0; i<s.length(); i++){
        char ch = Character.charAt(s[i]);
        if(ch==' '){
            return true;
        }
    }

    return false;
}





    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the USername:");
        String username=sc.nextLine();

        System.out.println("Enter the password :")

        String password=sc.nextLine();

        if(isUpparCase && isLowerCase && isDigit && !isCOntainseUserName && !isSpace){
            System.out.print("String password");
        }else {
            System.out.println("Weak Password");
        }





    }
}



// Assignment 1 - Text Editor

// Input:

// Hello

// Perform these operations using StringBuilder:

// Append " World"
// Insert "Java " at index 6
// Replace "Hello" with "Hi"
// Delete "World"
// Print final string

// Expected final output:


class TextEditor{

    public static void main(String[]args){

      

        StringBuilder sb=new StringBuilder("Hello");

         System.out.println(sb.append("World"));
        
         System.out.println( sb.insert(6,"Java"));
         System.out.println(sb.replace(0,6,"Hi"));
         System.out.println(sb.delete(3,8));
         



    }
}






