class String1{
    public static String conc(String givenArr[]){
        String finalString = "";
        int index = 0;
        while(index < givenArr.length){
            finalString = finalString + givenArr[index];
            index++;}
        return finalString;
    }
}



class ques5{
    public static void main(String[] args) {
    String[] array1 = {"W","E","L","C","O","M","E","!"};

    System.out.println("The result is: " + String1.conc(array1));



}
}