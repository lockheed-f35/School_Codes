class Employee{
    int id;
    String name;
    //method created named printDetails.
    //  METHODNAME HAS () AT END.
    public void printDetails(){
        System.out.println("The employee id is: "+ id);
        System.out.println("The employee name is :" + name);
    }




}

public class m416 {
    // a class Employee has been defined which___
    // using public access modifier will give error in line below.
    

    public static void main(String[] args){
        System.out.println("Test Passed!");
    //  INSTANTIATION A NEW EMPLOYEE CLASS OBJECT NAMED HARRY>>>
    // using the class Employee to create an object.

    Employee harry = new Employee(); //MEMORY ALLOCATED HERE!
    // Setting up properties/attributes.
        harry.id = 1441; 
        harry.name = "Harry Stanford";
    

    // Instead of using these lines to print the details everytime you need. The CODE HAS BEEN OVERRIDDEN {CODE: SKS}
    // System.out.println(harry.id);
    // System.out.println(harry.name);
    harry.printDetails();



    }
    
}
