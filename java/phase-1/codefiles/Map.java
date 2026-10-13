


/*

CLASS 1: Student
java
class Student {
    private int id;           // Unique student ID
    private String name;
    private String department;

    // Constructor with validation
    // Getters (no setters needed - make immutable)
    // toString() override
    // equals() and hashCode() based on id
}
CLASS 2: GradeManager
java
class GradeManager {
    // Map: Student ID → List of grades
    private Map<Integer, List<Integer>> gradeMap = new HashMap<>();
    
    // Also store student info separately
    private Map<Integer, Student> studentMap = new HashMap<>();

    // 1. Add a student
    boolean addStudent(Student student) {
        // Add student to studentMap
        // Also initialize gradeMap with empty list
        // Return true if added, false if duplicate
    }

    // 2. Add grade for a student
    boolean addGrade(int studentId, int grade) {
        // Validate grade (0-100)
        // Find student in studentMap
        // Add grade to gradeMap
        // Return true if added, false if student not found
    }

    // 3. Get all grades for a student
    List<Integer> getGrades(int studentId) {
        // Return copy of grades list
        // Return empty list if student not found
    }

    // 4. Get student by ID
    Student getStudent(int studentId) {
        // Return student
        // Return null if not found
    }

    // 5. Get all students
    Map<Integer, Student> getAllStudents() {
        // Return copy of studentMap
    }

    // 6. Calculate average for a student
    double getAverage(int studentId) {
        // Calculate average of all grades
        // Return -1 if no grades or student not found
    }

    // 7. Get highest grade for a student
    int getHighestGrade(int studentId) {
        // Return highest grade
        // Return -1 if no grades
    }

    // 8. Get lowest grade for a student
    int getLowestGrade(int studentId) {
        // Return lowest grade
        // Return -1 if no grades
    }

    // 9. Get all students who failed (average < 40)
    Map<Integer, Student> getFailedStudents() {
        // Return Map of failed students
    }

    // 10. Get all students who passed (average >= 40)
    Map<Integer, Student> getPassedStudents() {
        // Return Map of passed students
    }

    // 11. Get student with highest average
    Student getTopper() {
        // Find student with highest average
        // Return null if no students
    }

    // 12. Get department-wise average
    Map<String, Double> getDepartmentAverages() {
        // Calculate average for each department
        // Return Map: Department → Average
    }

    // 13. Remove a student
    boolean removeStudent(int studentId) {
        // Remove from both maps
        // Return true if removed
    }

    // 14. Print all students with grades
    void printAllStudents() {
        // Print all students with their grades
        // Show average, highest, lowest
        // Handle empty case
    }

    // 15. Get total students
    int getTotalStudents() {
        return studentMap.size();
    }
}
CLASS 3: Main (Test Your Code)
java
public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();

        // === TEST 1: Add Students ===
        System.out.println("\n=== TEST 1: Add Students ===");
        Student s1 = new Student(101, "Chandra", "Computer Science");
        Student s2 = new Student(102, "Rahul", "Mathematics");
        Student s3 = new Student(103, "Priya", "Physics");
        Student s4 = new Student(101, "Duplicate", "Chemistry"); // Duplicate

        System.out.println("Add Chandra: " + manager.addStudent(s1));
        System.out.println("Add Rahul: " + manager.addStudent(s2));
        System.out.println("Add Priya: " + manager.addStudent(s3));
        System.out.println("Add Duplicate: " + manager.addStudent(s4) + " (should be false)");
        System.out.println("Total students: " + manager.getTotalStudents());

        // === TEST 2: Add Grades ===
        System.out.println("\n=== TEST 2: Add Grades ===");
        System.out.println("Add grade 85 for 101: " + manager.addGrade(101, 85));
        System.out.println("Add grade 90 for 101: " + manager.addGrade(101, 90));
        System.out.println("Add grade 78 for 101: " + manager.addGrade(101, 78));
        System.out.println("Add grade 92 for 102: " + manager.addGrade(102, 92));
        System.out.println("Add grade 88 for 102: " + manager.addGrade(102, 88));
        System.out.println("Add grade 65 for 103: " + manager.addGrade(103, 65));
        System.out.println("Add grade 70 for 103: " + manager.addGrade(103, 70));
        System.out.println("Add grade invalid (101, 150): " + manager.addGrade(101, 150) + " (should be false)");
        System.out.println("Add grade for non-existent: " + manager.addGrade(999, 50) + " (should be false)");

        // === TEST 3: Get Grades ===
        System.out.println("\n=== TEST 3: Get Grades ===");
        System.out.println("Grades for 101: " + manager.getGrades(101));
        System.out.println("Grades for 102: " + manager.getGrades(102));
        System.out.println("Grades for 999: " + manager.getGrades(999));

        // === TEST 4: Get Student ===
        System.out.println("\n=== TEST 4: Get Student ===");
        System.out.println("Student 101: " + manager.getStudent(101));
        System.out.println("Student 999: " + manager.getStudent(999));

        // === TEST 5: Average ===
        System.out.println("\n=== TEST 5: Average ===");
        System.out.printf("Average for 101: %.2f\n", manager.getAverage(101));
        System.out.printf("Average for 102: %.2f\n", manager.getAverage(102));
        System.out.printf("Average for 103: %.2f\n", manager.getAverage(103));

        // === TEST 6: Highest/Lowest ===
        System.out.println("\n=== TEST 6: Highest/Lowest ===");
        System.out.println("Highest for 101: " + manager.getHighestGrade(101));
        System.out.println("Lowest for 101: " + manager.getLowestGrade(101));

        // === TEST 7: Topper ===
        System.out.println("\n=== TEST 7: Topper ===");
        System.out.println("Topper: " + manager.getTopper());

        // === TEST 8: Failed/Passed ===
        System.out.println("\n=== TEST 8: Failed/Passed ===");
        System.out.println("Failed students: " + manager.getFailedStudents().keySet());
        System.out.println("Passed students: " + manager.getPassedStudents().keySet());

        // === TEST 9: Department Averages ===
        System.out.println("\n=== TEST 9: Department Averages ===");
        System.out.println("Department averages: " + manager.getDepartmentAverages());

        // === TEST 10: Print All Students ===
        System.out.println("\n=== TEST 10: Print All Students ===");
        manager.printAllStudents();

        // === TEST 11: Remove Student ===
        System.out.println("\n=== TEST 11: Remove Student ===");
        System.out.println("Remove 103: " + manager.removeStudent(103));
        System.out.println("Remove 999: " + manager.removeStudent(999) + " (should be false)");
        System.out.println("Total students after removal: " + manager.getTotalStudents());

        // === TEST 12: Final State ===
        System.out.println("\n=== TEST 12: Final State ===");
        manager.printAllStudents();
    }
}
🎯 TEST DATA
Students:
java
Student s1 = new Student(101, "Chandra", "Computer Science");
Student s2 = new Student(102, "Rahul", "Mathematics");
Student s3 = new Student(103, "Priya", "Physics");
Student s4 = new Student(104, "Amit", "Computer Science");
Student s5 = new Student(105, "Sneha", "Mathematics");
Grades:
java
// Student 101: 85, 90, 78, 92
// Student 102: 88, 76, 95, 82
// Student 103: 65, 70, 58
// Student 104: 95, 88, 92, 96
// Student 105: 45, 50, 38  (one failed)






*/






















