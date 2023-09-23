class teamWolf{
    public static int[] connector(int array1[], int array2[]){
        int index = 0;
        int[] newArray = new int[array1.length];
        while (index<array1.length){
            newArray[index] = array1[index]+array2[index];
            index++;
        }
        return newArray;

    }
}


public class ques2 {
    public static void main(String[] args) {
        int [] arr1 = {3,2};
        int [] arr2 = {1,2};


        int[] basket1 = new int[arr1.length];

        basket1 = teamWolf.connector(arr1,arr2);
        int i = 0;


        while(i<arr1.length){
            System.out.println("The "+ i +" element is: " +basket1[i]);
            i++;
        }


    }
}
