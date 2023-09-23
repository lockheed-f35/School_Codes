// ANSWER IN WORDS: 
        // Step 1: Lets create a stack, we will push first of given binary string digit {say 0}. 
        // Step 2: From now on, if top of the stack will be same as our next digit in string, we will push it.{if it is 0 again, push it too}.
        // Step 3: If it does not match, we will pop one of the 0 from our stack
        // Step 4: If stack is empty at end, then we have same count for 0s and 1s.
        // Step 5: If we have any 0 left in stack, then we will conclude that 0s are more than 1s (counted by no. of 0s stack will have).
        // Step 6: If we had 1s at end of the stack, we will conclude that the 1s are more in the stack (counted by no. of 1s stack will have).

// THE CODE: PLEASE RUN IT : )
// This code was last updated on the 4 June 2023
        // It is lenghty but counts for every exception :--->

import java.util.Stack;
import java.util.Scanner;


public class answer1 {
        public static void main(String[] args) {
            
        //Getting Input Binary String:
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Binary String: ");
        String userInput = scan.nextLine();
        
        //Create a stack:
        Stack<String> counter = new Stack<>();
        
        //Code to add 0 to stack if there is a zero, pop a zero if there is 1 on index place
        int index = 0;


        // Case 1: UserInput is empty
        if (userInput.length()==0){
                System.out.println("THe given string is empty");
            }

        // Case 2: if boolean string begins with a zero, we will store zeros in stack.
        else if (userInput.substring(0,1).equals("0")){
        while(index < userInput.length()){
            if (userInput.length()==0){break;}
            else if(userInput.substring(index,index+1).equals( "0")){counter.push("0"); }
            else if (userInput.substring(index,index+1).equals( "1")){counter.pop();}

            // detects error in the given string.
            else{System.out.println("There is an error on " + (index+1) + " position in entered string." );}
            index++;
        }}


        // Case 3: if boolean string begins with a one, so we will store one in stack.
        else {        
            
        while(index < userInput.length()){
            if (userInput.length()==0){break;}
            else if(userInput.substring(index,index+1).equals( "1")){counter.push("1"); }
            else if (userInput.substring(index,index+1).equals( "0")){counter.pop();}

            // detects error in the given string:
            else{System.out.println("There is an error on " + (index+1) + " position in entered string." );}
            index++;
        }}

        // Printing the final results:
        if (counter.size() != 0){
        System.out.println("The values of " + counter.peek() + "s are more by: " + counter.size());}
        else{System.out.println("The values of 1s and 0s are still equal.");}
       
    }
}

