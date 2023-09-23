class Employee1{

    //Attribute 1
    int salary;

    //Method 1 of Attribute 1
    public int getSalary(){
    // public void getSalary() WARNING: VOID METHOD CANNOT RETURN ANYTHING.
        return salary;
    }


    //Attribute 2
    String name;

    //Method 1 of Attribute 2
    public String getName(){
        // public void getSalary() WARNING: VOID METHOD CANNOT RETURN ANYTHING.
            return name;
        }
    //Method 2 of Attribute 2
    public void setName(String n){
        // public String setName(String n) WARNING: STRING CANNOT BE USED AS METHOD IS NOT RETURING ANYTHING.
        name = n;
    }



}



public class video39 {
public static void main(String[] args) {
    

    Employee1 pilot = new Employee1(); // Instatiation of object Employee1.
    //Setting attributes of object pilot.
    pilot.name = "Hiroshi";
    pilot.salary = 87;

    // Calling methods for object pilot from class Employee1.
    System.out.println("The salary of employee is: " + pilot.getSalary());
    System.out.println("The name of employee is: " + pilot.getName());

    // changing name using method 2 of attribute 2.
    pilot.setName("Ravi");
    System.out.println("The name of employee is: " + pilot.getName());


    




} 
}
