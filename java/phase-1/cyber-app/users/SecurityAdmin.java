import user;
import security.LoginAlert;


class SecurityAdmin extends User {

    private String adminLevel;
    String department;
    protected int yearsOfExperience;

    SecurityAdmin(int userId, String userName, String emailId, String role,String adminLevel, String department,String department,int yearsOfExperience){

    super(userId,userName,emailId,role);

      this.adminLevel=adminLevel;
      this.department=department;
      this.yearsOfExperience=yearsOfExperience;
    }

    public String getAdminLevel(){
        return adminLevel;
    }

    void displaySecurity(){
        System.out.println("adminLevel :"+adminLevel);
        System.out.println("department : "+department);
        System.out.println("years of experience :" + yearsOfExperience);
    }

    



}