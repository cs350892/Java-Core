// 🔥 Tumhara Assignment 1 — Polymorphism

// Ab real-world cybersecurity scenario:

// Security Alert System

// Tumhare paas parent class hai:

// class Alert {
//     String alertId;
//     String severity;

//     Alert(String alertId, String severity) {
//         this.alertId = alertId;
//         this.severity = severity;
//     }

//     void investigate() {
//         System.out.println("Generic alert investigation");
//     }
// }

// Teen different alert types banao:

// LoginAlert
// MalwareAlert
// DataLeakAlert

// Har class Alert ko extend karegi aur investigate() ko override karegi.

// Expected behavior:

// LoginAlert → Investigating suspicious login...
// MalwareAlert → Scanning system for malware...
// DataLeakAlert → Investigating possible data exfiltration...
// Main mein condition ye honi chahiye:
// Alert alert;

// alert = new LoginAlert(...);
// alert.investigate();

// alert = new MalwareAlert(...);
// alert.investigate();

// alert = new DataLeakAlert(...);
// alert.investigate();
// Extra challenge 🔥

// Har child class ka apna extra field rakho:

// LoginAlert     → sourceIp
// MalwareAlert   → malwareName
// DataLeakAlert  → dataType

// Aur constructor ke through values initialize karo.

// Important: instanceof use nahi karna. Abhi usko intentionally avoid karo.

class Alert {

    String alertId;
    String severity;

    Alert(String alertId,String severity){
    
        this.alertId=alertId;
        this.severity=severity;

    }

    void investigate(){
        System.out.println("Generic Alert investigation...");
    }


}


class LoginAlert extends Alert {

    LoginAlert(String id, String severity){
        super(id,severity);
    }

    @Override
    void investigate(){
        System.out.println("Investigating suspicious login..........");
    }

}

class MalewareAlert extends Alert {

    MalewareAlert(String id, String severity){

        super(id,severity);

    }



    @Override
    void investigate(){
        System.out.println("Scanning System for malware ...........");
    }
}


class DataLeakAlert extends Alert{

    DataLeakAlert(String id, String severity){
        super(id,severity);
    }
    @Override
       void investigate(){
        System.out.println("Investigating possible data exfiltration.........");
       }
}

class Main{

    public static void main(String[]args){

        Alert a1=new Alert("qw12","High");
        a1.investigate();
        LoginAlert a2 =new LoginAlert("nm","hjhs");
        a2.investigate();
        DataLeakAlert a3=new DataLeakAlert("kjljkn","bhjjk");
        a3.investigate();

    }
}


//compile time polymorphism ...


// 🔥 Assignment 2 — Real Cybersecurity Scenario

// Ek ThreatDetector class banao.

// Usme same method detect() ko overload karo:

// Version 1
// detect(String ip)

// Output:

// Checking IP: 192.168.1.10
// Version 2
// detect(String ip, int port)

// Output:

// Checking IP: 192.168.1.10 on port 443
// Version 3
// detect(String ip, int port, String protocol)

// Output:

// Checking IP: 192.168.1.10 on port 443 using HTTPS
// Main:
// ThreatDetector td = new ThreatDetector();

// td.detect("192.168.1.10");

// td.detect("192.168.1.10", 443);

// td.detect("192.168.1.10", 443, "HTTPS");

class ThreatDetector{

    void detect(String ip){
        System.out.println("Detected ip :"+ip);
    }

    void detect(String ip, int port){
        System.out.println("Detected ip is :"+ip "and port is : "+port);
    }

    void detect(String ip, int port , String protocol){
        System.out.println("Detected ip is: "+ip "and port is : "+port +"and the protocol is :"+protocol);
    }


}


class Main{

    public static void main(String[]args){
        ThreatDetector td= new ThreatDetector();
        td.detect("192.168.0.61");
        tb.detect("192.168.0.61",8090);
        tb.detect("192.168.0.61",8090,"HTTPS");
    }
}



// 🔥 Ab next challenge

// Ab main tumhe ek tricky assignment dunga jisme overloading + overriding dono honge.

// Payment parent class banao:

// Payment
//    ↓
// CreditCardPayment
//    ↓
// OnlinePayment

// Requirements:

// Payment mein pay(double amount)
// CreditCardPayment mein pay(double amount) override karo
// CreditCardPayment mein pay(double amount, String cardNumber) overload karo
// OnlinePayment mein pay(double amount) override karo
// Main mein parent reference + child object use karo.


class Payment {

    double amount;

    Payment(int amount){
        this.amount =amount;
    }

    void pay(double amount){
    System.out.println("You are about to pay :"+amount);
}

}

class CreditCardPayment extends Payment{

    CreditCardPayment(double amount, String cardNumber){
        super(amount);
        this.cardNumber=cardNumber;

    }

    super.pay(amount);

    @Override
      void pay(double amount){
        System.out.println("Paying from the card...........")
      }

    void pay(double amount,String cardNumber){
        System.out.println("You are paying amount :"+amount + "from the card :"+cardNumber);
    }


}

class OnlinePayment extends CreditCardPayment{

    OnlinePayment(double amount,String cardNumber ,String status){
        super(amount,cardNumber);
        this.status=status;
    }

    @Override
      void pay(double amount){
        System.out.println("Online payment of :"+amount);
      }

      void pay(double amount,String cardNumber,String status){
        System.out.println("You are paying online :"+amount +"with card Number :"+cardNumber +"status is :"+ status);

      }

}

class Main{

    public static void main(String[]args){

         Payment p1 =new CreditCardPayment;
      
         Payment p2 =new OnlinePayment();

         p1.pay(1000);
         p2.pay(200);

        CreditCardPayment cp =new CreditCardPayment();

        
         cp.pay(3000,"ac12");
    }
}