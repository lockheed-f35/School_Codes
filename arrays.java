public class arrays {
    public static void main(String[] args) {
        int [][] m1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int index = 0;
        while (index<4){
            //new array of length 4 for each of index.
            int [] subar= new int[4];
            int index1 = 4;
            while(index1<4){
                subar[index1]= index1*index1;
                index1++;}
            m1[index]=subar;
            index++;
        }


        System.out.println(m1[3][3]);
        


    }
}
