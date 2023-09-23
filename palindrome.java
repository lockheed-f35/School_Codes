// Importing necessary documents
import java.util.Scanner;
import java.util.Stack;


public class palindrome {

    // method to inverse the string
    public static String Inverser(String orion){
        
        Stack<String> storm = new Stack<>();
        int index = 0; 
        while(index<orion.length()){
            String word = orion.substring(index, index+1);
            storm.push(word);
            index++;}

            // Now we have a stack with our string's last word on top.
        String StringInverted ="";
            index = 0;
            int stormSize = storm.size();
            while (index<stormSize){
                StringInverted = StringInverted+storm.pop();
                index++;
            }
        return StringInverted;
    }

    // method to compare inverted string to orignal


    /* REMOVE SPACES AND RETURN T/F
     *                  OR >>> Return the inverted string.
     * race car :-> rac ecar
     * 
     */
    public static Boolean InvertChecker(String maxP){
        // remove the spaces before comparison
        

        // two lines for removing white spaces
        String InversedStr = Inverser(maxP).replaceAll(" ", "");
        String refinedmaxP = maxP.replaceAll(" ", "");
       

        if (InversedStr.equals(refinedmaxP)){return true;}
        else {return false;}}
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the string to test: ");
        String givenString = scan.nextLine();


         // USING THE CODE
        if (InvertChecker(givenString) == true){System.out.println("The sentence you typed is a palindrome.");}
        else{System.out.println("The sentence you typed is not a palindrome.");



       






}
}
}