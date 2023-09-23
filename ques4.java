class fixDiagonal{
   public static int[][] oneDiagonal(int given2dAr[][]){
   int [][] finalArr = given2dAr;
   int index = 0;
        while (index<finalArr.length){
            finalArr[index][index]=1;
            index++;
            }
          return finalArr;
  }
}




public class ques4 {
    public static void main(String[] args) {
        int [][] array2d = {{1,4,7},{2,5,8},{3,6,9}};
        System.out.println(array2d.length);

        // we have to set 1,5 and 9 = 1;

        int[][] redfox = fixDiagonal.oneDiagonal(array2d);

        int index =0;
        while (index<redfox.length){
        System.out.println("While "+ index + " rank is: " + redfox[index][index]);
            index++;
    }

    }
}
