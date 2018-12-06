import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

    private StringBuilder name;
    private String code;
    private Scanner in = new Scanner(System.in, "UTF-8");
    private String deptId;
    private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[1-9]{2}$");

    EmployeeInfo() {
        setName();
        setDeptId();
    }

    StringBuilder getName() {
        return this.name;
    }

    private String getCode() {
        return this.code;
    }

    // The setName method will be called and then it will use inputName. This will get the first 
    // and last name as a single input that the user entered. checkName then makes sure that the 
    // name entered has a single space in it
    private void setName() {
        StringBuilder testName = new StringBuilder(inputName());
        if (checkName(testName)) {
            this.name = testName;
            //System.out.println("Good name, creating employee code");
            createEmployeeCode(testName);
        } else {
            this.name = testName;
            //System.out.println("Invalid name, setting code to guest");
            this.code = "guest";
        }
    }

    //createEmployeeCode() is used to take the first initial from the first
    //name and add it to the full last name to create the code
    private void createEmployeeCode(StringBuilder name) {
         this.code = name.charAt(0)+ name.substring(name.indexOf(" ")+1);
    }

    private String inputName() {
        System.out.println("Please enter your first and last name:");
        return in.nextLine();
    }

    //DOES THE NAME HAVE A SPACE??? find out here
    private boolean checkName(StringBuilder name) {
        if (name.indexOf(" ") > 0) {
            return (name.indexOf(" ", name.indexOf(" ")+1) == -1);
        } else
            return false;
    }

    private String getDeptId(){
        System.out.println("Please enter your department ID:");
        return in.nextLine();
    }

    //setDeptId() will now call getDeptId(), and get the id from the user before validId() is used to check if the input
    //matches the pattern.  If pattern matches, the given id is set to deptId otherwise a default value of
    //NoName should be assigned
    private void setDeptId(){
        String id = getDeptId();
        if (validId(id)){
            this.deptId = id;
            //System.out.println("Department ID set.");
        }
        else{
            //System.out.println("Inadequate Department ID, setting to default.");
            this.deptId = "NoName";
        }


    }
    private String getId(){
        return this.deptId;
    }

    // Match made in heaven? id and pattern match? Use a matcher to find out
    private boolean validId(String id){
        Matcher matcher = p.matcher(id);
        return matcher.matches();
    }

    private String reverseString(String id){
        if(id.isEmpty()){
            return id;
        } else {
            return reverseString(id.substring(1))+id.charAt(0);
        }
    }

    @Override
    public String toString(){
        return "Employee Code: " + getCode() + "\n" +
                "Department Number: " + getId();
    }

}
