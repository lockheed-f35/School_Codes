
public class fibonacci {
    static int fibonacci1(int n){
        //0,1,1,2,3,5,8,13...
        //0,1,2,3,4,5,6,7......

        //base case FOR ZERO
        if (n == 0){return 0;}
        //base case FOR ONE

        else if (n == 1) {return 1;}

        // recurssive case
        return fibonacci1(n-1)+fibonacci1(n-2);
     }
    



public static void main(String[] args){


    System.out.println(fibonacci1(6));

     }}



     // ULTRA RULE OF PROGRAMMING: IF SOMETHING WORKS, DO NOT TOUCH IT! 