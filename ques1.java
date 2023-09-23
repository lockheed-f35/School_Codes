class sniper{

    int myArray[];
    public static int[] duplex(int myArray[]){
        int index = 0;
        int newArray [] = new int[myArray.length];
        while (index<myArray.length){
            newArray[index]= myArray[index]*index;
            index++;}
        return newArray;
    }

}

public class ques1 {
    public static void main(String[] args) {
        int[] ClubHouse = {0,1,2,3,4,5,6,7,8,9};
        int[] romeo;



        romeo = sniper.duplex(ClubHouse);
        int i = 0;
        while(i<romeo.length){
            System.out.println("The "+ i +"th element is: "+ romeo[i]);
            i++;
        }
        
    }
}