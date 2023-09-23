import java.util.Scanner;
import java.util.Stack;




public class answer4 {

    public static Stack<Object> reSorter(Stack<Object> mainStack1){
        Stack<Object> tempStack = mainStack1;
        int fixSize = mainStack1.size();
        Stack<Object> finalStack = new Stack<>();
        for (int i = 0; i<fixSize; i++){
            
            finalStack.push(tempStack.pop());
        }
        //Now, final stack has the numbers in which they were entered
        return finalStack;
    }

    public static void main(String[] args) {
        // let the user decide what should be pushed into stack.
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of values you want to push: ");
        int count = scan.nextInt();
        Stack<Object> mainStack = new Stack<>();
        for (int index = 0; index<count; index++){
            System.out.print("Please enter the "+ (index+1) + " value: " );
            //int givenIn = Integer.parseInt(scan.next());
            Object givenIn = scan.next();
            mainStack.push(givenIn);
        }

        //Now we have stack named mainStack of custom length.
        Stack<Object> rose = reSorter(mainStack);
        System.out.println("The stack is: " + rose);

    }
}
