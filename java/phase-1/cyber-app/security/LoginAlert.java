package security;

class LoginAlert extends Alert {

    private String username;
    String ipAddress;
    protected int failedAttempt;

    LoginAlert(String alertId, String severity, String message ,String username,String ipAddress, int failedAttempt ){
        super(alertId,severity,message);
        this.username=username;
        this.ipAddress=ipAddress;
        this.failedAttempt=failedAttempt;
    }

    void showLogin(){
        System.out.println("User : "+username);
        System.out.println("IP Address : "+ipAddress);
        System.out.println("Failed Attempt :"+failedAttempt);
    }



}