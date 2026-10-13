


// Assignment 1 — Threat Response Engine

// Create an interface:

// interface ThreatResponse

// It should define behavior for:

// detect()
// respond()

// Then create:

// FirewallResponse
// IDSResponse
// EndpointResponse

// Each class must implement ThreatResponse differently.

// Then in main() you should use:

// ThreatResponse response;

// and dynamically assign different implementations to it.

// Extra challenge: create a class that implements two interfaces:

// ThreatResponse
// Auditable

// and make the class satisfy both contracts.



interface ThreatResponse {

    void detect();
    void response();


}

interface Auditable {
    void auditStatus ();
}

class FirewallResponse implements ThreatResponse {

    @Override 
    void detect(){
        System.out.println("The threat is coming from firewall...");
    }

    @Override
      void response (){
        System.out.println("Removed ip by threat wall...");
      }


}

class IDSResponse implements ThreatResponse {

    @Override 
       void detect (){

        System.out.println("The threat is coming from IDS..");




       }

       @Override
       void response (){
        SYstem.out.println("IDS threat blocked by admin..");

       }

}

class EndpointResponse implements ThreatResponse {

    @Override 
       void detect (){

        System.out.println("The threat is coming from ENdpoint");

       }

       @Override
       void response (){

        System.out.println("Endpoint threat is blocked by IT");
        
       }

}

class ThreatandAudit implements ThreatReponse,Auditable{

    @Override
       void detect(){
        System.out.println("Threat is coming ...........wait and fuck off");
       }

       @Override 
          void response(){
            System.out.println("Response for threat and audit........");
          }

          @Override
             auditStatus(){
                System.out.println("Audit status is closed....");
             }
}

class Main{

    public static void main(String[]args){
        ThreatResponse t1= new FirewallResponse();
        ThreatResponse t2= new IDSResponse();
        ThreatResponse t3 = new EndpointResponse();
        ThreatandAudit t4 = new ThreatandAudit();

        t1.detect();
        t1.response();
         
         t2.detect();
         t2.response();

         t3.response();
         t3.detect();

         t4.response();
         t4.detect();
         t4.auditStatus();


    }
}



Assignment: Cybersecurity Incident Response System

Build a small Threat Response Engine using interfaces + polymorphism.

Requirements

Create these interfaces:

interface ThreatDetector {
    void detect();
}


interface ThreatResponder {
    void respond();
}


interface Auditable {
    void audit();
}


// 1. Create NetworkThreat

// It should implement:

// ThreatDetector
// ThreatResponder
// Auditable

// Fields:

// String sourceIp
// int port
// String severity

// Methods should behave differently based on the data.

// For example:

// detect()
// → "Network threat detected from 192.168.1.10:443"


// respond()
// → HIGH severity  : "IP blocked immediately"
// → MEDIUM severity: "IP added to monitoring"
// → LOW severity   : "Traffic logged"


// audit()
// → print all important threat information


// 2. Create MalwareThreat

// It should implement:

// ThreatDetector
// ThreatResponder

// Fields:

// String hostname
// String malwareName
// String severity

// Example behavior:

// detect()
// → "Malware detected on SERVER-01"


// respond()
// → HIGH   → "Endpoint isolated"
// → MEDIUM → "Malware quarantined"
// → LOW    → "Malware activity logged"

// It doesn't implement Auditable.

// 3. Create DataLeakThreat

// It should implement:

// ThreatDetector
// ThreatResponder
// Auditable

// Fields:

// String username
// double dataTransferred
// String severity

// Behavior:

// detect()
// → "Possible data leak detected for user Chandra"


// respond()
// → if dataTransferred > 1000
//      "User account blocked"
//   otherwise
//      "Transfer placed under monitoring"


// audit()
// → display username + transferred data + severity
// 🔥 Main Challenge: Interface Polymorphism

// Don't simply do:

// NetworkThreat n = new NetworkThreat(...);
// MalwareThreat m = new MalwareThreat(...);

// Instead create:

// ThreatDetector[] threats = {
//     new NetworkThreat(...),
//     new MalwareThreat(...),
//     new DataLeakThreat(...)
// };

// Then:

// for (ThreatDetector threat : threats) {
//     threat.detect();
// }

// This is the important part.

// You're telling Java:

// "I don't care which actual class this object belongs to. If you are a ThreatDetector, I know you can detect()."

// Then create another array:

// ThreatResponder[] responders = {
//     new NetworkThreat(...),
//     new MalwareThreat(...),
//     new DataLeakThreat(...)
// };

// and call:

// for (ThreatResponder responder : responders) {
//     responder.respond();
// }
// ⭐ Bonus Challenge