class Student {

private int id;
private String name;
private String department;

Student(int id, String name, String department){

if( id <= 0 ){
    throw new IllegalArgumentException("Id must be valid positive number");

}

if(name==null || name.trim().isEmpty()){
    throw new IllegalArgumentException("name cant be empty");
}

if(department == null || department.trim().isEmpty()){
    throw new IllegalArgumentException("department can't be empty");
}

this.id=id;
this.name=name;
this.department=department;

}

public int getId(){
    return id;
}

public String getName(){
    return name;
}

public String getDepartment(){
    return department;
}

@Override
public String toString(){

    return String.format("Student{id='%d' , name='%s' , department ='%s'}", id,name,department);

}

@Override 
public boolean equals(Object o){

    if(this == o){
        return true;
    }

    if(!(o instanceof Student)){
        return false;
    }

    Student stu = (Student) o;

    return id == (stu.id);

}

@Override 
public int hashCode(){
    return Integer.hashCode(id);
}

}

class GradeManager{

  //studnetId-> marks
  
  private Map<Integer , List<Integer>> gradeMap = new HashMap<>();

  //sudent info

  private Map<Integer, Student> studentMap = new HashMap<>();

  //add Student

  boolean addStudent(Student student){
    int id=student.getId();

    if(studentMap.containsKey(id)){
        return false;
    }

    studentMap.put(id,student);
    gradeMap.put(id, new ArrayList<>());
    return true;

  }


