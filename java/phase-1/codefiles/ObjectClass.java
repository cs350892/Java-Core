// Ab tumhara assignment 🔥

// Basic Student assignment nahi.

// Tumhare cybersecurity context ka object banaate hain.

// Assignment: SecurityAlert equality system

// Tumhare paas:

// class SecurityAlert

// fields:

// alertId
// severity
// sourceIp

// Example:

// SecurityAlert a1 =
//     new SecurityAlert("AL-101", "HIGH", "192.168.1.10");

// SecurityAlert a2 =
//     new SecurityAlert("AL-101", "LOW", "10.0.0.5");
// Requirement 1 — toString()

// Override:

// toString()

// Output kuch meaningful hona chahiye:

// SecurityAlert{id='AL-101', severity='HIGH', sourceIp='192.168.1.10'}
// Requirement 2 — equals()

// Business rule:

// Do SecurityAlert objects same alert hain agar unka alertId same hai.

// So:

// a1.equals(a2)

// should return:

// true

// Even though severity and IP different hain.

// Requirement 3 — hashCode()

// equals() ke rule ko respect karo.

// Agar:

// a1.equals(a2)

// true hai,

// then:

// a1.hashCode() == a2.hashCode()

// hona chahiye.

// Hint:

// return alertId.hashCode();
// Requirement 4 — getClass()

// Main mein:

// System.out.println(a1.getClass().getName());

// run karo.

// Requirement 5 — Test everything

// Tumhara main approximately:

// SecurityAlert a1 =
//     new SecurityAlert("AL-101", "HIGH", "192.168.1.10");

// SecurityAlert a2 =
//     new SecurityAlert("AL-101", "LOW", "10.0.0.5");

// SecurityAlert a3 =
//     new SecurityAlert("AL-102", "HIGH", "192.168.1.10");

// Then test:

// System.out.println(a1);
// System.out.println(a1.equals(a2));
// System.out.println(a1.equals(a3));

// System.out.println(a1.hashCode());
// System.out.println(a2.hashCode());
// System.out.println(a3.hashCode());

// System.out.println(a1.getClass().getName());
// Expected conceptual result
// toString() → readable alert details

// a1.equals(a2) → true
// a1.equals(a3) → false

// a1.hashCode() == a2.hashCode() → true

// getClass() → SecurityAlert


//Assignment: SecurityAlert equality system



class SecurityAlert {

    String alertId;
    String severity;
    String sourceIp;



    SecurityAlert(String alertId,  String severity, String sourceIp){
        this.alertId=alertId;
        this.severity=severity;
        this.sourceIp=sourceIp;
    }


    @Override 
         public String toString(String alertId, String severity, String sourceIp){

            return "SecurityAlert{"alertId :"+ alertId + "severity :" + severity + "sourceIp :"+sourceIp }";

    }

    @Override
          public boolean equals(Object obj1, Object obj2){
            if(obj1.id == obj2.id){
                return true;
            }
            else {
                return false;
            }

          }

    @Override 
        public boolean hashCode(Object obj1,Object obj2 ){

            if(obj1.equals(obj2)){
                return true;
            }

            else {
               return false;
            }

        
           }

    
}

class Main{

    public static void main(String[]args){
  SecurityAlert a1 =
    new SecurityAlert("AL-101", "HIGH", "192.168.1.10");

SecurityAlert a2 =
    new SecurityAlert("AL-101", "LOW", "10.0.0.5");

SecurityAlert a3 =
    new SecurityAlert("AL-102", "HIGH", "192.168.1.10");
    }
}