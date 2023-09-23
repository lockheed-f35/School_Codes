public class fibonachi {
    public static void main(String[] args) {
        
  int givenIndex1 =7;
        int value = 0;
 
        int givenIndex = givenIndex1;
        int[] fibonachi = new int[givenIndex+1];


        fibonachi[0] = 0;
        fibonachi[1] = 1;

        while(givenIndex >= 2){
            if (givenIndex <= 2){

                break;
            }
            fibonachi[givenIndex1] = fibonachi[givenIndex-1]+fibonachi[givenIndex-2];
            givenIndex--;

        }
        System.out.println("your fibonach number is: " + fibonachi[givenIndex1]);


    }
}
