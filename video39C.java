class square{
int sideL;

public void setSideLength(int L){
    sideL = L;
}
public int area(){
    int area = sideL*sideL;
    return area;
}
public int parameter(){
    int para = sideL*4;
    return para;
}

}

public class video39C {
public static void main(String[] args) {
    

    //Instantation of class square
    square park = new square();
park.setSideLength(5);

System.out.println("The area of the park is: " + park.area());
System.out.println("The parameter of the park is: " + park.parameter());


    
}}