// Because only some threats are auditable:

// Auditable[] auditableThreats = {
//     new NetworkThreat(...),
//     new DataLeakThreat(...)
// };

// Then:

// for (Auditable threat : auditableThreats) {
//     threat.audit();
// }

// Notice something important:

// MalwareThreat cannot be placed in this array, because it doesn't implement Auditable.

// ⚠️ Rules

// Try this without looking at a solution.

// You are expected to make mistakes. In fact, I want you to make them because you're now combining:

// Interfaces
// implements
// Multiple interfaces
// @Override
// Constructors
// super isn't required here
// Encapsulation
// Polymorphism
// Arrays of interface references
// Runtime method dispatch

interface ThreatDetector {

    void detect();

}

interface ThreatResponder {

    void respond();

}

interface Audit {

    void info();

}

class NetworkThreat implements ThreatResponder, ThreatDetector, Audit {

    String sourceIp;
    int port;
    String severity;

    NetworkThreat(String sourceIp, int port, String severity) {
        this.sourceIp = sourceIp;
        this.port = port;
        this.severity = severity;
    }

    @Override
    public void detect() {
        System.out.println(
            "Network threat detected from " + sourceIp
        );
    }

    @Override
    public void respond() {

        if ("HIGH".equals(severity)) {
            System.out.println("IP blocked immediately...");
        }
        else if ("MEDIUM".equals(severity)) {
            System.out.println("IP added to monitoring...");
        }
        else if ("LOW".equals(severity)) {
            System.out.println("Traffic logged...");
        }
        else {
            System.out.println("Invalid severity...");
        }
    }

    @Override
    public void info() {

        System.out.println("Threat IP: " + sourceIp);
        System.out.println("Threat Port: " + port);
        System.out.println("Severity: " + severity);
    }
}


class MalwareThreat implements ThreatDetector, ThreatResponder {

    String hostname;
    String malwareName;
    String severity;

    MalwareThreat(
        String hostname,
        String malwareName,
        String severity
    ) {
        this.hostname = hostname;
        this.malwareName = malwareName;
        this.severity = severity;
    }

    @Override
    public void detect() {
        System.out.println(
            "Malware detected on " + hostname
        );
    }

    @Override
    public void respond() {

        if ("HIGH".equals(severity)) {
            System.out.println("Endpoint isolated");
        }
        else if ("MEDIUM".equals(severity)) {
            System.out.println("Malware quarantined");
        }
        else if ("LOW".equals(severity)) {
            System.out.println("Malware activity logged");
        }
    }
}


class DataLeakThreat implements ThreatDetector, ThreatResponder, Audit {

    String username;
    double dataTransferred;
    String severity;

    DataLeakThreat(
        String username,
        double dataTransferred,
        String severity
    ) {
        this.username = username;
        this.dataTransferred = dataTransferred;
        this.severity = severity;
    }

    @Override
    public void detect() {
        System.out.println(
            "Possible data leak detected by: " + username
        );
    }

    @Override
    public void respond() {

        if (dataTransferred > 1000) {
            System.out.println("User account blocked...");
        }
        else {
            System.out.println(
                "Transfer placed under monitoring..."
            );
        }
    }

    @Override
    public void info() {

        System.out.println(
            "Username: " + username +
            ", Transferred Data: " + dataTransferred +
            ", Severity: " + severity
        );
    }
}


class Main {

    public static void main(String[] args) {

        ThreatDetector[] threats = {

            new NetworkThreat(
                "192.168.0.61",
                8090,
                "HIGH"
            ),

            new MalwareThreat(
                "Server-02",
                "malware",
                "HIGH"
            ),

            new DataLeakThreat(
                "Chandra",
                1200,
                "HIGH"
            )
        };


        System.out.println("===== DETECTION =====");

        for (ThreatDetector threat : threats) {
            threat.detect();
        }


        ThreatResponder[] responders = {

            new NetworkThreat(
                "192.168.0.61",
                8090,
                "HIGH"
            ),

            new MalwareThreat(
                "Server-02",
                "malware",
                "HIGH"
            ),

            new DataLeakThreat(
                "Chandra",
                1200,
                "HIGH"
            )
        };


        System.out.println("\n===== RESPONSE =====");

        for (ThreatResponder responder : responders) {
            responder.respond();
        }


        Audit[] auditableThreats = {

            new NetworkThreat(
                "192.168.0.61",
                8090,
                "HIGH"
            ),

            new DataLeakThreat(
                "Chandra",
                1200,
                "HIGH"
            )
        };


        System.out.println("\n===== AUDIT =====");

        for (Audit threat : auditableThreats) {
            threat.info();
        }
    }
}


