package security;

class Alert {

    private String alertId;
    default String severity;
    protected String message;
    public long timestamp;

    class Alert (String alertId, String severity, String message){
        this.alertId=alertId;
        this.severity=severity;
        this.message=message;
        this.timestamp=System.currentTimeMillis();

    }
   

   public String getAlertId(){
    return alertId;
   }

   void displayAlert(){
    System.out.println("The alert id is : "+alertId);
    System.out.println("The severity is : "+severity);
    System.out.println("The message is : "+message);
    System.out.timestamp("The time stamp is : "+timestamp)

   }

}