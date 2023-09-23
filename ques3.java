// Practice Once more.
class arraySum{
    public static int[] amigo(int arr1[]){
        int[] masterArray = new int[arr1.length];
        int index = 0;
        int prevSum = 0;
        while(index<arr1.length){
            if (index<arr1.length){
                
            masterArray[index] = prevSum + arr1[index];
            prevSum = masterArray[index];
            index++;
            }
            else if (index == 0){masterArray[index] = arr1[index]; index++; prevSum = arr1[index];}
            else {break;}

        }
        


        return masterArray;
    }
}






public class ques3 {
    public static void main(String[] args){
       
       
       
       int[] givenArray = {1,2,3,4,5,6,7};
                        //1,3,6,10

       int[] resultantArray = new int[givenArray.length];

       resultantArray = arraySum.amigo(givenArray);
       
       int i = 0;
       while(i<givenArray.length){
        System.out.println("The "+ (i+1) +" element is: " +resultantArray[i]);
        i++;
    }
       
    }
    
}