  boolean addGrade(int studentId,int grade){
    if(grade<0 || grade>100){
        return false;
    }

    if(studentMap.containsKey(studentId)){
      
      List<Integer> gradeList = gradeMap.get(studentId);
      gradeList.add(grade);

      gradeMap.put(studentId, gradeList);
      return true;

    }
    return false;
  }


List<Integer> getGrades(int studentId){

  if(gradeMap.containsKey(studentId)){

    return new ArrayList<Integer>(gradeMap.get(studentId));

  }
  
  return new ArrayList<Integer>();

  }

  Student getStudentById(int studentId){
  
   
    if(studentMap.containsKey(studentId)){
        return studentMap.get(studentId);
    }

    return null
  }


}

Map<Integer,Student> getAllStudents(){
    return studentMap;

}

double getAverage(int studentId){

    if(!gradeMap.containsKey(studentId) || !studentMap.containsKey(studentId)){
        return -1;
    }

    

   List<Integer> grade =  gradeMap.get(studentId);
   int sum =0;
  
   for(int i =0; i<grade.size(); i++){
       sum+=grade.get(i);
   
   }
   
double avg=(double)sum/grade.size();
return avg;
   
}

int getHighestGrade(int studentId){
 
 List<Integer> grade = gradeMap.get(studentId);



 if( grade.isEmpty() || !studentMap.containsKey(studentId)){
    return -1;
 }

  int max=grade.get(0);

for(int i=1; i<grade.size(); i++ ){
    if(max<grade.get(i)){
        max=grade.get(i);
    }
}

return max;
}

int getLowestGrade(int studentId){

    if(!studentMap.containsKey(studentId)){
        return -1;
    }

    List<Integer> grade= gradeMap.get(studentId);
    if(grade.isEmpty()){
        return -1;
    }

    int lowest =grade.get(0);

    for(int i=1 ; i<grade.size();i++){
        if(lowest>grade.get(i)){
            lowest=grade.get(i);
        }
    }

    return lowest;
}


Map<Integer,Student> getFailedStudents(){

    Map<Integer,Student> failedStudent = new HashMap<>();

    for(Map.Entry<Integer,List<Integer>> entry : gradeMap.entrySet()){
        
        Student stu= getStudentById(entry.getKey());
        int stuId= entry.getKey();
        if(getAverage(stuId)<40){
            failedStudent.put(stuId,stu);
        }
    }

    return failedStudent;

}

Map<Integer,Student> getPassedStudents(){
  Map<Integer,Student> passedStudents = new HashMap<>();
    for(Map.Entry<Integer, List<Integer>> entry: gradeMap.entrySet()){
      
        int stuId=entry.getKey();
        if(getAverage(stuId) >=40){

            Student stu= getStudentById(stuId);
        
            passedStudents.put(stuId,stu);


        }

    }

    return passedStudents;
}

