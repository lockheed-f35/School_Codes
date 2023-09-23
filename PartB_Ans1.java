import java.util.Stack;

public class PartB_Ans1 {
    public static int[] reverser(int[] sparrow){
        // suppose we got {[3],[4],[7],[4]}
        int[] bettle = new int[sparrow.length];
        Stack<Integer> sparrow1 = new Stack<>();
        for(int i = 0; i<sparrow.length; i++){
            sparrow1.push(sparrow[i]);}

            for(int i = 0; i<sparrow.length; i++){
                bettle[i]=sparrow1.pop();}
                return bettle;}

    public static void main(String[] args) {
        int[] spider = {1,2,3,4,5,6,7};


        int[] final1 = reverser(spider);

        int i = 0;
        while (i<final1.length){
            System.out.println(final1[i]);
            i++;
        }
    }
}
