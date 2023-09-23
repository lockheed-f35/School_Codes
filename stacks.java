
import java.util.Stack;
public class stacks {
    public static void main(String[] args) {
        // Declaring a new stack.
        // use <> aligators to give a datatype.
        Stack<String> basket = new Stack<String>();
       // FOR INTEGER DATATYPE: (line below)
       // Stack<Integer> phones = new Stack<Integer>();
        // adding to the top of the stack.
        basket.add("Avacados");
        basket.add("Apples");
        basket.add("Bananas");
        basket.add("Grapes");
        basket.add("Mangos");
        //.pop returns the topmost element of stack and then, REMOVES IT! {Can printed as well.}
        basket.pop();


        // Adding element to top of the stack
        basket.push("Done!");
        basket.add("Strawberries");

        //printing the stack.
        System.out.println(basket);

        //return the topmost value but do not delete
        System.out.println(basket.peek());

        //Checks if element is in the stack.
        System.out.println(basket.contains("Grapes")); //gives true.

        // Get index
        System.out.println(basket.get(0)); // gets item at index 0

        // Replace something at index X with any other string.
        basket.set(4, "Has been changed!");

        System.out.println(basket);
    }
}