Student getTopper(){
  double maxi=-1;
    Student stu=null;


    for(Map.Entry<Integer , Student> entry : studentMap.entrySet()){

       int stuId=entry.getKey();
     double avg=getAverage(stuId);
       if(maxi< avg){
        maxi=avg;
      stu =getStudentById(stuId);
       }
  
    }
      return stu;

}


Map<String,Double> getDepartmentAverages(){

}

boolean removeStudent(int studentId){
    if(studentMap.containsKey(studentId) && gradeMap.containsKey(studentId)){
        studentMap.remove(studentId);
        gradeMap.remove(studentId);
        return true;
    }
   return false ;
}

void printAllStudents(){
  for(Student s : studentMap.getValue()){
    System.out.println("Student id : "+ s.getId());
    System.out.println("Student name : "+ s.getName());
    System.out.println("Student department : "+ s.getDepartment());
  }
}

int getTotalStudents(){
    return studentMap.size();
}

class Main{

    public static void main (String []args){
        GradeManager gm=new GradeManager();
        //add student
        Student s1= new Student(101,"Chandra","CSE");
        Student s2 =new Student(102,"Rahul","mathematics");
        Student s3=new Student(103, "Priya","physics");
        Student s4=new Student(101,"dulicate","Chemistry");

        System.out.println("add Chanadra"+gm.addStudent(s1));
        System.out.println("add Rahul"+ gm.addStudent(s2));
        System.out.println("add priya : "+ gm.addStudent(s3));
        System.out.println("Add duplicate : "+ gm.addStudent(s4));
        System.out.println("Total students : "+ gm.getTotalStudents());

        //add Grade Testing : 


       System.out.println("Adding grade 88 for 101 : "+ gm.addGrade(101,88));
       System.out.println("Adding grade 90 for 101 : "+ gm.addGrade(101,90));
       System.out.println("Adding grade 75 for 101": + gm.addGrade(101,75));


      System.out.println("Adding grade 87 for 102 : "+ gm.addGrade(102,87));
       System.out.println("Adding grade 97 for 102 : "+ gm.addGrade(102,97));
       System.out.println("Adding grade 77 for 102": + gm.addGrade(102,77));


     
      System.out.println("Adding grade 83 for 103 : "+ gm.addGrade(103,83));
       System.out.println("Adding grade 93 for 103 : "+ gm.addGrade(103,93));
       System.out.println("Adding grade 73for 103": + gm.addGrade(103,73));

       System.out.println("Adding grade 73for 103": + gm.addGrade(103,713));
    
        //getGrades

        System.out.println("Grades for 101 : "+ gm.getGrades(101));
         System.out.println("Grades for 102 : "+ gm.getGrades(102));
          System.out.println("Grades for 103 : "+ gm.getGrades(103));
    

    //average

    System.out.println("Average for 101 : %.2f\n",gm.getAverage(101));
    System.out.println("Average for 102 : %.2f\n",gm.getAverage(102));
    System.out.println("Average for 103 : %.2f\n",gm.getAverage(103));

   //highest lowest : 

   System.out.println("Highest grade for 101 : "+ gm.getHighestGrade(101));
   System.out.println("Lowest grade for 101 : "+gm.getLowestGrade(101));

    System.out.println("Highest grade for 102 : "+ gm.getHighestGrade(102));
   System.out.println("Lowest grade for 102 : "+gm.getLowestGrade(102));

   System.out.println("Highest grade for 103 : "+ gm.getHighestGrade(103));
   System.out.println("Lowest grade for 103 : "+gm.getLowestGrade(103));


   //Topper 

   System.out.println("Topper is : "+ gm.getTopper());

   //failed/passed

   System.out.println("Passed students : "+getPassedStudents() );
    System.out.println("failed students : "+getfailedStudents() );

//remove student

System.out.println("Removing student 101 : "+gm.removeStudent(101));

System.out.println("Total students : "+ gm.getTotalStudents());
 gm.printAllStudents();
    
    
    
    }


}






