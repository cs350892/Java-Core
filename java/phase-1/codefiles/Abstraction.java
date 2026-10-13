// Ab tumhara next assignment 🔥

// Basic Shape, Animal, Vehicle wala assignment nahi dunga. Tum cybersecurity project par kaam kar rahe ho, so real-world type banate hain.

// Assignment: Security Alert Engine

// Tumhe ek abstract class SecurityAlert banani hai.

// Parent class
// SecurityAlert

// Fields:

// alertId
// severity

// Constructor:

// SecurityAlert(String alertId, String severity)

// Methods:

// abstract void investigate();

// void showAlertInfo()

// showAlertInfo() should print:

// Alert ID: ...
// Severity: ...
// Child 1: LoginAlert

// It extends SecurityAlert.

// Its investigate() should print something like:

// Investigating suspicious login...
// Checking login location...
// Checking login time...
// Child 2: MalwareAlert

// Its investigate():

// Scanning endpoint for malware...
// Checking suspicious processes...
// Child 3: DataLeakAlert

// Its investigate():

// Investigating possible data exfiltration...
// Checking unusual data transfer...
// Main mein twist hai 😈

// Individual child references mat use karna.

// Ye mat karna:

// LoginAlert l = new LoginAlert(...);

// Instead:

// SecurityAlert a1 = new LoginAlert(...);
// SecurityAlert a2 = new MalwareAlert(...);
// SecurityAlert a3 = new DataLeakAlert(...);

// Then:

// a1.showAlertInfo();
// a1.investigate();

// a2.showAlertInfo();
// a2.investigate();

// a3.showAlertInfo();
// a3.investigate();

abstract class SecurityAlert{

    String alertId;
    String severity;

    SecurityAlert(String alertId, String severity){
        this.alertId=alertId;
        this.severity=severity;
    }

    abstract void investigate();

    void showAlertInfo(){
        System.out.println("AlertId : "+alertId );
        System.out.println("Severity : "+ severity);
       
    }



}

class LoginAlert extends SecurityAlert{

    LoginAlert(String alertId,String severity){
        super(alertId,severity);
    }

    @Override 
           void investigate() {

            System.out.println("Investigating suspicious login...");
            System.out.println("Checking login time....");
            System.out.println("Checking login location...");
           }
}

class MalwareAlert extends SecurityAlert{

    MalwareAlert(String alertId, String severity){
        super(alertId,severity);
    }

    @Override
          void investigate(){
            System.out.println("Scanning endpoint for malware .......");
            System.out.println("Checking suspicious Process...");
          }
}

class DataLeakAlert extends SecurityAlert{

    DataLeakAlert(String ALertId, String severity){
        super(alertId,severity);
    }
    @Override
       void investigate(){
        System.out.println("Checking possible data exfiltration....");
        System.out.println("Scanning for Large data transfer ........");
       }
}

class Main{


    public static void main (String[]args){

        // SecurityAlert a1= new LoginAlert("1","HIGH");
        // SecurityAlert a2= new MalewareAlert("2","Medium");
        // SecurityAlert a3 = new DataLeakAlert("3","Low");

        // a1.investigate();
        // a1.showAlertInfo();

        // a2.investigate();
        // a2.showAlertInfo();

        // a3.investigate();
        // a3.showAlertInfo();

        SecurityAlert[] alerts ={
            new LoginAlert("1","HIGH"),
            new MalewareAlert("2","Medium"),
            new DataLeakAlert("3","Low"),

        }

        for (int i=0; i<alerts.length; i++){
            alerts[i].investigate();
            alerts[i].showAlertInfo();
                    }


    }
}