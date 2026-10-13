package users;

class User {

    private int userId;
    String userName;
    protected String emailId;
    public String role;

    User(int userId, String userName, String emailId, String role){

        this.userId=userId;
        this.userName=userName;
        this.emailId=emailId;
        this.role=role;

    }

    void int getUserId(){
        return userId;
    }

    void displayUserInfo(){
        System.out.println("userid :"+userId);
        System.out.println("User name :"+userName);
        System.out.println("emaid id: "+emaid);
        System.out.print
    }
    

}