import java.util.Scanner;

public class answer3 {

    //This method returns String out of array
    public static String JoinString(String proxy1[]){   

        //Instantization of required variables
        int index = 0;
        String finale ="";

        //String Concatination loop
        while(index<proxy1.length){
            finale = finale+proxy1[index]+" ";
            index++;}

        finale = finale.substring(0, finale.length()-1);  //removes that extra space from end :)
        return finale;}


public static void main(String[] args) {

        // INPUT ARRAY FROM THE USER WITH DESIRED LENGTH :)
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of your array: ");
        int sizeAr = scan.nextInt();

        String[] bugger = new String[sizeAr];
        for (int index=0; index<sizeAr; index++){
            System.out.print("Please enter the " + (index+1) + " word of the array: ");
            bugger[index] = scan.next(); }



        System.out.println("Your final string is: "+JoinString(bugger));

}
    }

