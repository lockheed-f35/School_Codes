import java.util.*;

// import org.w3c.dom.Node;


public class hawk {
   
   
    public static void main(String[] args) {
       LinkedList<String> employeeIds = new LinkedList<>();
        // addFirst willl add values over here
            employeeIds.add("Shephard");
            employeeIds.add("Romeo");
            employeeIds.add("Charlie");
            employeeIds.add("Delta");
            // addLast will add string over here.

            //Removes Shephard (first value)
            employeeIds.remove();

            // Clearing the whole list
            employeeIds.clear();

            //getting any value from the list with the index
            // can access any value from the list.
            employeeIds.get(-2);

            // methods not availble in array list but available in Linked List.
            employeeIds.addLast("Not available in Array List!");
            





            //printing the linked List
            System.out.println(employeeIds);



    }
}
